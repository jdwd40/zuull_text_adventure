package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {

	Player p1 = new Player();
	Room tRoom = new Room("test room");
	
	@Test
	void getHealthtest() {
		assertEquals(10, p1.getHealth());
	}
	
	@Test
	void roomTest() {
		assertEquals("test room", tRoom.getDescription());
	}
	
	@Test
	void roomExitTest() {
		tRoom.setExit("North", tRoom);
		tRoom.setExit("South", tRoom);
		assertEquals("South North", tRoom.getExits());
		
	}

	@Test
	void playerCurrentLocationTest() {
		p1.setCurrentLocation(tRoom);
		assertEquals("smeg room", p1.getCurrentLocation());
		
	}

}
