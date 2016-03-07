package Loggers;

/**
 * Created by Newman on 2/27/16.
 */
 class ConsoleEventLogger implements EventLogger {

    public void logEvent (Event event){
        System.out.println("Event is" + event.toString());
    }


}
