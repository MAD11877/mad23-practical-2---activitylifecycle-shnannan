package sg.edu.np.mad.week2project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    final String title = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(title, "Create!");
        // Get the User object
        User myUser = new User();
        // getting username and passcode
        myUser.getName();
        myUser.getDescription();
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
}