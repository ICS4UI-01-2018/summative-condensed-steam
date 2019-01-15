/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;


/**
 *
 * @author lamon
 */
public class Bullet {
//
//    private int x, y;
//    private int dx = 10;
//    private int width = 10;
//    private int height = 10;
//    private boolean dead = true;
//    private int bullet_limit = 50;
//    private int bullet_range = 200;
//    public static TextureRegion bullet;
//    public static Texture texture;
//
//    texture  = new Texture(Gdx.files.internal("bullet.png"));
//
//    texture.setFilter (TextureFilter.Nearest, TextureFilter.Nearest);
//    bullet  = new TextureRegion(texture, 238, 5, 6, 13);
//
//    public void move() {
//        x += dx;
//        if (x > bullet_range) {
//            dead = false;
//        }
//
//    }
//
//    public void paint(Graphics g) {
//        g.drawImage(bulletPic, x, y, width, height, null);
//    }
//}

//    private Rectangle shape;
//    private int speed;
//    
//    public Bullet(int x, int y, int width, int height, int speed){
//        this.speed = speed;
//        shape = new Rectangle(x,y,width,height);
//
//    }
//    
//    public void move(){
//        shape.x = shape.x + speed;
//        shape.y = shape.y + speed;
//    }
//    
//    public float getLeft(){
//        return shape.x;
//    }
//    
//    public float getBottom(){
//        return shape.y;
//    }
//    
//    public float getRight(){
//        return shape.x + shape.width;
//    }
//    
//    public float getTop(){
//        return shape.y + shape.height;
//    }
//    
//    public void draw(ShapeRenderer shapeBatch){
//        shapeBatch.rect(shape.x, shape.y, shape.width, shape.height);
//    }
//    
//    public boolean collidesWith(Paddle p){
//        return shape.overlaps(p.getBounds());
//    }
//    public void spawnedIn(){
//        this.spawned = true;
//    }  
//    public boolean getSpawned(){
//        return this.spawned;
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
//    public float getX(){
//        return bullet.x;
//    }
//    
//    public float getY(){
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
//    public void drawBullet(ShapeRenderer shapeBatch) {
//        shapeBatch.rect(bullet.x, bullet.y, bullet.width, bullet.height);
//    }
}
