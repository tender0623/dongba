package com.jt.common.vo;

/**
 * Created by CGB on 2019/3/13.
 */

import com.jt.sys.pojo.SysRole;

import java.util.List;

/**
 * 借助此对象封装当前页数据以及分页信息
 */
public class PageObject<T> {
    /**
     * 当前页的记录
     */
    private List<T> records;
    /**
     * 总页数 计算获取
     */
    private int pageCount;
    /**总记录数  数据库获取*/
    private int rowCount;
    /**当前页的页码  从页面获取*/
    private int pageCurrent;

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(int pageCurrent) {
        this.pageCurrent = pageCurrent;
    }
}
