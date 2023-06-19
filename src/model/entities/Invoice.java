package model.entities;

public class Invoice {
	private Double basicPayment;
	private Double tax;

	public Invoice() {

	}

	public Invoice(Double basicPayment, Double tax) {

		this.basicPayment = basicPayment;
		this.tax = tax;

	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getTotalPayment() {

		// Esta pegando os Gets, pode ser que no futuro haja alteração na regra de
		// negocio para calcular a taxa, dessa maneira pegando o getTax não vai precisar
		// de fazer alteração dentro desta função.
		return getBasicPayment() + getTax();
	}

}
