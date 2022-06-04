package ua.pp.darknsoft.model.data;
import java.sql.*;
/** Протокол работы с документом. Отражает любые изменения в нем */
@Entity public class Protocol{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected Date Date;

	protected int OperationId;

	protected long LinkId;

	protected int UserId;

}

