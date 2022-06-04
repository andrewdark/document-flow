package ua.pp.darknsoft.model.data;
import java.io.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
 * Список удаленых порядковых номеров. Нужен 
 * для регистрации документов с порядковым 
 * номером "дырки". После регистрации, свободный 
 * номер из этого списка должен быть удален 
 * */
public @Entity class NumberRemove implements Serializable{
	
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	/** Группа документов к которой привязана запись нумератора */
	private Docgroup Docgroup;

	/** @see Numerator#Section Описание */
	private int Section;

	/** Порядковый номер удаленного документа */
	private long Num;

	public NumberRemove(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public NumberRemove(Docgroup Docgroup){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public NumberRemove(int DocgroupId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setSection(int Section){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public int getSection(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setNum(long Num){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getNum(){
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

