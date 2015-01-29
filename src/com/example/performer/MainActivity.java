package com.example.performer;

import android.support.v7.app.ActionBarActivity;
import android.R.integer;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity implements OnClickListener, OnItemClickListener {

	
	private ListView lv;
	private ArrayAdapter<String>  adapter;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        //设置adapter,让它存储并显示ListView的内容。
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1);
        lv=(ListView)findViewById(R.id.lv);
        lv.setAdapter(adapter);
        adapter.add("任务一");
        adapter.add("任务二");
        adapter.add("任务三");
        adapter.add("任务四");
        adapter.add("任务五");
        adapter.add("任务六");
        
        //设置ListView的内容监听器
        lv.setOnItemClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //触发事件
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
		
		Intent i=new Intent(MainActivity.this,Aty1.class);
		startActivity(i);
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}




}
