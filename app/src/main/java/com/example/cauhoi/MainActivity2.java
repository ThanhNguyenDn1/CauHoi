package com.example.cauhoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cauhoi.model.CauHoi;
import com.example.cauhoi.model.FakeData;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvContent;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private TextView tvNext;
    private View v1;
    private View v2;
    private View v3;
    private View v4;
    private View v5;
    private Bitmap bitmap;
    private FakeData fakeData;
    private int Index=0;
    private int sst=0;
    private int[] ListResult=new int[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fakeData=new FakeData();
        addControl();
        sss(fakeData);
        setEvent();


    }

    private void setEvent() {
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sst==0){
                    CauHoi cauHoi=fakeData.ListQuestion.get(Index);
                    if(cauHoi.ListAnswers[0]==cauHoi.AnswersCorrect){
                        ListResult[Index]=1;
                        Log.d("AAAA","Dung");
                        img1.setBackgroundResource(R.drawable.correct);
                    }
                    else {
                        ListResult[Index]=0;
                        Log.d("AAAA","sai");
                        img1.setBackgroundResource(R.drawable.falses);
                    }
                    sst=1;
                }
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sst==0){
                    CauHoi cauHoi=fakeData.ListQuestion.get(Index);
                    if(cauHoi.ListAnswers[1]==cauHoi.AnswersCorrect){
                        ListResult[Index]=1;
                        Log.d("AAAA","Dung");
                        img2.setBackgroundResource(R.drawable.correct);
                    }
                    else {
                        ListResult[Index]=0;
                        img2.setBackgroundResource(R.drawable.falses);

                        Log.d("AAAA","sai");
                    }
                    sst=1;
                }
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sst==0){
                    CauHoi cauHoi=fakeData.ListQuestion.get(Index);
                    if(cauHoi.ListAnswers[2]==cauHoi.AnswersCorrect){
                        ListResult[Index]=1;
                        Log.d("AAAA","Dung");
                        img3.setBackgroundResource(R.drawable.correct);
                    }
                    else {
                        ListResult[Index]=0;
                        img3.setBackgroundResource(R.drawable.falses);
                        Log.d("AAAA","sai");
                    }
                    sst=1;
                }

            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sst==0){
                    CauHoi cauHoi=fakeData.ListQuestion.get(Index);
                    if(cauHoi.ListAnswers[3]==cauHoi.AnswersCorrect){
                        ListResult[Index]=1;
                        img4.setBackgroundResource(R.drawable.correct);
                        Log.d("AAAA","Dung");
                    }
                    else {
                        img4.setBackgroundResource(R.drawable.falses);
                        ListResult[Index]=0;
                        Log.d("AAAA","sai");
                    }
                    sst=1;
                }
            }
        });

        tvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(sst==1){
                   switch (Index){
                       case 0:{
                           if(ListResult[Index]==0){
                               v1.setBackgroundResource(R.drawable.falses);
                           }
                           else
                           {
                               v1.setBackgroundResource(R.drawable.correct);
                           }
                           break;
                       }
                       case 1:{
                           if(ListResult[Index]==0){
                               v2.setBackgroundResource(R.drawable.falses);
                           }
                           else
                           {
                               v2.setBackgroundResource(R.drawable.correct);
                           }
                           break;
                       }
                       case 2:{
                           if(ListResult[Index]==0){
                               v3.setBackgroundResource(R.drawable.falses);
                           }
                           else
                           {
                               v3.setBackgroundResource(R.drawable.correct);
                           }
                           break;
                       }
                       case 3:{
                           if(ListResult[Index]==0){
                               v4.setBackgroundResource(R.drawable.falses);
                           }
                           else
                           {
                               v4.setBackgroundResource(R.drawable.correct);
                           }
                           break;
                       }
                       case 4:{
                           if(ListResult[Index]==0){
                               v5.setBackgroundResource(R.drawable.falses);
                           }
                           else
                           {
                               v5.setBackgroundResource(R.drawable.correct);
                           }
                           break;
                       }
                   }
                   sst=0;
                   Index++;
                    sss(fakeData);
               }
            }
        });
    }

    private void addControl() {
        tvContent=(TextView) findViewById(R.id.tv_Content);
        img1=(ImageView)findViewById(R.id.img_aw1);
        img2=(ImageView)findViewById(R.id.img_aw2);
        img3=(ImageView)findViewById(R.id.img_aw3);
        img4=(ImageView)findViewById(R.id.img_aw4);
        tvNext=(TextView)findViewById(R.id.tv_nextAw);
        v1=(View) findViewById(R.id.v1);
        v2=(View) findViewById(R.id.v2);
        v3=(View) findViewById(R.id.v3);
        v4=(View) findViewById(R.id.v4);
        v5=(View) findViewById(R.id.v5);
    }
    Bitmap setBitmap(String s){
        try{
            InputStream is=getAssets().open(s);
            bitmap = BitmapFactory.decodeStream(is);

        }catch (IOException e){}
        return bitmap;
    }

    void sss(FakeData fakeData){
        if(Index<5){
            CauHoi cauHoi=fakeData.ListQuestion.get(Index);
            tvContent.setText(cauHoi.Content);
            img1.setImageBitmap(setBitmap(cauHoi.ListAnswers[0]));
            img2.setImageBitmap(setBitmap(cauHoi.ListAnswers[1]));
            img3.setImageBitmap(setBitmap(cauHoi.ListAnswers[2]));
            img4.setImageBitmap(setBitmap(cauHoi.ListAnswers[3]));
            img1.setBackgroundResource(R.drawable.bg_xml);
            img2.setBackgroundResource(R.drawable.bg_xml);
            img3.setBackgroundResource(R.drawable.bg_xml);
            img4.setBackgroundResource(R.drawable.bg_xml);
        }
        else {
            Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
            startActivity(intent);
            finish();
        }

    }

}