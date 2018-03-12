package com.huongtlu.thuchanh_two;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by BEHUONG on 3/7/2018.
 */

public class customAdapter extends ArrayAdapter<monhoc> {

    public customAdapter(@NonNull Context context, List<monhoc> objects) {
        super(context, 0, objects);
    }

    public class ViewHolder {
        TextView txt_tenMH, txt_info, txt_diem;
        LinearLayout linearLayout;
        ListView ls_item;
    }
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(R.layout.item_list_view, parent, false);
                ViewHolder holder = new ViewHolder();
                holder.txt_tenMH = (TextView) convertView.findViewById(R.id.txt_tenMH);
                holder.txt_info =
                        (TextView) convertView.findViewById(R.id.txt_info);

                holder.txt_diem = (TextView) convertView.findViewById(R.id.txt_diem);

                holder.linearLayout = (LinearLayout) convertView.findViewById(R.id.container);
                convertView.setTag(holder);
            }

            monhoc mh = getItem(position);

            ViewHolder holder = (ViewHolder) convertView.getTag();
            holder.txt_tenMH.setText(mh.getTenMH());
            holder.txt_info.setText("Hoc ky " + mh.getHocky() + "Nam thu "+mh.getNam());
                    holder.txt_diem.setText(mh.getDiem() + "");
            if (position % 2 == 0) {
                holder.linearLayout.setBackgroundColor(Color.GREEN);
            }
            return convertView;
        }
    }


