import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Pizza_test extends Pizza {

	@Test
	void valorPizzaSemIngrediente() {
	Pizza pizza = new Pizza();
	assertEquals(pizza.getIngredientes().isEmpty(),true);
	}
	
	@Test
	void valorPizzaComDoisIngrediente() {
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("Muçarela");
	pizza.adicionaIngrediente("Catupiry");

	assertEquals(pizza.getIngredientes().size() == 2 ,true);
	}
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
