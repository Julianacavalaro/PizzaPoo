
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		Pizza pizza4 = new Pizza();

		CarrinhoDeCompras cart = new CarrinhoDeCompras();
	

		pizza1.adicionaIngrediente("Mussarela");
		pizza1.adicionaIngrediente("Palmito");
		
		System.out.println(" pizza4 getPreco " + pizza4.getPreco());
		pizza1.getIngrediente().size();
		
		pizza2.adicionaIngrediente("Frango");
		pizza2.adicionaIngrediente("Cheddar");
		pizza2.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Cebola");
		pizza2.adicionaIngrediente("Alho");
		pizza2.adicionaIngrediente("Manjericão");
		
		pizza2.getPreco();

		pizza3.adicionaIngrediente("Carne de Sol");
		pizza3.adicionaIngrediente("Provolone");
		pizza3.adicionaIngrediente("Cebola");
		
		cart.addPizza(pizza1);
		cart.addPizza(pizza2);
		cart.addPizza(pizza3);
		cart.addPizza(pizza4);
		
		System.out.println("Total de pizzas no carrinho: " +cart.totalPizzas());
		System.out.println("Valor total da compra: " + cart.getPrecoTotalPizzas() + " R$");
		
	
		System.out.println("Lista de ingredientes utilizados: \n" +Pizza.getIgredientesMap());
	
	}
}
