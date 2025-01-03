import java.util.List;

public class Lecture {
    private final List<Student> studentList;
    private final LectureRoom lectureRoom;
    private final Professor professor;

    public Lecture(List<Student> studentList, LectureRoom lectureRoom, Professor professor) {
        this.studentList = studentList;
        this.lectureRoom = lectureRoom;
        this.professor = professor;
    }
}

class LectureRoom {
    public LectureRoom() {
    }
}

class Professor {
    public Professor() {
    }
}
