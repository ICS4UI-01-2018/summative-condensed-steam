/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

/**
 *
 * @author Kalsr8025
 */
public class Bullet2 {

    private float x;
    private float y;
    private float width = 8;
    private float height = 4;
    private int speed = 5;
    private boolean visible;
    private Player player;
    private Rectangle bullet;

    public Bullet2(float x, float y) {
        bullet = new Rectangle(x, y, width, height);
    }

    public void move() {
        bullet.y = bullet.y + speed;
        bullet.x = bullet.y + speed;
    }

    public boolean collisionEnemy(Enemy enemy) {
        if (bullet.overlaps(enemy.getBounds())) {
            return true;
        } else {
            return false;
        }
    }
     public void drawBullet(ShapeRenderer shapeBatch) {
        shapeBatch.rect(bullet.x, bullet.y, bullet.width, bullet.height);
    }

}