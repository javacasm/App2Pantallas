package com.cep.javacasm.app2pantallas;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Recuperamos el intent que lanzó este activity

        Intent i=getIntent();
        // Recuperamos el valor de la etiqueta NAME
        String strName=i.getStringExtra("NAME");

        // Accedemos al control tvSaludo
        View vSaludo=findViewById(R.id.tvSaludo);
        TextView tvSaludo=(TextView)vSaludo;

        // ponemos el saludo en tvSaludo
        tvSaludo.setText(getText(R.string.saludo)+" "+strName+"!!");


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
