/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

/**
 *
 * @author Kalsr8025
 */
public class BulletShotByEnemy extends Enemy {

    private float x;
    private float y;
    private float targetx;
    private float targety;
    private Enemy enemy;
    private Player player;

    public BulletShotByEnemy(float positionX, float positionY, int width, int height, int score, boolean collisionEnemy, boolean collisionPlayer, boolean crashed) {
        super(positionX, positionY, width, height, score, collisionEnemy, collisionPlayer, crashed);

//    public BulletShotByEnemy() {
//        this.x = enemy.getPositionX();
//        this.y = enemy.getPositionY();
//    }
//
//    public int target() {
//        targetx = player.getPositionX();
//        targety = player.getPositionY();
//        return 0;
//    }
//
    }
}
