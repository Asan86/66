package com.company;

import java.lang.management.GarbageCollectorMXBean;

public class Player {
    private int Boss;
    private int Magical;
    private int Mental;
    private int Warrior;
    private int health;
    private int damage;
    private String ability;

    public int getBoss() {
        return Boss;
    }

    public void setBoss(int boss) {
        Boss = boss;
    }

    public int getMagical() {
        return Magical;
    }

    public void setMagical(int magical) {
        Magical = magical;
    }

    public int getMental() {
        return Mental;
    }

    public void setMental(int mental) {
        Mental = mental;
    }

    public int getWarrior() {
        return Warrior;
    }

    public void setWarrior(int warrior) {
        Warrior = warrior;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
        System.out.println();
    }
}
