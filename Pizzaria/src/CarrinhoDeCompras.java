import java.util.ArrayList;


public class CarrinhoDeCompras  {

	 double precoTotal;
	private  ArrayList<Pizza> pizzasLista = new ArrayList<Pizza>();


	// O carrinho não adiciona uma pizza caso não tenha ingredientes
	public void adicionaPizzaaoCarrinho(Pizza pizza) {
		if((pizza.getIngredientes().isEmpty())) {
			System.out.println("Pizza Sem ingrediente - NAO adicionada ao carrinho");
		} else {
		pizzasLista.add(pizza);
		System.out.println("Pizza COM ingredientes");
		}	
	}
	
	public int numeroTotalPizzas() {
		return pizzasLista.size();
	}
	
	public double getPrecoTotalPizzas(){

		for(int i =0; i < pizzasLista.size() ; i++) {
			precoTotal = precoTotal + pizzasLista.get(i).getPreco();
		}
			return precoTotal;
	}
	

	
}
