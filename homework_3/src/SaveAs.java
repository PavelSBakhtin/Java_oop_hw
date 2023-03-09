package homework_3.src;

import java.io.Serializable;

public interface SaveAs {
    Serializable save(String path, Serializable obj);
}
