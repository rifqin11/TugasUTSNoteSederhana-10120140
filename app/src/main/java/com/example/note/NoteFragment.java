//10120140-RifqiNugraha-IF4

package com.example.note;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class NoteFragment extends Fragment implements OnClickListener{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_note, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        FloatingActionButton addNoteBtn = (FloatingActionButton) getActivity().findViewById(R.id.add_note_btn);
        addNoteBtn.setOnClickListener((OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), NoteDetailsActivity.class);
        startActivity(intent);
    }
}