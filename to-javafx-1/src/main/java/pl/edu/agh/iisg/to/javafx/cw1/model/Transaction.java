package pl.edu.agh.iisg.to.javafx.cw1.model;

import java.math.BigInteger;
import java.time.LocalDate;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Transaction {
	
	private static final String EMPTY = "";
		
	private ObjectProperty<LocalDate> date;
	private StringProperty payee;
	private ObjectProperty<Category> category;
	private ObjectProperty<BigInteger> inflow;

	
	private Transaction() {
		this(LocalDate.now(), EMPTY, new Category(EMPTY), BigInteger.ZERO);
	}
	
	public Transaction(LocalDate date, String payee, Category category, BigInteger inflow) {
		this.date = new SimpleObjectProperty<LocalDate>(date);
		this.payee = new SimpleStringProperty(payee);
		this.category = new SimpleObjectProperty<Category>(category);
		this.inflow = new SimpleObjectProperty<BigInteger>(inflow);
	}

	public final LocalDate getDate() {
		return date.get();
	}

	public final void setDate(LocalDate date) {
		this.date.set(date);
	}
	
	public final ObjectProperty<LocalDate> getDateProperty() {
		return date;
	}

	public final String getPayee() {
		return payee.get();
	}
	
	public final void setPayee(String payee) {
		this.payee.set(payee);
	}

	public final StringProperty getPayeeProperty() {
		return payee;
	}
	
	public final Category getCategory() {
		return category.get();
	}
	
	
	public final void setCategory(Category category) {
		this.category.set(category);
	}

	public final ObjectProperty<Category> getCategoryProperty() {
		return category;
	}

	public final BigInteger getInflow() {
		return inflow.get();
	}

	public final void setInflow(BigInteger inflow) {
		this.inflow.set(inflow);
	}
	
	public final ObjectProperty<BigInteger> getInflowProperty() {
		return inflow;
	}
	
	public static final Transaction newTransaction() {
		return new Transaction();
	}
}
