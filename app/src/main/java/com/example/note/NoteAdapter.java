//10120140-RifqiNugraha-IF4

package com.example.note;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

    public class NoteAdapter extends ArrayAdapter<NoteModel>
    {
        public NoteAdapter(Context context, List<NoteModel> notes)
        {
            super(context, 0, notes);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
        {
            NoteModel note = getItem(position);
            if(convertView == null)
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_note_details, parent, false);

            TextView title = convertView.findViewById(R.id.notes_title_text);
            TextView desc = convertView.findViewById(R.id.notes_content_text);

            title.setText(note.getJudul());
            desc.setText(note.getCatatan());

            return convertView;
        }
    }
