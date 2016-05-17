package Maps;

import Textures.Floor;
import Textures.Maps;

public class TestMap extends Maps{

	static int []chasmCoords ={};
	
	public TestMap() {
		super(new Floor(), 2000, chasmCoords);
		
		super.addSmallCastle(1700);
		
		super.addCloud(50, 50);
		
//		
//		super.addMarble(140, 530);
//		super.addMarble(180, 530);
//		super.addMarble(440, 350);
//		super.addMarble(480, 350);
//		super.addMarble(300, 465);
//		
		
		super.addTruba(300, 468);
		
		
		super.addMushroom(600, 400);
		super.addMushroom(400, 100);
		super.addMushroom(200, 400);
		
	}

}
