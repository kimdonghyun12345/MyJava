class Rabbit {

     public String shape;
     public int xPos;
     public int yPos;

    void setPosition(int x, int y) {
        xPos = x;
        xPos = y;
    }
}

public class Code07_06 {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();

        rabbit.xPos = 100;
        rabbit.yPos = 200;
    }
}