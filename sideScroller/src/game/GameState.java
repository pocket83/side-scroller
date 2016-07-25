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

		if(input.isKeyDown(Input.KEY_RIGHT)) {			//RIGHT
			if(input.isKeyDown(Input.KEY_UP)){			//RIGHT + UP
				blooper.direction = 2;
			} else if(input.isKeyDown(Input.KEY_DOWN)){	//RIGHT + DOWN
				blooper.direction = 3;
			}
			else {
				blooper.direction = 1;
			}
		} else if(input.isKeyDown(Input.KEY_LEFT)){		//LEFT
			if(input.isKeyDown(Input.KEY_UP)){			//LEFT + UP
				blooper.direction = 5;
			} else if(input.isKeyDown(Input.KEY_DOWN)){ //LEFT + DOWN
				blooper.direction = 6;
			} else{
				blooper.direction = 4;
			}
		} else if(input.isKeyDown(Input.KEY_UP)){		//UP
			if(input.isKeyDown(Input.KEY_RIGHT)){		//UP + RIGHT
				blooper.direction = 8;
			} else if(input.isKeyDown(Input.KEY_LEFT)){ //UP + LEFT
				blooper.direction = 9;
			} else{
				blooper.direction = 7;
			}
		} else if(input.isKeyDown(Input.KEY_DOWN)){		//DOWN
			if(input.isKeyDown(Input.KEY_RIGHT)){		//DOWN + RIGHT
				blooper.direction = 11;
			} else if(input.isKeyDown(Input.KEY_LEFT)){ //DOWN + LEFT
				blooper.direction = 12;
			} else{
				blooper.direction = 10;
			}
		} else{
			blooper.direction = -1;
		}
		
		blooper.update(delta);
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
