package com.ctsig.dfs.controller;

import com.ctsig.dfs.wrapper.FastDFSClientWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Shen on 2016/11/14.
 */
@Controller
@RequestMapping("/files")
public class FileController {
    private final Logger logger = LoggerFactory.getLogger(FileController.class);
    @Autowired
    private FastDFSClientWrapper dfsClient;

    // 上传图片
    @ResponseBody
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(MultipartFile file) throws Exception {
        // 省略业务逻辑代码。。。
        String imgUrl = dfsClient.uploadFile(file);
        logger.error(imgUrl);
        System.err.println(imgUrl);
        // 。。。。
        return imgUrl;
    }
}
