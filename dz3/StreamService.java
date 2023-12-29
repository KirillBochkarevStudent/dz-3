import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private Stream groups;
    public StreamService(Stream groups){
        this.groups = groups;
    }

    public Stream getStream(){
        return groups;
    }

    public void removeStudentGroup (StudentGroup studentGroup){
        for (StudentGroup groupItem : groups) {
            if(studentGroup.equals(groupItem)){
                groups.remove(groupItem);
            }
        }
    }
    public List<StudentGroup> getSortedStream(){
        List<StudentGroup> groups1 = new ArrayList<>(groups.getStudentGroups());
        Collections.sort(groups1);
        return groups1;
    }
}
