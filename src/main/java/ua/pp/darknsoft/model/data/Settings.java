package ua.pp.darknsoft.model.data;
/** Настройки работы клиента */
@Entity public class Settings{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected int Flag;

	protected String Value;

	protected long UserId;

}

