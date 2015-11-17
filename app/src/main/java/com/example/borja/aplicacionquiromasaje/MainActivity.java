package com.example.borja.aplicacionquiromasaje;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{
    Button btnIngresar, btnRegistrar;
    EditText etCorreoElectronico, etcontrasenia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnIngresar=(Button)findViewById(R.id.btnIngresar);
        btnRegistrar=(Button)findViewById(R.id.btnRegistrar);
        etCorreoElectronico=(EditText)findViewById(R.id.etCorreoElectronico);
        etcontrasenia=(EditText)findViewById(R.id.etContraseña);
        btnRegistrar.setOnClickListener(this);
        btnIngresar.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {
        if(v==findViewById(R.id.btnIngresar)){
            //activity usuario o administrador
        }else{
            if(v==findViewById(R.id.btnRegistrar)){
                //activity registrar
            }
        }
    }
}
