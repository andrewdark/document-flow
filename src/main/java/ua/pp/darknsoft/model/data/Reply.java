package ua.pp.darknsoft.model.data;
import java.io.*;
import java.sql.*;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/** 
 * Отчеты исполнителей 
 * */
@Entity 
public class Reply implements Serializable{
	
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	/** Ссылка на резолюцию содержащих ответы/исполнителей */
	private Resolution Resolution;

	/** Дата отчета */
	private Date ReplyDate;

	/** Варианты ответа */
	@Enumerated 
	private CategoryReply Category;

	/** Ссылка на исполнителя */
	protected Department Executor;

	public Reply(){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Reply(Resolution Resolution){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Reply(long ResolutionId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setReplyDate(Date ReplyDate){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Date getReplyDate(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public void setCategory(CategoryReply Category){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public CategoryReply getCategory(){
		// TODO add implementation and return statement
		throw new UnsupportedOperationException();
	}

	public Resolution getResolution(){
		// TODO add implementation and return statement
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

}

