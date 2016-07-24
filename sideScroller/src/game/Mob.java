package game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Mob {
	
	
	private final int RIGHT 	= 1;
	private final int RIGHTUP 	= 2;
	private final int RIGHTDOWN = 3;
	private final int LEFT  	= 4;
	private final int LEFTUP    = 5;
	private final int LEFTDOWN  = 6;
	private final int UP 		= 7;
	private final int UPRIGHT	= 8;
	private final int UPLEFT	= 9;
	private final int DOWN		= 10;
	private final int DOWNRIGHT = 11;
	private final int DOWNLEFT  = 12;
	private final int IDLE  	= -1;
	
	int direction = IDLE;
	
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
		
		switch(direction){
			case RIGHT:
				x += 1;
				break;
			case RIGHTUP:
				x += 1;
				y -= 1;
				break;
			case RIGHTDOWN:
				x += 1;
				y += 1;
				break;			
			case LEFT:
				x -= 1;
				break;
			case LEFTUP:
				x -= 1;
				y -= 1;
				break;
			case LEFTDOWN:
				x -= 1;
				y += 1;
				break;
			case UP:
				y -= 1;
				break;
			case UPRIGHT:
				y -= 1;
				x += 1;
				break;
			case UPLEFT:
				y -= 1;
				x -= 1;
				break;
			case DOWN:
				y += 1;
				break;
			case DOWNRIGHT:
				y += 1;
				x += 1;
				break;
			case DOWNLEFT:
				y += 1;
				x -= 1;
				break;
			case IDLE:
				//nothing
		}
	}
}
