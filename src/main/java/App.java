import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by Newman on 2/27/16.
 */
 class App {
    Client client;
    EventLogger logger;

    public App (Client client, EventLogger logger){
        this.client=client;
        this.logger=logger;
    }

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");
        app.logEvent("name = ");
    }

    private void logEvent(String msg){

        System.out.println(msg + client.getName());

    }



}
