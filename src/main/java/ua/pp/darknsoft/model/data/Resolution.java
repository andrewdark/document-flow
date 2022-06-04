package ua.pp.darknsoft.model.data;
import java.sql.*;
/** Резолюции а документе */
@Entity public class Resolution implements java.io.Serializable{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected long RecordId;

	protected String Content;

	protected long AuthorId;

	protected Date ResolDate;

	protected Date PlanDate;

	protected Date FactDate;

	protected String Resume;

	protected String Summary;
	protected Record Document;

	protected CategoryResolution Category;



}

