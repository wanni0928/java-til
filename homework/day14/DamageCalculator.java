package steam.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntUnaryOperator;

enum Weapon {
    BARE_HANDS(5), DAGGER(40), LONG_SWORD(100), DRAGON_SLAYER(250);

    private final int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}

enum Item {
    MUSHROOM(value -> value + 20, 0),
    BLACK_POTION(value ->(int)(value * 1.1), 1),
    WHITE_POTION(value -> value + 200, 2);

    private final IntUnaryOperator op;
    private final int priority;

    Item(IntUnaryOperator op, int priority) {
        this.op = op;
        this.priority = priority;
    }

    public IntUnaryOperator getOp() {
        return op;
    }

    public int getPriority() {
        return priority;
    }
}

class Player {
    private Weapon weapon = Weapon.BARE_HANDS;
    private final List<Item> items = new ArrayList<>();

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int getDamage() {
       return items.stream().sorted(Comparator.comparingInt(Item::getPriority))
               .map(Item::getOp).reduce(value -> value, IntUnaryOperator::andThen)
               .applyAsInt(weapon.getDamage());
    }
}

public class DamageCalculator {
    public static void main(String[] args) {
        Player player = new Player();
        player.setWeapon(Weapon.DAGGER);
        System.out.println(player.getDamage());

        player.setWeapon(Weapon.DRAGON_SLAYER);
        System.out.println(player.getDamage());

        player.addItem(Item.BLACK_POTION);
        player.addItem(Item.WHITE_POTION);
        player.addItem(Item.WHITE_POTION);
        System.out.println(player.getDamage());

        player.removeItem(Item.WHITE_POTION);
        System.out.println(player.getDamage());

        player.addItem(Item.BLACK_POTION);
        player.addItem(Item.BLACK_POTION);
        player.addItem(Item.BLACK_POTION);
        player.addItem(Item.BLACK_POTION);
        System.out.println(player.getDamage());

        player.addItem(Item.MUSHROOM);
        System.out.println(player.getDamage());

        player.setWeapon(Weapon.LONG_SWORD);
        System.out.println(player.getDamage());
    }
}