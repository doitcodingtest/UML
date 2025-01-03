
interface Flyable {
    public void fly();
}
public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("날개를 이용하여 날아갑니다.");
    }
}
