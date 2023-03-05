import java.io.*;
import java.util.Properties;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProperties implements FileIO {
    private Properties p;
    public FileProperties() {
        this.p = new Properties();
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        FileInputStream stream = new FileInputStream(filename);
        this.p.load(stream);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        FileOutputStream stream = new FileOutputStream(filename);
        this.p.store(stream, "## written by FileProperties");
    }
    
    @Override
    public void setValue(String key, String value) {
        this.p.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return this.p.getProperty(key);
    }
    
}
