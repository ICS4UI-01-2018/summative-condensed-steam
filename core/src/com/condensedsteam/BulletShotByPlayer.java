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
public class BulletShotByPlayer {

    //Create a Bullet class to store the properties of your bullet. (e.g. speed, position)
    private float x;
    private float y;
    private float width;
    private float height;
    private int speed = 3;
    private Rectangle bullet;
    private Player player;
    
    

    public void BulletShotByPlayer(float x, float y, float width, float height, int speed) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        bullet = new Rectangle(x, y, 5, 5);
    }

    public Rectangle getBounds() {
        return bullet;
    }
    
    public void move() {
        bullet.x = bullet.x + speed * x;
        bullet.y = bullet.y + speed * y;
    }

    public float getLeft() {
        return bullet.x;
    }

    public float getBottom() {
        return bullet.y;
    }

    public float getRight() {
        return bullet.x + bullet.width;
    }

    public float getTop() {
        return bullet.y + bullet.height;
    }

    public void draw(ShapeRenderer shapeBatch) {
        shapeBatch.rect(bullet.x, bullet.y, bullet.width, bullet.height);
    }
}
