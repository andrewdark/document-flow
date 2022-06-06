package ua.pp.darknsoft.model.data;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Связка между документами
 */
@Entity
public class LinkRecord implements Serializable {

	private static final long serialVersionUID = 4638047586810335138L;

	/** Идентификатор записи */
	@Id
	@GeneratedValue
	private long Id;

	/** Тип связки */
	@ManyToOne
	private LinkType Type;

	/** Ссылка на основной документ */
	@ManyToOne(fetch = FetchType.LAZY)
	private Record Document;

	/** Ссылка на связаный документ */
	@ManyToOne(fetch = FetchType.LAZY)
	private Record Link;

	/** Примечание / информация о виртуальном документе */
	private String Note;

	public LinkRecord() {
		this.Id = -1;
		this.Type = null;
		this.Document = null;
		this.Link = null;
		this.Note = "";
	}

	public LinkRecord(Record Document, Record Link) {
		this();
		this.Document = Document;
		this.Link = Link;
	}

	public LinkRecord(long DocumentId, long LinkId) {
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public LinkRecord(Record Document, Record Link, LinkType Type) {
		this();
		this.Type = Type;
		this.Document = Document;
		this.Link = Link;
	}

	public LinkRecord(long DocumentId, long LinkId, int TypeId) {
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId() {
		return this.Id;
	}

	public void setNote(String Note) {
		this.Note = Note;
	}

	public String getNote() {
		return this.Note;
	}

	protected void setDocument(Record Document) {
		this.Document = Document;
	}

	public Record getDocument() {
		return this.Document;
	}

	public void setLink(Record Link) {
		this.Link = Link;
	}

	public Record getLink() {
		return this.Link;
	}

	public void setType(LinkType Type) {
		this.Type = Type;
	}

	public LinkType getType() {
		return this.Type;
	}

	@Override
	public String toString() {
		if (this.getLink() != null)
			return this.getLink().toString();
		return this.Note;
	}

}
