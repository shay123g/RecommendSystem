package proj.Recommendationsystem.controllers;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proj.Recommendationsystem.entities.Recommendation;
import proj.Recommendationsystem.handlers.RecommendationsHandler;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RecommendationController {

    private RecommendationsHandler handler;

    List<Recommendation> recommendationOptions = new ArrayList<>();

    @Autowired
    public void setRecommnendationsHandler (RecommendationsHandler handler) {
        this.handler = handler;
    }

    @GetMapping("/newReport")
    //Analyst open new report in Omnix, invoking call from Omnix with indication of the opened report
    public List<Recommendation> handleNewReportFromOmnix(){
        clearRecommendationList();
        return handler.getRecommendationsForNewReport(recommendationOptions);
    }

    @GetMapping("/newEventStarted")
    //Analyst create new investigation - Type Event (data gathered from report), all data being filled automatically into the investigations
    public List<Recommendation> handleNewEventInvestigationFromOmnix(){
        clearRecommendationList();
        return handler.getRecommendationsForNewEvent(recommendationOptions);

    }

    private void clearRecommendationList(){
        recommendationOptions.clear();
    }


}
