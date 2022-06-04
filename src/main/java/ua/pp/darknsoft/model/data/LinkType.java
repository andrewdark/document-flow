package ua.pp.darknsoft.model.data;
/** Варианты связок между документами */
@Entity public class LinkType{
	/** Идентификатор записи */
	protected @Id @GeneratedValue int Id;

	protected String Name;

	protected int Pare;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	protected boolean Deleted;

}

