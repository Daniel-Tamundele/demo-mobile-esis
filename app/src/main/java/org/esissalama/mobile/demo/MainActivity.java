package org.esissalama.mobile.demo;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] dices = {
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6
    };

    ImageView image = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        image = findViewById(R.id.ivDes);

        button.setOnClickListener(v -> {

            new CountDownTimer(1500,1) {
                @Override
                public void onTick(long millisUntilFinished) {
                    roll();
                }

                @Override
                public void onFinish() {
                    roll();
                }
            }.start();
        });
    }

    private void roll() {
        int indice = new Random().nextInt(6);
        image.setImageResource(dices[indice]);
    }
}