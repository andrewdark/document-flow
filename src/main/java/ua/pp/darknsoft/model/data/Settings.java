package ua.pp.darknsoft.model.data;
import java.io.*;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
 * Настройки работы клиента 
 * */
@Entity 
public class Settings implements Serializable{
	
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	/** ССылка на пользователя для которого предназначени эти настройки. Может быть пустым в случае общего характера настройки. */
	private User User;

	/** Номенклатура настройки */
	private SettingsFlag Flag;

	/** Заданое значение для настройки */
	private String Value;

	public Settings(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Settings(User User){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public void setFlag(SettingsFlag Flag){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public SettingsFlag getFlag(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public long getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setValue(String Value){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getValue(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setUser(User User){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public User getUser(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

}

