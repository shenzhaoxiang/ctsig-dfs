package com.ctsig.dfs;

import com.ctsig.dfs.wrapper.FastDFSClientWrapper;
import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
public class CtsigDfsApplicationTests {

	@Autowired
	private FastDFSClientWrapper dfsClient;

	@Autowired
	private FastFileStorageClient storageClient;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGenerateStorageClient() throws FileNotFoundException {
		File f = new File("D:\\564993fdN2474337b9a.jpg") ;
		FileInputStream inputStream = new FileInputStream(f) ;
		StorePath path = storageClient.uploadFile(inputStream, f.length(), ".jpg",null) ;
		System.out.println("=============== "+dfsClient.getResAccessUrl(path));
	}

}
