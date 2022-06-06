package ua.pp.darknsoft.model.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** 
 * Протокол работы с документом. Отражает 
 * любые изменения в нем 
 * */
@Entity 
public class Protocol implements Serializable{

	private static final long serialVersionUID = -2320106839045012153L;

	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	/** Пользователь которого логируем */
	@ManyToOne(fetch = FetchType.LAZY)
	private User User;

	/** Действие которое логируется */
	@ManyToOne	
	private Operation Operation;

	/** Время события */
	@Temporal(TemporalType.TIMESTAMP)
	private Date Date;

	/** Ссылка на объект, изменения в котором мы логируем
	 *  */
	private long LinkId;

	public Protocol(){
		this.Id = -1;
		//this.Date = new Date(Calendar.getInstance().getTime().getTime());
		this.Date = null;
		this.User = null;
		this.Operation = null;
		this.LinkId = 0;
	}

	public long getId(){
		return this.Id;
	}

	public void setDate(Date Date){
		this.Date = Date;
	}

	public Date getDate(){
		return this.Date;
	}

	public void setLinkId(long LinkId){
		this.LinkId = LinkId;
	}

	public long getLinkId(){
		return this.LinkId;
	}

	public void setOperation(Operation Operation){
		this.Operation = Operation;
	}

	public Operation getOperation(){
		return this.Operation;
	}

	public void setUser(User User){
		this.User = User ;
	}

	public User getUser(){
		return this.User;
	}

}

