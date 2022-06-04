package ua.pp.darknsoft.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/** 
 * Справочник организаций (корреспонденты и адресаты).
 * Интерактивно пополняемый. 
 * */
@Entity 
public class Organization{
	
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	/** Название организации */
	private String Name;

	/** Код ЕДРПОУ или ОКПО */
	private String Code;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	private boolean Deleted;

	public Organization(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId(){
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

	public void setCode(String Code){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getCode(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	private void setDeleted(boolean Deleted){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public boolean isDeleted(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

}

