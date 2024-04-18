import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarrinhoDeComprasTest {

	@BeforeEach
	void setUp() {
	Pizza.zeraIngredientes();
		System.out.println("@BeforeEach");
	}
	
	@Test
	void CenariosVazios() {
		CarrinhoDeCompras carrinhoVazio = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();
		carrinhoVazio.adicionaPizzaaoCarrinho(pizza);
		assertEquals(carrinhoVazio.getPrecoTotalPizzas(), 0);
		assertEquals(carrinhoVazio.precoTotal, 0);
		assertEquals(carrinhoVazio.getPrecoTotalPizzas(), 0);
		assertEquals(carrinhoVazio.numeroTotalPizzas(), 0);
	}
	@Test
	void AdicionaPizzaaoCarrinho() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("Queijo");
		carrinho.adicionaPizzaaoCarrinho(pizza);
		assertEquals(carrinho.numeroTotalPizzas(), 1);
	}
	@Test
	void getPrecoTotalPizzas() {
		CarrinhoDeCompras carrinhoMarcos = new CarrinhoDeCompras();
		Pizza pizzaQueijo = new Pizza();
		pizzaQueijo.adicionaIngrediente("Queijo");
		carrinhoMarcos.adicionaPizzaaoCarrinho(pizzaQueijo);
		Pizza pizzaMarcos = new Pizza();
		pizzaMarcos.adicionaIngrediente("Bacon");
		pizzaMarcos.adicionaIngrediente("Quejo");
		pizzaMarcos.adicionaIngrediente("Manjericão");
		carrinhoMarcos.adicionaPizzaaoCarrinho(pizzaMarcos);
		double carrinhoPrecoTotal = carrinhoMarcos.getPrecoTotalPizzas();
		assertEquals(carrinhoPrecoTotal, 35);
	}
}
