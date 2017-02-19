package es.unizar.tmdad.lab0.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.social.twitter.api.SearchResults;

import es.unizar.tmdad.lab0.service.TwitterLookupService;


@Controller
public class SearchController {

    @Autowired
    TwitterLookupService twitter;

    @RequestMapping("/")
    public String greeting() {
        return "index";
    }

    @ResponseBody
    @RequestMapping("/search")
    public SearchResults search(@RequestParam("q") String q) {
        return twitter.search(q);
    }
}
