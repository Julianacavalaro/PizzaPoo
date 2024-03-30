import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {

    private  ArrayList<String> ingrediente = new ArrayList<>();

    public static Map<String, Integer> ingredientesMap = new HashMap<String, Integer>();

	public ArrayList<String> getIngrediente(){
		return ingrediente;	
	}
	
	 public static Map<String, Integer> getIgredientesMap() {
		 return ingredientesMap;
	 } 
	 public void adicionaIngrediente(String nomeIngrediente) {
		 this.ingrediente.add(nomeIngrediente);
		 contabilizaIngrediente(nomeIngrediente);
	 }

	public static void contabilizaIngrediente(String nomeIngrediente) {
	if (ingredientesMap.containsKey(nomeIngrediente)) { //ingredientesMap.containsKey(nomeIngrediente) - Verifica se nomeIngrediente já existe
		int value = ingredientesMap.get(nomeIngrediente); //Verifica o value do nomeIngrediente que já existe (value = quantidade)
		ingredientesMap.put(nomeIngrediente, value + 1);//Adiciona +1 ao value do nomeIngrediente repetido
	} else {
		ingredientesMap.put(nomeIngrediente, 1);
	}
}

	
	public int getPreco() {
	    int preco = 0;
	    if(getIngrediente().size() == 0) { // .size() retorna o tamanho do Array(Lista)
	    return preco;
	    }
		if(getIngrediente().size() <=2) {
			preco = 15;
		}
		else if(getIngrediente().size() >=3 && getIngrediente().size()<= 5) {
			preco = 20;
		}else {
			preco = 23;
		}
		return preco;
	}
	    

}
