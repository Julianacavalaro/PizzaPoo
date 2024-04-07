import java.util.ArrayList;


public class CarrinhoDeCompras  {

	 double precoTotal;
	private  ArrayList<Pizza> pizzas = new ArrayList<Pizza>();


	// O carrinho não adiciona uma pizza caso não tenha ingredientes
	public void adicionaPizzaaoCarrinho(Pizza pizza) {
		if((pizza.getIngredientes().isEmpty())) {
			System.out.println("Pizza Sem ingrediente - NAO adicionada ao carrinho");
		} else {
		pizzas.add(pizza);
		System.out.println("Pizza COM ingredientes");
		}	
	}
	
	public int totalPizzas() {
		return pizzas.size();
	}
	
	public double getPrecoTotalPizzas(){

		for(int i =0; i < pizzas.size() ; i++) {
			precoTotal = precoTotal + pizzas.get(i).getPreco();
		}
			return precoTotal;
	}
	

	
}
