/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.particles.values.MeshSpawnShapeValue.Triangle;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

/**
 *
 * @author maxid2657
 */
public class Player {

    private int score;
    private int speed = 3;
    private Rectangle player;
    private BulletShotByPlayer bullet;

    public Player(float x, float y, float width, float height, int speed, int score) {

        speed = this.speed;
        this.score = score;
        player = new Rectangle(x, y, width, height);

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

    public boolean collisionEnemy(Enemy enemy, Fixed fixed) {
        if (player.overlaps(enemy.getBounds())) {
            return true;
        } else if (player.overlaps(fixed.getBounds())) {
            return true;
        } else {
            return false;
        }
    }

    public float getBottomLeft() {           //may have some errors

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
//    public int setScore() {
//        if (collisionPlayer = true) {
//            return this.score -= 5;
//        } else if (collisionEnemy = true) {
//            return this.score;
//        } else {
//            return this.score;
//        }
//    }

}
