import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {

    public static int quantidadeContadorIngredientes =0;
    private ArrayList<String> ingrediente = new ArrayList<>();

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
	if (ingredientesMap.containsKey(nomeIngrediente)) {
		int value = ingredientesMap.get(nomeIngrediente);
		ingredientesMap.put(nomeIngrediente, value + 1);
	} else {
		ingredientesMap.put(nomeIngrediente, 1);
	}
	quantidadeContadorIngredientes++;
}

	
	public int getPreco() {
	    int preco = 0;
		if(quantidadeContadorIngredientes <=2) {
			preco = 15;
		}
		else if(quantidadeContadorIngredientes >=3 && quantidadeContadorIngredientes<= 5) {
			preco = 20;
		}else {
			preco = 23;
		}
		return preco;
	}

}
