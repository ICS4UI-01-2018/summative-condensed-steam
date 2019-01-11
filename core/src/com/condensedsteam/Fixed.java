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
public class Fixed {

    private Rectangle fixed;
    private int speed = 2;
    private boolean collisionPlayer;
    private Enemy enemy ;

    public Fixed(float positionX, float positionY, int speed) {
        this.speed = speed;
        this.fixed = new Rectangle(positionX, positionY, 20, 20);
    }
    
    public void move(){
         
    }
    public Rectangle getBounds() {
        return fixed;
    }

    public boolean collisionPlayer(Player player) {
        if (fixed.overlaps(player.getBounds())) {
            return true;
        } else {
            return false;
        }
    }

    public float getBottomLeft() {
        return this.fixed.x;
    }

    public float getBottomRight() {
        return this.fixed.x + this.fixed.width;
    }

    public float getTopLeft() {
        return this.fixed.y;
    }

    public float getTopRight() {
        return this.fixed.y + +this.fixed.height;
    }

    public void moveup() {
        fixed.y += speed;
    }

    public void movedown() {
        fixed.y -= speed;
    }

    public void draw(ShapeRenderer shapeBatch) {
        shapeBatch.rect(fixed.x, fixed.y, fixed.width, fixed.height);
    }
    
}
