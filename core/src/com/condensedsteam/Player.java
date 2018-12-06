/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g3d.particles.values.MeshSpawnShapeValue.Triangle;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;


/**
 *
 * @author maxid2657
 */
public class Player {
    
    private int speed;
    private Rectangle player;
    
    
    public void createPlayer(float x, float y, float width, float height, int speed){
        
        speed = this.speed;
        
        player = new Rectangle(x,y,width,height);  
        
        
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
    
    public float getPositionX(){
        
        return player.x;
    }
    
    public float getPositionY(){
        
        return player.y;
    }
    
    public void draw(ShapeRenderer shapeBatch){
       
        shapeBatch.rect(player.x, player.y, player.width, player.height);
        
        shapeBatch.setColor(Color.CLEAR); 
        
    }
}

