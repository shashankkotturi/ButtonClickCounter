package lab1_202_17.uwaterloo.ca.lecture6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView myTV;

    Button buttonTap;
    Button buttonReset;

    int tapCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTV = (TextView) findViewById(R.id.myTV);

        buttonTap = (Button) findViewById(R.id.buttonTap);
        buttonReset = (Button) findViewById(R.id.buttonReset);

        tapCount = 0;

        buttonTap.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                // tapCount++;
                myTV.setText(String.format("%d Taps", ++tapCount));
            }

        });

        buttonReset.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                tapCount = 0;
                myTV.setText(String.format("%d Taps", tapCount));
            }

        });


    }
}
