package com.fada21.android.hydralist.sample;

import com.fada21.android.hydralist.dragable.interfaces.DragableListItem;
import com.fada21.android.hydralist.expandable.BasicExpandableListItem;

public class SampleListItem extends BasicExpandableListItem implements DragableListItem {

	private SampleContents sc;
	private int number;

	public SampleListItem(SampleContents sc, int defaultItemHeight, int number) {
		super(defaultItemHeight, sc.isSampleExpandable());
		this.sc = sc;
		this.number = number;
	}

	public SampleContents getSc() {
		return sc;
	}

	public void setSc(SampleContents sc) {
		this.sc = sc;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public long getId() {
		return number;
	}

	@Override
	public boolean isDragable() {
		return sc.isDragable();
	}

}
