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
//public class BulletShotByPlayer {
//
//    //Create a Bullet class to store the properties of your bullet. (e.g. speed, position)
//    private float x;
//    private float y;
//    private float width;
//    private float height;
//    private int speed = 3;
//    private Rectangle bullet;
//    private Player player;
//
//    public void BulletShotByPlayer(float x, float y, float width, float height, int speed) {
//        this.x = x;
//        this.y = y;
//        this.width = width;
//        this.height = height;
//        this.speed = speed;
//        bullet = new Rectangle(x, y, 5, 5);
//    }
//
//    public Rectangle getBounds() {
//        return bullet;
//    }
//
//    public boolean collidesWithEnemy(Enemy enemy, Fixed fixed) {
//        if (bullet.overlaps(enemy.getBounds())) {
//            return true;
//        } else if (bullet.overlaps(fixed.getBounds())) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void move() {
//        bullet.x = bullet.x + speed * x;
//        bullet.y = bullet.y + speed * y;
//    }
//
//    public float getLeft() {
//        return bullet.x;
//    }
//
//    public float getBottom() {
//        return bullet.y;
//    }
//
//    public float getRight() {
//        return bullet.x + bullet.width;
//    }
//
//    public float getTop() {
//        return bullet.y + bullet.height;
//    }
//
//    public void draw(ShapeRenderer shapeBatch) {
//        shapeBatch.rect(bullet.x, bullet.y, bullet.width, bullet.height);
//    }
//}

public class Bullet {

    private Rectangle bullet;
    private int speed;
    private float dx;
    private float dy;
    private int damage;    
    private boolean spawned;

    public Bullet(float x, float y, int width, int height, int speed, int damage, float dx, float dy) {
        this.speed = speed;
        this.damage = damage;
        bullet = new Rectangle(x, y, width, height);
        bullet.x = x;
        bullet.y = y;
        this.dx = dx;
        this.dy = dy;
        spawned = false;
    }

    public void bulletMovement() {
        bullet.x = bullet.x + speed *dx;
        bullet.y = bullet.y + speed *dy;
    }
    
    
    
    public void spawnedIn(){
        this.spawned = true;
    }  
    public boolean getSpawned(){
        return this.spawned;
    }
    
    public float getLeft() {
        return bullet.x;
    }

    public float getBottom() {
        return bullet.y;
    }
    
    public float getX(){
        return bullet.x;
    }
    
    public float getY(){
        return bullet.y;
    }

    public float getRight() {
        return bullet.x + bullet.width;
    }

    public float getTop() {
        return bullet.y + bullet.height;
    }

    public void drawBullet(ShapeRenderer shapeBatch) {
        shapeBatch.rect(bullet.x, bullet.y, bullet.width, bullet.height);
    }
    

}
