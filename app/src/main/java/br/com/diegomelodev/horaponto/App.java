package br.com.diegomelodev.horaponto;

import android.app.Application;

import com.orm.SugarContext;

/**
 * Created by Diego on 12/07/2016.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SugarContext.init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        SugarContext.terminate();
    }
}
