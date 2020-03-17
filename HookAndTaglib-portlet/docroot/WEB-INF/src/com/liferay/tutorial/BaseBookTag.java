package com.liferay.tutorial;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

import com.liferay.taglib.util.IncludeTag;

public class BaseBookTag extends IncludeTag {
	protected static final String _ATTRIBUTE_NAMESPACE =  "bs:book:";
	private static final String _START_PAGE="/html/hookandtaglib/book/end.jsp";
	private static final String _END_PAGE="/html/hookandtaglib/book/start.jsp";
	
	private String title = null;
	private String edition= null;
	private String isbn= null;
	private String cover= null;
	private int numberOfPage = 0;
	private String publisherName= null;
	private String publisherURL= null;
	
	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);
		return super.doStartTag();
	}
	
	@Override
	protected void cleanUp() {
		super.cleanUp();
		
		title = null;
		edition = null;
		isbn = null;
		cover = null;
		numberOfPage = 0;
		publisherName = null;
		publisherURL = null;
	}
	
	@Override
	protected void setAttributes(HttpServletRequest request) {
		setNamespacedAttribute(request, "title", title);
		setNamespacedAttribute(request, "edition", edition);
		setNamespacedAttribute(request, "isbn", isbn);
		setNamespacedAttribute(request, "cover", cover);
		setNamespacedAttribute(request, "numberOfPage", numberOfPage);
		setNamespacedAttribute(request, "publisherName", publisherName);
		setNamespacedAttribute(request, "publisherURL", publisherURL);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public int getNumberOfPage() {
		return numberOfPage;
	}

	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherURL() {
		return publisherURL;
	}

	public void setPublisherURL(String publisherURL) {
		this.publisherURL = publisherURL;
	}
	
	@Override
	protected String getStartPage() {
		return _START_PAGE;
	}
	
	@Override
	public String getEndPage() {
		return _END_PAGE;
	}
	
}
