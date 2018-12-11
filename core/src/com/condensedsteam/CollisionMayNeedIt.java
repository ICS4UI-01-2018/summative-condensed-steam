/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

/**
 *
 * @author Kalsr8025
 */
public class CollisionMayNeedIt {

    private Player player;
    private Enemies enemies;
    private BulletShotByPlayer playerbullet;
    private BulletShotByEnemy enemybullet;

    public void Collision(Player player, Enemies enemies, BulletShotByPlayer playerbullet, BulletShotByEnemy enemybullet) {
        this.player = player;
        this.enemies = enemies;
        this.enemybullet = enemybullet;
        this.playerbullet = playerbullet;
    }


    //player vs enemy 
    //enemy vs enemy
    //player vs bullet
    //enemy vs bullet
    //player vs walls
}
