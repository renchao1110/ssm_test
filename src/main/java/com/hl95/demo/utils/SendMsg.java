package com.hl95.demo.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

@Component
public class SendMsg {
	
	public static String sendGet(String url){
		CloseableHttpClient httpClient = HttpClients.createDefault();
		BufferedReader in = null;
		
		try {
			HttpGet httpGet = new HttpGet(url);
			CloseableHttpResponse httpResponse = null;
			httpResponse = httpClient.execute(httpGet);
			try {
				HttpEntity entity = httpResponse.getEntity();
				if(null!=entity){
					String tempStr = "";
					in = new BufferedReader(new InputStreamReader(entity.getContent()));
					StringBuffer content = new StringBuffer();
					while((tempStr = in.readLine())!=null){
						content.append(tempStr);
					}
					return content.toString();
				}
			} finally {
				if(httpResponse!=null){
					httpResponse.close();
				}
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(httpClient!=null){
				try {
					httpClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return "";
	}
	
	
	
	public static String sendPost(String url,Map<String, Object> map){
		CloseableHttpClient client = HttpClients.createDefault();
		BufferedReader in = null;
		String body = "";
		CloseableHttpResponse response = null;
		try {
			
			HttpPost httpPost = new HttpPost(url);
			//装填参数
			List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			
			if(map!=null){
				for (Map.Entry<String, Object> entry : map.entrySet()) {
					String key = entry.getKey();
					String value = (String)entry.getValue();
					if("message".equals(entry.getKey())){
						//value = new String(value.getBytes("UTF-8"),"GBK");
						value = URLEncoder.encode(value,"GBK");
					}
					nvps.add(new BasicNameValuePair(key, value));
				}
			}
			
			//设置参数到请求对象中
			httpPost.setEntity(new UrlEncodedFormEntity(nvps));
			
			httpPost.setHeader("Content-type", "application/x-www-form-urlencoded;charset=GBK");
			httpPost.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
			
			response = client.execute(httpPost);
			//获取结果实体
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				//按指定编码转换结果实体为String类型
				body = EntityUtils.toString(entity);
			}
			EntityUtils.consume(entity);
			return body;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//释放链接
			if(response!=null){
				try {
					response.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return "";
	}
}
