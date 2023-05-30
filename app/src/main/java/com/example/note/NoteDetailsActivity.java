//10120140-RifqiNugraha-IF4

package com.example.note;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.os.Bundle;

public class NoteDetailsActivity extends AppCompatActivity {
    EditText titleEditText,contentEditText;
    ImageButton saveNoteBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_details);

        titleEditText = findViewById(R.id.notes_title_text);
        contentEditText = findViewById(R.id.notes_content_text);
        saveNoteBtn = findViewById(R.id.save_note_btn);
        saveNoteBtn.setOnClickListener( (v)-> saveNote());


    }
    void saveNote() {
        String judul = titleEditText.getText().toString();
        String catatan = contentEditText.getText().toString();
        int id = NoteModel.noteArrayList.size();
        NoteModel newNote = new NoteModel(id, judul, catatan);
        NoteModel.noteArrayList.add(newNote);
        finish();
        }
}