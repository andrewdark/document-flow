package ua.pp.darknsoft.model.data;
import java.sql.*;
/** Визы и подписи исходящего документа */
@Entity public class Vise{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected long RecordId;

	protected short Kind;

	protected Date Date;

	protected long DepartmentId;

}

