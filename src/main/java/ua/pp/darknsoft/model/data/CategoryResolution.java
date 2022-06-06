/**
 * @author Prk
 */
package ua.pp.darknsoft.model.data;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
 * Справочник. Обозначение состояния исполнения резолюции. 
 * Часто используется при закрытии резолюции. 
 * Есть часто используемые варианты. 
 * <ul>
 * <li>Контроль продлен</li>
 * <li>Рассмотренно положительно</li>
 * <li>Рассмотренно отрицательно</li>
 * <li>Даны разъяснения</li>
 * <li>Возвращено автору</li>
 * <li>Переслано по назначению</li>
 * </ul> 
 * */
@Entity 
public class CategoryResolution implements Serializable{

	/** 
	 * Идентификатор записи 
	 * */
	@Id 
	@GeneratedValue 
	private int Id;

	/** 
	 * Текстовое обозначение категории резолюции.  
	 * */
	private String Name;

	/** 
	 * Признак удаленой записи. Нужен чтобы 
	 * не удалять полностью документ из базы 
	 * */
	private boolean Deleted;

	/**
	 * Конструктор по-умолчанию
	 */
	public CategoryResolution(){
		this.Id = -1;
		this.Name = "";
		this.Deleted = false;
	}

	/**
	 * Идентификатор записи
	 * @return Возвращает идентификатор записи
	 */
	public int getId(){
		return Id;
	}

	/**
	 * Задаёт название состояния исполнения резолюции
	 * @param Name - любое не пустое название
	 */
	public void setName(String Name){
		this.Name = Name;
	}

	/**
	 * Возвращает название состояния исполнения резолюции
	 * @return Нвименование состояния исполнения
	 */
	public String getName(){
		return this.Name;
	}

    /**
	 * Задает признак удаления (сокрытия) текущей записи.
	 * Запись удаляется с помощью этого признака при наличии 
	 * ссылок в старых резолюциях на нее.
	 * @param Deleted : истина - запись удалена, ложь - запись актуальна
	 */
	protected void setDeleted(boolean Deleted){
		this.Deleted = Deleted;
	}

	/**
	 * Возвращает признак удаления (сокрытия) текущей записи.
	 * @return истина - запись удалена, ложь - запись актуальна
	 */
	public boolean isDeleted(){
		return this.Deleted;
	}

	@Override
	public String toString() {
		return this.getName();
	}
}

