package com.example.lab3;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class UserAdapter extends ArrayAdapter<User> {
    Context context;
    List<User> objects;
    public UserAdapter(Context context, int resource, int textViewResourceId, List<User> objects) {
        super(context, resource, textViewResourceId, objects);

        this.context = context;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.custom_layout, parent, false);
        TextView tvTitle = (TextView)view.findViewById(R.id.tvTitle);
        TextView tvMini = (TextView)view.findViewById(R.id.tvMini);
        TextView tvSubTitle = (TextView)view.findViewById(R.id.tvSubTitle);
        User temp = objects.get(position);


        tvTitle.setText(temp.getName());
        tvSubTitle.setText(temp.getEmail());
        return view;
    }
}

