import java.util.Random;
import java.util.Scanner;

public class GameProcces {
    public static void GameItSelf() {

        String userInput;
        boolean running = true;

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int a = (int) Math.random() * 10 + 10;
        int health = (int) Math.random() * 30 + 10;

        Enemies skeleton = new Enemies("skeleton", a, health);
        Enemies zombie = new Enemies("zombie", a, health);
        Enemies warrior = new Enemies("warrior", a, health);
        Enemies assassin = new Enemies("assassin", a, health);

        Enemies[] enemy = {skeleton, zombie, warrior, assassin};

        Player player = new Player(20, 100);



        GAME:
        while (running) {

            int heroIndex = random.nextInt(enemy.length);

            switch (heroIndex){      // think of it, how you can improve it ? Maybe you want to use another way of creating heroes
                case 0:
                    System.out.println("-----------------------------");
                    System.out.println(skeleton.getName() + " has appeared " +
                            "\nhealth : " + skeleton.health);
                    break;
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println(zombie.getName() + " has appeared "
                            + "\nhealth : " + zombie.health);
                    break;
                case 2:
                    System.out.println("-----------------------------");
                    System.out.println(warrior.getName() + " has appeared " +
                            "\nhealth : " + warrior.health);
                    break;
                case 3:
                    System.out.println("-----------------------------");
                    System.out.println(assassin.getName() + " has appeared " +
                            "\nhealth : " + assassin.health);
                    break;
            }

            System.out.println("\tWhat would you like to do ? ");
            System.out.println("\t1. Attack");
            System.out.println("\t2. Drink Potion");
            System.out.println("\t3. Run!");

            userInput = sc.next();

            if (userInput.equals("1")){   // here you will have to get an action depending on userInput's number, you have to subtract from heroes health your damage
                System.out.println(enemy[heroIndex].getHealth());
                enemy[heroIndex].setHealth(enemy[heroIndex].health - player.getDamage());
                System.out.println(enemy[heroIndex].getHealth());
            }
        }
    }
}