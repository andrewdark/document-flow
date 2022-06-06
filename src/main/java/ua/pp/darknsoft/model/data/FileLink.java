package ua.pp.darknsoft.model.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 * Прикрепленные к документу файлы
 */
@Entity
public class FileLink implements Serializable {

	private static final long serialVersionUID = -2369510938525398174L;

	/** Идентификатор записи */
	@Id
	@GeneratedValue
	private long Id;

	/** Название файла */
	private String Name;

	/** Содержимое файла */
	@Lob
	private byte[] Content;

	/**
	 * Ссылка на документ, в который вложен файл
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private Record Document;

	public FileLink() {
		this.Id = -1;
		this.Name = "";
		this.Content = null;
		this.Document = null;
	}

	public FileLink(Record Document) {
		this();
		this.Document = Document;
	}

	public long getId() {
		return this.Id;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getName() {
		return this.Name;
	}

	public void setContent(byte[] Content) {
		this.Content = Content;
	}

	public byte[] getContent() {
		return this.Content;
	}

	public void setDocument(Record Document) {
		this.Document = Document;
	}

	public Record getDocument() {
		return this.Document;
	}

	@Override
	public String toString() {
		return this.getName();
	}

}
