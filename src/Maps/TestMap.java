package Maps;

import Textures.Floor;
import Textures.Maps;

public class TestMap extends Maps{

	static int []chasmCoords ={800,801,802};
	
	public TestMap() {
		super(new Floor(), 2000, chasmCoords);
		
		super.addCloud(80, 70);		
		super.addCloud(300, 110);
		super.addCloud(580, 85);
		super.addCloud(710, 125);
		super.addCloud(900, 95);
		super.addCloud(1230, 120);
		super.addCloud(1630, 83);
		super.addCloud(1830, 70);
		
		
		super.addMarble(140, 530);
		super.addMarble(180, 530);
		super.addMarble(440, 350);
		super.addMarble(480, 350);
		
		
		
		super.addTruba(700, 468);

		super.addStep(1350, 532);
		super.addStep(1350, 490);
		super.addStep(1350, 448);
		super.addStep(1350, 406);
		
		super.addStep(1308, 532);
		super.addStep(1308, 490);
		super.addStep(1308, 448);
		
		super.addStep(1266, 532);
		super.addStep(1266, 490);
		
		super.addStep(1224, 532);
		
		super.addMushroom(600, 400);
		super.addMushroom(400, 400);
		super.addMushroom(700, 400);
		super.addMushroom(1200, 400);
		
		super.addSmallCastle(1600);
		
	}

}
