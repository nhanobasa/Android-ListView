package td.nhan.listview02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

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
    }

    private List<Technology> getAll() {
        List<Technology> t = new ArrayList<>();
        t.add(new Technology(R.drawable.facebook_logo_png_9024, "Spring", "Sub Spring", "D17"));
        t.add(new Technology(R.drawable.facebook_logo_png_9024, "Spring", "Sub Spring", "D17"));
        t.add(new Technology(R.drawable.facebook_logo_png_9024, "Spring", "Sub Spring", "D17"));
        t.add(new Technology(R.drawable.facebook_logo_png_9024, "Spring", "Sub Spring", "D17"));

        return t;
    }
}