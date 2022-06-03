package ua.pp.darknsoft.model.data;
public class LinkRecord{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected long RecordId;

	protected long PareRecordId;

	protected int LinkTypeId;

	protected String Note;

}

