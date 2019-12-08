package easyblood.backend.service;

import easyblood.backend.repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutServiceImpl implements AboutService{

    @Autowired
    AboutRepository aboutRepository;
}
