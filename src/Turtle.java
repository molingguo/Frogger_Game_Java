/**
 * Copyright 2013 Moling Guo
 * @author Moling Guo
 * @date 17 April 2013
 */

import javalib.worldimages.FromFileImage;
import javalib.worldimages.Posn;
import javalib.worldimages.WorldImage;

public class Turtle extends SonofOfe {
	
	Turtle(CartPt loc) {
		super(loc);
	}
	
	public WorldImage getImage() {
		return new FromFileImage(new Posn(this.loc.x, this.loc.y), 
				"turtle.png");
	}
	

}