
package com.geektech.player_3_4.second;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.player_3_4.OnClickData;
import com.geektech.player_3_4.R;
import com.geektech.player_3_4.SecondActivity;

import java.util.ArrayList;


public class SecondFragment extends Fragment implements OnClickData {

    private RecyclerView recyclerView;
    private ArrayList<Playlist> playlist;
    private PlaylistAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycler);
        adapter = new PlaylistAdapter(playlist,this);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        playlist = new ArrayList<>();
        playlist.add(new Playlist(1, "Ain't Nobody", "Felix Jaehn", "3:22"));
        playlist.add(new Playlist(2, "Zayn", "Dusk till dawn", "04:15"));
        playlist.add(new Playlist(3, "Alone", "Alan Walker", "3:59"));
        playlist.add(new Playlist(4, "Here before", "Halogen", "4:30"));
        playlist.add(new Playlist(5, "Likey","Twice", "02:45"));
        playlist.add(new Playlist(6, "Perfect", "Ed sheeran", "02:50"));
        playlist.add(new Playlist(7, "La la la", "Sam Smith", "04:32"));
        playlist.add(new Playlist(8, "Right now", "Akon", "02:40"));
        playlist.add(new Playlist(9, "Me too", "Meghan trainor", "01:40"));
        playlist.add(new Playlist(10, "Like i would", "Zayn", "4:32"));
    }

    @Override
    public void onClick(Playlist playlist) {
        Intent intent = new Intent(requireActivity(), SecondActivity.class);
        intent.putExtra("key", playlist.getSong());
        startActivity(intent);
    }
}
