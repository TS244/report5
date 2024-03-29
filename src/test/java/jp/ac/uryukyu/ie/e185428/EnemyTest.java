package jp.ac.uryukyu.ie.e185428;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    void attack() {
        int heroHP = 10;
        Hero hero = new Hero("勇者", heroHP, 5 );
        Enemy enemy = new Enemy("スライム", 6, 3);
        enemy.setDead(true);
        for(int i=0; i<10; i++){
            enemy.attack(hero);
        }
        assertEquals(heroHP, hero.getHitPoint());
    }
}