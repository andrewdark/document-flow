package ua.pp.darknsoft.model.data;
import java.io.*;
import java.util.*;

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
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setFullname(String Fullname){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getFullname(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setAddress(String Address){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getAddress(){
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

	private void setStatus(Set<CitizenStatus> Status){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Set<CitizenStatus> getStatus(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	protected void setCategory(Set<CitizenCategory> Category){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Set<CitizenCategory> getCategory(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

}

