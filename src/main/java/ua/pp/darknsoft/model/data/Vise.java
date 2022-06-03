package ua.pp.darknsoft.model.data;
import java.sql.*;
public class Vise{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected long RecordId;

	protected short Kind;

	protected Date Date;

	protected long DepartmentId;

}

