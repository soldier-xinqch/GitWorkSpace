package com.xinqch.shiro.common;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;

public class ShiroFactory extends ShiroFilterFactoryBean {

	private static void getData(String querySQL) throws Exception {
		URL url = new URL("http://api.liqwei.com/location/");
		// 打开连接，此处只是创建一个实例，并没有真正的连接
		HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
		httpCon.setDoOutput(true);
		// 打开写入属性
		httpCon.setRequestMethod("GET");
		// 设置提交方法
		String params = "ip=221.217.170.165";
		// 此处调用getOutputStream会隐含的进行connect操作，所以不用在上面显示调用connect()
		httpCon.getOutputStream().write(params.getBytes());
		httpCon.getOutputStream().flush();
		httpCon.getOutputStream().close();
		// 如果inputStream读操作在outputStream的写操作之前，会抛java.net.ProtocolException
		// 将内存缓冲区中封装好的完整的HTTP请求电文发送到服务端。
		InputStream inputStream = httpCon.getInputStream();
		InputStreamReader inputReader = new InputStreamReader(inputStream,
				"gbk");
		BufferedReader bufferReader = new BufferedReader(inputReader);
		String inputLine = null;
		StringBuffer sb = new StringBuffer();
		while ((inputLine = bufferReader.readLine()) != null) {
			sb.append(inputLine);
		}
		bufferReader.close();
		inputReader.close();
		inputStream.close();
		System.out.println(sb.toString());
	}

	public static String getRemortIP(HttpServletRequest request) {
		if (request.getHeader("x-forwarded-for") == null) {
			return request.getRemoteAddr();
		}
		return request.getHeader("x-forwarded-for");
	}

	public static void main(String[] args) {
		try {
			getData("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
