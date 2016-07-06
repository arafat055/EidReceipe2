package eidreceipie.islam.mazharul.eidreceipe;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity{

    ListView list;
    Integer[] itemname ={
            R.string.rec_01,
            R.string.rec_02,
            R.string.rec_03,
            R.string.rec_04,
            R.string.rec_05,
            R.string.rec_06,
            R.string.rec_07,
            R.string.rec_08,
            R.string.rec_09,
            R.string.rec_10,
            R.string.rec_11,
            R.string.rec_12,
            R.string.rec_13,
            R.string.rec_14,
            R.string.rec_15,
            R.string.rec_16,
            R.string.rec_17,
            R.string.rec_18,
            R.string.rec_19,
            R.string.rec_20

    };

    Integer[] imgid={
            R.drawable.rec_01,
            R.drawable.rec_02,
            R.drawable.rec_03,
            R.drawable.rec_04,
            R.drawable.rec_05,
            R.drawable.rec_06,
            R.drawable.rec_07,
            R.drawable.rec_08,
            R.drawable.rec_09,
            R.drawable.rec_10,
            R.drawable.rec_11,
            R.drawable.rec_12,
            R.drawable.rec_13,
            R.drawable.rec_14,
            R.drawable.rec_15,
            R.drawable.rec_16,
            R.drawable.rec_17,
            R.drawable.rec_18,
            R.drawable.rec_19,
            R.drawable.rec_20
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListOfRecipeAdapter adapter=new ListOfRecipeAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                Intent intent= new Intent(MainActivity.this,DetailsCook.class);
                intent.putExtra("position",position);
                startActivity(intent);
              //  String Slecteditem= itemname[+position];
               // Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}