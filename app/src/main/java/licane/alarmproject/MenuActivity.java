package licane.alarmproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by MSI on 28/05/2017.
 */

public class MenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);

        Button alarmBtn = (Button) findViewById(R.id.horloge);
        Button audioBtn = (Button) findViewById(R.id.audioRecord);

        alarmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setContentView(R.layout.activity_main);
            }
        });

    }


   public void onClickAudioBtn(View view){

        Intent startIntent = new Intent(MenuActivity.this, MainActivity2.class);
        startActivity(startIntent);

    }

}
