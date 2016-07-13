package br.com.diegomelodev.horaponto.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.orm.SugarContext;

import br.com.diegomelodev.horaponto.R;
import br.com.diegomelodev.horaponto.controller.PontoController;

public class MainActivity extends Activity {
    private ImageView imgDigital;
    private TextView txtOrdemPonto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiViews();
    }

    private void intiViews() {
        txtOrdemPonto = (TextView) findViewById(R.id.txtOrdemPonto);
        txtOrdemPonto.setText(getTextoOrdemPonto());

        imgDigital = (ImageView) findViewById(R.id.imgDigital);
        imgDigital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Valeu, Falow!", Toast.LENGTH_SHORT).show();
                new PontoController().save();
                finish();
            }
        });
    }

    public String getTextoOrdemPonto() {
        return new PontoController().getTextoOrdemPonto();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
