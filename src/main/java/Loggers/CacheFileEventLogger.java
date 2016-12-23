package Loggers;

import java.util.List;



/**
 * Created by Newman on 3/7/16.
 */
public class CacheFileEventLogger extends FileEventLogger {

    private int cacheSize;
    private List<Event> cache;

    public CacheFileEventLogger(String fileName, int cacheSize) {
        super(fileName);
    }
    public CacheFileEventLogger(){

    }

    @Override
    public void logEvent(Event event) {
        cache.add(event);

        if (cache.size() == cacheSize){
            writeEventsFromCache();
            cache.clear();
        }
    }

    public void destroy(){
        if (!cache.isEmpty())
            writeEventsFromCache();
    }

    private void writeEventsFromCache() {
        for (Event ev : cache){
            super.logEvent(ev);
        }
    }
}
