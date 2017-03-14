package com.mdazizulhakim.bddivision;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DivisionDetails extends AppCompatActivity {

    Button btnMore;
    TextView txtDivHead, txtDiv1, txtDiv2, txtDivHistory, txtdivWeather;
    ImageView imgDiv, imgChart1, imgChart2, imgChartWeather;

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division_details);

        actionBar = getSupportActionBar();

        String data = getIntent().getExtras().getString("Division");

        btnMore = (Button) findViewById(R.id.btnMoreInfo);
        txtDiv1 = (TextView) findViewById(R.id.txtDivtxt1);
        txtDivHead = (TextView) findViewById(R.id.txtHead);
        txtDiv2 = (TextView) findViewById(R.id.txtDivtxt2);
        txtDivHistory = (TextView) findViewById(R.id.txtDivHistory);
        txtdivWeather = (TextView) findViewById(R.id.txtWeather);

        imgChart1 = (ImageView) findViewById(R.id.imgDivChart1);
        imgChart2 = (ImageView) findViewById(R.id.imgdivChart2);
        imgDiv = (ImageView) findViewById(R.id.imgDiv);
        imgChartWeather = (ImageView) findViewById(R.id.imgDivWeather);


        if (data.equals("Dhaka")) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));
            actionBar.setTitle(Html.fromHtml("<font color='#088A08'>Dhaka</font>"));
            txtDivHead.setText("Dhaka,Bangladesh");
            txtDiv1.setText(R.string.dhaka1);
            txtDiv2.setText(R.string.dhaka2);
            txtDivHistory.setText(R.string.dhaka3);
            txtdivWeather.setText("Dhaka's Weather Chart");

            imgDiv.setImageResource(R.drawable.dhakadivision);
            imgChart1.setImageResource(R.drawable.dhakachart);
            imgChart2.setImageResource(R.drawable.dhakachart2);
            imgChartWeather.setImageResource(R.drawable.dhakaweather);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Dhaka"));
                    startActivity(intent);
                }
            });


        }


        if (data.equals("Chittagong")) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));
         //   actionBar.setTitle(Html.fromHtml("<font color='#088A08'>Chittagong</font>"));
            txtDivHead.setText("Chittagong,Bangladesh");
            txtDiv1.setText(R.string.ctg1);
            txtDiv2.setText(R.string.ctg2);
            txtDivHistory.setText(R.string.ctg3);
            txtdivWeather.setText("Chittagong's Weather Chart");

            imgDiv.setImageResource(R.drawable.chittagongdivision);
            imgChart1.setImageResource(R.drawable.ctgchart);
            imgChart2.setImageResource(R.drawable.ctgchart2);
            imgChartWeather.setImageResource(R.drawable.ctgweather);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Chittagong"));
                    startActivity(intent);
                }
            });


        }


        if (data.equals("Sylhet")) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));
          //  actionBar.setTitle(Html.fromHtml("<font color='#088A08'>Sylhet</font>"));
            txtDivHead.setText("Syllet,Bangladesh");
            txtDiv1.setText(R.string.syllet1);
            txtDiv2.setText(R.string.syllet2);
            txtDivHistory.setText(R.string.syllet3);
            txtdivWeather.setText("Syllet's Weather Chart");

            imgDiv.setImageResource(R.drawable.sylhetdivision);
            imgChart1.setImageResource(R.drawable.sylletchart1);
            imgChart2.setImageResource(R.drawable.sylletchart2);
            imgChartWeather.setImageResource(R.drawable.sylletweather);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Sylhet"));
                    startActivity(intent);
                }
            });


        }



        if (data.equals("Rajshahi")) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));
           // actionBar.setTitle(Html.fromHtml("<font color='#088A08'>Rajshahi</font>"));
            txtDivHead.setText("Rajshahi,Bangladesh");
            txtDiv1.setText(R.string.raj1);
            txtDiv2.setText(R.string.raj2);
            txtDivHistory.setText(R.string.raj3);
            txtdivWeather.setText("Syllet's Weather Chart");

            imgDiv.setImageResource(R.drawable.rajshahidivision);
            imgChart1.setImageResource(R.drawable.rajshahichart1);
            imgChart2.setImageResource(R.drawable.rajshahichart2);
            imgChartWeather.setImageResource(R.drawable.rajshahiweather);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Rajshahi"));
                    startActivity(intent);
                }
            });


        }

        if (data.equals("Khulna")) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));
          //  actionBar.setTitle(Html.fromHtml("<font color='#088A08'>Khulna</font>"));
            txtDivHead.setText("Khulna,Bangladesh");
            txtDiv1.setText(R.string.khul1);
            txtDiv2.setText(R.string.khul2);
            txtDivHistory.setText(R.string.khul3);
            txtdivWeather.setText("Khulna's Weather Chart");

            imgDiv.setImageResource(R.drawable.khulnadivision);
            imgChart1.setImageResource(R.drawable.khulnachart1);
            imgChart2.setImageResource(R.drawable.khulnachart2);
            imgChartWeather.setImageResource(R.drawable.khulnaweather);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Khulna"));
                    startActivity(intent);
                }
            });


        }


        if (data.equals("Barisal")) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));
           // actionBar.setTitle(Html.fromHtml("<font color='#088A08'>Barisal</font>"));
            txtDivHead.setText("Barisal,Bangladesh");
            txtDiv1.setText(R.string.bar1);
            txtDiv2.setText(R.string.bar2);
            txtDivHistory.setText(R.string.bar3);
            txtdivWeather.setText("Barisal's Weather Chart");

            imgDiv.setImageResource(R.drawable.barisaldivision);
            imgChart1.setImageResource(R.drawable.barislchart1);
            imgChart2.setImageResource(R.drawable.barisalchart2);
            imgChartWeather.setImageResource(R.drawable.barisalweather);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Barisal"));
                    startActivity(intent);
                }
            });


        }

        if (data.equals("Mymensing")) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));
           // actionBar.setTitle(Html.fromHtml("<font color='#088A08'>Mymensing</font>"));
            txtDivHead.setText("Mymensing,Bangladesh");
            txtDiv1.setText(R.string.my1);
            txtDiv2.setText(R.string.my2);
            txtDivHistory.setText(R.string.my3);
            txtdivWeather.setText("Mymensingh's Weather Chart");

            imgDiv.setImageResource(R.drawable.mymensinghdivision);
           // imgChart1.setImageResource(R.drawable.rajshahichart1);
            //imgChart2.setImageResource(R.drawable.rajshahichart2);
            imgChartWeather.setImageResource(R.drawable.myweaher);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Mymensingh"));
                    startActivity(intent);
                }
            });


        }



        if (data.equals("Rangpur")) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));
         //   actionBar.setTitle(Html.fromHtml("<font color='#088A08'>Rangpur</font>"));
            txtDivHead.setText("Rangpur,Bangladesh");
            txtDiv1.setText(R.string.rang1);
            txtDiv2.setText(R.string.rang2);
            txtDivHistory.setText(R.string.rang3);
            txtdivWeather.setText("Rangpur's Weather Chart");

            imgDiv.setImageResource(R.drawable.rangpurdivision);
            imgChart1.setImageResource(R.drawable.rangpurchart1);
            imgChart2.setImageResource(R.drawable.rangpurchart2);
            imgChartWeather.setImageResource(R.drawable.rangpurweather);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Rangpur_Division"));
                    startActivity(intent);
                }
            });


        }


    }
}
