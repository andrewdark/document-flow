package ua.pp.darknsoft.model.data;
import java.io.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/** 
 * Справочник. Обозначение категории резолюции. Часто используется при закрытии резолюции. Есть часто используемые варианты. 
 * <ul>
 * <li>Контроль продлен</li>
 * <li>Рассмотренно положительно</li>
 * <li>Рассмотренно отрицательно</li>
 * <li>Даны разъяснения</li>
 * <li>Возвращено автору</li>
 * <li>Переслано</li>
 * </ul> 
 * */
@Entity 
public class CategoryResolution implements Serializable{
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private int Id;

	/** Текстовое обозначение категории резолюции.  */
	private String Name;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	private boolean Deleted;

	public CategoryResolution(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public int getId(){
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

	protected void setDeleted(boolean Deleted){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public boolean isDeleted(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

}

