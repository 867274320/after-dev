package org.boy.utils;

/**
 * @author tanglijie
 * @date 2024/7/5 上午10:59
 * @description 前端过滤器
 **/
public class FiltersRow {
    /*
    * 属性
    * */
    private String field;
    /*
    * 操作符
    * */
    private String operator;
    /*
    * 表字段
    * */
    private String column;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }
}
