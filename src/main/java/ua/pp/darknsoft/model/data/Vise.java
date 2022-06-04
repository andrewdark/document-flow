package ua.pp.darknsoft.model.data;
import java.io.*;
import java.sql.*;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
 * Визы и подписи исходящего документа 
 * */
@Entity 
public class Vise implements Serializable{
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	private Date Date;

	private Record Document;

	private Department Official;

	@Enumerated(EnumType.ORDINAL) 
	private VisaKind Kind;

	private String Note;

	public Vise(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Vise(Record Document){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Vise(long DocumentId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Vise(Record Document, Department Official){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Vise(long DocumentId, long OfficialId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setDate(Date Date){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Date getDate(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public Record getDocument(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	protected void setOfficial(Department Official){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Department getOfficial(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setKind(VisaKind Kind){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public VisaKind getKind(){
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

}

