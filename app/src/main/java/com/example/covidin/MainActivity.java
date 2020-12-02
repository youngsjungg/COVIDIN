package com.example.covidin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.covidin.R;


public class MainActivity extends Activity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinner = (Spinner)findViewById(R.id.spinner);

        //input array data
        final ArrayList<String> list = new ArrayList<>();
        list.add("도시를 선택하세요");
        list.add("경남");
        list.add("경북");
        list.add("제주");

        String[] list2 = new String[2];
        list2[0] = xmlpasing.java;
        list2[1] = "하세요";

        //using ArrayAdapter
        ArrayAdapter spinnerAdapter;
        spinnerAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, list2);
        spinner.setAdapter(spinnerAdapter);

        //event listener
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"선택된 아이템 : "+spinner.getItemAtPosition(position),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}


//        ArrayAdapter monthAdapter = ArrayAdapter.createFromResource(this, R.array.sido, android.R.layout.simple_spinner_dropdown_item);
//        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(monthAdapter); //어댑터에 연결해줍니다.
//
//
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//            }
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) { }
//        });
//    }
//}


     









