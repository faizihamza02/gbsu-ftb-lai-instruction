package com.kata.gbsuftblai.controllers;

import com.kata.gbsuftblai.controllers.model.ResultDto;
import com.kata.gbsuftblai.services.GbsuFtbLaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gbsu-ftb-lai")
class GbsuFtbLaiController {

    @Autowired
    private GbsuFtbLaiService gbsuFtbLaiService;

    @GetMapping("/{inputNumber}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResultDto convertNumber(@PathVariable(name = "inputNumber") int inputNumber) {
        return  ResultDto.builder().result(gbsuFtbLaiService.convertNumber(inputNumber)).build();
    }

}
