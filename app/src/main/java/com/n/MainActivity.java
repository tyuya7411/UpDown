package com.n;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private GameMap gameMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();
    }

    private void findview(){
        findViewById(R.id.up).setOnClickListener(this);
        findViewById(R.id.down).setOnClickListener(this);
        findViewById(R.id.left).setOnClickListener(this);
        findViewById(R.id.right).setOnClickListener(this);
        gameMap = findViewById(R.id.view2);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.up:
                Log.d("MainActivity","onClick:UP");
                if(gameMap.posY>150)
                    gameMap.posY=gameMap.posY-50;
                gameMap.invalidate();
                break;
            case R.id.down:
                Log.d("MainActivity","onClick:DOWN");
                if(gameMap.posY<1400)
                    gameMap.posY=gameMap.posY+50;
                gameMap.invalidate();
                break;
            case R.id.left:
                Log.d("MainActivity","onClick:LEFT");
                if(gameMap.posX>10)
                    gameMap.posX=gameMap.posX-50;
                gameMap.invalidate();
                break;
            case R.id.right:
                Log.d("MainActivity","onClick:RIGHT");
                if(gameMap.posX<1300)
                    gameMap.posX=gameMap.posX+50;
                gameMap.invalidate();
                break;

        }

}
