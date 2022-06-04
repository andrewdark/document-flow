package ua.pp.darknsoft.model.data;
import java.sql.*;
import java.util.*;
/** "Тело" документа. Головной узел документа. К нему привязываются отстальные "части" документа */
public @Entity class Record implements java.io.Serializable{
	/** Идентификатор записи */
	private @Id @GeneratedValue long Id;

	private long DocgroupId;

	private long OrderNum;

	private String Regnum;

	private java.sql.Date Regdate;

	private String Consist;

	private String Content;

	private String Note;

	private long Executor;

	private int DeliveryId;

	private boolean Collective;

	private int SignCount = 1;

	private Set<Resolution> Resolutions;

	public Record(){
		// TODO add implementation
	}

	public long getId(){
		// TODO add implementation and return statement
	}

	public void setOrderNum(long OrderNum){
		// TODO add implementation
	}

	public long getOrderNum(){
		// TODO add implementation and return statement
	}

	public void setRegnum(String Regnum){
		// TODO add implementation
	}

	public String getRegnum(){
		// TODO add implementation and return statement
	}

	public void setRegdate(java.sql.Date Regdate){
		// TODO add implementation
	}

	public java.sql.Date getRegdate(){
		// TODO add implementation and return statement
	}

	public void setConsist(String Consist){
		// TODO add implementation
	}

	public String getConsist(){
		// TODO add implementation and return statement
	}

	public void setContent(String Content){
		// TODO add implementation
	}

	public String getContent(){
		// TODO add implementation and return statement
	}

	public void setNote(String Note){
		// TODO add implementation
	}

	public String getNote(){
		// TODO add implementation and return statement
	}

	public void setExecutor(long Executor){
		// TODO add implementation
	}

	public long getExecutor(){
		// TODO add implementation and return statement
	}

	public void setCollective(boolean Collective){
		// TODO add implementation
	}

	public boolean isCollective(){
		// TODO add implementation and return statement
	}

	public void setSignCount(int SignCount){
		// TODO add implementation
	}

	public int getSignCount(){
		// TODO add implementation and return statement
	}

	public Set<Resolution> getResolutions(){
		// TODO add implementation
	}

}

