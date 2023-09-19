package dio.restaurante.model;

public class Pedido implements Command {
	private Chef chef;
	private String comida;

	public Pedido(Chef chef, String comida) {
		this.chef = chef;
		this.comida = comida;
	}

	@Override
	public void execute() {
		if (this.comida.equals("Refeição")) {
			this.chef.prepararRefeicao();
		} else {
			this.chef.prepararSobremesa();
		}
	}
}