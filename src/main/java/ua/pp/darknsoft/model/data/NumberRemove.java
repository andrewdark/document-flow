package ua.pp.darknsoft.model.data;
/** Список удаленых порядковых номеров. Нужен для регистрации документов с порядковым номером "дырки". После регистрации, свободный номер из этого списка должен быть удален */
public class NumberRemove{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected int DocgroupId;

	protected int Year;

	protected int Num;

}

