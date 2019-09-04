package com.pl.jokes_about_chuck_norris.History;

import java.io.IOException;
import java.util.Set;

public interface History {

    Set<String> getHistory() throws IOException;

    boolean saveHistory(Set<String> history);
}
