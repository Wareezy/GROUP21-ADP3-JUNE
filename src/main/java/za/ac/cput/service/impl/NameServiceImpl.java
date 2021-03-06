package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Name;
import za.ac.cput.repository.NameRepository;
import za.ac.cput.service.service.NameService;

import java.util.List;
import java.util.Optional;

@Service
public class NameServiceImpl implements NameService {
    private final NameRepository repository;
    @Autowired
    public NameServiceImpl(NameRepository repository){this.repository=repository;}
    @Override
    public Name save(Name name){return this.repository.save(name);}

    @Override
    public Optional<Name> read(Name.NameId nameId){return this.repository.findById(nameId);}
    @Override
    public void delete(Name name){this.repository.delete(name);}
    @Override
    public List<Name> findAll(){return this.repository.findAll();}

    @Override
    public List findByFirstName(String firstName){return this.repository.findByFirstName(firstName);}
}

