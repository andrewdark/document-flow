package ua.pp.darknsoft.model.data;
/** Таблица связи документа с рубрикой */
@Entity public class RubricLink{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected long RecordId;

	protected int RubricId;
	protected int Weight;


}

