package com.samadou.absare.stepchallenge;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.Toast;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

/**
 * Created by absare on 24/10/2015.
 */
public class DatabaseConnector extends Activity
{

    private class ContactDatabase extends AsyncTask<String, Void, String>
    {
        protected String doInBackground(String... url)
        {
            try {
                    HttpClient httpClient = new DefaultHttpClient();
                    HttpPost httpPost = new HttpPost("http://www.google.com");
                    HttpResponse response = httpClient.execute(httpPost);
                    HttpEntity entity = response.getEntity();
                } catch (ClientProtocolException e)
                {

                }catch (IOException e)
                {

                }

            return null;
        }

        protected  void onPostExecute(String result)
        {
            super.onPostExecute(result);
            Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
        }
    }
}
