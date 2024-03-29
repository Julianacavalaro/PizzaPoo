import java.util.ArrayList;


public class CarrinhoDeCompras  {

	int precoTotal;
	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();


	// O carrinho não adiciona uma pizza caso não tenha ingredientes
	public void addPizza(Pizza p) {
		if((p.getIngrediente().isEmpty())) {
			pizzas.add(p);
			System.out.println("Pizza COM ingredientes");
		} else {
		System.out.println("Pizza Sem ingrediente");
		}	
	}
	
	public int totalPizzas() {
		return pizzas.size();
	}
	
	public int getPrecoTotalPizzas(){

		for(int u =0; u < pizzas.size() ; u++) {
			precoTotal = precoTotal + pizzas.get(u).getPreco();
		}
			return precoTotal;
	}
	

	
}
