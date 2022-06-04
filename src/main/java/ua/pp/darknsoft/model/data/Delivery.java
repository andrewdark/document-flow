package ua.pp.darknsoft.model.data;
/** Список видов доставки */
@Entity public class Delivery{
	/** Идентификатор записи */
	protected @Id @GeneratedValue int Id;

	/** Наименование видов доставки */
	protected String Name;

	/** Признак удаленой записи. Нужен чтобы не удалять полностью документ из базы */
	protected boolean Deleted;

}

