package lanure.listview;

import android.os.Bundle;
import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {
protected ListView lv;
    protected ListAdapter adapter;
    SimpleAdapter Adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] Pil;
    String[] Ltn;
    String[] Gbr;


@Override
public void onCreate(Bundle savedInstanceState){
super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);

     Pil = new String[] {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY","FRIDAY","SATURDAY",  "SUNDAY"};


Gbr = new String[] {Integer.toString(R.drawable.day),
                    Integer.toString(R.drawable.day),
                    Integer.toString(R.drawable.day),
                    Integer.toString(R.drawable.day),
                    Integer.toString(R.drawable.day),
                    Integer.toString(R.drawable.day),
                   Integer.toString(R.drawable.day) };


    mylist = new ArrayList<HashMap<String,String>>();
for (int i = 0; i < Pil.length; i++) {
    map = new HashMap<String, String>();
    map.put("list", Pil[i]);
    map.put("gbr", Gbr[i]);
    mylist.add(map);
    }

    Adapter = new SimpleAdapter(this, mylist, R.layout.rowlayout,
          new String[] {"list","gbr"}, new int[] {R.id.tv_nama, });
    lv.setAdapter(Adapter);
}

}