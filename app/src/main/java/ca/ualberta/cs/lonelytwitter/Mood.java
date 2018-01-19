package ca.ualberta.cs.lonelytwitter;

import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hamdamare on 2018-01-19.
 */

public abstract class Mood {
    private String date;


    public Mood(String date) {
        this.date = date;
    }

    //getter
    public String getdate() {
        return this.date;
    }

    //setter
    public void setdate(String date){
        this.date = date;
    }
}

