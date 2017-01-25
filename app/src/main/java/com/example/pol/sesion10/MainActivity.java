package com.example.pol.sesion10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OmplirListview();
        Opcions();

    }

    private void OmplirListview() {
        String[] sensors = {"Accelerometer","Proximity","Light","Gyroscope","Ambient Temp", "Interior Temp","Orientation","Compass - Not working"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.llista, sensors);
        ListView list =(ListView) findViewById(R.id.LlistaMain);
        list.setAdapter(adapter);
    }
    private void Opcions() {
        ListView list =(ListView) findViewById(R.id.LlistaMain);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Intent opcio0 = new Intent(getApplicationContext(),Accelerometer.class);
                        startActivity(opcio0);
                        break;
                    case 1:Intent opcio1 = new Intent(getApplicationContext(),proximity.class);
                        startActivity(opcio1);
                        break;
                    case 2:Intent opcio2 = new Intent(getApplicationContext(),light.class);
                        startActivity(opcio2);
                        break;
                    case 3:Intent opcio3 = new Intent(getApplicationContext(),gyroscope.class);
                        startActivity(opcio3);
                        break;
                    case 4:Intent opcio4 = new Intent(getApplicationContext(),AmbTemp.class);
                        startActivity(opcio4);
                        break;
                    case 5:Intent opcio5 = new Intent(getApplicationContext(),Temp.class);
                        startActivity(opcio5);
                        break;
                    case 6:Intent opcio6 = new Intent(getApplicationContext(),orientation.class);
                        startActivity(opcio6);
                        break;
                    case 7:Intent opcio7 = new Intent(getApplicationContext(),magnetic.class);
                        startActivity(opcio7);
                        break;

                    default:
                        break;
                }
            }
        });

    }
}
