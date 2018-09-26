package com.myerp.model;

import java.util.List;

public class MyPage<T> {
    private int pageNum;	//第几页
    private int pageSize;	//每页最多显示多少行
    private int totalRecord;//一共有多少条记录
    private int totalPage;	//一共有多少页
    private int startIndex;	//从第几个记录开始   
    private List<T> list;	//页面数据（对象集合）
     
    private int start;	//开始页的序号
    private int end;	//结束页的序号
    public MyPage(int pageNum,int pageSize,int totalRecord) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalRecord = totalRecord;
        if(totalRecord%pageSize==0){
            this.totalPage = totalRecord/pageSize;
        }else{
            this.totalPage = totalRecord/pageSize + 1;
        }
        this.startIndex = (pageNum-1)*pageSize + 1 ;
        this.start = 1;
        this.end = 5;
        if(totalPage <=5){
            this.end = this.totalPage;
        }else{
            this.start = pageNum - 2;
            this.end = pageNum + 2;           
            if(start < 0){
                this.start = 1;
                this.end = 5;
            }
            if(end > this.totalPage){
                this.end = totalPage;
                this.start = end-5;
            }
        }
    }
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
    
    
}
