package ua.pp.darknsoft.model.data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
/** 
 * Группа документов (Журнал регистрации). 
 * Иерархический справочник. 
 * */
@Entity 
public class Docgroup implements Serializable{
	
	private static final long serialVersionUID = -8556100167510411343L;
	
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private int Id;

	/** Ссылка на родительскую запись */
	@ManyToOne(fetch = FetchType.EAGER)
	private Docgroup Parent;

	/** Дочерние записи по иерархии
	 *  */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Parent")
	private Set<Docgroup> Chields;

	/** Варианты документов: входящие, письма граждан, исходящие */
	@Enumerated
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
		this.Id = -1;
		this.Index = "";
		this.Kind = null;
		this.Name = "";
		this.Node = false;
		this.Parent = null;
		this.Chields = new HashSet<>();
		this.Deleted = false;
		this.Shablon = "";			
	}

	public Docgroup(Docgroup Parent){
		this();
		this.Index = Parent.Index;
		this.Parent = Parent;
		this.Shablon = Parent.getShablon();
	}

	public Docgroup(int ParentId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public int getId(){
		return this.Id;
	}

	public Docgroup getParent(){
		return this.Parent;
	}

	public Set<Docgroup> getChields(){
		return this.Chields;
	}

	public void setKind(DocgroupKind Kind){
		this.Kind = Kind;
	}

	public DocgroupKind getKind(){
		return this.Kind;
	}

	public void setIndex(String Index){
		this.Index = Index;
	}

	public String getIndex(){
		return this.Index;
	}

	public void setName(String Name){
		this.Name = Name;
	}

	public String getName(){
		return this.Name;
	}

	protected void setNode(boolean Node){
		this.Node = Node;
	}

	public boolean isNode(){
		return this.Node;
	}

	public void setShablon(String Shablon){
		this.Shablon = Shablon;
	}

	public String getShablon(){
		return this.Shablon;
	}

	protected void setDeleted(boolean Deleted){
		this.Deleted = Deleted;
	}

	public boolean isDeleted(){
		return this.Deleted;
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

