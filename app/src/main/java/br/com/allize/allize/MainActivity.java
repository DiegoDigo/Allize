package br.com.allize.allize;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager sliderViewPage;
    private LinearLayout dotsLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderViewPage =  findViewById(R.id.viewPageSlide);
        dotsLayout = findViewById(R.id.linearLayoutDots);

    }
}
