import java.util.ArrayList;


public class CarrinhoDeCompras  {

	 int precoTotal;
	private  ArrayList<Pizza> pizzas = new ArrayList<Pizza>();


	// O carrinho não adiciona uma pizza caso não tenha ingredientes
	public void adicionaPizza(Pizza pizza) {
		if((pizza.getIngrediente().isEmpty())) {
			System.out.println("Pizza Sem ingrediente - NAO Aceito");
		} else {
		pizzas.add(pizza);
		System.out.println("Pizza COM ingredientes");
		}	
	}
	
	public int totalPizzas() {
		return pizzas.size();
	}
	
	public int getPrecoTotalPizzas(){

		for(int i =0; i < pizzas.size() ; i++) {
			precoTotal = precoTotal + pizzas.get(i).getPreco();
		}
			return precoTotal;
	}
	

	
}
