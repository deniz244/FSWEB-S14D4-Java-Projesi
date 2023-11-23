package com.workintech.rpgGame.monsters;

import com.workintech.rpgGame.Monster;

public class Vampire extends Monster {

    public Vampire(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double poison() {
        return getDamage()*0.3;
    }
}
