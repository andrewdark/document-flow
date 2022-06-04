package ua.pp.darknsoft.model.data;
import java.io.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

/** Справочник. Обозначение категории резолюции. Часто используется при закрытии резолюции. Есть часто используемые варианты. 
 * <ul>
 * <li>Контроль продлен</li>
 * <li>Рассмотренно положительно</li>
 * <li>Рассмотренно отрицательно</li>
 * <li>Даны разъяснения</li>
 * <li>Возвращено автору</li>
 * <li>Переслано</li>
 * </ul> */
@Entity
public class CategoryResolution implements Serializable{
	/** Идентификатор записи */
	@Id 
	@GeneratedValue
	private int Id;

	/** Текстовое обозначение категории резолюции.  */
	private java.lang.String/* String */ Name;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	private boolean Deleted;

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
	public CategoryResolution(){
		// TODO add implementation
	}


}

