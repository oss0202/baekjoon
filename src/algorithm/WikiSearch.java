package algorithm;

import java.util.Map;

public class WikiSearch {
    // 검색어를 포함하는 URL별 관련성 점수의 맵
    private Map<String, Integer> map;

    public WikiSearch(Map<String, Integer> map){
        this.map = map;
    }

    public Integer getRelevance(String url){
        Integer relevance = map.get(url);
        return relevance == null ? 0 : relevance;
    }
}
