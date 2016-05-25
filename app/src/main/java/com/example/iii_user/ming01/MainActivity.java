package com.example.iii_user.ming01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    final String[] from ={"title","content","image"};
    int [] to = {R.id.layout_TextView,R.id.layout_content,R.id.layout_ImageView};
    ArrayList<HashMap<String,Object>> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listview);
        theView();
    }
    private void theView (){

        HashMap<String,Object> data0 =new HashMap<>();
        data0.put(from[0],"蓋倫 Garen");
        data0.put(from[1],"「想殺死一個敵人，最有效的方法就是連他身邊的人一起砍翻。」");
        data0.put(from[2],R.drawable.garen);
        data.add(data0);

        HashMap<String,Object> data1 =new HashMap<>();
        data1.put(from[0],"達瑞文 Draven");
        data1.put(from[1], "「最棒的秀 ─ 是我每天生活的縮影與享受。」");
        data1.put(from[2],R.drawable.draven);
        data.add(data1);

        HashMap<String,Object> data2 =new HashMap<>();
        data2.put(from[0],"艾希 Ashe");
        data2.put(from[1], "「同個部落，同種人民，共同的弗雷爾卓德。」");
        data2.put(from[2],R.drawable.ashe);
        data.add(data2);

        HashMap<String,Object> data3 =new HashMap<>();
        data3.put(from[0],"勒布朗 Leblanc");
        data3.put(from[1],"「真相一直都擺在眼前。在那些無法看清事實的人們眼中，這個世界是完全不同的。」");
        data3.put(from[2],R.drawable.leblanc);
        data.add(data3);

        HashMap<String,Object> data4 =new HashMap<>();
        data4.put(from[0],"悟空 MonkeyKing");
        data4.put(from[1],"「只有透過戰鬥，才能找到真我，吱！」");
        data4.put(from[2],R.drawable.monkeyking);
        data.add(data4);


        SimpleAdapter adapter = new SimpleAdapter(
                this,
                data,
                R.layout.layout_listview,
                from,to);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                String title =(String)data.get(position).get(from[0]);
                Toast.makeText(MainActivity.this,title,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
