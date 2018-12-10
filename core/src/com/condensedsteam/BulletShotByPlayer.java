/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

import com.badlogic.gdx.math.Rectangle;

/**
 *
 * @author Kalsr8025
 */
public class BulletShotByPlayer{

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
        this.y= y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        bullet = new Rectangle(x,y,5,5);  

    }
    
}
