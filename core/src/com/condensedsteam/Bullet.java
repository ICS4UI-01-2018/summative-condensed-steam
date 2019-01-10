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
 * @author lamon
 */
public class Bullet {
    private Rectangle shape;
    private int speed;
    
    public Bullet(int x, int y, int width, int height, int speed){
        this.speed = speed;
        shape = new Rectangle(x,y,width,height);

    }
    
    public void move(){
        shape.x = shape.x + speed;
        shape.y = shape.y + speed;
    }
    
    public float getLeft(){
        return shape.x;
    }
    
    public float getBottom(){
        return shape.y;
    }
    
    public float getRight(){
        return shape.x + shape.width;
    }
    
    public float getTop(){
        return shape.y + shape.height;
    }
    
    public void draw(ShapeRenderer shapeBatch){
        shapeBatch.rect(shape.x, shape.y, shape.width, shape.height);
    }
//    
//    public boolean collidesWith(Paddle p){
//        return shape.overlaps(p.getBounds());
//    }
    
    
    
}