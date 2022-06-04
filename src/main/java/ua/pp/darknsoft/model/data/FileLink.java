package ua.pp.darknsoft.model.data;
import java.io.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

/** 
 * Прикрепленные к документу файлы 
 * */
@Entity 
public class FileLink implements Serializable{
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	/** Название файла */
	private String Name;

	/** Содержимое файла */
	@Lob 
	private byte[] Content;

	/** Ссылка на документ, в который вложен файл
	 *  */
	private Record Document;

	public FileLink(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public FileLink(Record Document){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId(){
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

	public void setContent(byte[] Content){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public byte[] getContent(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setDocument(Record Document){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Record getDocument(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

}

