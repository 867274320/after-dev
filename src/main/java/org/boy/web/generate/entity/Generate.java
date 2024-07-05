package org.boy.web.generate.entity;

import org.boy.web.basic.entity.BasicEntity;

/**
 * @author tanglijie
 * @date 2024/7/5 上午11:10
 * @description 生成表
 **/
public class Generate extends BasicEntity {

    /*
    * 包名
    * */
    private String packageName;
    /*
     * 对象名
     * */
    private String objName;
    /*
    * 文件夹英文名
    * */
    private String folder;
    /*
     * 文件夹中文名
     * */
    private String folderName;
    /*
     * 数据库类型
     * */
    private String dataBaseType;
    /*
     * 表名
     * */
    private String tableName;


    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getDataBaseType() {
        return dataBaseType;
    }

    public void setDataBaseType(String dataBaseType) {
        this.dataBaseType = dataBaseType;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
