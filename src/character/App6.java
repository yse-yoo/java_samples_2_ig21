package character;

import monster.Monster;

public class App6 {

    public static void main(String[] args) {
        Wizard wizard = new Wizard("アリス");
        Warrior warrior = new Warrior("ボブ");
        Monster monster = new Monster();
        MagicList magicList = new MagicList();
        
        wizard.magic(monster, magicList.get("fire"));
        System.out.println(monster.hp);
        wizard.magic(monster, magicList.get("heal"));

        wizard.magic(warrior, magicList.get("heal"));
        System.out.println(warrior.getHp());
    }

}
