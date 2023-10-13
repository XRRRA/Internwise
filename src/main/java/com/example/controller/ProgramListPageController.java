package com.example.controller;

import com.example.entities.Program;
import com.example.service.ProgramService;
import com.example.service.response.PageableResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgramListPageController {
    private final ProgramService programService;
    public ProgramListPageController(ProgramService programService) {
        this.programService = programService;
    }
    @GetMapping(path = "/programs")
    public String getPrograms(Model model){
        PageableResponse<Program> first25Programs = programService.getPrograms(25,0);

        model.addAttribute("pageTitle", "Latest programs");
        model.addAttribute("pageablePrograms", first25Programs);
        model.addAttribute("pageContent", "program-list-body");

        return "layout";
    }
}
