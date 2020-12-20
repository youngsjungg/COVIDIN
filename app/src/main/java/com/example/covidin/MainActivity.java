package com.example.covidin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.attribute.AclEntry;
import java.util.ArrayList;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.covidin.R;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import retrofit2.http.GET;

//import static retrofit2.converter.gson.GsonConverterFactory.*;


public class MainActivity extends Activity {


     private final String TAG = "BT";
     private final String key = "INtNC54XZqdLzdO%2BaPP5sO9ZR3%2FgW1z7IbGhd6uPOuYaTmB5iYtZKJLRme9rlEEn23GBSkUNSIJUZYQ%2FygATHw%3D%3D";
     private final String endPoint = "INtNC54XZqdLzdO%2BaPP5sO9ZR3%2FgW1z7IbGhd6uPOuYaTmB5iYtZKJLRme9rlEEn23GBSkUNSIJUZYQ%2FygATHw%3D%3D";

     private SearchView xmlGUBUN;//xml변수

    private URL url;
    private InputStream is;
    private XmlPullParserFactory factory;
    private XmlPullParser xpp;
    private String tag;
    private int eventType;


    private String GUBUN;//도시
    private StringBuffer buffer;

    private String createDt;
    private String deathCnt;
    private String defCnt;
    private String gubun;
    private String incDec;
    private String isolClearCnt;
    private String isolIngCnt;
    private String localOccCnt;
    private String overFlowCnt;
    private String seq;
    private String stdDay;
    private String updateDt;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getXmlId();
        butter = new StringBuffer();


    }

    private void getXmlId() {
    }

    public void search(View view) {
        GUBUN = xmlGUBUN.getText().toString();
        createDt = deathCnt = defCnt = gubun = incDec = isolClearCnt = isolIngCnt=localOccCnt= overFlowCnt=seq=stdDay=updateDt=null;
        buffer = null;
        buffer = new StringBuffer();

        if(exmineData()) {
            // 입력값 검사 함수에서 true를 return할 경우 값이 잘못된 것..
            // 종료..
            return;


            new Thread(new Runnable() {
                @Override
                public void run() {
                    getGUBUN(GUBUN);




    }



}






     









