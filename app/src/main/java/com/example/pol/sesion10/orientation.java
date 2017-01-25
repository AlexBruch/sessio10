package com.example.pol.sesion10;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.hardware.Sensor.STRING_TYPE_ORIENTATION;

public class orientation extends AppCompatActivity implements SensorEventListener {
    Sensor orien;
    SensorManager sm;
    TextView text, text2;
    float[] a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);

        orien = sm.getDefaultSensor(Sensor.TYPE_ORIENTATION);
        sm.registerListener(this, orien, SensorManager.SENSOR_DELAY_NORMAL);
        text = (TextView) findViewById(R.id.orien1);
        text2 = (TextView) findViewById(R.id.orien2);
        text2.setText(STRING_TYPE_ORIENTATION);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        text.setText("X:"+ sensorEvent.values[0]+
                "\nY:"+ sensorEvent.values[1]+
                "\nZ:"+ sensorEvent.values[2]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
