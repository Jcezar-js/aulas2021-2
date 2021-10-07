package br.com.up.appurlsfavoritas.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import br.com.up.appurlsfavoritas.R;

public class UrlAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<String> urlList;
    private OnLinkClickListener listener;

    public UrlAdapter(ArrayList<String> urlList,
                      OnLinkClickListener listener){
        this.urlList = urlList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View layout = inflater.inflate(R.layout.item_view_url, parent, false);
        UrlViewHolder urlViewHolder = new UrlViewHolder(
                layout
        );
        return urlViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //Atualiza o nome mostrado conforme atualizações da lista de url
        String url = urlList.get(position);
        UrlViewHolder urlViewHolder = (UrlViewHolder) holder;
        urlViewHolder.textViewUrlTitle.setText(url);
    }

    @Override
    public int getItemCount() {
        return urlList.size();
    }

    public class UrlViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewUrlTitle;

        public UrlViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewUrlTitle = itemView.findViewById(R.id.text_url_title);

            ImageView iconGoToUrl = itemView.findViewById(R.id.image_icon_url_go);

            iconGoToUrl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    int position = getAdapterPosition();
                    String url = urlList.get(position);
                    listener.onClick(url);
                }
            });
        }
    }

    public interface OnLinkClickListener {
        void onClick(String url);
    }
}
