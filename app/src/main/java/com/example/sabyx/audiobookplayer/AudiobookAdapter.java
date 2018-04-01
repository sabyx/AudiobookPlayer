package com.example.sabyx.audiobookplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AudiobookAdapter extends ArrayAdapter<Audiobook> {
    AudiobookAdapter(@NonNull Context context, @NonNull List<Audiobook> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Audiobook currentAudiobook = getItem(position);
        if (currentAudiobook != null) {
            TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
            nameTextView.setText(currentAudiobook.getName());

            TextView durationTextView = listItemView.findViewById(R.id.duration_text_view);
            durationTextView.setText(currentAudiobook.getDuration());
        }

        return listItemView;
    }
}
