package com.iu.s3.notice;

import java.sql.Date;

public class NoticeDTO {
	
	private long noticeNumber;
	private String noticeSub;
	private String id;
	private String noticeContent;
	private long hit;
	private Date noticeDate;
	
	public long getNoticeNumber() {
		return noticeNumber;
	}
	public void setNoticeNumber(long noticeNumber) {
		this.noticeNumber = noticeNumber;
	}
	public String getNoticeSub() {
		return noticeSub;
	}
	public void setNoticeSub(String noticeSub) {
		this.noticeSub = noticeSub;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public long getHit() {
		return hit;
	}
	public void setHit(long hit) {
		this.hit = hit;
	}
	public Date getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}
}
