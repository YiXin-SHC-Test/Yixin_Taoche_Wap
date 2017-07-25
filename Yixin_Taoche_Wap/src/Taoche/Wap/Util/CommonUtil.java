package Taoche.Wap.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class CommonUtil {
	public static int GetResponseCode(String URL) throws Exception {

		URL u = new URL(URL);

		HttpURLConnection uConnection = (HttpURLConnection) u.openConnection();
		uConnection.connect();
		int ResponseCode = uConnection.getResponseCode();
		//System.out.println(ResponseCode);
		
		// 注释代码用于获取页面源码内容，上面报错注释可以先不删，要不打开这段代码还需重新引
		/*InputStream is = uConnection.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();
		while (br.read() != -1) {
			sb.append(br.readLine());
		}
		String content = new String(sb);
		content = new String(content.getBytes("GBK"), "ISO-8859-1");
		System.out.println(content);
		br.close();*/
		
		return ResponseCode;

	}
}
