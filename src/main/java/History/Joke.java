package History;

import com.sun.javafx.binding.StringFormatter;

public class Joke {
    String id;
    String value;

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("id:%1$s Value:%2$s",this.id,this.value);
    }
}
