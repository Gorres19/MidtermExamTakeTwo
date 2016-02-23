package mett.android.com.midtermexamtaketwo;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> title_array = new ArrayList<String>();
    ListView list;
    String url = "http://joseniandroid.herokuapp.com";
    BooksAdapter adapter = new BooksAdapter(MainActivity.this, title_array);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ListView listView = (ListView) findViewById(R.id.listView);
        BooksAdapter adapter = new BooksAdapter(MainActivity.this, title_array);
        listView.setAdapter(adapter);
        new RunPlease().execute();

    }

    class RunPlease extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... params) {
            String str = null;
            HttpUtils.getResponse(url, title_array);

            return str;
        }


    }
}

