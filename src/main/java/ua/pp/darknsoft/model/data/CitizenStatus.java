package ua.pp.darknsoft.model.data;
import java.io.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/** 
 * Справочник социальных статусов граждан. Существует 
 * предопределенный справочник. 
 * */
@Entity 
public class CitizenStatus implements Serializable{
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private int Id;

	/** Наименование социального статуса гражданина */
	private String Name;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	private boolean Deleted;

	public CitizenStatus(){
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

}

