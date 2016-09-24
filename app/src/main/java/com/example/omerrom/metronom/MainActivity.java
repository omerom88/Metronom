package com.example.omerrom.metronom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        AudioGenerator audio = new AudioGenerator(8000);
//        double[] silence = audio.getSineWave(20000, 8000, 0);
//        int noteDuration = 2400;
//        double[] doNote = audio.getSineWave(noteDuration/2, 8000, 523.25);
//        double[] reNote = audio.getSineWave(noteDuration/2, 8000, 587.33);
//        double[] faNote = audio.getSineWave(noteDuration, 8000, 698.46);
//        double[] laNote = audio.getSineWave(noteDuration, 8000, 880.00);
//        audio.createPlayer();

        Metronome metronome = new Metronome(70,4);
        metronome.play();

//        audio.writeSound(doNote);
//        audio.writeSound(silence);
//        audio.writeSound(doNote);
//        audio.writeSound(silence);
//        audio.writeSound(doNote);
//        audio.writeSound(silence);
//        audio.writeSound(doNote);
//        audio.writeSound(silence);
//        audio.writeSound(doNote);
//        audio.writeSound(silence);
//        audio.writeSound(doNote);
//        audio.destroyAudioTrack();
    }
}
