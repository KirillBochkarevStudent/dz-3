import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> groups;

    public Stream(List<StudentGroup> groups) {
        this.groups = groups;
    }

    public List<StudentGroup> getStudentGroups() {
        return groups;
    }

    public void addStudentGroup (StudentGroup studentGroup){
        groups.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    public void remove(StudentGroup studentGroup){
        groups.remove(studentGroup);
    }
}
