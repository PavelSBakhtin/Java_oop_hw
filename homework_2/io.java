package homework_2;

import java.io.*;

public class io implements load_from, save_as {
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
    public void save(String path, Serializable obj) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(path))) {
            objectOutputStream.writeObject(obj);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
