package homework_3.src;

import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IO implements LoadFrom, SaveAs {
    @Override
    public Serializable load(String path) {
        Serializable personRestored = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(path))) {
            personRestored = (Serializable) objectInputStream.readObject();
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return personRestored;
    }

    @Override
    public Serializable save(String path, Serializable obj) {
        return obj;
        
    }
}
