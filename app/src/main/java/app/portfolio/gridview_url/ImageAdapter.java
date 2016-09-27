package app.portfolio.gridview_url;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Asus on 9/24/2016.
 */

public class ImageAdapter extends ArrayAdapter {
    private Context context;
    private LayoutInflater inflater;
    private String[] imgurls;

    public ImageAdapter(Context context, String[] imgurls) {
        super(context, R.layout.list,imgurls);
        this.context = context;
        this.imgurls=imgurls;

        inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null) {
            convertView=inflater.inflate(R.layout.list,parent,false);
        }
        Picasso
                .with(context)
                .load(imgurls[position])
                .fit() // will explain later
                .into((ImageView) convertView);

        return convertView;


    }
}
