package app.portfolio.gridview_url;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gv= (GridView) findViewById(R.id.view_load);
        gv.setAdapter(new ImageAdapter(MainActivity.this,supermovieimages));

    }
    public static String[] supermovieimages = {
            "http://image.tmdb.org/t/p/w185//5N20rQURev5CNDcMjHVUZhpoCNC.jpg","http://image.tmdb.org/t/p/w185//oQWWth5AOtbWG9o8SCAviGcADed.jpg",
            "http://image.tmdb.org/t/p/w185//z6BP8yLwck8mN9dtdYKkZ4XGa3D.jpg","http://image.tmdb.org/t/p/w185//g54J9MnNLe7WJYVIvdWTeTIygAH.jpg","http://image.tmdb.org/t/p/w185//tgfRDJs5PFW20Aoh1orEzuxW8cN.jpg",
            "http://image.tmdb.org/t/p/w185/6kMu4vECAyTpj2Z7n8viJ4RAaYh.jpg" ,
            "http://image.tmdb.org/t/p/w185//h28t2JNNGrZx0fIuAw8aHQFhIxR.jpg","http://image.tmdb.org/t/p/w185//vj4IhmH4HCMZYYjTMiYBybTWR5o.jpg",
            "http://image.tmdb.org/t/p/w185//sm7p6NvWOBSDywdIPhmiX3SLSH8.jpg"
    };
}
