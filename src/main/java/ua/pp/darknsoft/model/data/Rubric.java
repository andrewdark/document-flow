package ua.pp.darknsoft.model.data;
/** Иерархический справочник "Рубрикатор". Нужен для указания тематики вопроса в письме */
public class Rubric{
	/** Идентификатор записи */
	protected @Id @GeneratedValue int Id;

	protected int Parent;

	protected String Code;

	protected String Name;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	protected boolean Deleted;

}

