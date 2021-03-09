package proj.omnix.controllers;

import proj.omnix.proxies.RecommendationServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String getRecommendation(){
        List<String> suggestions =
                recommendationServiceProxy.getRecommendationFromRecommendationSystem();
        System.out.println(suggestions);
        return null;
    }
}
