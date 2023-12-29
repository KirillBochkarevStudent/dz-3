import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup("Нефтегазовое дело", 3);
        StudentGroup studentGroup2 = new StudentGroup("Механики", 1);
        StudentGroup studentGroup3 = new StudentGroup("Разработка", 3);


        List<StudentGroup> groups = new ArrayList<>();
        groups.add(studentGroup1);
        groups.add(studentGroup2);
        groups.add(studentGroup3);

        System.out.println();
        
        Stream stream = new Stream(groups);
        StreamService service = new StreamService(stream);
        for (StudentGroup group : service.getStream()) {
            System.out.println(group);
        }
        System.out.println();

        for (StudentGroup group : service.getSortedStream()) {
            System.out.println(group);
        }

        System.out.println();
    }
}
