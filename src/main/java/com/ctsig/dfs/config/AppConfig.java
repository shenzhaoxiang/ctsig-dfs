package com.ctsig.dfs.config;

/**
 * @version： V1.0.0
 * @des：
 * @author: Shen
 * @email: shenzhaoxiang@gmail.com
 * @date: 2016/11/14
 */
public class AppConfig {

    private String fdfsStoragePort ;
    private String resHost ;

    public String getFdfsStoragePort() {
        return fdfsStoragePort;
    }

    public void setFdfsStoragePort(String fdfsStoragePort) {
        this.fdfsStoragePort = fdfsStoragePort;
    }

    public String getResHost() {
        return resHost;
    }

    public void setResHost(String resHost) {
        this.resHost = resHost;
    }
}
