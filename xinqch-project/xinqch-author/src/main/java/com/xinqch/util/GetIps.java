package com.xinqch.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;

public class GetIps {
	
	/**
	 * 获取登录用户IP地址
	 * 
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {
	    String ip = request.getHeader("x-forwarded-for");
	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	        ip = request.getHeader("Proxy-Client-IP");
	    }
	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	        ip = request.getHeader("WL-Proxy-Client-IP");
	    }
	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	        ip = request.getRemoteAddr();
	    }
	    if (ip.equals("0:0:0:0:0:0:0:1")) {
	        ip = "本地";
	    }
	    return ip;
	}

	/**
	 * 获取地址
	 * @param params
	 * @param encoding
	 * @return
	 * @throws Exception
	 */
	public String getAddress(String params, String encoding) throws Exception {
		String path = "http://ip.taobao.com/service/getIpInfo.php";
		String returnStr = this.getRs(path, params, encoding);
		JSONObject json = null;
		String ipJson = null;
		if (returnStr != null) {
			json = JSONObject.parseObject(returnStr);
			if ("0".equals(json.get("code").toString())) {
				ipJson = json.getString("data");
			} else {
				return "获取ip地址详细信息失败";
			}
		}
		return ipJson;
	}

	/**
	 * 从url获取结果
	 * 
	 * @param path
	 * @param params
	 * @param encoding
	 * @return
	 */
	public String getRs(String path, String params, String encoding) {
		URL url = null;
		HttpURLConnection connection = null;
		try {
			url = new URL(path);
			connection = (HttpURLConnection) url.openConnection();// 新建连接实例
			connection.setConnectTimeout(2000);// 设置连接超时时间，单位毫�?
			connection.setReadTimeout(2000);// 设置读取数据超时时间，单位毫�?
			connection.setDoInput(true);// 是否打开输出�? true|false
			connection.setDoOutput(true);// 是否打开输入流true|false
			connection.setRequestMethod("POST");// 提交方法POST|GET
			connection.setUseCaches(false);// 是否缓存true|false
			connection.connect();// 打开连接端口
			DataOutputStream out = new DataOutputStream(connection.getOutputStream());
			out.writeBytes(params);
			out.flush();
			out.close();
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), encoding));
			StringBuffer buffer = new StringBuffer();
			String line = "";
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
			}
			reader.close();
			return buffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();// 关闭连接
		}
		return null;
	}
	
	public static void main(String[] args) {
		GetIps ips = new GetIps();
		try {
			System.out.println(ips.getAddress("ip=118.198.153.154", "utf-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
