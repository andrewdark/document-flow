package ua.pp.darknsoft.model.data;
/** Типы операций с документом (и его составных частях) в протоколе */
@Entity public class Opetation{
	/** Идентификатор записи */
	protected @Id @GeneratedValue int Id;

	protected String Description;

}

