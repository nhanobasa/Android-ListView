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

import td.nhan.listview02.model.Technology;

public class ListViewAdapter extends ArrayAdapter<Technology> {

    private List<Technology> technologyList;

    public ListViewAdapter(@NonNull Context context, List<Technology> resource) {
        super(context, R.layout.listview, resource);
        technologyList = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the data item for this position
        Technology technology = technologyList.get(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview, parent, false);

        // Lookup view for data population
        ImageView imageView = convertView.findViewById(R.id.img);
        TextView textView1 = convertView.findViewById(R.id.title);
        TextView textView2 = convertView.findViewById(R.id.sub);
        TextView textView3 = convertView.findViewById(R.id.content);

        // Populate the data into the template view using the data object
        imageView.setImageResource(technology.getResImg());
        textView1.setText(technology.getTitle());
        textView2.setText(technology.getSub());
        textView3.setText(technology.getContent());

        // Return the completed view to render on screen
        return convertView;

    }

    public Technology getItem(int position) {
        return technologyList.get(position);
    }
}
