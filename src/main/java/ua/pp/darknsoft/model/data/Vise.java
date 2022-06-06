package ua.pp.darknsoft.model.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Визы и подписи исходящего документа
 */
@Entity
public class Vise implements Serializable {

	private static final long serialVersionUID = 7958757576135122211L;

	/** Идентификатор записи */
	@Id
	@GeneratedValue
	private long Id;

	/**
	 * Дата и время подписи документа
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date Date;

	/**
	 * Ссылка на подписаный документ
	 */
	@ManyToOne
	private Record Document;

	/**
	 * Ссылка на должностное лицо подписавшее документ
	 */
	@ManyToOne
	private Department Official;

	/**
	 * Сила подписи: Подпись или Виза
	 */
	@Enumerated
	private VisaKind Kind;

	/**
	 * Примечание подписавшего
	 */
	private String Note;

	public Vise() {
		this.Id = -1;
		this.Date = null;
		this.Document = null;
		this.Official = null;
		this.Kind = null;
		this.Note = "";
	}

	public Vise(Record Document) {
		this();
		this.Document = Document;
	}

	public Vise(long DocumentId) {
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public Vise(Record Document, Department Official) {
		this();
		this.Document = Document;
		this.Official = Official;
	}

	public Vise(long DocumentId, long OfficialId) {
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId() {
		return this.Id;
	}

	public Date getDate() {
		return this.Date;
	}

	public void setDate(Date date) {
		this.Date = date;
	}

	public Record getDocument() {
		return this.Document;
	}

	protected void setDocument(Record document) {
		this.Document = document;
	}

	public Department getOfficial() {
		return this.Official;
	}

	public void setOfficial(Department official) {
		this.Official = official;
	}

	public VisaKind getKind() {
		return this.Kind;
	}

	public void setKind(VisaKind kind) {
		this.Kind = kind;
	}

	public String getNote() {
		return this.Note;
	}

	public void setNote(String note) {
		this.Note = note;
	}

	@Override
	public String toString() {
		String result = "";
		if (this.getDate() != null)
			result = "[" + this.getDate().toString() + "]";
		if (this.getOfficial() != null) {
			if (result.length() > 0)
				result += " ";
			result += this.getOfficial().toString();
		}
		return result;
	}

}
