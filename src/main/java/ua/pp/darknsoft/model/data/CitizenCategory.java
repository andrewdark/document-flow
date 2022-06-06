package ua.pp.darknsoft.model.data;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/** 
 * Справочник социальной категорий граждан. 
 * Существует предопределенный справочник. 
 * */
@Entity 
public class CitizenCategory implements Serializable{
	
	/** 
	 * Идентификатор записи 
	 * */
	@Id 
	@GeneratedValue 
	private int Id;

	/** Наименование социальной категории гражданина */
	private String Name;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	private boolean Deleted;

	public CitizenCategory(){
		this.Id = -1;
		this.Name = "";
		this.Deleted = false;
	}

	public int getId(){
		return this.Id;
	}

	public void setName(String Name){
		this.Name = Name;
	}

	public String getName(){
		return this.Name;
	}

	protected void setDeleted(boolean Deleted){
		this.Deleted = Deleted;
	}

	public boolean isDeleted(){
		return this.Deleted;
	}

	@Override
	public String toString() {
		return this.getName();
	}
}

