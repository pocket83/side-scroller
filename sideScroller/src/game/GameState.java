package game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameState extends BasicGameState{
	
	private Mob blooper;

	@Override
	public void init(GameContainer container, StateBasedGame arg1) throws SlickException {
		blooper = new Mob();
	}
	
	@Override
	public void update(GameContainer container, StateBasedGame arg1, int delta) throws SlickException {
		Input input = container.getInput();

		if(input.isKeyDown(Input.KEY_RIGHT)) {
			blooper.xDirection = 1;						//RIGHT
		} else if(input.isKeyDown(Input.KEY_LEFT)){
			blooper.xDirection = -1;					//LEFT
		} else {
			blooper.xDirection = 0;						//IDLE
		}


		if(input.isKeyDown(Input.KEY_UP)){
			blooper.yDirection = 1;						//UP
		} else if(input.isKeyDown(Input.KEY_DOWN)){
			blooper.yDirection = -1;					//DOWN
		} else {
			blooper.yDirection = 0;						//IDLE
		}

		//blooper.update(delta);
		blooper.move();
	}

	@Override
	public void render(GameContainer container, StateBasedGame arg1, Graphics g) throws SlickException {
		blooper.draw();
	}

	@Override
	public int getID() {
		
		return 0;
	}
}
