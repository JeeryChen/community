package com.jerrychen.dome.controller;

import com.jerrychen.dome.dto.QuestionDTO;
import com.jerrychen.dome.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/question/{id}")
    String question(@PathVariable(name = "id") Integer id,
                    Model model) {

        QuestionDTO questionDTO = questionService.getById(id);
        model.addAttribute("question",questionDTO);
        return "question";
    }
}
