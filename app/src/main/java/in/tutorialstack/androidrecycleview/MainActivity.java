package in.tutorialstack.androidrecycleview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String TAG = MainActivity.class.getSimpleName();

    Context context;
    private RecyclerView mRecyclerView;
    private ItemAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            context = this;
            mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

            mLayoutManager = new LinearLayoutManager(this);
            mRecyclerView.setLayoutManager(mLayoutManager);

            mAdapter = new ItemAdapter(getItemList());
            mRecyclerView.setAdapter(mAdapter);
            mAdapter.setOnItemClicklListener(new ItemAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    Toast.makeText(context, "Clicked item position: " + position, Toast.LENGTH_LONG).show();
                }
            });
        } catch (Exception ex) {
            Log.e(TAG, ex.getMessage());
        }
    }

    private List<DataModel> getItemList() {
        List<DataModel> models = new ArrayList<>();
        models.add(new DataModel("Item Title 1", "01 Jan, 2018"));
        models.add(new DataModel("Item Title 2", "02 Jan, 2018"));
        models.add(new DataModel("Item Title 3", "03 Jan, 2018"));
        models.add(new DataModel("Item Title 4", "04 Jan, 2018"));
        models.add(new DataModel("Item Title 5", "05 Jan, 2018"));
        models.add(new DataModel("Item Title 6", "06 Jan, 2018"));
        models.add(new DataModel("Item Title 7", "07 Jan, 2018"));
        models.add(new DataModel("Item Title 8", "08 Jan, 2018"));
        models.add(new DataModel("Item Title 9", "09 Jan, 2018"));
        models.add(new DataModel("Item Title 10", "10 Jan, 2018"));
        models.add(new DataModel("Item Title 11", "11 Jan, 2018"));
        models.add(new DataModel("Item Title 12", "12 Jan, 2018"));

        return models;
    }
}