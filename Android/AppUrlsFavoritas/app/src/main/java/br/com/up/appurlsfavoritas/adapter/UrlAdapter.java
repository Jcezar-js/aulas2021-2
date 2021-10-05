package br.com.up.appurlsfavoritas.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import br.com.up.appurlsfavoritas.R;

public class UrlAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<String> urlList;

    public UrlAdapter(ArrayList<String> urlList){
        this.urlList = urlList;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View layout = inflater.inflate(R.layout.item_view_url, parent, false);


        return new UrlViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return urlList.size();
    }

    public static class UrlViewHolder extends RecyclerView.ViewHolder{

        public UrlViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
