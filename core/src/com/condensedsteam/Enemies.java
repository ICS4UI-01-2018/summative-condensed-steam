/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

import com.badlogic.gdx.math.Rectangle;

/**
 *
 * @author Kalsr8025
 */
public class Enemies {

    private int score;
    private boolean collisionEnemy;
    private boolean collisionPlayer;
    private boolean crashed;
    private Player player;
     private Rectangle enemies;

    public Enemies(float positionX, float positionY, int width, int height, int score, boolean collisionEnemy, boolean collisionPlayer, boolean crashed) {
        this.enemies = new Rectangle (positionX,positionY,width,height);
        this.score = score;
        this.collisionEnemy = collisionEnemy;
        this.collisionPlayer = collisionPlayer;
        this.crashed = crashed;
    }

    public void moveup() {
    }

    public void movedown() {
    }

    public void moveright() {
    }

    public void moveleft() {
    }

    public boolean collisionEnemy() {
        return this.collisionEnemy;
    }

    public boolean collisionPlayer() {
        return this.collisionPlayer;
    }

//    public boolean crashed() {
//        if (player.getPositionX() == this.positionX && player.getPositionY() == this.positionY) {
//            return this.crashed = true;
//        }
//        return this.crashed = false;
//    }

    public float getLeft() {
        return this.enemies.x;
    }

    public float getRight() {
        return this.enemies.x + this.enemies.width;
    }
    public float getTop() {
        return this.enemies.y + this.enemies.height;
    }
    public float getBottom() {
        return this.enemies.y;
    }

    // add something that makes sure we add 10 points when enemy is killed but sub 5
    // points when fixed enemy is killed
    public int getScore() {
        return this.score;
    }

    public int setScore() {
        if (collisionPlayer = true) {
            return this.score -= 5;
        } else if (collisionEnemy = true) {
            return this.score;
        } else {
            return this.score;
        }
    }

}
