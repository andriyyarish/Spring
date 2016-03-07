import Loggers.EventLogger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Newman on 2/27/16.
 */
 class App {
    Client client;
    static EventLogger logger;
    static Event event;

    public App (Client client, EventLogger logger){
        this.client=client;
        this.logger=logger;
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");
        event = (Event) ctx.getBean("event");
        event.setMessage("Hello I am new Event ");
        app.logEvent("I am logging event by logger method", event);
        // app.logEvent("name = ");
        ctx.close();
    }

    private void logEvent(String msg, Event event){

        logger.logEvent(event);
        System.out.println(msg);
    }



}
