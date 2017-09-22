package me.bankumon.productflavorsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.MetaKeyKeyListener;
import android.widget.TextView;

import me.bankumon.productflavorsdemo.utils.MetaDataReader;

public class MainActivity extends AppCompatActivity {

    private TextView tvUmeng_Channel;
    private TextView tvKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUmeng_Channel = (TextView) findViewById(R.id.tv_umeng_channel);
        tvKey = (TextView) findViewById(R.id.tv_key);

        setText();

    }

    private void setText() {
        tvUmeng_Channel.setText("UMENG_CHANNEL:" + MetaDataReader.readAppKeyFromMetaData("UMENG_CHANNEL"));
        tvKey.setText("KEY:" + MetaDataReader.readAppKeyFromMetaData("KEY"));
    }
}
