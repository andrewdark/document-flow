package ua.pp.darknsoft.model.data;
import java.io.*;
import java.util.*;
/** Справочник. Интерактивно пополняемый. Список граждан, которые обратились с заявлениями, или которым отправили письма. */
public @Entity class Citizen implements Serializable{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	/** Полное имя гражданина. */
	public String Fullname;

	/** Адрес гражданина, куда отправляять письма, а не адрес вопроса. */
	public String Address;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	protected boolean Deleted;

	public @ManyToMany @JoinTable(name="CitizenStatusLink",joinColumns=@JoinColumn(name="CitizenId"),inverseJoinColumns=@JoinColumn(name="StatusId")) Set<CitizenStatus> Status;

	public @ManyToMany @JoinTable(name="CitizenCategoryLink",joinColumns=@JoinColumn(name="CitizenId"),inverseJoinColumns=@JoinColumn(name="CategoryId")) Set<CitizenCategory> Category;

	public long getId(){
		// TODO add implementation and return statement
	}

	public void setFullname(String Fullname){
		// TODO add implementation
	}

	public String getFullname(){
		// TODO add implementation and return statement
	}

	public void setAddress(String Address){
		// TODO add implementation
	}

	public String getAddress(){
		// TODO add implementation and return statement
	}

	protected void setDeleted(boolean Deleted){
		// TODO add implementation
	}

	public boolean isDeleted(){
		// TODO add implementation and return statement
	}

	public Set<CitizenStatus> getStatus(){
		// TODO add implementation
	}

	public Set<CitizenCategory> getCategory(){
		// TODO add implementation
	}

}

