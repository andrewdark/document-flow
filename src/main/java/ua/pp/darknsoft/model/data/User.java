package ua.pp.darknsoft.model.data;
import java.io.*;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/** 
 * Список пользователей
 *  */
@Entity 
public class User implements Serializable{
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private int Id;

	/** Читаемое имя пользователя */
	private String Name;

	/** Логин для авторизации в системе */
	private String Login;

	/** Хеш пароля */
	private String Password;

	/** Свободное описание подразделения */
	private String Department;

	/** Признак удаления записи */
	private boolean Deleted;

	/** Настройки пользователя */
	private Set<Settings> Settings;

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

	public void setLogin(String Login){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getLogin(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	protected void setPassword(String Password){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public void setDepartment(String Department){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getDepartment(){
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

	public Set<Settings> getSettings(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

}

