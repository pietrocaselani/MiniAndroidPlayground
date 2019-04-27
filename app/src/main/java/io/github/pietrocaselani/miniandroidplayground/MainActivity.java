package io.github.pietrocaselani.miniandroidplayground;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import io.github.pietrocaselani.simplejava.compiler.SimpleJavaCompiler;
import io.github.pietrocaselani.simplejava.compiler.SimpleJavaCompiler.Callback;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static android.text.InputType.TYPE_CLASS_TEXT;
import static io.github.pietrocaselani.miniandroidplayground.FilesActivity.SELECTED_FILE_RESULT_CODE;

public final class MainActivity extends AppCompatActivity {
    private final List<String> logs = new ArrayList<>();
    private FileHandler fileHandler;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fileHandler = new FileHandler(getFilesDir());

        findViewById(R.id.activity_main_button_compile)
                .setOnClickListener(new OnClickListener() {
                    @Override public void onClick(View view) {
                        compileCode(sourceCodeFromView());
                    }
                });

        findViewById(R.id.activity_main_button_save).setOnClickListener(new OnClickListener() {
            @Override public void onClick(View view) {
                showFilenameDialog();
            }
        });

        findViewById(R.id.activity_main_button_load).setOnClickListener(new OnClickListener() {
            @Override public void onClick(View view) {
                loadCode();
            }
        });
    }

    @Override protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == SELECTED_FILE_RESULT_CODE) {
            handleSelectedFile(resultCode, data);
        }
    }

    private void handleSelectedFile(int resultCode, Intent data) {
        if (resultCode != Activity.RESULT_OK) return;

        final String selectedFileName = data.getStringExtra(FilesActivity.SELECTED_FILE_KEY);
        final File file = new File(fileHandler.programsDirectory(), selectedFileName);
        try {
            final String text = fileHandler.loadContensOf(file);
            setSourceCodeIntoView(text);
        } catch (IOException e) {
            Toast.makeText(this, "Can't read file", Toast.LENGTH_SHORT).show();
        }
    }

    private void loadCode() {
        final List<String> files = fileHandler.listFilesInto(fileHandler.programsDirectory());
        goToFilesActivity(files);
    }

    private void showFilenameDialog() {
        final EditText input = new EditText(this);
        input.setInputType(TYPE_CLASS_TEXT);

        new AlertDialog.Builder(this)
                .setTitle("Filename")
                .setView(input)
                .setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        saveFile(input.getText().toString(), sourceCodeFromView());
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        }).show();
    }

    private String sourceCodeFromView() {
        return ((EditText) findViewById(R.id.activity_main_edittext_code)).getText().toString();
    }

    private void setSourceCodeIntoView(String sourceCode) {
        ((EditText) findViewById(R.id.activity_main_edittext_code)).setText(sourceCode);
    }

    private void saveFile(String filename, String code) {
        final File sourceCodeFile = new File(fileHandler.programsDirectory(), filename);
        try {
            writeCodeToFile(code, sourceCodeFile);
            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Toast.makeText(this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void compileCode(String sourceCode) {
        compileCode(sourceCode, fileHandler.defaultOutputFile(), fileHandler.defaultSourceCodeFile());
    }

    private void compileCode(String sourceCode, File dexFile, File sourceCodeFile) {
        final Callback compilerCallback = new Callback() {
            @Override public void infoMessage(String message) {
                logs.add(message);
            }
        };

        final SimpleJavaCompiler compiler = new SimpleJavaCompiler(dexFile, compilerCallback);

        try {
            writeCodeToFile(sourceCode, sourceCodeFile);
            compiler.compileFiles(sourceCodeFile);
        } catch (IOException e) {
            logs.add("Compilation error:\n" + e.getLocalizedMessage());
        }

        goToResultActivity(dexFile);
    }

    private void writeCodeToFile(String code, File file) throws IOException {
        fileHandler.writeToFile(code, file);
    }

    private void goToResultActivity(File dexFile) {
        final Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(ResultActivity.LOGS_KEY, joinedLogs());
        intent.putExtra(ResultActivity.DEX_FILEPATH_KEY, dexFile.getAbsolutePath());

        startActivity(intent);
    }

    private void goToFilesActivity(List<String> files) {
        final Intent intent = new Intent(this, FilesActivity.class);
        intent.putStringArrayListExtra(FilesActivity.FILES_KEY, new ArrayList<>(files));
        startActivityForResult(intent, SELECTED_FILE_RESULT_CODE);
    }

    private String joinedLogs() {
        final StringBuilder builder = new StringBuilder();

        for (String log : logs) {
            builder.append(log).append("\n");
        }

        return builder.toString();
    }
}
