package Close;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example2 {
    public void get(String key) throws IOException {
        try {
            File file = new File("myFile.txt");
            FileInputStream fis = new FileInputStream(file);
            int size = fis.available();
            byte[] data = new byte[size];
            int read = 0;
            while (read<size) {
                read += fis.read(data,read,size-read);
            }
            fis.close();

        }
        catch(IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
