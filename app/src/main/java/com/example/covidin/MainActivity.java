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
//
//import okhttp3.ResponseBody;
//import retrofit2.Call;
//import retrofit2.Retrofit;
////import retrofit2.converter.gson.GsonConverterFactory;
//import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
//import retrofit2.http.GET;
//
////import static retrofit2.converter.gson.GsonConverterFactory.*;


public class MainActivity extends Activity {


    EditText edit;
    TextView text;

    XmlPullParser xpp;
    String key = "INtNC54XZqdLzdO%2BaPP5sO9ZR3%2FgW1z7IbGhd6uPOuYaTmB5iYtZKJLRme9rlEEn23GBSkUNSIJUZYQ%2FygATHw%3D%3D";


    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit= (EditText) findViewById((R.id.edit));
        text = (TextView) findViewById(R.id.result);
    }



    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.button:


                new Thread(new Runnable() {

                    @Override
                    public void run() {
                        // TODO Auto-generated method stub
                        data = getXmlData();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                // TODO Auto-generated method stub
                                text.setText(data); //TextView에 문자열  data 출력
                            }
                        });
                    }
                }).start();
                break;
        }
    }


    String getXmlData() {

        StringBuffer buffer = new StringBuffer();


        String queryUrl = "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19SidoInfStateJson?" +
                "serviceKey=INtNC54XZqdLzdO%2BaPP5sO9ZR3%2FgW1z7IbGhd6uPOuYaTmB5iYtZKJLRme9rlEEn23GBSkUNSIJUZYQ%2FygATHw%3D%3D" +
                "&pageNo=1&numOfRows=10";

        try {
            URL url = new URL(queryUrl);
            InputStream is = url.openStream();

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xpp = factory.newPullParser();
            xpp.setInput(new InputStreamReader(is, "UTF-8"));

            String tag;

            xpp.next();
            int eventType = xpp.getEventType();

            while (eventType != XmlPullParser.END_DOCUMENT) {
                switch (eventType) {
                    case XmlPullParser.START_DOCUMENT:
                        buffer.append("파싱 시작...\n\n");
                        break;

                    case XmlPullParser.START_TAG:
                        tag = xpp.getName();

                        if (tag.equals("item")) ;
                        else if (tag.equals("gubun")) {
                            buffer.append("시도 : ");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        else if (tag.equals("stdDay")) {
                            buffer.append("기준일시  :");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");


                        } else if (tag.equals("defCnt")) {
                            buffer.append("확진자 수 :");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        } else if (tag.equals("createDt ")) {
                            buffer.append("등록일시분 :");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        } else if (tag.equals("incDec")) {
                            buffer.append("전일대비 증감 수  :");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        } else if (tag.equals("isolClearCnt")) {
                            buffer.append("격리 해제 수   :");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append(" \n ");
                        } else if (tag.equals("isolIngCnt")) {
                            buffer.append("격리중 환자수 :");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        } else if (tag.equals("localOccCnt")) {
                            buffer.append("지역발생 수  :");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        } else if (tag.equals("overFlowCnt")) {
                            buffer.append("해외 유입 수 :");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        } else if (tag.equals("seq")) {
                            buffer.append("게시글번호  :");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        } else if (tag.equals("deathCnt")) {
                            buffer.append("사망자  : ");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
//                        else if(tag.equals("updateDt")){
//                            buffer.append("수정일시분초  :");
//                            xpp.next();
//                            buffer.append(xpp.getText());//mapy 요소의 TEXT 읽어와서 문자열버퍼에 추가
//                            buffer.append("\n"); //줄바꿈 문자 추가
//                        }
                        break;

                    case XmlPullParser.TEXT:
                        break;

                    case XmlPullParser.END_TAG:
                        tag = xpp.getName();

                        if (tag.equals("item")) buffer.append("\n");
                        break;
                }

                eventType = xpp.next();
            }

        } catch (Exception e) {
            // TODO Auto-generated catch blocke.printStackTrace();
        }

        buffer.append("파싱 완료 \n");
        return buffer.toString();

    }


}














