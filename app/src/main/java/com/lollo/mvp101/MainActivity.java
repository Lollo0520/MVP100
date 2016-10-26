package com.lollo.mvp101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements IMainView{

    private TextView textView;
    private MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =  (TextView) findViewById(R.id.text1);
        presenter = new MainPresenter(this);
        presenter.getString();
    }

    @Override
    public void onShowString(String s) {
        textView.setText(s);
    }
}
