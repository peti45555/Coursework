package Maps;

import Textures.Floor;
import Textures.Maps;

public class TestMap extends Maps{

	static int []chasmCoords ={};
	
	public TestMap() {
		super(new Floor(), 2000,chasmCoords);
		super.addCloud(50, 50);
		super.addMarble(100, 530);
		super.addMarble(140, 530);
		super.addMarble(140, 300);
		super.addTruba(300, 468);
		super.addCloud(500, 400);
		super.addMushroom(600, 400);
		super.addMushroom(400, 400);
		super.addMushroom(200, 400);
	}

	

	
	




}
