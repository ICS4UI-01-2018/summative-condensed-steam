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
public class EnemyShootPlayer extends Enemies {

    private Rectangle enemyShootPlayer;

    public EnemyShootPlayer(float positionX, float positionY, int score, boolean collisionEnemy, boolean collisionPlayer, boolean crashed) {
        super(positionX, positionY, score, collisionEnemy, collisionPlayer, crashed);
        this.enemyShootPlayer = new Rectangle(positionX, positionY, 10, 10);
    }

    @Override
    public void moveup() {
        enemyShootPlayer.y += 4;
    }

    @Override
    public void movedown() {
        enemyShootPlayer.y -= 4;
    }

    @Override
    public void moveright() {
        enemyShootPlayer.x += 4;
    }

    @Override
    public void moveleft() {
        enemyShootPlayer.y -= 4;
    }

    public void draw(ShapeRenderer shapeBatch) {
        shapeBatch.rect(enemyShootPlayer.x, enemyShootPlayer.y, enemyShootPlayer.width, enemyShootPlayer.height);
    }
}

// move up, down, right, left
