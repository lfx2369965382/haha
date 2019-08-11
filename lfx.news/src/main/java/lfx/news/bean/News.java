package lfx.news.bean;

import java.util.Date;

public class News {
	
	private int nid;
	private int score;
	private Date createTime;
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "News [nid=" + nid + ", score=" + score + ", createTime=" + createTime + "]";
	}
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
