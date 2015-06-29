package com.nearsoft.spittr.web.controller;

import com.nearsoft.spittr.domain.model.Spittle;
import com.nearsoft.spittr.domain.repository.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by vtorres on 28/06/15.
 */
@Controller
@RequestMapping(value = {"/spittles"})
public class SpittleController {
    private static final String MAX_LONG_AS_STRING = Long.MAX_VALUE+"";
    private SpittleRepository spittleRepository;


    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = GET)
    public String spittles(@RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max,
                           @RequestParam(value = "count", defaultValue = "20") int count,
                                  Model model)  {
        model.addAttribute(spittleRepository.findSpittles(max, count));
        return "spittles";
    }

    @RequestMapping(method = GET, value = {"/{idSpittle}"})
    public String spittles(@PathVariable(value = "idSpittle") long id, Model model)  {
        model.addAttribute(spittleRepository.findOne(id));
        return "spittle";
    }
}
