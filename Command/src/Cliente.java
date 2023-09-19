import dio.restaurante.model.Chef;
import dio.restaurante.model.Garcom;
import dio.restaurante.model.Pedido;

public class Cliente {
    //invocador
	public static void main(String[] args) {
		Chef chef = new Chef();
        
		Pedido pedido = new Pedido(chef, "Refeição");
		Garcom garcom = new Garcom(pedido);
		garcom.execute();

		pedido = new Pedido(chef, "Sobremesa");
		garcom = new Garcom(pedido);
		garcom.execute();
	}
}