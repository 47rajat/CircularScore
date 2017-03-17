package com.wssholmes.stark.circularscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wssholmes.stark.circular_score.CircularScoreAnimation;
import com.wssholmes.stark.circular_score.CircularScoreView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircularScoreView one = (CircularScoreView) findViewById(R.id.one);
        CircularScoreView two = (CircularScoreView) findViewById(R.id.two);
        CircularScoreView three = (CircularScoreView) findViewById(R.id.three);

        CircularScoreAnimation oneAnimation = new CircularScoreAnimation(one, 25);
        oneAnimation.setDuration(2000);

        CircularScoreAnimation twoAnimation = new CircularScoreAnimation(two, 25, 75);
        twoAnimation.setDuration(2000);

        one.startAnimation(oneAnimation);
        two.startAnimation(twoAnimation);
    }
}
