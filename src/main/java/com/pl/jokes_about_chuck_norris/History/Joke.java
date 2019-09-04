package com.pl.jokes_about_chuck_norris.History;

public class Joke {
    String id;
    String value;

    public void setId(String id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("id:%1$s Value:%2$s", this.id, this.value);
    }
}
