package ua.pp.darknsoft.model.data;
import java.io.*;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
 * Справочник всех настроек 
 * */
@Entity 
public class SettingsFlag implements Serializable{
	
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private int Id;

	/** Название настройки(стоит задуматься о точечной номенклатуре) */
	private String Name;

	/** Описание настройки */
	private String Description;

	public SettingsFlag(){
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

	public void setDescription(String Description){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getDescription(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

}

