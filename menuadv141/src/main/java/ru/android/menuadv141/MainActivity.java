package ru.android.menuadv141;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv;
CheckBox chb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tv=(TextView)findViewById(R.id.textView);
        chb=(CheckBox)findViewById(R.id.chbExtMenu);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0,1,0,"add");
        menu.add(0,2,0,"EDIT");
        menu.add(0,3,3,"DELET");
        menu.add(1,4,1,"COPY");
        menu.add(1,5,2,"PASTE");
        menu.add(1,6,4,"EXIST");
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onPrepareOptionsMenu(Menu menu){
        menu.setGroupVisible(1,chb.isChecked());
        return super.onPrepareOptionsMenu(menu);

    }
    public boolean onOpionsItemSelected(MenuItem item){
        StringBuilder sb=new StringBuilder();
        sb.append("item Menu");
        sb.append("\r\n groupId: " + String.valueOf(item.getGroupId()));
        sb.append("\r\n itemId: " + String.valueOf(item.getItemId()));
        sb.append("\r\n order: " + String.valueOf(item.getOrder()));
        sb.append("\r\n title: " + item.getTitle());
        tv.setText(sb.toString());
        return super.onOptionsItemSelected(item);

    }
}
