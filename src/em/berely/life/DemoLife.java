package em.berely.life;

public class DemoLife {
    public static void main(String[] args) {
        Human[] humans = {
                new Man("Саймон", "Переглядає  вакансії", 186, 1300,2*55,1255),
                new Woman("Аманда", "Вільна", 168, 800,344,5153)
        };
        Human.getHumaus(humans);

        System.out.println();
        Bank.Pay2Pay(humans));
    }

}

