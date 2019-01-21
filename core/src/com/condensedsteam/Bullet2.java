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
    private int speed = 30;
    private boolean visible;
    private Player player;
    private Rectangle bullet;
    private float x;
    private float y;

    public Bullet2(float x, float y) {
        
        
        bullet = new Rectangle(x, y, width, height);

        visible = true;
    }

    public void move() {
            bullet.x = bullet.x + speed;
            if(bullet.x > 1000){
            visible = false;
            }
            
            
            
    }
   
//    public void stop(){
//        speed = 0;
//        bullet.x = bullet.x + speed;
//        visible = false;
//    }
    
//    public void jobDone(){
//    if (visible = false){
//        bullet.y = 1000000;
//    }    
//    }
    
    public float BulletX() {
     
        return bullet.x;
    }

    public float y() {
        return bullet.y;
    }
    public float x(){
        return bullet.x;
    }
    

    public boolean visible() {
        return this.visible;
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
