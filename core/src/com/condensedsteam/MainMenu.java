/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.sun.org.apache.bcel.internal.Constants;

/**
 *
 * @author kathf6052
 */
public class MainMenu implements Screen {

    private gradiusgalaxies game;
    private OrthographicCamera camera;
    private SpriteBatch batch;
    protected Stage stage;
    private Viewport viewport;
    private TextureAtlas atlas;
    protected Skin skin;

    public MainMenu(gradiusgalaxies game) {
        this.game = game;
        atlas = new TextureAtlas("skin.atlas");
        skin = new Skin(Gdx.files.internal("skin.json"), atlas);

        batch = new SpriteBatch();
        camera = new OrthographicCamera();
        viewport = new FitViewport(800, 660, camera);
        viewport.apply();

        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);
        camera.update();

        stage = new Stage(viewport, batch);
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);

        Table mainTable = new Table();
        mainTable.setFillParent(true);
        mainTable.top();

        TextButton playButton = new TextButton("Play", skin);
        TextButton optionsButton = new TextButton("Options", skin);
        TextButton exitButton = new TextButton("Exit", skin);

        playButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
            //    ((Game) Gdx.app.getApplicationListener()).setScreen(new GameScreen);
            }
        });
        exitButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.app.exit();
            }
        });

        mainTable.add(playButton);
        mainTable.row();
        mainTable.add(optionsButton);
        mainTable.row();
        mainTable.add(exitButton);

        stage.addActor(mainTable);
    }

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
    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);
        camera.update();
    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void render(float delta) {

    }
}
