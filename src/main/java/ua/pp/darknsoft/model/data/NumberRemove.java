package ua.pp.darknsoft.model.data;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/** 
 * Список удаленых порядковых номеров. Нужен 
 * для регистрации документов с порядковым 
 * номером "дырки". После регистрации, свободный 
 * номер из этого списка должен быть удален 
 * */
@Entity 
public class NumberRemove implements Serializable{
	
	/** 
	 * Идентификатор записи 
	 * */
	@Id 
	@GeneratedValue 
	private long Id;

	/** 
	 * Группа документов к которой привязана запись нумератора 
	 * */
	@ManyToOne
	private Docgroup Docgroup;

	/** 
	 * @see Numerator#Section Описание 
	 * */
	private String Section;

	/** 
	 * Порядковый номер удаленного документа 
	 * */
	private long Num;

	public NumberRemove(){
		this.Id = -1;
		this.Docgroup = null;
		this.Section = "";
		this.Num = 0;
	}

	public NumberRemove(Docgroup Docgroup){
		this();
		this.Docgroup = Docgroup;
	}

	public NumberRemove(int DocgroupId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId(){
		return this.Id;
	}

	public void setSection(String Section){
		this.Section = Section;
	}

	public String getSection(){
		return this.Section;
	}

	public void setNum(long Num){
		this.Num = Num;
	}

	public long getNum(){
		return this.Num;
	}

	protected void setDocgroup(Docgroup Docgroup){
		this.Docgroup = Docgroup;
	}

	public Docgroup getDocgroup(){
		return this.Docgroup;
	}

}

