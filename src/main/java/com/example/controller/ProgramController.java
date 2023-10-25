package com.example.controller;

import com.example.entities.Program;
import com.example.service.ProgramService;
import com.example.service.response.PageableResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/programs")
public class ProgramController {
    private final ProgramService programService;
    public ProgramController(ProgramService programService){
        this.programService = programService;
    }
    @PostMapping(path="/addProgram")
    public Program addProgram(Program program){
        return programService.addProgram(program);
    }
    @GetMapping(path="/findProgramById")
    public Program findProgramById(Integer id) {
        return programService.findProgramById(id);
    }
    @DeleteMapping(path="/removeProgramById")
    public boolean removeProgramById(Integer id){
        return programService.removeProgramById(id);
    }
    @GetMapping(path="/getPrograms")
    public PageableResponse<Program> getPrograms(Integer pageSize, Integer page){
        return programService.getPrograms(pageSize, page);
    }
    @PutMapping(path="/updateProgramById")
    public Program updateProgramById(Program program){
        return programService.updateProgramById(program);
    }
    @GetMapping(value = {"/{companyUrlPath}/{programUrlPath}"})
    public String getProductDetailedPage(@PathVariable String companyUrlPath, @PathVariable String programUrlPath, ModelMap model) {
        String urlPat = "/"+companyUrlPath+"/"+programUrlPath;
        Program program  = programService.getProgramsByProgramUrlPath(urlPat);

        model.addAttribute("program", program);
        model.addAttribute("pageContent", "internships_details");
        model.addAttribute("pageTitle", "Internship description");
        return "layout";
    }
}