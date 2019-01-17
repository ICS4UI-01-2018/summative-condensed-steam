/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

/**
 *
 * @author Kalsr8025
 */
public class Bullet2 {

    private float width = 80;
    private float height = 40;
    private int speed = 5;
    private boolean visible;
    private Player player;
    private Rectangle bullet;

    public Bullet2(float x, float y) {
        bullet = new Rectangle(x, y, width, height);
        visible = false;
    }

    public void move() {
        bullet.x += speed;
        visible = true;
    }

    public boolean visible() {
        return this.visible = true;
    }

    public float x() {
        return bullet.x;
    }

    public float y() {
        return bullet.y;
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
        shapeBatch.setColor(Color.CLEAR);

    }

}
