import java.util.Date;
import java.util.List;

public class Student {
    private List<Email> emailList;

    public Student() {
    }
}

class Email {
    String address;
    String domain;
    String pw;
    Date createDt;
}
