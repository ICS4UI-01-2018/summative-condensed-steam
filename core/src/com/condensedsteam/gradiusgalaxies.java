package com.condensedsteam;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class gradiusgalaxies extends ApplicationAdapter implements InputProcessor {

    SpriteBatch batch;
    private ShapeRenderer shapeBatch;
    TiledMap tiledMap;
    OrthographicCamera camera;
    TiledMapRenderer tiledMapRenderer;
    private Texture spaceshipPic;
    private Player player;
    private Enemy enemy;
    private Fixed fixed;
    
    
    @Override
    public void create() {
        float w = Gdx.graphics.getWidth();
        float h = Gdx.graphics.getHeight();

       camera = new OrthographicCamera();
       camera.setToOrtho(false, 192, 192);
       camera.update();
       tiledMap = new TmxMapLoader().load("Level1.tmx");
       spaceshipPic = new Texture("spaceship.png");
       tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
       Gdx.input.setInputProcessor(this);
       player = new Player(100,100,20,20,2,0);
    }

    @Override
    public void render() {
        
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();
        tiledMapRenderer.setView(camera);
        tiledMapRenderer.render();
        
        player.draw(shapeBatch);
        
        shapeBatch.setColor(Color.WHITE);
        player.draw(shapeBatch);
        
    }

        @Override
    public boolean keyTyped(char character) {

        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
       if(keycode == Input.Keys.LEFT)
            camera.translate(-16,0);
        if(keycode == Input.Keys.RIGHT)
            camera.translate(16,0);
        if(keycode == Input.Keys.UP)
            camera.translate(0,16);
        if(keycode == Input.Keys.DOWN)
            camera.translate(0,-16);
        if(keycode == Input.Keys.NUM_1)
            tiledMap.getLayers().get(0).setVisible(!tiledMap.getLayers().get(0).isVisible());
        if(keycode == Input.Keys.NUM_2)
            tiledMap.getLayers().get(1).setVisible(!tiledMap.getLayers().get(1).isVisible());
        return false;
  
    }
   
    
    
    
    

}
