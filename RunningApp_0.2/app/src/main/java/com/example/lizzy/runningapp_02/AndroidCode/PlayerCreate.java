package com.example.lizzy.runningapp_02.AndroidCode;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.lizzy.runningapp_02.GameCode.Player;
import com.example.lizzy.runningapp_02.R;
import com.example.lizzy.runningapp_02.StaticThings;

public class PlayerCreate extends Activity {

    static boolean isMale = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_create);


        ImageButton boyButton = (ImageButton) findViewById(R.id.boyButton);
        ImageButton girlButton = (ImageButton) findViewById(R.id.femaleButton);
        final ImageView preview = (ImageView) findViewById(R.id.characterPreview);
        Button startButton = (Button) findViewById(R.id.startButton);
        final EditText name = (EditText) findViewById(R.id.nameTextBox);

        boyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.boy);
                isMale = true;
            }
        });

        girlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.girl);
                isMale = false;
            }
        });

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StaticThings.player = new Player(name.getText().toString(), isMale);
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.player_create, menu);
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
}
