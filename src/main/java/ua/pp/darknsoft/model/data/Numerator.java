package ua.pp.darknsoft.model.data;
import java.io.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

	/** Группа документов к которой привязана запись нумератора */
	private Docgroup Docgroup;

	/** Год ведения подсчета (Можно поразмышлять что делать если прошла реорганизация, или нумерация привязана к созыву сессии) */
	private String Section;

	/** Порядковый номер следующего документа */
	private long LastNum;

	public Numerator(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Numerator(Docgroup Docgroup){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Numerator(int DocgroupId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public int getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setSection(String Section){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getSection(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setLastNum(long LastNum){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getLastNum(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	protected void setDocgroup(Docgroup Docgroup){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Docgroup getDocgroup(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

}

