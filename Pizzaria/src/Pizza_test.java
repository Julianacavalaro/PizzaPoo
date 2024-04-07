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
	Pizza pizzaDeVento = new Pizza();
	assertEquals(pizzaDeVento.getIngredientes().isEmpty(),true);
	assertEquals(pizzaDeVento.getPreco() == 0, true);
	assertEquals(Pizza.getIgredientesMap().isEmpty() , true);
	}
	
	@Test
	void valorPizzaComDoisIngredientes() {
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("Muçarela");
	pizza.adicionaIngrediente("Catupiry");
	assertEquals(pizza.getIngredientes().size() == 2 ,true);
	assertEquals(pizza.getPreco() == 15, true);
	}
	
	@Test
	void valorPizzaComCincoIngredientes() {
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("Muçarela");
	pizza.adicionaIngrediente("Catupiry");
	pizza.adicionaIngrediente("Muçarela");
	pizza.adicionaIngrediente("Catupiry");
	pizza.adicionaIngrediente("Muçarela");

	assertEquals(pizza.getIngredientes().size() == 5 ,true);
	assertEquals(pizza.getPreco() == 20, true);
	}
	
	@Test
	void valorPizzaComSeisIngredientes() {
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("Muçarela");
	pizza.adicionaIngrediente("Catupiry");
	pizza.adicionaIngrediente("Muçarela");
	pizza.adicionaIngrediente("Catupiry");
	pizza.adicionaIngrediente("Muçarela");
	pizza.adicionaIngrediente("Catupiry");
	assertEquals(pizza.getIngredientes().size() == 6 ,true);
	assertEquals(pizza.getPreco() == 23, true);


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
