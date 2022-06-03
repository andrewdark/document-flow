package ua.pp.darknsoft.model.data;
import java.sql.*;
public class Resolution{
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

	protected int CategoryId;

}

