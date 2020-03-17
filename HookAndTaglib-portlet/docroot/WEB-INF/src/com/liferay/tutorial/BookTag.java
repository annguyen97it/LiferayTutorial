package com.liferay.tutorial;

import javax.servlet.http.HttpServletRequest;
import javax.swing.border.TitledBorder;

public class BookTag extends BaseBookTag{
	private static final boolean _CLEAN_UP_SET_ATTRIBUTE = true;
	
	@Override
	protected boolean isCleanUpSetAttributes() {
		return _CLEAN_UP_SET_ATTRIBUTE;
	}
	
	@Override
	protected void setAttributes(HttpServletRequest request) {
		super.setAttributes(request);
		
		String title = getTitle();
		setNamespacedAttribute(request, "title", title);
		
		String edition = getEdition();
		setNamespacedAttribute(request, "edition", edition);
		
		String isbn = getIsbn();
		setNamespacedAttribute(request, "isbn", isbn);
		
		String cover = getCover();
		setNamespacedAttribute(request, "cover", cover);
		
		int numberOfPage = getNumberOfPage();
		setNamespacedAttribute(request, "numberOfPage", numberOfPage);
		
		String publisherName = getPublisherName();
		setNamespacedAttribute(request, "publisherName", publisherName);
		
		String publisherURL = getPublisherURL();
		setNamespacedAttribute(request, "publisherURL", publisherURL);
	}
}
