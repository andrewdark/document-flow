package ua.pp.darknsoft.model.data;
/** Группа документов. Иерархический справочник. */
@Entity public class Docgroup{
	/** Идентификатор записи */
	protected @Id @GeneratedValue int Id;

	protected int Parent;

	protected String Name;

	protected boolean Node;

	protected short Kind;

	protected String Numerator;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	protected boolean Deleted;

	protected String Index;

}

