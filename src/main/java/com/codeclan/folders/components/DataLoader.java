package com.codeclan.folders.components;

import com.codeclan.folders.models.File;
import com.codeclan.folders.models.Folder;
import com.codeclan.folders.models.User;
import com.codeclan.folders.repositories.FileRepository;
import com.codeclan.folders.repositories.FolderRepository;
import com.codeclan.folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;


    public void run(ApplicationArguments args) {


        Folder operationOuch = new Folder("operation ouch");
        folderRepository.save(operationOuch);

        Folder operationTiny = new Folder("operation tiny");
        folderRepository.save(operationTiny);

        File picture = new File("picture", "jpeg", "450mb", operationOuch );
        fileRepository.save(picture);

        File map = new File ("map", "jpeg", "2gb", operationTiny );
        fileRepository.save(map);

        User mrEagle = new User("agent", "mrEagle");
        userRepository.save(mrEagle);



    }
}
