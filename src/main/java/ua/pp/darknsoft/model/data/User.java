package ua.pp.darknsoft.model.data;
import java.io.*;
/** Список пользователей
 *  */
public @Entity class User implements Serializable{
	/** Идентификатор записи */
	protected @Id @GeneratedValue int Id;

	/** Читаемое имя пользователя */
	public String Name;

	/** Логин для авторизации в системе */
	public String Login;

	/** Хеш пароля */
	protected String Password;

	/** Свободное описание подразделения */
	public String Department;

	/** Признак удаления записи */
	protected boolean Deleted;

	public int getId(){
		// TODO add implementation and return statement
	}

	public void setName(String Name){
		// TODO add implementation
	}

	public String getName(){
		// TODO add implementation and return statement
	}

	public void setLogin(String Login){
		// TODO add implementation
	}

	public String getLogin(){
		// TODO add implementation and return statement
	}

	public void setPassword(String Password){
		// TODO add implementation
	}

	public void setDepartment(String Department){
		// TODO add implementation
	}

	public String getDepartment(){
		// TODO add implementation and return statement
	}

	public void setDeleted(boolean Deleted){
		// TODO add implementation
	}

	public boolean isDeleted(){
		// TODO add implementation and return statement
	}

}

