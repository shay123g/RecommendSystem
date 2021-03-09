package proj.recommendation.controllers;

import proj.dtos.InvestigationData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RecommendationController {

    @GetMapping("/newReport")
    public List<String> computeRecommendation(@RequestBody InvestigationData investigationData){
        // instructions for Omnix?
        // do some heavy business logic
         return new ArrayList<String>();
    }
}
