package in.silive.bytepad.Ui.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import java.util.concurrent.TimeUnit;

import in.silive.bytepad.R;
import io.reactivex.Completable;
import io.reactivex.Observable;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        GoToHome();
    }

    private void GoToHome() {
        //This is rxjava time handler which execute doOnComplete task after the delay...
        Completable.complete()
                .delay(1500, TimeUnit.MILLISECONDS)
                .doOnComplete(() -> {
                    startActivity(new Intent(this,MainActivity.class));
                    Animatoo.animateSlideLeft(this);
                })
                .subscribe();
    }
}