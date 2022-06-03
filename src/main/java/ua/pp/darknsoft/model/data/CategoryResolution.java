package ua.pp.darknsoft.model.data;
import java.io.*;
/** Справочник. Обозначение категории резолюции. Часто используется при закрытии резолюции. Есть часто используемые варианты. 
 * <ul>
 * <li>Контроль продлен</li>
 * <li>Рассмотренно положительно</li>
 * <li>Рассмотренно отрицательно</li>
 * <li>Даны разъяснения</li>
 * <li>Возвращено автору</li>
 * <li>Переслано</li>
 * </ul> */
public @Entity class CategoryResolution implements Serializable{
	/** Идентификатор записи */
	protected @Id @GeneratedValue int Id;

	/** Текстовое обозначение категории резолюции.  */
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

