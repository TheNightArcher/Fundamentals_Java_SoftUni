import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroesOfCodeAndLogic_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfHeroes = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> heroHP = new TreeMap<>();
        Map<String, Integer> heroMP = new TreeMap<>();
        for (int i = 0; i < numberOfHeroes; i++) {

            String stats = scanner.nextLine();
            String[] definitionsOfHero = stats.split("\\s+");
            String name = definitionsOfHero[0];
            int hp = Integer.parseInt(definitionsOfHero[1]);
            int mp = Integer.parseInt(definitionsOfHero[2]);

            heroHP.put(name, hp);
            heroMP.put(name, mp);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputCommand = input.split(" - ");
            String command = inputCommand[0];
            String nameHero = inputCommand[1];

            switch (command) {
                case "CastSpell":
                    int mpNeed = Integer.parseInt(inputCommand[2]);
                    String spellName = inputCommand[3];
                    int currentMp = heroMP.get(nameHero);

                    if (currentMp >= mpNeed) {
                        int mpLeft = currentMp - mpNeed;
                        heroMP.put(nameHero,mpLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", nameHero, spellName, mpLeft);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", nameHero, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(inputCommand[2]);
                    String attacker = inputCommand[3];

                    int currentHp = heroHP.get(nameHero);
                    int hpLeft = currentHp - damage;
                    if (hpLeft > 0) {
                        heroHP.put(nameHero,hpLeft);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", nameHero, damage, attacker, hpLeft);
                    } else {
                        heroHP.remove(nameHero);
                        heroMP.remove(nameHero);
                        System.out.printf("%s has been killed by %s!%n",nameHero,attacker);
                    }
                    break;
                case "Recharge":
                    int rechargeAmount = Integer.parseInt(inputCommand[2]);
                    int currentAmount = heroMP.get(nameHero);
                    int increaseMp = currentAmount + rechargeAmount;
                    if (increaseMp > 200){
                        increaseMp = 200;
                    }
                    heroMP.put(nameHero,increaseMp);
                    System.out.printf("%s recharged for %d MP!%n",nameHero,increaseMp - currentAmount);
                    break;
                case "Heal":
                    int healingAmount = Integer.parseInt(inputCommand[2]);
                    int currentHeal = heroHP.get(nameHero);
                    int increaseHp = currentHeal + healingAmount;
                    if (increaseHp > 100){
                        increaseHp = 100;
                    }
                    heroHP.put(nameHero,increaseHp);
                    System.out.printf("%s healed for %d HP!%n",nameHero,increaseHp - currentHeal);
                    break;
            }
            input = scanner.nextLine();
        }
        heroHP.entrySet().stream()
                .sorted((e1,e2) -> Integer.compare(e2.getValue(),e1.getValue()))
                .forEach(entry ->{
                    System.out.println(entry.getKey());
                    System.out.printf("  HP: %d%n",entry.getValue());
                    int currentMP = heroMP.get(entry.getKey());
                    System.out.printf("  MP: %d%n",currentMP);
                });
    }
}
