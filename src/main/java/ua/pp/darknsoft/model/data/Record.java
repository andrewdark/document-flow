package ua.pp.darknsoft.model.data;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
/** 
 * "Тело" документа. Головной узел документа. 
 * К нему привязываются отстальные "части" документа 
 * */
@Entity 
public class Record implements Serializable{
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	/** Журнал(Группа документов в котором регистрируются документы */
	private Docgroup Docgroup;

	/** Порядковая часть номера документа */
	private long OrderNum;

	/** Регистрационный номер документа */
	private String Regnum;

	/** Дата регистрации документа */
	private java.sql.Date Regdate;

	/** Состав/колличество листов */
	private String Consist;

	/** Краткое содержание */
	private String Content;

	/** Примечание */
	private String Note;

	/** Признак коллективности письма (Только для писем граждан) */
	private boolean Collective;

	/** Колличество подписей в обращении (Только для писем граждан) */
	private int SignCount = 1;

	/** Резолюции наложенные на документ */
	private Set<Resolution> Resolutions;

	/** Вид доставки */
	private Delivery Delivery;

	/** Исполнитель документа (Только для исходящих и внутреней документации) */
	private Department Executor;

	/** Визы и Подписи */
	private Set<Vise> Vises;

	/** Файлы прикрепленные к документу */
	private Set<FileLink> Files;

	/** Перечень кореспондентов (только для входящих и граждан) */
	private Set<Correspondent> Correspondents;

	/** Рубрикатор */
	private Set<Rubric> Rubrics;

	/** Связки с другими документами */
	protected Set<LinkRecord> Links;

	public Record(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Record(Docgroup Docgroup, java.util.Date RegDate){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Record(Docgroup Docgroup, java.util.Date RegDate, String RegNum){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Record(long DocgroupId, java.util.Date RegDate){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Record(long DocgroupId, java.util.Date RegDate, String RegNum){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setOrderNum(long OrderNum){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getOrderNum(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setRegnum(String Regnum){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getRegnum(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setRegdate(java.sql.Date Regdate){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public java.sql.Date getRegdate(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setConsist(String Consist){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getConsist(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setContent(String Content){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getContent(){
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

	public void setCollective(boolean Collective){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public boolean isCollective(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setSignCount(int SignCount){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public int getSignCount(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setDelivery(Delivery Delivery){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Delivery getDelivery(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public Set<Resolution> getResolutions(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public void setExecutor(Department Executor){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Department getExecutor(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public Set<Vise> getVises(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Set<FileLink> getFiles(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Set<Correspondent> getCorrespondents(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Set<Rubric> getRubrics(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Set<LinkRecord> getLinks(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

}

