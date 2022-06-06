package ua.pp.darknsoft.model.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Настройки работы клиента
 */
@Entity
public class Settings implements Serializable {

	private static final long serialVersionUID = -142298292332956352L;

	/**
	 * Идентификатор записи
	 */
	@Id
	@GeneratedValue
	private long Id;

	/**
	 * Ссылка на пользователя для которого предназначени
	 * эти настройки. Может быть пустым в случае
	 * общего характера настройки.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private UserEntry User;

	/**
	 * Номенклатура настройки
	 */
	@ManyToOne
	private SettingsFlag Flag;

	/**
	 * Заданое значение для настройки
	 */
	private String Value;

	public Settings() {
		this.Id = -1;
		this.User = null;
		this.Flag = null;
		this.Value = "";
	}

	public Settings(UserEntry User) {
		this();
		this.User = User;
	}

	public long getId() {
		return this.Id;
	}

	public UserEntry getUser() {
		return this.User;
	}

	protected void setUser(UserEntry user) {
		this.User = user;
	}

	public SettingsFlag getFlag() {
		return this.Flag;
	}

	public void setFlag(SettingsFlag flag) {
		this.Flag = flag;
	}

	public String getValue() {
		return this.Value;
	}

	public void setValue(String value) {
		this.Value = value;
	}

	@Override
	public String toString() {
		return this.getValue();
	}

}
