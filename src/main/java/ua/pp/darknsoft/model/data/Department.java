package ua.pp.darknsoft.model.data;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/** 
 * Справочник подразделений и должностных лиц 
 * */
@Entity 
public class Department{

	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	/** Ссылка на родительский элемент */
	private Department Parent;

	/** Список дочерних элементов */
	private Set<Department> Chields;

	/** Наименование подразделения или Имя должностного лица */
	private String Name;

	/** Должность */
	private String Post;

	/** Признак должностного лица */
	private boolean Official;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	private boolean Deleted;

	public Department(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Department(Department Parent){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Department(long ParentId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setName(String Name){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getName(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setPost(String Post){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getPost(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setOfficial(boolean Official){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public boolean isOfficial(){
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

	protected void setParent(Department Parent){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Department getParent(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public Set<Department> getChields(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

}

