package ua.pp.darknsoft.model.data;
import java.io.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/** 
 * Хранение последнего порядкового номера, 
 * при регистрации документов 
 * */
@Entity 
public class Numerator implements Serializable{

	/** 
	 * Идентификатор записи 
	 * */
	@Id 
	@GeneratedValue 
	private int Id;

	/** 
	 * Группа документов к которой привязана запись нумератора 
	 * */
	@ManyToOne
	private Docgroup Docgroup;

	/** 
	 * Год ведения подсчета (Можно поразмышлять что делать 
	 * если прошла реорганизация, или нумерация привязана 
	 * к созыву сессии) 
	 * */
	private String Section;

	/** 
	 * Порядковый номер следующего документа 
	 * */
	private long LastNum;

	public Numerator(){
		this.Id = -1;
		this.Docgroup = null;
		this.Section = "";
		this.LastNum = 1;
	}

	public Numerator(Docgroup Docgroup){
		this();
		this.Docgroup = Docgroup;
	}

	public Numerator(int DocgroupId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public int getId(){
		return this.Id;
	}

	public void setSection(String Section){
		this.Section = Section;
	}

	public String getSection(){
		return this.Section;
	}

	public void setLastNum(long LastNum){
		this.LastNum = LastNum;
	}

	public long getLastNum(){
		return this.LastNum;
	}

	protected void setDocgroup(Docgroup Docgroup){
		this.Docgroup = Docgroup;
	}

	public Docgroup getDocgroup(){
		return this.Docgroup;
	}

}

