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
    private boolean collisionWalls;
    private Player player;
    private Rectangle enemies;
    private boolean visible;

    public Enemies(float positionX, float positionY, int width, int height, int score, boolean collisionEnemy, boolean collisionPlayer, boolean collisionWalls) {
        this.enemies = new Rectangle(positionX, positionY, width, height);
        this.score = score;
        this.collisionEnemy = collisionEnemy;
        this.collisionPlayer = collisionPlayer;
        this.collisionWalls = collisionWalls;
    }

    public Rectangle getBounds() {
        return enemies;
    }

    public void moveup() {
    }

    public void movedown() {
    }

    public void moveright() {
    }

    public void moveleft() {
    }

    public boolean collisionEnemy(Enemy enemy, Fixed fixed) {
        if (enemies.overlaps(enemy.getBounds())) {
            return true;
        } else if (enemies.overlaps(fixed.getBounds())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean collisionPlayer(Player player) {
        if (enemies.overlaps(player.getBounds())) {
            return true;
        } else {
            return false;
        }
    }

    public float getBottomLeft() {
        return this.enemies.x;
    }

    public float getBottomRight() {
        return this.enemies.x + this.enemies.width;
    }

    public float getTopLeft() {
        return this.enemies.y;
    }

    public float getTopRight() {
        return this.enemies.y + +this.enemies.height;
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

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

}
