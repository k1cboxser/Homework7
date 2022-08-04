package com.company;

public class Main {

    public static void main(String[] args) {

        Medic medic = new Medic();
        Magic magic = new Magic();
        Warrior warrior = new Warrior();
        Hero[] myheroes = {medic,magic, warrior};
        for (int i = 0; i < myheroes.length; i++) {
            if (myheroes[i] instanceof Medic){
                medic.applySuperAbility("Healing");
            }
            if (myheroes[i] instanceof Magic){
                magic.applySuperAbility("Fireball");
            }
            if (myheroes[i] instanceof Warrior){
                warrior.applySuperAbility("CRITICAL DAMAGE");
            }
        }

    }
}
