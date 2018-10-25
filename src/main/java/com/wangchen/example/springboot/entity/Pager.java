package com.wangchen.example.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chenqing on 2017/11/24.
 */
@ApiModel
public class Pager<T> implements Serializable{

    private static final long serialVersionUID = -929298520452960007L;

    @ApiModelProperty(value = "当前页信息")
    private List<T> resultsForCurrentPage;
    @ApiModelProperty(value = "当前页数")
    private int currentPageNo;
    @ApiModelProperty(value = "页数")
    private int pageSize;
    @ApiModelProperty(value = "总记录数")
    private long totalRecordSize;
    @ApiModelProperty(value = "总页数")
    private long totalPageNum;

    public List<T> getResultsForCurrentPage() {
        return resultsForCurrentPage;
    }

    public void setResultsForCurrentPage(List<T> resultsForCurrentPage) {
        this.resultsForCurrentPage = resultsForCurrentPage;
    }

    public int getCurrentPageNo() {
        return currentPageNo;
    }

    public void setCurrentPageNo(int currentPageNo) {
        this.currentPageNo = currentPageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalRecordSize() {
        return totalRecordSize;
    }

    public void setTotalRecordSize(long totalRecordSize) {
        this.totalRecordSize = totalRecordSize;
    }

    public long getTotalPageNum() {
        return totalPageNum;
    }

    public void setTotalPageNum(long totalPageNum) {
        this.totalPageNum = totalPageNum;
    }
}
