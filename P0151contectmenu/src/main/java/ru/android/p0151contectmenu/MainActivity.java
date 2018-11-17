package ru.android.p0151contectmenu;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

  final int MENU_COLOR_RED=1;
  final int MENU_COLOR_GREEN=2;
  final int MENU_COLOR_BLUE=3;
  final int MENU_SIZE_22=4;
  final int MENU_SIZE_26=5;
  final int MENU_SIZE_30=6;
    TextView tvColor,tvSize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tvColor=(TextView)findViewById(R.id.tvColor);
        tvSize=(TextView)findViewById(R.id.tvSize);
        registerForContextMenu(tvColor);
        registerForContextMenu(tvSize);

        }
    public void onCreteContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        switch (v.getId()){
            case R.id.tvColor:
                menu.add(0,MENU_COLOR_RED,0,"RED");
                menu.add(0,MENU_COLOR_GREEN,0,"GREEN");
                menu.add(0,MENU_COLOR_BLUE,0,"Blue");
                break;
            case R.id.tvSize:
                menu.add(0,MENU_SIZE_22,0,"22");
                menu.add(0,MENU_SIZE_26,0,"26");
                menu.add(0,MENU_SIZE_30,0,"30");
        }
    }
    public boolean onContextItemSelect(MenuItem item){
        switch (item.getItemId()){
            case MENU_COLOR_RED:
                tvColor.setTextColor(Color.RED);
                tvColor.setText("Text color =red");
                break;
            case MENU_COLOR_GREEN:
                tvColor.setTextColor(Color.GREEN);
                tvColor.setText("Text color= gren");
                break;
            case MENU_COLOR_BLUE:
                tvColor.setTextColor(Color.BLUE);
                tvColor.setText("Text color =Bluy");
                break;
            case MENU_SIZE_22:
                tvSize.setTextSize(22);
                tvSize.setText("Tezt size=22");
                break;
            case MENU_SIZE_26:
                tvSize.setTextSize(26);
                tvSize.setText("Text size=26");
                break;
            case MENU_SIZE_30:
                tvSize.setTextSize(30);
                tvSize.setText("Text size=30");
                break;



        }
        return super .onContextItemSelected(item);
    }
    }

