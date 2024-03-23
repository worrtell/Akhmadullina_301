import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
    List<Program> programs;
    public Lists(List<String> file) {
        this.programs = new ArrayList<>();
        String channel = "";
        String time = "";
        for (String s : file) {
            if (s.contains("#")) {
                channel = s.substring(1);
            }
            else if (s.contains(":")){
                time = s;
            }
            else {
                programs.add(new Program(channel,time,s));
            }
        }
    }

    public void print() {
        for (Program s : programs) {
            s.print();
        }
    }
    public List<Program> SortTime() {
        List<Program> list = programs;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-i-1; j++) {
                if (list.get(j).time.after(list.get(j+1).time)) {
                    Collections.swap(list, j, j+1);
                }
            }
        }
        return list;
    }

    public List<Program> ThisTime(String t) {
        BroadcastsTime time = new BroadcastsTime(t);
        List<Program> list = this.SortTime();
        List<Program> output = new ArrayList<>();
        for (Program s : list) {
            if (s.time.equals(time)) {
                output.add(s);
            }
        }
        return output;
    }

    public List<Program> ThisName(String name) {
        List<Program> list = this.SortTime();
        List<Program> output = new ArrayList<>();
        for (Program s : list) {
            if (s.name.equals(name)) {
                output.add(s);
            }
        }
        return output;
    }

    public List<Program> ThisTimeAndChannel(String t, String channel) {
        List<Program> list = this.ThisTime(t);
        List<Program> output = new ArrayList<>();
        for (Program s : list) {
            if (s.channel.equals(channel)) {
                output.add(s);
            }
        }
        return output;
    }

    public List<Program> ThisPeriodOfTimeAndChannel(String t, String channel) {
        List<Program> list = this.ThisTime(t);
        List<Program> output = new ArrayList<>();
        for (Program s : list) {
            if (s.channel.equals(channel)) {
                output.add(s);
            }
        }
        return output;
    }
}
