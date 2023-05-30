//10120140-RifqiNugraha-IF4

package com.example.note;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.view.View;

import com.example.note.databinding.ActivityMainBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private ListView noteListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new NoteFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
                int id = item.getItemId();
                if (id == R.id.profile) {
                    replaceFragment(new ProfilFragment());
                }else if (id == R.id.notes) {
                    replaceFragment(new NoteFragment());
                }else if (id == R.id.info) {
                    replaceFragment(new InfoFragment());
                }
            return true;
        });

    }

    void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }

    private void initWidgets()
    {
        noteListView = findViewById(R.id.noteListView);
    }

    private void setNoteAdapter()
    {
        NoteAdapter noteAdapter = new NoteAdapter(getApplicationContext(), NoteModel.noteArrayList);
        noteListView.setAdapter(noteAdapter);
    }
    public void newNote(View view)
    {
        Intent newNoteIntent = new Intent(this, NoteDetailsActivity.class);
        startActivity(newNoteIntent);
    }


}