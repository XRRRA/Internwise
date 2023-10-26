package com.example.service;

import com.example.entities.Program;
import com.example.service.response.PageableResponse;

public interface ProgramService {
    Program addProgram(Program program);
    Program findProgramById(Integer id);
    boolean removeProgramById(Integer id);
    PageableResponse<Program> getPrograms(Integer pageSize, Integer page);
    Program updateProgramById(Program program);
    Program getProgramsByProgramUrlPath(String programUrlPath);
}
