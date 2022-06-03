package ua.pp.darknsoft.model.data;
import java.io.*;
import java.sql.*;
/** Таблица связи для организации связи многие-ко-многим с документом. И для уточнениия характера этой связи. */
public @Entity class Correspondent implements Serializable{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	/** Исходящий номер письма корреспондента или вхоящий адресата */
	public String OutNum;

	/** Исходящая дата письма корреспондента или вхоящий адресата */
	public Date OutDate;

	/** Примечание */
	public String Note;

	/** Кто подписал */
	public String Signatory;

	public @OneToOne(optional=true) Organization Oranization;

	public @OneToOne(optional=true) Citizen Citizen;

	public @OneToOne(optional=true) Record Document;

	public CorrespondentKind Kind;

	public long getId(){
		// TODO add implementation and return statement
	}

}

