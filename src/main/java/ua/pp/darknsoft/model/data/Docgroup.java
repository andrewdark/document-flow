package ua.pp.darknsoft.model.data;
import java.io.*;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/** 
 * Группа документов (Журнал регистрации). 
 * Иерархический справочник. 
 * */
@Entity 
public class Docgroup implements Serializable{
	
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private int Id;

	/** Ссылка на родительскую запись */
	private Docgroup Parent;

	/** Дочерние записи по иерархии
	 *  */
	private Set<Docgroup> Chields;

	/** Варианты документов: входящие, письма граждан, исходящие */
	@Enumerated(EnumType.ORDINAL) 
	private DocgroupKind Kind;

	/** Индекс по номенклатуре. Необходим для генерации номера */
	private String Index;

	/** Название журнала */
	private String Name;

	/** Признак елемента выбора. Лист */
	private boolean Node;

	/** Шаблон для генерации номера */
	private String Shablon;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	private boolean Deleted;

	public Docgroup(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Docgroup(Docgroup Parent){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Docgroup(int ParentId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public int getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public Docgroup getParent(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public Set<Docgroup> getChields(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public void setKind(DocgroupKind Kind){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public DocgroupKind getKind(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setIndex(String Index){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getIndex(){
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

	protected void setNode(boolean Node){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public boolean isNode(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setNumerator(String Numerator){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getNumerator(){
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

	/** Сервисный метод, помогающий получить пеобходимый нумератор */
	public Numerator getNumerators(String Section){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	/** 
	 * @see Numerator#Section Секция нумератора
	 * Получение списка секций
	 *  */
	public Set<String> getNumeratorSections(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	/** Сервисный метод, помогающий получить список удаленых номеров */
	public Set<NumberRemove> getRemoveNumbers(String Section){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

}

