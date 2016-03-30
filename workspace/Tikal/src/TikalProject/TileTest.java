package TikalProject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TileTest {

	private TikalProject.Tile Tile1 ;
	
	@Test
	public void TestTemple (){
		Tile1 = new TikalProject.Tile();
		TikalProject.Tile.setData() ;
		boolean actual = TikalProject.Tile.getTemple();
		assertTrue(actual == true);
		
		
	@Test
	public void TestPathways() {
		Tile1 = new TikalProject.Tile();
		TikalProject.Tile.setData();
		
	}
	
}
