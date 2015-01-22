package a1;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import a1.Vector3D;

public class Vector3DTest {
	
	private Vector3D VectorA, VectorB, VectorC;
	private static final double DELTA = 1e-15;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
		this.VectorA = new Vector3D(0.5, 22.0, 5.0);
		this.VectorB = new Vector3D(0.5, 22.0, 5.0);
		this.VectorC = new Vector3D(1.5, 2.0, 3.0);
	}
	
	@After
	public void destory() throws Exception {
		this.VectorA = null;
		this.VectorB = null;
		this.VectorC = null;
	}
	
	@Test
	public void testNumber() {
		assertNotNull(this.VectorA);
		assertNotNull(this.VectorB);
		assertNotNull(this.VectorC);
	}
	
	@Test
	public void testEqualsObject() {
		assertEquals(VectorA.x, VectorB.x, DELTA);
	}


}
