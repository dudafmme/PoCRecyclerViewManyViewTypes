package dudafmme.com.br.pocrecyclerviewmanyviewtypes;

import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Item> lines = new ArrayList<>();
    private static final String USER_TYPE = "USER";
    private static final String AGENT_TYPE = "AGENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Populating list items
        lines.add(new Item(USER_TYPE));
        lines.add(new Item(AGENT_TYPE));
        lines.add(new Item(AGENT_TYPE));
        lines.add(new Item(USER_TYPE));
        lines.add(new Item(USER_TYPE));
        lines.add(new Item(AGENT_TYPE));
        lines.add(new Item(USER_TYPE));
        lines.add(new Item(AGENT_TYPE));

        mRecyclerView = (RecyclerView) findViewById(R.id.mRecycler);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new LineAdapter(lines);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mRecyclerView.setAdapter(mAdapter);
    }
}