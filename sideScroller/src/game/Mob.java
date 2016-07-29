package game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Mob {
	
	int xDirection = 0;
	int yDirection = 0;

	int x, y;
	Image sprite;
	
	public Mob() throws SlickException{
		x = 20;
		y = 20;
		sprite = new Image("res/blooper.png");
	}
	
	public void update(int delta){
		move();
	}
	
	public void draw(){
		sprite.draw(x, y);
	}
	
	public void move(){

		//update the x coordinates
		switch(xDirection) {
			case 1:
				x += 1;
				break;
			case -1:
				x -= 1;
				break;
			case 0:
				break;
		}

		//update the y coordinates
		switch(yDirection){
			case 1:
				y -= 1;
				break;
			case -1:
				y += 1;
				break;
			case 0:
				break;
		}
	}
}
