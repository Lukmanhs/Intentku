package com.lukmanhakims.tgsintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName ();
    public  static final String EXTRA_MESSAGE ="com.example.android.twoactivityes.extra.MESSAGE";
    private EditText mMessagenama,mMessagealamat,mMessagenohp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMessagenama = (EditText) findViewById(R.id.edit1);
        mMessagealamat = (EditText) findViewById(R.id.edit2);
        mMessagenohp = (EditText) findViewById(R.id.edit3);
    }
    public void launchSecondActivity ( View view ) {
        Log.d(LOG_TAG,"Button clicked");
        Intent intent = new Intent ( this, Layout2.class );
        intent.putExtra ("nama", mMessagenama.getText().toString());
        intent.putExtra ("alamat", mMessagealamat.getText().toString());
        intent.putExtra ("nohp", mMessagenohp.getText().toString());
        startActivity(intent);
    }
}
