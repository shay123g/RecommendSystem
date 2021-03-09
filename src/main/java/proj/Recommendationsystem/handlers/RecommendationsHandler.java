package proj.Recommendationsystem.handlers;

import lombok.AllArgsConstructor;
import lombok.ToString;
import proj.MessagePool;
import proj.Recommendationsystem.entities.Recommendation;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@ToString
public class RecommendationsHandler {

   

    public List<Recommendation> getRecommendationsForNewReport( List<Recommendation> recOptions) {
        List<String> newReportSuggestions = Arrays.asList(MessagePool.OPEN_INVESTIGATION,
                                                          MessagePool.SAVE_FOR_LATE,
                                                          MessagePool.IGNORE_RECOMMENDATION);
        return fillRecommendationList(recOptions,newReportSuggestions);
    }

    private List<Recommendation> fillRecommendationList(List<Recommendation> recOptions, List<String> messages) {
        for (String message : messages)
                recOptions.add(new Recommendation(message));

        return recOptions;
    }

    public List<Recommendation> getRecommendationsForNewEvent(List<Recommendation> recommendationOptions) {
        List<String> newEventSuggestions = Arrays.asList(MessagePool.DISPLAY_CAR_DETAILS,
                                                          MessagePool.COLLECT_TRAFFIC_REPORTS,
                                                          MessagePool.DISPLAY_LOCATION_ON_MAP);
        return fillRecommendationList(recommendationOptions,newEventSuggestions);
    }
}
