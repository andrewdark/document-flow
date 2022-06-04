package ua.pp.darknsoft.model.data;
import java.io.*;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;

/** 
 * Справочник. Интерактивно пополняемый. 
 * Список граждан, которые обратились с заявлениями, 
 * или которым отправили письма. 
 * */
@Entity
public class Citizen implements Serializable{

	/** 
	 * Идентификатор записи 
	 * */
	@Id 
	@GeneratedValue
	protected  long Id;

	/** Полное имя гражданина. */
	public String Fullname;

	/** Адрес гражданина, куда отправляять письма, а не адрес вопроса. */
	public String Address;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	protected boolean Deleted;

	@ManyToMany 
	@JoinTable(
		name="CitizenStatusLink",
		joinColumns=@JoinColumn(name="CitizenId"),
		inverseJoinColumns=@JoinColumn(name="StatusId")
	)
	public Set<CitizenStatus> Status;

	@ManyToMany 
	@JoinTable(
		name="CitizenCategoryLink",
		joinColumns=@JoinColumn(name="CitizenId"),
		inverseJoinColumns=@JoinColumn(name="CategoryId")
	)
	public Set<CitizenCategory> Category;

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

	public Set<CitizenStatus> getStatus(){
		return this.Status;
	}

	public Set<CitizenCategory> getCategory(){
		return this.Category;
	}

}

