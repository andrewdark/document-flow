package ua.pp.darknsoft.model.data;
/** Прикрепленные к документу файлы */
@Entity public class FileLink{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected long RecordId;

	protected String Name;

	protected byte[] Content;

}

