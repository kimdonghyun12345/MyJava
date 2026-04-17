class Rabbit {
    String shape;
    int xPos;
    int yPos;

    Rabbit(String value) {
        shape = value;
    }

    void setPosition(int x, int y) {
        xPos = x;
        xPos = y;
    }
}
public class Code07_06 {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit("원");
        Rabbit rabbit2 = new Rabbit("삼각형");
        Rabbit rabbit3 = new Rabbit("토끼");


        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.\n", rabbit1.shape);
        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.\n", rabbit2.shape);
        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.\n", rabbit3.shape);

    }
}