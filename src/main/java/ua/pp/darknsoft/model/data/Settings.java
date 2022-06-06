package ua.pp.darknsoft.model.data;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
 * Настройки работы клиента 
 * */
@Entity 
public class Settings implements Serializable{
	
	/** 
	 * Идентификатор записи 
	 * */
	@Id 
	@GeneratedValue 
	private long Id;

	/** 
	 * Ссылка на пользователя для которого предназначени 
	 * эти настройки. Может быть пустым в случае 
	 * общего характера настройки. 
	 * */
	private User User;

	/** 
	 * Номенклатура настройки 
	 * */
	private SettingsFlag Flag;

	/** 
	 * Заданое значение для настройки 
	 * */
	private String Value;

	public Settings() {
		this.Id = -1;
		this.User = null;
		this.Flag = null;
		this.Value = "";
	}

	public Settings(User User){
		this();
		this.User = User;
	}
	
	public long getId() {
		return this.Id;
	}

	public User getUser() {
		return this.User;
	}

	protected void setUser(User user) {
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

