package lamda.functional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 열거형 타입과 함수형 프로그래밍을 이용하여 플레이어의 공격력을 계산하는 알고리즘을 구현하시오.
 *
 * 플레이어 공격력을 계산하는 과정은 아래와 같다.
 * 1. 플레이어의 무기에 따라 공격력이 변화한다. 무기는 최근에 장착한 무기의 공격력 만으로 계산된다.
 *   1-1. BARE_HANDS - 공격력 5
 *   1-2. DAGGER - 공격력 40
 *   1-3. LONG_SWORD - 공격력 100
 *   1-4. DRAGON_SLAYER -  공격력 250
 * 2. 플레이어의 공격력에 영향을 주는 아이템에 따라 공격력 증가 방식이 다르며, 아이템은 중복 적용된다.
 *   2-1. BLACK_POTION - 공격력 10% 증가
 *   2-2. WHITE_POTION - 모든 공격력 계산이 끝난 후에 공격력 + 200
 *   2-3. MUSHROOM - 무기 공격력 + 20
 *
 */

enum Weapon {
    // 무기 구현
    BARE_HANDS(5), DAGGER(40), LONG_SWORD(100), DRAGON_SLAYER(250);
    private Integer weapon;

    Weapon(Integer weapon) {
        this.weapon = weapon;
    }

    public Integer getWeaponAttackPoint() {
        return weapon;
    }

    public void setWeapon(Integer weapon) {
        this.weapon = weapon;
    }
}

enum Item {
    // 소비 아이템 구현
    BLACK_POTION(10), WHITE_POTION(200), MUSHROOM(20);
    private final Integer item;

    Item(Integer item) {
        this.item = item;
    }

    public Integer getItem() {
        return item;
    }


}

class Player {
    Weapon currentWeapon;
    List<Item> items;
    Integer attackPoint;

    public Player() {
        this.currentWeapon = Weapon.BARE_HANDS;
        this.items = new ArrayList<>();
        this.attackPoint = currentWeapon.getWeaponAttackPoint();
    }

    // TODO: Player에 필요한 메소드 구현
    // 무기 교체, 아이템 사용, 아이템 효과 종료 메소드 구현

    // 무기 교체
    Consumer<Weapon> equipItem = weapon -> {
        this.currentWeapon = weapon;
        attackPoint = this.currentWeapon.getWeaponAttackPoint();
    };

    // 아이템 사용
    Consumer<Item> useItem = item -> this.items.add(item);
    Predicate<Item> checkItem = (paramItem) -> this.items.contains(paramItem);

    // 아이템 효과
    Function<Item, Integer> blackPotion = effect -> attackPoint += attackPoint / effect.getItem();
    Function<Item, Integer> mushroom = effect -> attackPoint += effect.getItem();
    Function<Item, Integer> whitePotion = effect -> attackPoint += effect.getItem();


    // 아이템 사용여부 확인
    Predicate<List<Item>> findAnyItems = items -> items.size() != 0;

    // 아이템 효과 종료
    Consumer<List<Item>> clearEffect = (items) -> {
        items.clear();
        attackPoint = currentWeapon.getWeaponAttackPoint();
    };

    // 아이템 효과 판정
    Supplier<Integer> attackPointWithItemEffects = () -> {
        List<Item> whitePotions = new ArrayList<>();
        for (Item item : items) {
            switch (item) {
                case WHITE_POTION:
                    whitePotions.add(item);
                    break;
                case BLACK_POTION:
                    blackPotion.apply(item);
                    break;
                case MUSHROOM:
                    attackPoint = mushroom.apply(item);
                    break;
            }
        }

        if(whitePotions.size() != 0) {
            for (Item item : whitePotions) {
                whitePotion.apply(item);
            }
        }

        return this.currentWeapon.getWeaponAttackPoint();
    };

    // 공격력 계산
    Supplier<Integer> calculate = () -> findAnyItems.test(items) ? attackPointWithItemEffects.get() : attackPoint;

    // 장비 바꾸기
    void changeWeapon(Weapon weapon) {
        equipItem.accept(weapon);
        attackPoint = calculate.get();
    }

    // 아이템 사용하기
    void useItem(Item item) {
        useItem.accept(item);
    }

    // 공격력 출력하기
    Integer getAttackPoint(){
        calculate.get();
        return attackPoint;
    }
}

public class DamageCalculation {
    public static void main(String[] args) {
        // 무기 및 아이템 장착/사용 시나리오 및 플레이어 공격력 출력
        Player player = new Player();

        for (int i = 0; i < 2; i++) {
            player.useItem(Item.MUSHROOM);
            player.useItem(Item.BLACK_POTION);
            player.useItem(Item.WHITE_POTION);
        }

        System.out.println(player.getAttackPoint());
        player.changeWeapon(Weapon.LONG_SWORD);
        System.out.println(player.getAttackPoint());
    }
}
