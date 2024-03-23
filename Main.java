
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:/Users/Dell/Downloads/schedule.txt"));
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        Maps a = new Maps(lines);
        //System.out.println(a.map.get("Россия 1"));
        Lists b = new Lists(lines);
//        b.print();
//        b.SortTime();
    }
}
