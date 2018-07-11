
public interface alimento <t> {
	public default void addAlimento(t i1) throws Exception{
		System.out.println("errore alimento non previsto");
	}
}
