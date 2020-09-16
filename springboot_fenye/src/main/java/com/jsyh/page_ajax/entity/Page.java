package com.jsyh.page_ajax.entity;

public class Page {
    private int pageNo;          // 当前页
    private int total;           //总条数
    private int pageSize;        //每页显示的数量
    private int startRow;       //起始行位置
    private int totalPageCount; //总页数

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int pageNo, int pageSize) {
        this.startRow = (pageNo - 1) * pageSize;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int total, int pageSize) {
        this.totalPageCount = total % pageSize == 0 ? total / pageSize : total / pageSize + 1;
    }
    //下面的方法是为了，更方便的调用里面的方法
//    public Page(int pageNo, int total, int pageSize) {
//        this.pageNo = pageNo;
//        this.total = total;
//        this.pageSize = pageSize;
//        this.setStartRow(pageNo, pageSize);
//        this.setTotalPageCount(total, pageSize);
//    }
}
