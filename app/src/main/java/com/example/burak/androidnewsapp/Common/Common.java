package com.example.burak.androidnewsapp.Common;

import com.example.burak.androidnewsapp.Interface.IconBetterIdeaService;
import com.example.burak.androidnewsapp.Interface.NewsService;
import com.example.burak.androidnewsapp.Model.IconBetterIdea;
import com.example.burak.androidnewsapp.Remote.IconBetterIdeaClient;
import com.example.burak.androidnewsapp.Remote.RetrofitClient;


public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public  static final String API_KEY="919f0f88ddc8470facfdce8d74fa8974";

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }


    public static String getAPIUrl(String source,String sortBy,String apiKEY)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }


}
