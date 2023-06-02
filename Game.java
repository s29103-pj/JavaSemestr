import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Mage mage = new Mage();
        Knight knight = new Knight();
        Archer archer = new Archer();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose your hero:");
            System.out.println("1. Mage");
            System.out.println("2. Knight");
            System.out.println("3. Archer");
            System.out.println("0. Exit game");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("You left the game");
                break;
            }

            Hero selectedHero;

            switch (choice) {
                case 1:
                    selectedHero = mage;
                    break;
                case 2:
                    selectedHero = knight;
                    break;
                case 3:
                    selectedHero = archer;
                    break;
                default:
                    System.out.println("Wrong hero index");
                    continue;
            }

            selectedHero.displayInfo();

            while (true) {
                System.out.println("Choose what to do:");
                System.out.println("1. Level Up");
                System.out.println("2. Upgrade stats");
                System.out.println("0. Back to choosing hero");

                int action = scanner.nextInt();

                if (action == 0) {
                    break;
                } else if (action == 1) {
                    selectedHero.levelUp();
                    System.out.println("Hero level improved!");
                } else if (action == 2) {
                    System.out.println("Choose the stat for upgrade (1-6):");
                    int statIndex = scanner.nextInt();
                    selectedHero.upgradeStat(statIndex);
                    System.out.println("Stat upgraded!");
                } else {
                    System.out.println("Wrong input.");
                    continue;
                }

                selectedHero.displayInfo();
            }
        }
    }
}
