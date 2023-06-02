import java.util.Scanner;

public class Hero {
    private String name;
    private int level;
    private int stat1, stat2, stat3, stat4, stat5, stat6;
    private int upgradePoints;
    private double upgradePercentage1, upgradePercentage2, upgradePercentage3, upgradePercentage4, upgradePercentage5, upgradePercentage6;

    public Hero(String name, int stat1, int stat2, int stat3, int stat4, int stat5, int stat6,
                double upgradePercentage1, double upgradePercentage2, double upgradePercentage3,
                double upgradePercentage4, double upgradePercentage5, double upgradePercentage6) {
        this.name = name;
        this.level = 1;
        this.stat1 = stat1;
        this.stat2 = stat2;
        this.stat3 = stat3;
        this.stat4 = stat4;
        this.stat5 = stat5;
        this.stat6 = stat6;
        this.upgradePoints = 0;
        this.upgradePercentage1 = upgradePercentage1;
        this.upgradePercentage2 = upgradePercentage2;
        this.upgradePercentage3 = upgradePercentage3;
        this.upgradePercentage4 = upgradePercentage4;
        this.upgradePercentage5 = upgradePercentage5;
        this.upgradePercentage6 = upgradePercentage6;
    }

    public void levelUp() {
        this.level++;
        this.upgradePoints += 10;
    }

    public void upgradeStat(int statIndex) {
        if (upgradePoints <= 0) {
            System.out.println("You have not points for upgrading tour hero");
            return;
        }

        double upgradePercentage = getUpgradePercentage(statIndex);
        int statValue = getStatValue(statIndex);
        int upgradedStatValue = (int) (statValue * (1 + upgradePercentage / 100.0));

        setStatValue(statIndex, upgradedStatValue);
        this.upgradePoints--;
    }

    private int getStatValue(int statIndex) {
        switch (statIndex) {
            case 1:
                return this.stat1;
            case 2:
                return this.stat2;
            case 3:
                return this.stat3;
            case 4:
                return this.stat4;
            case 5:
                return this.stat5;
            case 6:
                return this.stat6;
            default:
                System.out.println("Wrong Stat index");
                return 0;
        }
    }

    private void setStatValue(int statIndex, int value) {
        switch (statIndex) {
            case 1:
                this.stat1 = value;
                break;
            case 2:
                this.stat2 = value;
                break;
            case 3:
                this.stat3 = value;
                break;
            case 4:
                this.stat4 = value;
                break;
            case 5:
                this.stat5 = value;
                break;
            case 6:
                this.stat6 = value;
                break;
            default:
                System.out.println("Wrong Stat index");
                break;
        }
    }

    private double getUpgradePercentage(int statIndex) {
        switch (statIndex) {
            case 1:
                return this.upgradePercentage1;
            case 2:
                return this.upgradePercentage2;
            case 3:
                return this.upgradePercentage3;
            case 4:
                return this.upgradePercentage4;
            case 5:
                return this.upgradePercentage5;
            case 6:
                return this.upgradePercentage6;
            default:
                System.out.println("Wrong Stat index");
                return 0;
        }
    }

    public void displayInfo() {
        System.out.println("Hero: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("Stats:");
        System.out.println("1. strength:     " + this.stat1);
        System.out.println("2. defence:      " + this.stat2);
        System.out.println("3. intelligence: " + this.stat3);
        System.out.println("4. dexterity:    " + this.stat4);
        System.out.println("5. agility:      " + this.stat5);
        System.out.println("6. speed:        " + this.stat6);
        System.out.println("Upgrade points: " + this.upgradePoints);
    }
}
