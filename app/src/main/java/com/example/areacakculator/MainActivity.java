package com.example.areacakculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mEditWidth;
    EditText mEditHeight;
    TextView mTextResult;
    Button mButtonCircular;
    Button mButtonTriangular;
    Button mButtonRectangular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditWidth = (EditText) findViewById(R.id.editWidth);
        mEditHeight = (EditText) findViewById(R.id.EditHeight);
        mTextResult =(TextView) findViewById(R.id.TextResult);
mButtonCircular = (Button) findViewById(R.id.Buttoncircular);
mButtonTriangular = (Button) findViewById(R.id.ButtonTriangular);
mButtonRectangular = (Button) findViewById(R.id.ButtonRectangular);

mButtonCircular.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        CircleCalculate();
    }
});
mButtonTriangular.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        TriangleCalculate();
    }
});
mButtonRectangular.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        RectangleCalculate();
    }
});
    }
    public void CircleCalculate(){
        Double width = Double.parseDouble (mEditWidth.getText().toString());
        Double Height = Double.parseDouble(mEditHeight.getText().toString());
Double CalculateCircle = width*Height*3.14;
mTextResult.setText(CalculateCircle.toString());
    }
   public void TriangleCalculate(){
        Double width = Double.parseDouble(mEditWidth.getText().toString());
        Double Height = Double.parseDouble(mEditHeight.getText().toString());
        Double CalculateTriangle = 0.5*width*Height;
        mTextResult.setText(CalculateTriangle.toString());
   }
    public void RectangleCalculate(){
        Double width = Double.parseDouble(mEditWidth.getText().toString());
        Double Height = Double.parseDouble(mEditHeight.getText().toString());
        Double CalculateRectangle = width*Height;
        mTextResult.setText(CalculateRectangle.toString());

    }

}