package ua.pp.darknsoft.model.data;
import java.io.*;
import java.sql.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
/** 
 * Таблица связи для организации связи многие-ко-многим 
 * с документом. И для уточнениия характера этой связи. 
 * */
@Entity 
public class Correspondent implements Serializable{

	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	/** Ссылка на документ содержащего корреспондента */
	@OneToOne(optional=true) 
	private Record Document;

	/** Исходящий номер письма корреспондента или вхоящий адресата */
	private String OutNum;

	/** Исходящая дата письма корреспондента или вхоящий адресата */
	private Date OutDate;

	/** Примечание */
	private String Note;

	/** Кто подписал */
	private String Signatory;

	/** Ссылка на организацию-корреспондента */
	@OneToOne(optional=true) 
	private Organization Organization;

	/** Ссылка на физлицо-корреспондента */
	@OneToOne(optional=true) 
	private Citizen Citizen;

	/** Варианты корреспондентов */
	private CorrespondentKind Kind;

	public Correspondent(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Correspondent(Record Document){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setOutNum(String OutNum){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public void setOutDate(Date OutDate){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Date getOutDate(){
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

	public void setSignatory(String Signatory){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getSignatory(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	protected void setOrganization(Organization Organization){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Organization getOrganization(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	protected void setCitizen(Citizen Citizen){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Citizen getCitizen(){
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

}

