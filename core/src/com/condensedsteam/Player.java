/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g3d.particles.values.MeshSpawnShapeValue.Triangle;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;


/**
 *
 * @author maxid2657
 */
public class Player {
    
    private float positionx;
    private float positiony;
    private int width;
    private int height;
    private float score;
    private int speed;
    private Rectangle player;
    
    
    public void createPlayer(float x, float y, float width, float height, int speed){
        
        speed = this.speed;
        
        player = new Rectangle(x,y,width,height);  //leave as a rectangle for now
        //how to make a triangle?
        
        //player = new Triangle();
}
    
    public Rectangle Location(){
        return player;
    }
     
    public void moveUp(){
        
        player.y = player.y + speed;
    }
    
    public void moveDown(){
        player.y = player.y - speed;
    }
    
    public void moveForward(){
        player.x = player.x + speed;
    }
    
    public void moveBack(){
        player.x = player.x - speed;
    }
    
    public void draw(ShapeRenderer shapeBatch){
        //shapeBatch.Rectangle();
    }
}

