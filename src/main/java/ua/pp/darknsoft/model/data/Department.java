package ua.pp.darknsoft.model.data;
/** Справочник подразделений и должностных лиц */
@Entity public class Department{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected long Parent;

	protected String Name;

	protected String Post;

	protected boolean Node;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	protected boolean Deleted;

}

