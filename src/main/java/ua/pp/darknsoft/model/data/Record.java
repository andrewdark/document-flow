package ua.pp.darknsoft.model.data;
import java.sql.*;
/** "Тело" документа. Головной узел документа. К нему привязываются отстальные "части" документа */
public class Record{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected long DocgroupId;

	protected long OrderNum;

	protected String Regnum;

	protected Date Regdate;

	protected String Consist;

	protected String Content;

	protected String Note;

	protected long Executor;

	protected int DeliveryId;

	protected boolean Collective;

	protected int SignCount = 1;

}

