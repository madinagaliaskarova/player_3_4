package com.geektech.player_3_4.second;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.player_3_4.OnClickData;
import com.geektech.player_3_4.R;

import java.util.ArrayList;

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder> {
    private ArrayList<Playlist> playlists;
    private OnClickData onClickData;

    public PlaylistAdapter(ArrayList<Playlist> playlists, OnClickData onClickData) {
        this.playlists = playlists;
        this.onClickData = onClickData;
    }

    @NonNull
    @Override
    public PlaylistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlaylistViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PlaylistViewHolder holder, int position) {
        holder.bind(playlists.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickData.onClick(playlists.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return playlists.size();
    }

    static class PlaylistViewHolder extends RecyclerView.ViewHolder{
        private TextView number, song, artist, song_length;
        public PlaylistViewHolder(@NonNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.number);
            song = itemView.findViewById(R.id.song);
            artist= itemView.findViewById(R.id.artist);
            song_length = itemView.findViewById(R.id.song_length);
        }

        public void bind(Playlist playlist) {
            number.setText(String.valueOf(playlist.getNumber()));
            song.setText(playlist.getSong());
            artist.setText(playlist.getArtist());
            song_length.setText(playlist.getLengthSong());
        }
    }
}
