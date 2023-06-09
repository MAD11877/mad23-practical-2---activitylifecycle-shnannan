package sg.edu.np.mad.week2project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    final String title = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(title, "Create!");
        // Get the User object
        User myUser = new User();
        // getting Name and description
        myUser.followed = false; // not followed!
        myUser.isFollowed();
        TextView tv2 = findViewById(R.id.textView2);
        tv2.setText("Hello World!");
        TextView tv = findViewById(R.id.txtDesc);
        tv.setText("Lorem ipsum dolor sit amet. Et quas recusandae id quae deserunt ea placeat beatae quo velit quam est quidem soluta et rerum voluptas ut alias fuga! Ab pariatur ipsum hic libero rerum qui doloribus nobis qui quam sint non culpa inventore et voluptas sequi.");
        ToggleButton togBtn2 = findViewById(R.id.toggleButton2);

        if (myUser.followed)  // if user is followed show unfollowed
        {
            togBtn2.getTextOn(); // unfollowed (already following)
            togBtn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    togBtn2.getTextOff(); //follow (not following)
                    Log.v(title,"Toggle Button: Follow clicked! Now Unfollowed..");
                }
            });
        }
        else { // if user is unfollowed then show follow
            togBtn2.getTextOff();  //follow (not following)
            togBtn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    togBtn2.getTextOn();
                    Log.v(title,"Toggle Button: Follow clicked!Now Following");
                }
            });
        }

        ToggleButton togBtn3 = findViewById(R.id.toggleButton3);
        togBtn3.getTextOff();
        togBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(title,"Toggle Button: Message clicked!");
                togBtn3.getTextOn();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(title, "Start!"); // title, msg (logging) which of these functions am i in
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(title, "Resume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(title,"Paused");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(title,"Stop!");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.v(title,"Restart");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(title,"Destroy");
    }
}