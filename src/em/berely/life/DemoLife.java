package em.berely.life;

public class DemoLife {
    public static void main(String[] args) {
        Human[] humans = {
                new Man("Саймон", "Безроботько", 186, 1600),
                new Woman("Аманда", "Вільна", 168, 800)
        };
        getHumaus(humans);

    }

    public static void getHumaus(Human[] humans) {
        System.out.println("Проведемо перепись");
        for (Human hums : humans) {
            if (hums instanceof Man) {
                System.out.println(hums + " Козачок!");
            } else {
                System.out.println(hums + " Баришня");
            }
        }
    }
}
