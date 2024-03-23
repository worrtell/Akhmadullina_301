import java.util.Date;

class BroadcastsTime implements Comparable<BroadcastsTime> {
    String time;
    public BroadcastsTime(String time) {
        this.time = time;
    }
    byte hour() {
        return (byte) Integer.parseInt(time.substring(0,2));
    }
    byte minutes() {
        return (byte) Integer.parseInt(time.substring(3));
    }
    boolean after(BroadcastsTime t) {
        return (this.compareTo(t) == 1);
    }
    boolean before(BroadcastsTime t) {
        return (this.compareTo(t) == -1);
    }
    boolean between(BroadcastsTime t1, BroadcastsTime t2) {
        return (this.compareTo(t1) == 1 && this.compareTo(t2) == -1);
    }

    boolean equals(BroadcastsTime t) {
        return (this.hour() == t.hour() && this.minutes() == t.minutes());
    }

    @Override
    public int compareTo(BroadcastsTime o) {
        if (this.hour() >= o.hour() && this.minutes() >= o.minutes()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
