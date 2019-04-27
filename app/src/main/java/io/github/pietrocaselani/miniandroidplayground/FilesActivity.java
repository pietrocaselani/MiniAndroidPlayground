package io.github.pietrocaselani.miniandroidplayground;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.view.View.INVISIBLE;

public final class FilesActivity extends AppCompatActivity {
    public static final int SELECTED_FILE_RESULT_CODE = 1;
    public static final String FILES_KEY = "Files";
    public static final String SELECTED_FILE_KEY = "SelectedFile";

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_files);

        final ArrayList<String> files = getIntent().getStringArrayListExtra(FILES_KEY);

        if (!files.isEmpty()) {
            findViewById(R.id.activity_files_textview).setVisibility(INVISIBLE);
        }

        final FileSelectedListener fileSelectedListener = new FileSelectedListener() {
            @Override public void onSelectFile(String filename) {
                final Intent data = new Intent().putExtra(SELECTED_FILE_KEY, filename);
                setResult(RESULT_OK, data);
                finish();
            }
        };

        final RecyclerView recyclerView = findViewById(R.id.activity_files_recyclerview);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        final FilesAdapter adapter = new FilesAdapter(files, fileSelectedListener);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private interface FileSelectedListener {
        void onSelectFile(String filename);
    }

    private final class FilesAdapter extends RecyclerView.Adapter<FilesAdapter.FileViewHolder> {
        private final List<String> files;
        private final OnClickListener clickListener;

        private FilesAdapter(List<String> files, final FileSelectedListener listener) {
            this.files = files;

            clickListener = new OnClickListener() {
                @Override public void onClick(View view) {
                    final TextView textView = view.findViewById(android.R.id.text1);
                    final String filename = textView.getText().toString();

                    listener.onSelectFile(filename);
                }
            };
        }

        @NonNull @Override public FileViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
            final LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
            final View view = layoutInflater.inflate(android.R.layout.simple_list_item_1, viewGroup, false);
            return new FileViewHolder(view, clickListener);
        }

        @Override public void onBindViewHolder(@NonNull FileViewHolder fileViewHolder, int position) {
            fileViewHolder.bind(files.get(position));
        }

        @Override public int getItemCount() {
            return files.size();
        }

        private final class FileViewHolder extends RecyclerView.ViewHolder {
            private final TextView textView;

            FileViewHolder(@NonNull View itemView, OnClickListener clickListener) {
                super(itemView);

                itemView.setOnClickListener(clickListener);

                textView = itemView.findViewById(android.R.id.text1);
            }

            void bind(String file) {
                textView.setText(file);
            }
        }

    }
}

