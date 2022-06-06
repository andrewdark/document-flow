package ua.pp.darknsoft.model.data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

/** 
 * Справочник. Интерактивно пополняемый. Список граждан, 
 * которые обратились с заявлениями, или которым отправили письма. 
 * */
@Entity 
public class Citizen implements Serializable{
	
	private static final long serialVersionUID = -1800638145313484296L;
	
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	/** Полное имя гражданина. */
	private String Fullname;

	/** Адрес гражданина, куда отправляять письма, а не адрес вопроса. */
	private String Address;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	private boolean Deleted;

	/** Список социальных статусов гражданина */
	@ManyToMany 
	@JoinTable(
		name="CitizenStatusLink",
		joinColumns=@JoinColumn(name="CitizenId"),
		inverseJoinColumns=@JoinColumn(name="StatusId")
	) 
	private Set<CitizenStatus> Status;

	/** Список социальных категорий гражданина */
	@ManyToMany 
	@JoinTable(
		name="CitizenCategoryLink",
		joinColumns=@JoinColumn(name="CitizenId"),
		inverseJoinColumns=@JoinColumn(name="CategoryId")
	) 
	private Set<CitizenCategory> Category;

	public Citizen(){
		this.Id = -1;
		this.Fullname = "";
		this.Address = "";
		this.Deleted = false;
		this.Category = new HashSet<CitizenCategory>();
		this.Status = new HashSet<CitizenStatus>();
	}

	public long getId(){
		return this.Id;
	}

	public void setFullname(String Fullname){
		this.Fullname = Fullname;
	}

	public String getFullname(){
		return this.Fullname;
	}

	public void setAddress(String Address){
		this.Address = Address;
	}

	public String getAddress(){
		return this.Address;
	}

	protected void setDeleted(boolean Deleted){
		this.Deleted = Deleted;
	}

	public boolean isDeleted(){
		return this.Deleted;
	}

	protected void setStatus(Set<CitizenStatus> Status){
		this.Status = Status;
	}

	public Set<CitizenStatus> getStatus(){
		return this.Status;
	}

	protected void setCategory(Set<CitizenCategory> Category){
		this.Category = Category;
	}

	public Set<CitizenCategory> getCategory(){
		return this.Category;
	}

	@Override
	public String toString() {
		return this.getFullname();
	}
}

