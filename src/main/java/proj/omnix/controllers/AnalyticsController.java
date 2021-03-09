package proj.omnix.controllers;

import proj.dtos.InvestigationData;
import proj.omnix.proxies.RecommendationServiceProxy;
import proj.responses.RecommendationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnalyticsController {

    private RecommendationServiceProxy recommendationServiceProxy;

    @Autowired
    public AnalyticsController(RecommendationServiceProxy recommendationServiceProxy) {
        this.recommendationServiceProxy = recommendationServiceProxy;
    }

    @GetMapping("/getRecommendation")
    public String getRecommendation(@RequestBody InvestigationData investigation){
        List<String> suggestions =
                recommendationServiceProxy.getRecommendationFromRecommendationSystem(investigation);
        System.out.println(suggestions);
        return null;
    }
}
