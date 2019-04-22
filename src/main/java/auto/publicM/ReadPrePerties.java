package auto.publicM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ReadPrePerties {

    public static String readGetKey(String key) {
        File f = new File("");
        FileInputStream fin = null;
        try {
            new FileInputStream(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Properties p = new Properties();
        BufferedReader bf = new BufferedReader(new InputStreamReader(fin));
        try {
            p.load(bf);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return p.getProperty(key);
    }
}