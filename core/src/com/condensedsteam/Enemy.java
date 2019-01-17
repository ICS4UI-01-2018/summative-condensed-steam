/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author Kalsr8025
 */
public class Enemy {

    private Rectangle enemy;
    private BulletShotByEnemy bullet;
    private Player player;
    private int speed = 5;
    private boolean collisionPlayer;
    private boolean visible;

    public Enemy(float positionX, float positionY, int speed) {
        this.speed = speed;
        this.enemy = new Rectangle(positionX, positionY, 20, 30);
//        this.target = target;
    }

//work on this 
    public void movetowardsplayer(Player player) {
        if (player.getYPosition() == this.enemy.y && player.getXPosition()< this.enemy.x) {
            this.enemy.x -= 1;
        } else if (player.getYPosition() == this.enemy.y &&  player.getXPosition() > this.enemy.x) {
            this.enemy.x += 1;
        } else if ( player.getXPosition() == this.enemy.x && player.getYPosition() > this.enemy.y) {
           this.enemy.y  += 1;
        } else if ( player.getXPosition() == this.enemy.x && player.getYPosition() < this.enemy.y) {
            this.enemy.y  -= 1;
        } else if ( player.getXPosition() <this.enemy.x && player.getYPosition() > this.enemy.y) {
            this.enemy.y  += 1;
            this.enemy.x -= 1;
        } else if ( player.getXPosition() < this.enemy.x && player.getYPosition() < this.enemy.y) {
            this.enemy.y  -= 1;
            this.enemy.x -= 1;
        } else if ( player.getXPosition() > this.enemy.x && player.getYPosition() > this.enemy.y) {
            this.enemy.y  += 1;
            this.enemy.x += 1;
        } else if ( player.getXPosition() > this.enemy.x && player.getYPosition() < this.enemy.y) {
            this.enemy.y  -= 1;
            this.enemy.x+= 1;
        }

    }

    public Rectangle getBounds() {
        return enemy;
    }

    public boolean collisionPlayer(Player player) {
        if (enemy.overlaps(player.getBounds())) {
            return true;
        } else {
            return false;
        }
    }


    public float getBottomLeft() {
        return this.enemy.x;
    }

    public float getBottomRight() {
        return this.enemy.x + this.enemy.width;
    }

    public float getTopLeft() {
        return this.enemy.y;
    }

    public float getTopRight() {
        return this.enemy.y + +this.enemy.height;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void draw(ShapeRenderer shapeBatch) {
        shapeBatch.rect(enemy.x, enemy.y, enemy.width, enemy.height);
    }


}
