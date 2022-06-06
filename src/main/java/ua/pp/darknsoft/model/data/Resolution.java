package ua.pp.darknsoft.model.data;
import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** 
 * Резолюции а документе 
 * */
@Entity 
public class Resolution implements Serializable{
	/** Идентификатор записи */
	@Id 
	@GeneratedValue 
	private long Id;

	/** Ссылка на документ */
	@ManyToOne
	private Record Document;

	/** 
	 * Текст резолюции
	 *  */
	private String Content;

	/** Автор резолюции */
	@ManyToOne
	private Department Author;

	/** Дата наложения резолюции */
	@Temporal(TemporalType.DATE)
	private Date ResolDate;

	/** Плановая дата исполнения резолюции */
	@Temporal(TemporalType.DATE)
	private Date PlanDate;

	/** Фактическая дата исполнения резолюции */
	@Temporal(TemporalType.DATE)
	private Date FactDate;

	/** Основание снятия с контроля */
	private String Resume;

	/** Ход исполнения */
	private String Summary;

	/** Состояние исполнения резолюции */	
	@ManyToOne	
	private CategoryResolution Category;

	/** Отчеты исполнителей и сами исполнители */
	@OneToMany
	private Set<Reply> Replays;

	public Resolution() {
		this.Id = -1;
		this.Document = null;
		this.Content = "";
		this.Author = null;
		this.ResolDate = null;
		this.PlanDate = null;
		this.FactDate = null;
		this.Resume = "";
		this.Summary = "";
		this.Category = null;
		this.Replays = new HashSet<>();
	}

	public Resolution(Record Document){
		this();
		this.Document = Document;
	}

	public Resolution(long DocumentId){
		// TODO add implementation
		throw new UnsupportedOperationException();
	}

	public long getId() {
		return this.Id;
	}

	public Record getDocument() {
		return this.Document;
	}

	protected void setDocument(Record document) {
		this.Document = document;
	}

	public String getContent() {
		return this.Content;
	}

	public void setContent(String content) {
		this.Content = content;
	}

	public Department getAuthor() {
		return this.Author;
	}

	protected void setAuthor(Department author) {
		this.Author = author;
	}

	public Date getResolDate() {
		return this.ResolDate;
	}

	public void setResolDate(Date resolDate) {
		this.ResolDate = resolDate;
	}

	public Date getPlanDate() {
		return this.PlanDate;
	}

	public void setPlanDate(Date planDate) {
		this.PlanDate = planDate;
	}

	public Date getFactDate() {
		return this.FactDate;
	}

	public void setFactDate(Date factDate) {
		this.FactDate = factDate;
	}

	public String getResume() {
		return this.Resume;
	}

	public void setResume(String resume) {
		this.Resume = resume;
	}

	public String getSummary() {
		return this.Summary;
	}

	public void setSummary(String summary) {
		this.Summary = summary;
	}

	public void setCategory(CategoryResolution category) {
		this.Category = category;
	}

	public CategoryResolution getCategory() {
		return this.Category;
	}

	public Set<Reply> getReplays() {
		return this.Replays;
	}

}

