import java.util.LinkedList;

public class MainPizzeria {

	public static void main(String[] args) {
		ingredient t1 = new top();
		ingredient r1 = new ripieno();
		LinkedList<ingredient> l1 = new LinkedList<>();
		l1.add(r1);
		l1.add(t1);
		alimento a1 = new pizza();
		alimento c1 = new calzone();

		for (ingredient ingredient : l1) {
			try{
				c1.addAlimento(ingredient);
			}catch (Exception e) {
				System.out.println("ho aggiunto un elemento sbagliato");
			}
		}
	}

}
