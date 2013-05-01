package com.martinadamek.jsonandroid;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

//import net.vvakame.util.jsonpullparser.JsonPullParser;
import net.vvakame.util.jsonpullparser.JsonFormatException;

public class JPParser implements TestJson{

    public String getName() {
        return "JsonPullParser 1.6.1";
    }

    public List<Map> parsePublicTimeline(InputStream inputStream) {

        //List<Map> result = new ArrayList<Map>();
        List<JPPTweet> result;

        try{
            result = JPPTweetGen.getList(inputStream);
        }catch(JsonFormatException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}
