package com.example.pol.sesion10;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Temp extends AppCompatActivity implements SensorEventListener {
    Sensor temp;
    SensorManager sm;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);

        temp = sm.getDefaultSensor(Sensor.TYPE_TEMPERATURE);
        sm.registerListener(this, temp, SensorManager.SENSOR_DELAY_NORMAL);
        text = (TextView) findViewById(R.id.tempdata2);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        text.setText("Temp Cº: "+sensorEvent.values[0]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
