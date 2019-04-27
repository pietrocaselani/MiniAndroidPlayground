package io.github.pietrocaselani.miniandroidplayground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

public final class ResultActivity extends AppCompatActivity {
    public static final String DEX_FILEPATH_KEY = "Dex_FilePath";
    public static final String LOGS_KEY = "CompileLogs";
    private String dexFilePath;
    private String logs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        dexFilePath = getIntent().getStringExtra(DEX_FILEPATH_KEY);
        logs = getIntent().getStringExtra(LOGS_KEY);

        findViewById(R.id.activity_result_button_logs).setOnClickListener(new OnClickListener() {
            @Override public void onClick(View view) {
                showLogs();
            }
        });

        findViewById(R.id.activity_result_button_bytecode).setOnClickListener(new OnClickListener() {
            @Override public void onClick(View view) {
                showBytecode();
            }
        });

        findViewById(R.id.activity_result_button_run).setOnClickListener(new OnClickListener() {
            @Override public void onClick(View view) {
                runCode();
            }
        });
    }

    private void runCode() {
        final DexClassLoader dexClassLoader = createDexClassLoader();
        if (dexClassLoader == null) {
            Toast.makeText(this, "Impossível criar DexLoader", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            final Class<?> mainClass = dexClassLoader.loadClass("pietrocaselani.hello.Main");
            mainClass.getMethod("main").invoke(null);
        } catch (Exception e) {
            setText(e.getLocalizedMessage());
        }
    }

    private DexClassLoader createDexClassLoader() {
        try {
            return new DexClassLoader(dexFilePath, File.createTempFile("tmp_dex", "files").getAbsolutePath(), null, getClassLoader());
        } catch (IOException e) {
            return null;
        }
    }

    private void showBytecode() {
        final StringBuilder builder = new StringBuilder();

        try {
            final Enumeration<String> entries = new DexFile(dexFilePath).entries();
            while (entries.hasMoreElements()) {
                builder.append(entries.nextElement()).append("\n");
            }

            setText(builder.toString());
        } catch (IOException e) {
            setText(e.getLocalizedMessage());
        }
    }

    private void showLogs() {
        setText(logs);
    }

    private void setText(String text) {
        ((TextView) findViewById(R.id.activity_result_textview)).setText(text);
    }
}
