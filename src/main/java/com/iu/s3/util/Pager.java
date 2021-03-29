package com.iu.s3.util;

public class Pager {

	private long startRow;
	private long lastRow;
	private long curPage;
	private long totalPager;
	
	
	public long getTotalPager() {
		return totalPager;
	}
	public void setTotalPager(long totalPager) {
		this.totalPager = totalPager;
	}
	public long getCurPage() {
		if(curPage<1) {
			curPage=1;
		}
		return curPage;
	}
	public void setCurPage(long curPage) {
		this.curPage = curPage;
	}
	public long getStartRow() {
		return startRow;
	}
	public void setStartRow(long startRow) {
		this.startRow = startRow;
	}
	public long getLastRow() {
		return lastRow;
	}
	public void setLastRow(long lastRow) {
		this.lastRow = lastRow;
	}
}
