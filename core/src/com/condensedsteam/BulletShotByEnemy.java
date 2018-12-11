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
public class BulletShotByEnemy {

    private int speed = 3;
    private int x;
    private int y;
    private boolean visible;
    private Rectangle bullet;

    public BulletShotByEnemy(int x, int y) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.visible = true;
        bullet = new Rectangle(x, y, 5, 5);
    }

    //update x AND Y..............
    public void update() {
        x += speed;
        // find out dimensions of the game and sub them for 800
        if (x > 800) {
            visible = false;
        }
        y += speed;
        // find out dimensions of the game and sub them for 800
        if (y > 800) {
            visible = false;
        }
    }

    public Rectangle getBounds() {
        return bullet;
    }
    
    //need to work on this 
    public void moveTowardsPlayer(Player player){
        
        
    }
    
    public boolean collidesWithPlayer(Player player){
       if (bullet.overlaps(player.getBounds())){
           return true;
       }else 
           return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void draw(ShapeRenderer shapeBatch) {
        shapeBatch.rect(bullet.x, bullet.y, bullet.width, bullet.height);
    }
}
