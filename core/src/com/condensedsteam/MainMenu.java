///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.condensedsteam;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.Input;
//import com.badlogic.gdx.graphics.GL20;
//import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.Screen;
//
///**
// *
// * @author kathf6052
// */
//public class MainMenu implements Screen {
//    private gradiusgalaxies game;
//    private OrthographicCamera camera;
//    
//    public MainMenu(gradiusgalaxies game){
//        // assigns the game passed to the placeholder
//        this.game = game;
//        // creates the camera
//        camera = new OrthographicCamera();
//        // set the width and height
//        camera.setToOrtho(false, 800, 480);
//        
//    }
//    @Override
//    public void render (float deltaTime){
//        // Sets the color to be applied after clearing the screen
//        Gdx.gl.glClearColor(0, 0, 255, 1);
//        // Clears the screen
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        
//        // updates camera view 
//        camera.update();
//        
//        // makes the camera fit onto available screen
//        game.batch.setProjectionMatrix(camera.combined);
//        
//    }
//    
//    @Override
//    public void resize(int width, int height){
//        
//    }
//        
//
//    @Override
//    public void show(){
//
//    }
//
//    @Override
//    public void hide(){
//
//
//    }
//
//    @Override
//    public void pause(){
//
//    }
//
//    @Override
//    public void resume(){
//
//    }
//
//    @Override
//    public void dispose(){
//
//    }
//}
