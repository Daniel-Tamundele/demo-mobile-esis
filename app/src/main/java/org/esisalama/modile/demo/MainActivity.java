package org.esisalama.modile.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] images = new int[]{
                R.drawable.dice_1,
                R.drawable.dice_2,
                R.drawable.dice_3,
                R.drawable.dice_4,
                R.drawable.dice_5,
                R.drawable.dice_6,
        };

        ImageView imageView = findViewById(R.id.dice_1);
        Button Lance = findViewById(R.id.Button_1);

        Lance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                int i = random.nextInt(5);
                imageView.setImageResource(images[i]);
                Toast  toast =Toast.makeText(MainActivity.this,"Vous avait appuyer",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}