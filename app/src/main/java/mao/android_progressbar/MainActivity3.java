package mao.android_progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ProgressBar progressBar = findViewById(R.id.ProgressBar);

        ImageView imageView = findViewById(R.drawable.amin_pgbar);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();


        progressBar.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                animationDrawable.start();
            }
        }, 100);
    }
}