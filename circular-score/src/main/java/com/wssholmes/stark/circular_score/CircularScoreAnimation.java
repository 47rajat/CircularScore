package com.wssholmes.stark.circular_score;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by stark on 13/03/17.
 */

public class CircularScoreAnimation extends Animation {

    private CircularScoreView mCircularScoreView;

    private int mStartScore;
    private int mEndScore;

    public CircularScoreAnimation(CircularScoreView circularScoreView, int endScore){
        mCircularScoreView = circularScoreView;
        mStartScore = 0;
        mEndScore = endScore;
    }

    public CircularScoreAnimation(CircularScoreView circularScoreView, int starScore, int endScore){
        mCircularScoreView = circularScoreView;
        mStartScore = starScore;
        mEndScore = endScore;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        int score = (int)  (mStartScore + (mEndScore - mStartScore)*interpolatedTime);

        mCircularScoreView.setScore(score);
    }
}
