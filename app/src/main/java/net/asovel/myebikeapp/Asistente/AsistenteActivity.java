package net.asovel.myebikeapp.Asistente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;

import net.asovel.myebikeapp.R;

public class AsistenteActivity extends AppCompatActivity {

    private CustomSeekBar mySeekBar;
    private RadioGroup radioGroupMotor;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistente);

        mySeekBar = (CustomSeekBar) findViewById(R.id.mySeekBar_diametro_rueda);
        radioGroupMotor = (RadioGroup) findViewById(R.id.radioGroup_traccion);
        radioButton = (RadioButton) findViewById(R.id.traccion_trasera);

        radioGroupMotor.setEnabled(false);


        mySeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

    }
}

