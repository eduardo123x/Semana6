package com.example.semana6.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.semana6.R;
import com.example.semana6.models.Productos;

import java.util.List;

public class ProductoAdapter extends ArrayAdapter<Productos> {
    Context context;
    /*ImageLoader queue;*/
    private class ViewHolder {
        NetworkImageView image;
        TextView nombre;
        TextView descripcion;
        TextView precio;



        private ViewHolder() {
        }

    }

    public ProductoAdapter(Context context, List<Productos> items, ImageLoader _queue) {
        super(context, 0, items);
        this.context = context;
        /*this.queue = _queue;*/

    }
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        final Productos rowItem = (Productos) getItem(position);
        LayoutInflater mInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.productos_item, null);
            holder = new ViewHolder();
            holder.nombre = (TextView) convertView.findViewById(R.id.nombre);
            holder.descripcion = (TextView) convertView.findViewById(R.id.descripcion);
            holder.precio = (TextView) convertView.findViewById(R.id.precio);
            holder.image = (NetworkImageView)convertView.findViewById(R.id.image);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.nombre.setText(rowItem.nombre);
        holder.descripcion.setText(rowItem.descripcion);
        holder.precio.setText(rowItem.precio.toString());

       /* if ( rowItem.getSmallImage() != null ) { //<----- El modelo debe poseer esta function
            holder.image.setImageUrl(rowItem.getSmallImage(), queue);
        }*/






        return convertView;
    }
}

