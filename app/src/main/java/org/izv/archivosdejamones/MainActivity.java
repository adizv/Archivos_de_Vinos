package org.izv.archivosdejamones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.izv.archivosdejamones.data.Vino;
import org.izv.archivosdejamones.util.Csv;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getName() + "xyzyx";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        Vino v = new Vino(1,"Betis", "Man que pierda", "Verde", "Benito Villamarín", 15.2, 2015);
        String csv = Csv.getCsv(v);
        Log.v(TAG, csv);
        Vino v2 = Csv.getVino(csv);
        Log.v(TAG, v2.toString());
    }
}