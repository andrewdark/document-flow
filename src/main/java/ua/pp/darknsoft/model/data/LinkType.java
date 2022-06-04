package ua.pp.darknsoft.model.data;
import java.io.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
 * Варианты связок между документами 
 * */
@Entity 
public class LinkType implements Serializable{
	
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private int Id;

	/** Название связки */
	private String Name;

	/** Ссылка на обратную связка (при наличии) */
	private LinkType Pare;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	private boolean Deleted;

	public LinkType(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public int getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setName(String Name){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getName(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	protected void setDeleted(boolean Deleted){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public boolean isDeleted(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	protected void setPare(LinkType Pare){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public LinkType getPare(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

}

