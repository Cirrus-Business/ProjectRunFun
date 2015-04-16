package com.example.lizzy.runningapp_02.AndroidCode;

    import android.app.Activity;
    import android.app.Fragment;
    import android.app.FragmentTransaction;
    import android.content.Intent;
    import android.os.Bundle;
    import android.view.LayoutInflater;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.ImageButton;
    import android.widget.Toolbar;

    import com.example.lizzy.runningapp_02.GameCode.Place;
    import com.example.lizzy.runningapp_02.GameCode.Quest;
    import com.example.lizzy.runningapp_02.R;
    import com.example.lizzy.runningapp_02.StaticThings;

    import java.util.ArrayList;


    public class MainActivity extends Activity {

        public static ArrayList<Quest> quests = new ArrayList<Quest>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (StaticThings.player == null){
            Intent intent = new Intent(this, PlayerCreate.class);
            startActivity(intent);
        }
        StaticThings.setUpTowns();
        setContentView(R.layout.activity_main);

        quests.add(new Quest("Go somewhere", "Just move.", 0));
        quests.add(new Quest("Go anywhere", "Come On.Move. It cant be that hard", 0));
        quests.add(new Quest("Stay Still", "How the fuck did you- I just- I- I don't... What?", 89));

        Fragment newFragment = new WorldViewer();
        FragmentTransaction ft = (getFragmentManager()).beginTransaction();
        ft.replace(R.id.fragmentContainer, newFragment);
        ft.commit();

    }

    public void refresh(){

     }

    @Override
    protected void onResume() {
        super.onResume();
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolBar);
        if (StaticThings.player != null)
            mToolbar.setTitle("Welcome " + StaticThings.player.getName());
        mToolbar.inflateMenu(R.menu.main);
        setActionBar(mToolbar);
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
        Fragment newFragment;
        if (id == R.id.action_objectives) {
            newFragment = new CurrentObjectives();
        } else {
            newFragment = new WorldViewer();
        }
        FragmentTransaction ft = (getFragmentManager()).beginTransaction();
        ft.replace(R.id.fragmentContainer, newFragment);
        ft.commit();
        return true;
    }

}
