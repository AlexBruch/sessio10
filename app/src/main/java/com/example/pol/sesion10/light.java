package com.example.pol.sesion10;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class light extends AppCompatActivity implements SensorEventListener{
    Sensor light;
    SensorManager sm;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);

        light = sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this, light, SensorManager.SENSOR_DELAY_NORMAL);
        text = (TextView) findViewById(R.id.lightdata);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        text.setText("Lux: "+sensorEvent.values[0]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
