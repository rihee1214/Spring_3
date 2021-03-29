package com.iu.s3.util;

public class Pager {

	private long startRow;
	private long lastRow;
	private long curPage;
	private long startnum;
	private long lastnum;
	
	
	public long getStartnum() {
		return startnum;
	}
	public void setStartnum(long startnum) {
		this.startnum = startnum;
	}
	public long getLastnum() {
		return lastnum;
	}
	public void setLastnum(long lastnum) {
		this.lastnum = lastnum;
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
