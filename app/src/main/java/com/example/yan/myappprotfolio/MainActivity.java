package com.example.yan.myappprotfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private View rootView;
    CharSequence spot = "This button will launch Spotify Streamer ";
    CharSequence scores = "This button will lauch Scores App ";
    CharSequence library = "This button will lauch the library App ";
    CharSequence built = "This button will lauch Built It Bigger ";
    CharSequence xyz = "This button will lauch XYZ Reader ";
    CharSequence capstone = "This button will launch my capstone app ";
    Button button_spot;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.spotify_streamer_text_view)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), spot, Toast.LENGTH_SHORT).show();
            }
        });

        ((Button)findViewById(R.id.score_app_text_view)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), scores, Toast.LENGTH_SHORT).show();
            }
        });

        ((Button)findViewById(R.id.library_app_text_view)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), library, Toast.LENGTH_SHORT).show();
            }
        });

        ((Button)findViewById(R.id.build_it_bigger_text_view)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), built, Toast.LENGTH_SHORT).show();
            }
        });

        ((Button)findViewById(R.id.xyx_reader_text_view)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), xyz, Toast.LENGTH_SHORT).show();
            }
        });

        ((Button)findViewById(R.id.capstone_text_view)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), capstone, Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
