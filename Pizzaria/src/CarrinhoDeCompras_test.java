import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarrinhoDeCompras_test {

	@BeforeEach
	void setUp() throws Exception {
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
		assertEquals(carrinhoVazio.totalPizzas(), 0);
	}
	@Test
	void AdicionaPizzaaoCarrinho() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("Queijo");
		carrinho.adicionaPizzaaoCarrinho(pizza);
		assertEquals(carrinho.totalPizzas(), 1);
	}
	@Test
	void getPrecoTotalPizzas() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("Queijo");
		carrinho.adicionaPizzaaoCarrinho(pizza);
		double carrinhoPrecoTotal = carrinho.getPrecoTotalPizzas();
		assertEquals(carrinhoPrecoTotal, 15);
	}
}
