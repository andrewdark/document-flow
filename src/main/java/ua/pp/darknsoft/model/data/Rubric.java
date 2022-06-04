package ua.pp.darknsoft.model.data;
import java.io.*;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/** 
 * Иерархический справочник "Рубрикатор". 
 * Нужен для указания тематики вопроса в письме 
 * */
@Entity 
public class Rubric implements Serializable{
	/** Идентификатор записи */
	@Id @GeneratedValue 
	private int Id;

	/** Код тематики вопроса (В некоторіх случаях обязательное) */
	private String Code;

	/** Наименование рубрики */
	private String Name;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	private boolean Deleted;

	/** Ссілка на родительскую папку */
	private Rubric Parent;

	/** Перечень дочерних рубрик */
	private Set<Rubric> Chields;

	public Rubric(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Rubric(Rubric Parent){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public int getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setCode(String Code){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getCode(){
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

	public Rubric getParent(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public Set<Rubric> getChields(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

}

