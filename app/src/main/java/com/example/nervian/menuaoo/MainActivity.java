package com.example.nervian.menuaoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId())
        {
            case R.id.create_new:
                Toast.makeText(this,"this is cool",Toast.LENGTH_SHORT).show();

                return true;
            case R.id.open:
                Toast.makeText(this,"this is nice",Toast.LENGTH_SHORT).show();

                return true;
            case R.id.create_new1:
                Toast.makeText(this,"this is awesome",Toast.LENGTH_SHORT).show();

                return true;

            case R.id.open1:
                Toast.makeText(this,"this is good",Toast.LENGTH_SHORT).show();

                return true;


        }




        return super.onOptionsItemSelected(item);
    }
}
