public abstract class User {
    private String id;
    private String pw;

    public abstract void login();
}

class NormalUser extends User {
    @Override
    public void login() {
        System.out.println("일반 사용자 로그인");
    }
}

class Admin extends User {
    @Override
    public void login() {
        System.out.println("관리자 로그인");
    }
}