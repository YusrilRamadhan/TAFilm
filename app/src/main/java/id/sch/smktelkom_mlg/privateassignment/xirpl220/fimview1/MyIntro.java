package id.sch.smktelkom_mlg.privateassignment.xirpl220.fimview1;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class MyIntro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       addSlide(AppIntroFragment.newInstance("FimView", "Informasi tentang Film-Film Popular",
               R.drawable.ic_local_movies_black_24dp, Color.parseColor("#51e2b7")));
        addSlide(AppIntroFragment.newInstance("FimView", "Informasi tentang Film-Film Coming Soon",
                R.drawable.ic_movie_filter_black_24dp, Color.parseColor("#51e2b7")));
        addSlide(AppIntroFragment.newInstance("FimView", "Informasi tentang Sejarah Film",
                R.drawable.ic_import_contacts_black_24dp, Color.parseColor("#51e2b7")));
        addSlide(AppIntroFragment.newInstance("FimView", "ENJOY IT!",
                R.drawable.huhah, Color.parseColor("#51e2b7")));

        showStatusBar(false);
        setBarColor(Color.parseColor("#333639"));
        setSeparatorColor(Color.parseColor("#2196F3"));
    }

    @Override
    public void onDonePressed() {
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        finish();
    }

    @Override
    public void onSlideChanged() {
        Toast.makeText(this, "Go Slide Changed", Toast.LENGTH_SHORT).show();
    }
}
