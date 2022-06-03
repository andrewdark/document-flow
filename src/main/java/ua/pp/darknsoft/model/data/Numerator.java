package ua.pp.darknsoft.model.data;
/** Хранение последнего порядкового номера, при регистрации документов */
public class Numerator{
	/** Идентификатор записи */
	protected @Id @GeneratedValue int Id;

	protected int DocgroupId;

	protected int Year;

	protected int LastNum;

}

