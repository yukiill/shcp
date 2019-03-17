package com.shcp.common.utils;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Yuki
 * @date 2019/3/7 16:12
 */
public class HttpClientUtil {

    public static String doGet(String url, Map<String, String> params){
        //创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String resultString = "";
        CloseableHttpResponse response = null;
        try {
            URIBuilder uriBuilder = new URIBuilder(url);
            if(params != null){
                for(String key : params.keySet()){
                    uriBuilder.addParameter(key, params.get(key));
                }
            }
            URI uri = uriBuilder.build();
            HttpGet httpGet = new HttpGet(uri);
            response = httpClient.execute(httpGet);
            HttpEntity httpEntity = response.getEntity();
            resultString = EntityUtils.toString(httpEntity);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return resultString;
    }

    public static String doPost(String url, Map<String, String> params){
        //创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String resultString = "";
        CloseableHttpResponse response = null;
        try {
            URIBuilder uriBuilder = new URIBuilder(url);
            if(params != null){
                List<NameValuePair> nameValuePairs = new ArrayList<>();
                for(String key : params.keySet()){
                    nameValuePairs.add(new BasicNameValuePair(key, params.get(key)));
                }
                uriBuilder.setParameters(nameValuePairs);
            }
            URI uri = uriBuilder.build();
            HttpPost httpPost = new HttpPost(uri);
            response = httpClient.execute(httpPost);
            HttpEntity httpEntity = response.getEntity();
            resultString = EntityUtils.toString(httpEntity);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return resultString;
    }
}
