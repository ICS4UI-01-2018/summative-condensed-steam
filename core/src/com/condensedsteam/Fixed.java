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
public class Fixed extends Enemies{
    private Rectangle fixed;
    
    
    public Fixed(float positionX, float positionY, int score, boolean collisionEnemy, boolean collisionPlayer, boolean crashed) {
        super(positionX, positionY, score, collisionEnemy, collisionPlayer, crashed);
        //random position and size... 
        this.fixed = new Rectangle(positionX, positionY, 20, 20);
    }
    
    @Override
     public void moveup() {
        fixed.y += 2; 
    }

    @Override
    public void movedown() {
        fixed.y -= 2; 
    }
    public void draw(ShapeRenderer shapeBatch) {
        shapeBatch.rect(fixed.x, fixed.y, fixed.width, fixed.height);
    }
}
