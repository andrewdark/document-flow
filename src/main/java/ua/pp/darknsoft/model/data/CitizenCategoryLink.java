package ua.pp.darknsoft.model.data;
import java.io.*;
/** Таблица для организации связи многие-ко-многим между гражданином и его категорией */
public @Entity class CitizenCategoryLink implements Serializable{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected long CitizenId;

	protected int CategoryId;

}

