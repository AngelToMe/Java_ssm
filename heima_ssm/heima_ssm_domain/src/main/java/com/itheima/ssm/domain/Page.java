package com.itheima.ssm.domain;

/**
 * @author Vagaband
 * @date 2020/8/8 16:46
 */
public class Page {
    private int totalPage; // 总页数 = 总记录数/每页显示条数
    private int countPage; // 总记录数
    private int currentPage; // 当前页码
    private int sizePage; // 每页显示条数
    private int currentPageRecord;// 当前页初始值 = (当前页码-1)*每页显示条数+1
    private int currentPageEnd; // 当前页结束值 = 初始值+每页显示条数-1

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int countPage, int sizePage) {
        // 判断 总记录数/每页记录数 = 总页码
        if (currentPage%sizePage == 0){
            this.totalPage = countPage/sizePage;
        }else {
            this.totalPage = countPage/sizePage + 1;
        }
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getSizePage() {
        return sizePage;
    }

    public void setSizePage(int sizePage) {
        this.sizePage = sizePage;
    }

    public int getCurrentPageRecord() {
        return currentPageRecord;
    }

    public void setCurrentPageRecord(int currentPage,int sizePage) {
        this.currentPageRecord = (currentPage-1)*sizePage+1;
    }

    public int getCurrentPageEnd() {
        return currentPageEnd;
    }

    public void setCurrentPageEnd(int currentPageRecord,int sizePage) {
        this.currentPageEnd = currentPageRecord+sizePage-1;
    }

    @Override
    public String toString() {
        return "Page{" +
                "totalPage=" + totalPage +
                ", countPage=" + countPage +
                ", currentPage=" + currentPage +
                ", sizePage=" + sizePage +
                ", currentPageRecord=" + currentPageRecord +
                ", currentPageEnd=" + currentPageEnd +
                '}';
    }
}
