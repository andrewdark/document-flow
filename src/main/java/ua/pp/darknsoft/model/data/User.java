package ua.pp.darknsoft.model.data;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/** 
 * Список пользователей
 *  */
@Entity 
public class User implements Serializable{

	private static final long serialVersionUID = -2475548608804521218L;
	
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
	@OneToMany
	private Set<Settings> Settings;

	public User() {
		this.Id = -1;
		this.Name = "";
		this.Login = "";
		this.Password = "";
		this.Department = null;
		this.Deleted = false;
		this.Settings = new HashSet<>();
	}

	public int getId() {
		return this.Id;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getLogin() {
		return this.Login;
	}

	public void setLogin(String login) {
		this.Login = login;
	}

	public String getPassword() {
		return this.Password;
	}

	protected void setPassword(String password) {
		this.Password = password;
	}

	public String getDepartment() {
		return this.Department;
	}

	public void setDepartment(String department) {
		this.Department = department;
	}

	public boolean isDeleted() {
		return this.Deleted;
	}

	public void setDeleted(boolean deleted) {
		this.Deleted = deleted;
	}

	public Set<Settings> getSettings() {
		return this.Settings;
	}

}

