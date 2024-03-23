//(канал, время, название)
public class Program {
    String channel;
    BroadcastsTime time;
    String name;
    public Program(String channel, String time, String name) {
        this.channel = channel;
        this.time = new BroadcastsTime(time);
        this.name = name;
    }
    public void print() {
        System.out.println(channel + " " + time.hour() + ":" + time.minutes() + " " + name);
    }
}
