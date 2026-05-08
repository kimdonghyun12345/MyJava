class Rabbit1 {
    String shape;
    int xPos;
    int yPos;
    static int count;

    Rabbit1() {
        count++;
    }
}

        public class Code08_01 {
            public static void main(String[] args) {
                System.out.println("개체 생선 전의 총 토끼 수 ==>" + Rabbit1.count);

                Rabbit rabbit1 = new Rabbit();
                System.out.println("토끼 객체1 생성 후의 총 토끼 수 ==>" + Rabbit1.count);

                Rabbit rabbit2 = new Rabbit();
                System.out.println("토끼 객체2 생성 후의 총 토끼 수 ==>" + Rabbit1.count);
            }
        }