package com.example.cryptographycpp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static android.nfc.tech.MifareClassic.BLOCK_SIZE;

public class MainActivity extends AppCompatActivity {
    EditText edt_encrypt;
    EditText edt_decrypt;
    Button btn_encrypt;
    Button btn_decrypt;
    TextView result, result1;

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(string);
// A simple test of TEA.

        public native String stringFromJNI();
    }
}