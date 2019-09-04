package History;

import java.io.IOException;
import java.util.Set;

public interface History {

    public Set<String> getHistory() throws IOException;

    public boolean saveHistory(Set<String> history);
}
