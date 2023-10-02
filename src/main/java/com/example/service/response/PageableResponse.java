package com.example.service.response;

import java.util.List;

public class PageableResponse<T> {
    private Integer totalRecords;
    private Integer currentPage;
    private List<T> content;

    public PageableResponse(Integer totalRecords, Integer currentPage, List<T> content) {
        this.totalRecords = totalRecords;
        this.currentPage = currentPage;
        this.content = content;
    }

    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }
}
