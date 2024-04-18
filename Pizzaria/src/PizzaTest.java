import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PizzaTest {

	@BeforeEach
	void setUp() {
		Pizza.zeraIngredientes();
		System.out.println("@BeforeEach");
	}
	
	@Test
	void valorPizzaComDoisIngredientes() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("Muçarela");
		pizza.adicionaIngrediente("Catupiry");
		assertEquals(pizza.getIngredientes().size() ,2);
		assertEquals(pizza.getPreco(), 15);
	}

	@Test
	void valorPizzaComCincoIngredientes() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("Muçarela");
		pizza.adicionaIngrediente("Catupiry");
		pizza.adicionaIngrediente("Muçarela");
		pizza.adicionaIngrediente("Catupiry");
		pizza.adicionaIngrediente("Muçarela");

		assertEquals(pizza.getIngredientes().size() ,5);
		assertEquals(pizza.getPreco(), 20);
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
		assertEquals(pizza.getIngredientes().size() ,6);
		assertEquals(pizza.getPreco(), 23);


	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}


	@Test
	void valorPizzaSemIngrediente() {
		Pizza pizzaDeVento = new Pizza();
		assertEquals(pizzaDeVento.getIngredientes().isEmpty(),true);
		assertEquals(pizzaDeVento.getPreco(), 0);
		assertEquals(Pizza.getIgredientesMap().isEmpty() , true);
	}


}
