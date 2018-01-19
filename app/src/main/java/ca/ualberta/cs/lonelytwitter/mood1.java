package ca.ualberta.cs.lonelytwitter;

/**
 * Created by hamdamare on 2018-01-19.
 */
//mood subclass one
public class mood1 extends Mood {
    private String message;

    mood1(String date) {
        super(date);
    }

    @Override
    public void setdate(String date) {
        super.setdate(date);
    }


    String happy = "Happy";

    public String happy (){
        return happy;
    }
}