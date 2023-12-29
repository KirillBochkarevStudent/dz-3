import java.util.Comparator;

public class StreamComporator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        int resultOfComparing = o1.getStudentGroupName().compareTo(o2.getStudentGroupName());
        return resultOfComparing;
    }
    
}
