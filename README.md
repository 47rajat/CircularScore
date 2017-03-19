# CircularScore

A lightweight custom circular view for android.

[ ![Download](https://api.bintray.com/packages/wssholmes/circular-score/circular-score/images/download.svg) ](https://bintray.com/wssholmes/circular-score/circular-score/_latestVersion)

![alt text](https://media.giphy.com/media/m0zv8ji3eATEk/giphy.gif "Example app screenshot")


## Gradle


```gradle
dependencies {
    compile 'com.wssholmes.stark:circular-score:0.1.1'
}
````

## Usage
---
```xml
<com.wssholmes.stark.circular_score.CircularScoreView
            android:id="@+id/two"
            android:layout_width="100dp"
            android:layout_height="100dp"
            app:score="50"
            app:setPrimaryColor="@color/color_primary"
            app:setSecondaryColor="@color/color_secondary"
            app:setBackgroundColor="@color/color_background"
            app:setTextColor="@color/color_text"/>
```

```java
CircularScoreView circularScoreView = (CircularScoreView) findViewById(R.id.score_view);
circularScoreView.setScore(20);
```

**Properties**
- ` app:score` : int to set score/progress.
- `app:setPrimaryColor` : used to set color of score indicator.
- `app:setSecondaryColor` : used to set color of reamaining indicator.
- `app:setBackgroundColor` : used to set color of background circle.
- `app:setTextColor` : used to set color of the text in the middle.

**Methods**
- `void setScore(int score)` : used to set the score.
- `void setPrimaryColor(int color)` : used to set the color of score indicator.
- `void setSecondaryColor(int color)`: used to set color of remaining indicator.
- `void setBackgroundColor(int color)`: used to set color of background circle.
- `void setTextColor(int color)` : used to set color of the text in the middle.

## Animation

```java
CircularScoreAnimation circularScoreAnimation = new CircularScoreAnimation(circularScoreView, 25);
circularScoreAnimation.setDuration(2000); //duration in millisecond.
circularScoreView.startAnimation(circularScoreAnimation);
```

```java
CircularScoreAnimation circularScoreAnimation = new CircularScoreAnimation(circularScoreView, 25, 75);
circularScoreAnimation.setDuration(1500); //duration in millisecond.
circularScoreView.startAnimation(circularScoreAnimation);
```

**Constructors**
- `CircularScoreAnimation(CircularScoreView circularScoreView, int endScore)` : use to set animation from 0 to `endScore`.
- `CircularScoreAnimation(CircularScoreView circularScoreView, int starScore, int endScore)` : use to set animation from `startScore` to `endScore`.


## License

The contents of this repository are covered under the [Apache License](https://github.com/wssholmes/CircularScore/blob/master/LICENSE)





