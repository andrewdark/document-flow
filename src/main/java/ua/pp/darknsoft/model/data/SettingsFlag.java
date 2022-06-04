package ua.pp.darknsoft.model.data;
/** Справочник всех настроек */
@Entity public class SettingsFlag{
	/** Идентификатор записи */
	protected @Id @GeneratedValue int Id;

	protected String Name;
	protected java.lang.String Description;


}

