package com.cognition.app.mulika;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by user on 3/24/2018.
 */

public class PostsAdapter extends BaseAdapter {
    Context context;
    JSONArray posts;
    LayoutInflater inflter;

    public PostsAdapter(Context applicationContext, JSONArray posts) {
        this.context = context;
        this.posts = posts;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return posts.length();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_list_item, null);
        TextView user = (TextView) view.findViewById(R.id.user);
        ImageView pic = (ImageView) view.findViewById(R.id.pic);
        TextView plate = (TextView) view.findViewById(R.id.plate);
        TextView sacco = (TextView) view.findViewById(R.id.sacco);
        TextView description = (TextView) view.findViewById(R.id.description);

        JSONObject post = null;
        try {
            post = posts.getJSONObject(i);
            user.setText(post.getJSONObject("user").getString("user_name"));
            plate.setText(post.getString("plate"));
            sacco.setText(post.getString("sacco"));
            pic.setImageResource(R.drawable.cardi);
            description.setText(post.getString("caption"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return view;
    }
}