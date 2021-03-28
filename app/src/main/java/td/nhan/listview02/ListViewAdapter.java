package td.nhan.listview02;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.zip.Inflater;

import td.nhan.listview02.model.Technology;

public class ListViewAdapter extends ArrayAdapter<Technology> {

    private List<Technology> technologyList;
    private Context context;

    public ListViewAdapter(@NonNull Context context, List<Technology> resource) {
        super(context, R.layout.listview, resource);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View v = layoutInflater.inflate(R.layout.listview, parent, false);

        ImageView img = v.findViewById(R.id.img);
        TextView txt1 = v.findViewById(R.id.title);
        TextView txt2 = v.findViewById(R.id.sub);
        TextView txt3 = v.findViewById(R.id.content);

        Technology technology = technologyList.get(position);

        img.setImageResource(technology.getResImg());
        txt1.setText(technology.getTitle());
        txt2.setText(technology.getSub());
        txt3.setText(technology.getContent());

        return v;
    }
}
