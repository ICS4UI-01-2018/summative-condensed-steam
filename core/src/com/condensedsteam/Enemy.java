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
    private ArrayList<BulletShotByEnemy> projectiles = new ArrayList<BulletShotByEnemy>();
    private Player player;
    private int speed = 5;
    private boolean collisionfixed;
    private boolean collisionPlayer;
    private boolean visible;

    public Enemy(float positionX, float positionY, int speed) {
        this.speed = speed;
        this.enemy = new Rectangle(positionX, positionY, 20, 30);
//        this.target = target;
    }

//work on this 
    public void movetowardsplayer() {
//        if (pX > this.enemy.x) {
//            this.enemy.x += speed;
//        } else if (pX < this.enemy.x) {
//            this.enemy.x -= speed;
//        }
//        if (pY > this.enemy.y) {
//            this.enemy.y += speed;
//        } else if (pY < this.enemy.y) {
//            this.enemy.y -= speed;
//        }
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

    public boolean collisionfixed(Fixed fixed) {
        if (enemy.overlaps(fixed.getBounds())) {
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

    public void shoot() {
        BulletShotByEnemy shoot;
        shoot = new BulletShotByEnemy((int) (enemy.x + Math.random()), (int) (enemy.y + Math.random()));
        projectiles.add(shoot);
    }

    public ArrayList getBulletShotByEnemy() {
        return projectiles;
    }

}
