
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pizzaMeioAMeio = new Pizza();
		Pizza pizzaPortuguesa = new Pizza();
		Pizza pizzaCarneDeSol = new Pizza();
		Pizza pizzaSemIngrediente = new Pizza();

		CarrinhoDeCompras cart = new CarrinhoDeCompras();
	

		pizzaMeioAMeio.adicionaIngrediente("Mussarela");
		pizzaMeioAMeio.adicionaIngrediente("Palmito");
		
		System.out.println("pizzaSemIngrediente getPreco " + pizzaSemIngrediente.getPreco());
		
		System.out.println("pizzaMeioAMeio.getIngrediente().size() " + pizzaMeioAMeio.getIngrediente().size());
		
		pizzaPortuguesa.adicionaIngrediente("Frango");
		pizzaPortuguesa.adicionaIngrediente("Cheddar");
		pizzaPortuguesa.adicionaIngrediente("Mussarela");
		pizzaPortuguesa.adicionaIngrediente("Cebola");
		pizzaPortuguesa.adicionaIngrediente("Alho");
		pizzaPortuguesa.adicionaIngrediente("Manjericão");

		pizzaCarneDeSol.adicionaIngrediente("Carne de Sol");
		pizzaCarneDeSol.adicionaIngrediente("Provolone");
		pizzaCarneDeSol.adicionaIngrediente("Cebola");
		
		cart.adicionaPizzaaoCarrinho(pizzaMeioAMeio);
		cart.adicionaPizzaaoCarrinho(pizzaPortuguesa);
		cart.adicionaPizzaaoCarrinho(pizzaCarneDeSol);
		cart.adicionaPizzaaoCarrinho(pizzaSemIngrediente);
		
		System.out.println("Total de pizzas no carrinho: " +cart.totalPizzas());
		System.out.println("Valor total da compra: " + cart.getPrecoTotalPizzas() + " R$");
		
	
		System.out.println("Lista de ingredientes utilizados: \n" +Pizza.getIgredientesMap());
	
	}
}
