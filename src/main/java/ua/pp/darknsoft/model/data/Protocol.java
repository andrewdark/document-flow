package ua.pp.darknsoft.model.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
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
 */
@Entity
public class Protocol implements Serializable {

	private static final long serialVersionUID = -2320106839045012153L;

	/** Идентификатор записи */
	@Id
	@GeneratedValue
	private long Id;

	/** Пользователь которого логируем */
	@ManyToOne(fetch = FetchType.LAZY)
	private UserEntry User;

	/** Действие которое логируется */
	@ManyToOne
	private Operation Operation;

	/** Время события */
	//@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date Date;

	/**
	 * Ссылка на объект, изменения в котором мы логируем
	 */
	@Column(name = "link_id")
	private long Link;

	public Protocol() {
		this.Id = -1;
		//this.Date = java.util.Calendar.getInstance().getTime();
		this.Date = null;
		this.User = null;
		this.Operation = null;
		this.Link = 0;
	}

	public long getId() {
		return this.Id;
	}

	public void setDate(Date Date) {
		this.Date = Date;
	}

	public Date getDate() {
		return this.Date;
	}

	public void setLink(long Link) {
		this.Link = Link;
	}

	public long getLink() {
		return this.Link;
	}

	public void setOperation(Operation Operation) {
		this.Operation = Operation;
	}

	public Operation getOperation() {
		return this.Operation;
	}

	public void setUser(UserEntry User) {
		this.User = User;
	}

	public UserEntry getUser() {
		return this.User;
	}

}
