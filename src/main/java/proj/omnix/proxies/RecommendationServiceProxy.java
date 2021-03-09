package proj.omnix.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="recommendation-service", url="localhost:8000")
public interface RecommendationServiceProxy {

    @GetMapping("/getRecommendation")
    public List<String> getRecommendationFromRecommendationSystem();
}
