package br.com.up.mypokedex.network;

import android.os.AsyncTask;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectionAsyncTask extends AsyncTask<String,Integer,String> {

        private ConnectionListener listener;

        public ConnectionAsyncTask(ConnectionListener listener){this.listener = listener;}

        @Override
        protected String doInBackground(String... strings) {

            String stringUrl = strings[0];

            try{

                URL url = new URL(stringUrl);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.connect();

                if(urlConnection.getResponseCode() == 200){
                    InputStream inputStream = urlConnection.getInputStream();
                    return IOUtils.toString(inputStream,"UTF-8");
                }
                else{
                    return null;
                }

            }catch (Exception e){
                return null;
            }
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            try{
                JSONObject object =  new JSONObject();
            }catch (Exception e){ }

            listener.onRequestFinish(null);
        }

        public interface ConnectionListener{
            void onRequestFinish(JSONObject object);

        }
    }
