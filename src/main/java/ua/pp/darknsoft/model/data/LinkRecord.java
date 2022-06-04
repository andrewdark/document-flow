package ua.pp.darknsoft.model.data;
import java.io.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
 * Связка между документами 
 * */
@Entity 
public class LinkRecord implements Serializable{
	
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	/** Тип связки */
	private LinkType Type;

	/** Ссылка на основной документ */
	private Record Document;

	/** Ссылка на связаный документ */
	private Record Link;

	/** Примечание / информация о виртуальном документе */
	private java.lang.String Note;

	public LinkRecord(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public LinkRecord(Record Document, Record Link){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public LinkRecord(long DocumentId, long LinkId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public LinkRecord(Record Document, Record Link, LinkType Type){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public LinkRecord(long DocumentId, long LinkId, int TypeId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setNote(String Note){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getNote(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	protected void setDocument(Record Document){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Record getDocument(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setLink(Record Link){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Record getLink(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setType(LinkType Type){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public LinkType getType(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

}

