package com.hl95.testHttpClient;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class TestHttpClient2 {

    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://blog.java1234.com/blog/articles/250.html");
        httpPost.setHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");
        try {
            CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
            HttpEntity httpEntity = httpResponse.getEntity();
            Header contentType = httpEntity.getContentType();
            System.out.println(httpResponse.getStatusLine().getStatusCode());
            System.out.println(contentType.getValue());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
