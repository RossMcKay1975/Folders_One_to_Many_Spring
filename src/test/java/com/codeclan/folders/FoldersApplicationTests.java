package com.codeclan.folders;

import com.codeclan.folders.models.File;
import com.codeclan.folders.repositories.FileRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}


	@Test
	public void createFile() {
		File file = new File();
		fileRepository.save(file);

	}
}