package br.com.up.appurlsfavoritas.adapter;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UrlAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<String> urlList;

    private UrlAdapter (ArrayList<String>urlList){
        this.urlList = urlList;
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return urlList.size();
    }
}
