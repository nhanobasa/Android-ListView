package td.nhan.listview02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import td.nhan.listview02.model.Technology;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ListViewAdapter listViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listSocialNetwork);

        listViewAdapter = new ListViewAdapter(MainActivity.this, getAll());
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(MainActivity.this, listViewAdapter.getItem(position).toString(), Toast.LENGTH_LONG).show();
        });

    }

    private List<Technology> getAll() {
        List<Technology> t = new ArrayList<>();
        t.add(new Technology(R.drawable.facebook_logo_png_9024, "Facebook", "Sub Spring", "D17"));
        t.add(new Technology(R.drawable.facebook_logo_png_9024, "Instagram", "Sub Spring", "D17"));
        t.add(new Technology(R.drawable.facebook_logo_png_9024, "Twitter", "Sub Spring", "D17"));
        t.add(new Technology(R.drawable.facebook_logo_png_9024, "Telegram", "Sub Spring", "D17"));

        return t;
    }
}