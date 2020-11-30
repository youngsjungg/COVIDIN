//package com.example.covidin;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import org.xmlpull.v1.XmlPullParser;
//import org.xmlpull.v1.XmlPullParserFactory;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.net.URLEncoder;
//import java.util.ArrayList;
//
//import android.widget.ArrayAdapter;
//import android.widget.Spinner;
//
//
//public class MainActivity extends Activity {
//
//    Button btn_sp;
//    ArrayList arrayList;
//    Spinner spinner;
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        arrayList = new ArrayList();
//        arrayList.add("제주");
//        arrayList.add("경남");
//        arrayList.add("경북");
//
//
//        final String[] select_item = {""};
//
//        Spinner spinner = (Spinner) findViewById(R.id.spinner);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>
//                (this, android.R.layout.simple_spinner_dropdown_item, arrayList);
//        spinner.setAdapter(adapter);
//
//        Button button = (Button) findViewById(R.id.btn_sp);
//
//
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
//                select_item[0] = String.valueOf(arrayList.get(arg2));
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> arg0) {
//
//            }
//        });
//
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (select_item[0].equals("제주")) {
//                    Intent intent = new Intent(MainActivity.this, Activity1.class);
//                    startActivity(intent);
//                    finish();
//
//                } else if (select_item[0].equals("경남")) {
//                    Intent intent = new Intent(MainActivity.this, Activity1.class);
//                    startActivity(intent);
//                    finish();
//                }
//                else if (select_item[0].equals("경북")) {
//                    Intent intent = new Intent(MainActivity.this, Activity1.class);
//                    startActivity(intent);
//                    finish();
//                }
//            }
//        });
//
//
//    }
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
