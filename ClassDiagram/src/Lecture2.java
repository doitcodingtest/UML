import java.util.ArrayList;
import java.util.List;

public class Lecture2 {
    private final List<Student> studentList;
    private final LectureRoom lectureRoom;
    private final Professor professor;

    public Lecture2() {
        this.studentList = new ArrayList<>();
        this.lectureRoom = new LectureRoom();
        this.professor = new Professor();
    }
}
