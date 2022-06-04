package ua.pp.darknsoft.model.data;
/** Справочник организаций (корреспонденты и адресаты). Интерактивно пополняемый. */
public @Entity class Organization{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected String Name;

	protected String Code;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	protected boolean Deleted;

	public long getId(){
		// TODO add implementation and return statement
	}

}

