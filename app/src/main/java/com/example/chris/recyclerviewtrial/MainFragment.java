package com.example.chris.recyclerviewtrial;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Chris on 8/25/16.
 */
public class MainFragment extends Fragment {
    private RecyclerView mRecyclerView;

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        mRecyclerView = (RecyclerView) container.findViewById(R.id.weather_recycler_view);
        return null;
    }

}