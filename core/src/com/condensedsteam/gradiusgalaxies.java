package com.condensedsteam;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import static sun.audio.AudioPlayer.player;

public class gradiusgalaxies extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private ShapeRenderer shapeBatch;
        Player player;
        
	@Override
	public void create () {
            
		batch = new SpriteBatch();
                shapeBatch = new ShapeRenderer();
		img = new Texture("badlogic.jpg");
                
                
                
                
                
                
                
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
                
                
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
        
        
        
}
