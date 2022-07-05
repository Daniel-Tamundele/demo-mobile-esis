package org.esissalama.mobile.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);
        ImageView img = (ImageView) findViewById(R.id.img);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nb = new Random().nextInt(6) + 1;

                switch (nb) {
                    case 1:
                        img.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        img.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        img.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        img.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        img.setImageResource(R.drawable.dice_5);
                        break;
                    default:
                        img.setImageResource(R.drawable.dice_6);
                        break;
                }
            }
        });
    }
}