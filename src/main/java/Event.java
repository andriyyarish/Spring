import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by Newman on 2/28/16.
 */
public class Event {

public Event(Date date, DateFormat df){
    this.setId();
    this.setDate(date);
    this.setDf(df);
}

    private int id;
    private String message;
    private Date date;

    public DateFormat getDf() {
        return df;
    }

    public void setDf(DateFormat df) {
        this.df = df;
    }

    private DateFormat df;


    public String toString(){
        return new String(" id = " + id + " date = " + df.format(date) + " message = " + message);
    }


    public int getId() {
        return id;
    }

    public void setId() {
        Random rand = new Random();
        this.id =  rand.nextInt(9999);
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }




}
