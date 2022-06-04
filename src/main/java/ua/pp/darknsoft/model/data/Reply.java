package ua.pp.darknsoft.model.data;
import java.sql.*;
/** Отчеты исполнителей */
@Entity public class Reply{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected long ResolutionId;

	protected long ExecutorId;

	public Date ReplyDate;

	public @Enumerated CategoryReply Category;

}

