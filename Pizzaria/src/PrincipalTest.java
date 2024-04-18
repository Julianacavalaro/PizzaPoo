import org.junit.jupiter.api.Test;

public class PrincipalTest {
	
	@Test
	void dicionaIngredientepizzaMeioAMeio() {
		Pizza pizzaMeioAMeio = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		pizzaMeioAMeio.adicionaIngrediente("Mussarela");
		pizzaMeioAMeio.adicionaIngrediente("Palmito");

	}
	

}
