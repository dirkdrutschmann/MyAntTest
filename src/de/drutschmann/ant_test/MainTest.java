package de.drutschmann.ant_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

	Main main;
	
	@BeforeEach
	void setUp() throws Exception {
		 main = new Main();
	}

	@Test
	void test() {
		 assertEquals("welcome", main.getWelcomeMessage());
	}

}
