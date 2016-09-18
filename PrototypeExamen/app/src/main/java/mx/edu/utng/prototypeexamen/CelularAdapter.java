package mx.edu.utng.prototypeexamen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jony on 7/9/2016.
 */
public class CelularAdapter extends ArrayAdapter<Celular>{


    public CelularAdapter(Context context , ArrayList<Celular> celulars){
        super(context,0,celulars);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Celular celular =getItem(position);
        if (convertView==null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.celular_layout, parent, false);
        }
            TextView txtCelular = (TextView)convertView.findViewById(R.id.tvx_celular);
            txtCelular.setText( celular.getMarca()+" "+celular.getModelo() +" "+celular.getCompañia() );
            return convertView;
    }
}








