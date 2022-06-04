package ua.pp.darknsoft.model.data;
import java.io.*;
import java.sql.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
 * Протокол работы с документом. Отражает 
 * любые изменения в нем 
 * */
@Entity 
public class Protocol implements Serializable{
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	/** Пользователь которого логируем */
	private User User;

	/** Действие которое логируется */
	private Operation Operation;

	/** Время события */
	private Date Date;

	/** Ссылка на объект, изменения в котором мы логируем
	 *  */
	private long LinkId;

	public Protocol(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setDate(Date Date){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Date getDate(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setLinkId(long LinkId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getLinkId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setOperation(Operation Operation){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Operation getOperation(){
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

