package com.joon.mydiceapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView diceImg1;
    ImageView diceImg2;

    MediaPlayer mp;

    // 5. 주사위 실제 이미지(1~6) 를 코드로 가져온다.
    // 6 . 이미지를 int로 가져온 이유는?? 안드로이드에서 자동으로 우리가 넣은 이미지를 정수로 바꿔서 관리합니다.
    int[] diceImages = {R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 0. 주사위 이미지 2개를 가져온다.
        diceImg1 = findViewById(R.id.imageDice1);
        diceImg2 = findViewById(R.id.imageDice2);

        mp = MediaPlayer.create(this,R.raw.dice_sound);
        // 1. 버튼 가져온다.
        Button btnRoll = findViewById(R.id.btnRollDice);
        //2. 버튼에 이벤트를 정의한다.
        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 3. 이 안에다 동작시키고 싶은 코드를 작성한다.

                // 3-1 버튼이 눌렸을때 실행 순서
                Log.i("MyDiceApp","주사위 버튼 눌렸음!"); // 코드를 불러오는지 확인 할 수 있다.
                // 3-2 랜덤으로 한 개 숫자 가져와서
                Random rand = new Random();
                int diceNumber = rand.nextInt(6);
                Log.i("MyDiceApp",""+diceNumber);
                // 3-3. 가져온 숫자에 맞는 주사위이미지를 셋팅한다.
                // dicenumber 는 0~5 까지 나온다. 따라서 다이스넘버에 해당하는 숫자가, 이미지배열의 인덱스와 같다.
                diceImg1.setImageResource(diceImages[diceNumber]);
                Log.i("MyDiceApp",""+diceNumber);
                diceImg2.setImageResource(diceImages[diceNumber]);

                YoYo.with(Techniques.RubberBand)
                        .duration(700)
                        .repeat(5)
                        .playOn(diceImg1);

                YoYo.with(Techniques.ZoomIn)
                        .duration(700)
                        .repeat(5)
                        .playOn(diceImg2);

                mp.start();
            }
        });


//        diceImg1.setImageResource(diceImages[5]);
//        diceImg2.setImageResource(diceImages[4]);
       }
}
