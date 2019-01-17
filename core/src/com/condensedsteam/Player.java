/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.particles.values.MeshSpawnShapeValue.Triangle;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author maxid2657
 */
public class Player {

  
    private int score;
    private float speed = 25;
    private Rectangle player;
    private boolean collisionEnemy;
    private ArrayList<Bullet2> bullet2;

    public Player(float x, float y, float width, float height, float speed, int score) {

        speed = this.speed;
        this.score = score;
        player = new Rectangle(x, y, width, height);
        this.collisionEnemy = collisionEnemy;
        bullet2 = new ArrayList();

    }

  

    public Rectangle Location() {
        return player;
    }

    public void moveUp() {

        player.y = player.y + speed;
    }

    public void moveDown() {
        player.y = player.y - speed;
    }

    public void moveForward() {
        player.x = player.x + speed;
    }

    public void moveBack() {
        player.x = player.x - speed;
    }

    public Rectangle getBounds() {
        return player;
    }

    public float getBottomLeft() {           //may have some errors

        return player.x;

    }

    public float getYPosition() {
        return player.y;
    }

    public float getXPosition() {
        return player.x;
    }

    public float getBottomRight() {

        return player.x + player.width;
    }

    public float getTopLeft() {

        return player.y;
    }

    public float getTopRight() {
        return player.y + player.width;
    }

    public void draw(ShapeRenderer shapeBatch) { //may have some errors

        shapeBatch.rect(player.x, player.y, player.width, player.height);

        shapeBatch.setColor(Color.CLEAR);

    }

    public int getScore() {
        return this.score;
    }

    // 10 points added when player shoots enemy
    public int setScore() {
        if (collisionEnemy = true) {
            return this.score += 10;
        } else {
            return this.score;
        }
    }

}
