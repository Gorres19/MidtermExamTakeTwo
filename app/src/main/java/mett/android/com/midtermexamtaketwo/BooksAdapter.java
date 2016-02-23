package mett.android.com.midtermexamtaketwo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 2/23/2016.
 */
public class BooksAdapter extends BaseAdapter {

    private Activity activity;
    private static ArrayList title,notice;
    private static LayoutInflater inflater = null;

    public BooksAdapter(Activity a, ArrayList b)
    {
        activity = a;
        this.title = b;

        inflater = (LayoutInflater) activity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return title.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vi = view;
        if(view == null)
            vi = inflater.inflate(R.layout.list_books, null);

        TextView bookname = (TextView) vi.findViewById(R.id.TvBook);
        String Book = title.get(i).toString();
        bookname.setText(Book);
        return vi;
    }
}
