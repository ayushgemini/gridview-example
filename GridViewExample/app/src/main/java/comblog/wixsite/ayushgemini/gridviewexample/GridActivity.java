package comblog.wixsite.ayushgemini.gridviewexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class GridActivity extends Activity {
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        init();

    }
    private void init(){
        getView();
        setView();
    }
    private void getView(){
        gridView=(GridView)findViewById(R.id.grid_view);
    }
    private void setView(){
        // Instance of GridViewAdapter Class
        gridView.setAdapter(new GridViewAdapter(this));
        /**
         * On Click event for Single Gridview Item
         * */
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), FullViewActivity.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });

    }

}
