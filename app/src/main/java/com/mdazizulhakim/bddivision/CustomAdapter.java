package com.mdazizulhakim.bddivision;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MD AZIZUL HAKIM on 12/02/2017.
 */

public class CustomAdapter extends BaseAdapter{

    String Division[];
    int DivIcon[];
    LayoutInflater inflater;

    public CustomAdapter(Context context,String [] Division,int[] DivIcon){
        this.Division = Division;
        this.DivIcon = DivIcon;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return Division.length ;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.list_style,parent,false);
        TextView textView = (TextView) convertView.findViewById(R.id.textViewlist);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewlist);

        textView.setText(Division[position]);
        imageView.setImageResource(DivIcon[position]);


        return convertView;
    }
}
