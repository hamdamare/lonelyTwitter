/*
 * Copyright (c) 2018. University of alberta copyright thing it got deleted
 */

package ca.ualberta.cs.lonelytwitter;

import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Date;


/**
 * Represents a tweet.
 * @author Hamda Mare
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */

/**
 * Created by hamdamare on 2018-01-17.
 */
//because we have an abstract method we must have an abstarct class

public  abstract class Tweet {
    public String message;

    private String date;//only tweet class has access to it
    public String happy;
    public String sad;
    public String angry;

    /**
     *
     * @param v  View
     */
    public void onClick(View v) {

    //array list of moods

        String happy = "happy";
        String sad = "sad";
        String angry = "angry";


        ArrayList<String> mood = new ArrayList<String>();
        mood.add(happy);
        mood.add(sad);
        mood.add(angry);
    }


    /**
     *
     * @param message tweet message
     * @throws ThrowNewException
     *
     */

    public Tweet(String message) {
        //have a class for tweet we aassum tweet is an object and it will have a message poor text
        //in this constructor we want to save the message
        this.message = message;

    }

    /**
     *
     * @param message tweet message
     *
     * @param date tweet date
     */
    //we want this tweet to have a message and date
    public Tweet(String message, String date) {

        //this refers to this instaance of the object
        this.date = date;
        this.message = message;
    }
        //created a class had some variables in it and had some metods in this case we have constructors to initialize the object
        //with this method name we can use the method signiture and if we use this signmature then this method will eb called
        //any of the objects in this maessage will be  able to accs this method and data

    /**
     *
     * @return date
     */
    public String getdate(){
        return date;

    }


    /**
     *
     * @param message Tweet message
     * @throws ThrowNewException
     */

    //modify after creation
    public void setMessage(String message) throws ThrowNewException {
        if (message.length()>160){
            //throw an error using exception
            throw new ThrowNewException();
        }

        this.message = message;
    }

    /**
     *
     * @param date Tweet date
     */
    public void setdate(String date){
        this.date = date;
    }

    /**
     *
     * @return true or false
     */
    public abstract boolean isimportant();

    /**
     *
     * @return true or false
     */
    public abstract boolean isImportant();
    //doesnt matter how tou place abstract so now

}
