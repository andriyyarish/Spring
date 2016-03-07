package Loggers;

import java.io.File;
import java.io.IOException;

import Loggers.EventLogger;
import org.apache.commons.io.FileUtils;

/**
 * Created by Newman on 3/7/16.
 */
public class FileEventLogger implements EventLogger {
    private String fileName;
    private File file;
    private String msg;

    public FileEventLogger (String fileName){
        this.fileName=fileName;
    }
    public FileEventLogger(){

    }

    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file,msg,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void init() throws IOException{
        this.file = new File(fileName);
        file.canWrite();
    }
}
