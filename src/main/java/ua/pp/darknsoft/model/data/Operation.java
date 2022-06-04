package ua.pp.darknsoft.model.data;
import java.io.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
 * Типы операций с документом (и его составных частях) 
 * в протоколе 
 * */
@Entity 
public class Operation implements Serializable{
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private int Id;

	private String Description;

	public Operation(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public int getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setDescription(String Description){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getDescription(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

}

