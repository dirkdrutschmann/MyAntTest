package de.drutschmann.ant_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MainTest {

	Main main;
	
	@Before
	public void setUp() throws Exception {
		 main = new Main();
	}

	@Test
	public void test() {
		 assertEquals("welcome", main.getWelcomeMessage());
	}

}
