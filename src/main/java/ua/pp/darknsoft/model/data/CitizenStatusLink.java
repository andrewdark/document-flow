package ua.pp.darknsoft.model.data;
import java.io.*;
/** Таблица для организации связи многие-ко-многим между гражданином и его соцстаттусом */
public @Entity class CitizenStatusLink implements Serializable{
	/** Идентификатор записи */
	protected @Id @GeneratedValue long Id;

	protected long CitizenId;

	protected int StatusId;

}

