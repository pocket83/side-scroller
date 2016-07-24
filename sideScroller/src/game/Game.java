package game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends StateBasedGame {

	public Game(String title) {
		super(title);
	}

	public static void main(String[] args) throws SlickException {
		AppGameContainer mainWindow = new AppGameContainer(new Game("Game Title!"));
		mainWindow.setDisplayMode(800, 600, false);
		mainWindow.setAlwaysRender(true);
		
		mainWindow.start();
		
	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		this.addState(new GameState());
		
	}
	
	

}
