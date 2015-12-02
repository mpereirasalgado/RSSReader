package com.example.micael.rssreader;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RssfeedActivity extends Activity implements MyListFragment.OnItemSelectedListener, DetailFragment.OnItemListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rssfeed);
    }

    @Override
    public void onRssItemSelected(String link) {
        DetailFragment fragment1 = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        fragment1.setText(link);

    }

    @Override
    public void onOkItemSelected(String link) {
        MyListFragment fragment2 = (MyListFragment) getFragmentManager().findFragmentById(R.id.listFragment);
        fragment2.setText(link);
    }
}
// subir git

//ciclo de vida activity y ciclo de vida fragment
//que hace x funcion