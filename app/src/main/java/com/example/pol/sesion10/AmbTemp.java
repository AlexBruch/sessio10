package com.example.pol.sesion10;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AmbTemp extends AppCompatActivity implements SensorEventListener {
    Sensor Atemp;
    SensorManager sm;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amb_temp);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);

        Atemp = sm.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
        sm.registerListener(this, Atemp, SensorManager.SENSOR_DELAY_NORMAL);
        text = (TextView) findViewById(R.id.tempdata);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        text.setText("Ambient Temp Cº: : "+sensorEvent.values[0]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
