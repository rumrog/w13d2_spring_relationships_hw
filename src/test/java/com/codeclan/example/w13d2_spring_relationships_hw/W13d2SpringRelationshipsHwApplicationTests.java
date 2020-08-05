package com.codeclan.example.w13d2_spring_relationships_hw;

import com.codeclan.example.w13d2_spring_relationships_hw.models.File;
import com.codeclan.example.w13d2_spring_relationships_hw.models.Folder;
import com.codeclan.example.w13d2_spring_relationships_hw.models.User;
import com.codeclan.example.w13d2_spring_relationships_hw.repository.FileRepository;
import com.codeclan.example.w13d2_spring_relationships_hw.repository.FolderRepository;
import com.codeclan.example.w13d2_spring_relationships_hw.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class W13d2SpringRelationshipsHwApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserAndFolderAndFile(){
		User rumrog = new User("Rumen Roger");
		userRepository.save(rumrog);

		Folder e40 = new Folder("e40", rumrog);
		folderRepository.save(e40);

		File hw = new File("hw", ".jar", 20, e40);
		fileRepository.save(hw);
	}

}
