package com.codeclan.example.w13d2_spring_relationships_hw.components;

import com.codeclan.example.w13d2_spring_relationships_hw.models.File;
import com.codeclan.example.w13d2_spring_relationships_hw.models.Folder;
import com.codeclan.example.w13d2_spring_relationships_hw.models.User;
import com.codeclan.example.w13d2_spring_relationships_hw.repository.FileRepository;
import com.codeclan.example.w13d2_spring_relationships_hw.repository.FolderRepository;
import com.codeclan.example.w13d2_spring_relationships_hw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        User rumrog = new User("Rumen Roger");
        userRepository.save(rumrog);

        Folder e40 = new Folder("e40", rumrog);
        folderRepository.save(e40);

        File hw = new File("hw", ".jar", 20, e40);
        fileRepository.save(hw);
    }
}
