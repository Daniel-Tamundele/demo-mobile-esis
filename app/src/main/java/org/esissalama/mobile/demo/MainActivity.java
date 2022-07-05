package org.esissalama.mobile.demo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.playBtn);
        imageView = findViewById(R.id.ic_dice);

        Random ran = new Random();

        button.setOnClickListener(v -> {
            int i = ran.nextInt(6);
            imageView.setImageResource(imageSelect(i));
            Toast.makeText(this, "" + (i), Toast.LENGTH_SHORT).show();
        });
    }

    private int imageSelect(int choice){
        int c;
        switch (choice) {
            case 1 : c = R.drawable.dice_1; break;
            case 2 : c = R.drawable.dice_2; break;
            case 3 : c = R.drawable.dice_3; break;
            case 4 : c = R.drawable.dice_4; break;
            case 5 : c = R.drawable.dice_5; break;
            default : c = R.drawable.dice_6; break;
        }
        return c;
    }
}