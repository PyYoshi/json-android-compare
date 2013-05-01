package com.martinadamek.jsonandroid;

import com.martinadamek.jsonandroid.twitter.Tweet;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JacksonJsonOMapper implements TestJson{
    public String getName() {
        return "[OM]Jackson 1.9.12";
    }

    public List<Map> parsePublicTimeline(InputStream inputStream) {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonFactory f = new JsonFactory();
        try {
            JsonParser jp = f.createJsonParser(inputStream);
            Iterator<Tweet> tweets = mapper.readValues(jp, Tweet.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
