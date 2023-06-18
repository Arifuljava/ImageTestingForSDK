package com.messas.imagetestingforsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class BitmApToImageActivity extends AppCompatActivity {
    ImageView imageviw,afterbitmapp;
Button convertsection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitm_ap_to_image);
        imageviw=findViewById(R.id.imageviw);
        afterbitmapp=findViewById(R.id.afterbitmapp);
        convertsection=findViewById(R.id.convertsection);
        convertsection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.rainy);
                Toast.makeText(BitmApToImageActivity.this, ""+bitmap, Toast.LENGTH_SHORT).show();;
                afterbitmapp.setImageBitmap(bitmap);
            }
        });


    }
}