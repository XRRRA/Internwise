package com.example.controller;

import com.example.entities.Program;
import com.example.service.ProgramService;
import com.example.service.response.PageableResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProgramListPageController {
    private final ProgramService programService;
    public ProgramListPageController(ProgramService programService) {
        this.programService = programService;
    }
    @GetMapping(path = "/programs")
    public String getPrograms(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        int pageSize = 6;
        PageableResponse<Program> programsPage = programService.getPrograms(pageSize, page);

        model.addAttribute("pageTitle", "Latest programs");
        model.addAttribute("pageablePrograms", programsPage);
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("pageContent", "program-list-body");

        return "layout";
    }

}
