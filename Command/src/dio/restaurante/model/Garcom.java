package dio.restaurante.model;

public class Garcom {
    //manipula o comando
	private Pedido pedido;

	public Garcom(Pedido pedido) {
		this.pedido = pedido;
	}

	public void execute() {
		this.pedido.execute();
	}
}