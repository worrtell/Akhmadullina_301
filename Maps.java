import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    Map<String, List<String>> map;

    public Maps(List<String> file) {
        this.map = new HashMap<>();
        List<String> a = new ArrayList<>();
        String channel = "";
        for (String s : file) {
            if (s.charAt(0) == '#') {
                map.put(channel, a);
                channel = s.substring(1);
                a = new ArrayList<>();
            }
            else if (!s.contains(":")){
                a.add(s);
            }
        }
    }

}
