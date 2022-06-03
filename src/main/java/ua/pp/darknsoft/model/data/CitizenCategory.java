package ua.pp.darknsoft.model.data;
import java.io.*;
/** Справочник категорий граждан. Существует предопределенный справочник. */
public @Entity class CitizenCategory implements Serializable{
	/** Идентификатор записи */
	protected @Id @GeneratedValue int Id;

	public String Name;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	protected boolean Deleted;

	public int getId(){
		// TODO add implementation and return statement
	}

	public void setName(String Name){
		// TODO add implementation
	}

	public String getName(){
		// TODO add implementation and return statement
	}

	protected void setDeleted(boolean Deleted){
		// TODO add implementation
	}

	public boolean isDeleted(){
		// TODO add implementation and return statement
	}

}

