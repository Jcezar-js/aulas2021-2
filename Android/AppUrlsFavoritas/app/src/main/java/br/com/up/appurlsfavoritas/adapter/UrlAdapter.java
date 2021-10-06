package br.com.up.appurlsfavoritas.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        //Atualiza o nome mostrado conforme atualizações da lista de url
        String url = urlList.get(position);
        UrlViewHolder urlViewHolder = (UrlViewHolder) holder;
        TextView textViewUrlTitle = urlViewHolder.itemView.findViewById(R.id.text_url_title);

        textViewUrlTitle.setText(url);
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
