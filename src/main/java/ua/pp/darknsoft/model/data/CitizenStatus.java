package ua.pp.darknsoft.model.data;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/** 
 * Справочник социальных статусов граждан. Существует 
 * предопределенный справочник. 
 * */
@Entity 
public class CitizenStatus implements Serializable{

	private static final long serialVersionUID = 3056867703435571803L;
	
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private int Id;

	/** Наименование социального статуса гражданина */
	private String Name;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	private boolean Deleted;

	public CitizenStatus(){
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

