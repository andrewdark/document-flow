package ua.pp.darknsoft.model.data;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/** 
 * Резолюции а документе 
 * */
@Entity 
public class Resolution implements Serializable{
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	/** Ссылка на документ */
	private Record Document;

	/** Текст резолюции
	 *  */
	private String Content;

	/** Автор резолюции */
	private Department Author;

	/** Дата наложения резолюции */
	private java.sql.Date ResolDate;

	/** Плановая дата исполнения резолюции */
	private java.sql.Date PlanDate;

	/** Фактическая дата исполнения резолюции */
	private java.sql.Date FactDate;

	/** Основание снятия с контроля */
	private String Resume;

	/** Ход исполнения */
	private String Summary;

	/** Состояние исполнения резолюции */
	private CategoryResolution Category;

	/** Отчеты исполнителей и сами исполнители */
	private Set<Reply> Replays;

	public Resolution(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Resolution(Record Documnt){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Resolution(long DocumentId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId(){
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

	public void setAuthor(Department Author){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Department getAuthor(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setResolDate(java.sql.Date ResolDate){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public java.sql.Date getResolDate(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setPlanDate(java.sql.Date PlanDate){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public java.sql.Date getPlanDate(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setFactDate(java.sql.Date FactDate){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public java.sql.Date getFactDate(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setResume(String Resume){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public String getResume(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setSummary(String Summary){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public void setCategory(CategoryResolution Category){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public CategoryResolution getCategory(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public Record getDocument(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public Set<Reply> getReplays(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

}

