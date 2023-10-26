package com.example.service.impl;

import com.example.entities.Program;
import com.example.repository.ProgramRepository;
import com.example.service.ProgramService;
import com.example.service.response.PageableResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProgramServiceImpl implements ProgramService {
    private final ProgramRepository programRepository;

    public ProgramServiceImpl(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    @Override
    public Program addProgram(Program program) {
        return programRepository.save(program);
    }

    @Override
    public Program findProgramById(Integer id) {
        Optional<Program> program = programRepository.findById(id);
        if(program.isEmpty()){
            System.out.println("Program not found");
        }
        return program.get();
    }

    @Override
    public boolean removeProgramById(Integer id) {
        programRepository.deleteById(id);
        return !programRepository.existsById(id);
    }

    @Override
    public Program updateProgramById(Program program) {
        return programRepository.save(program);
    }

    @Override
    public Program getProgramsByProgramUrlPath(String programUrlPath) {
        return programRepository.getProgramByUrlPath(programUrlPath);
    }

    @Override
    public PageableResponse<Program> getPrograms(Integer pageSize, Integer page) {
        Page<Program> pageProgram = programRepository.findAll(PageRequest.of(page, pageSize));
        return new PageableResponse<>((int) pageProgram.getTotalElements(), page, pageProgram.getContent());
    }



}
