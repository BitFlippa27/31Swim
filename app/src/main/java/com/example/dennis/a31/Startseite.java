package com.example.dennis.a31;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import android.widget.Button;
import android.content.Intent;

public class Startseite extends AppCompatActivity
{
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_startseite);
        Toast.makeText(getApplicationContext(),"Ich bin onCreate motherfucker",Toast.LENGTH_SHORT).show();
        startButton = (Button)findViewById(R.id.button);
        startButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivitySpieleranzahl();
            }
        });

    }

    public void openActivitySpieleranzahl()
    {
        Intent intent = new Intent(this, Spieleranzahl.class);
        startActivity(intent);
    }



    /*protected void onDestroy()
    {
        super.onDestroy();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_startseite);
        Toast.makeText(getApplicationContext(),"Ich bin onDestroy",Toast.LENGTH_SHORT).show();

    }

    protected void onPause()
    {
        super.onPause();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_startseite);
        Toast.makeText(getApplicationContext(),"Ich bin onPause",Toast.LENGTH_SHORT).show();

    }
    */

}
