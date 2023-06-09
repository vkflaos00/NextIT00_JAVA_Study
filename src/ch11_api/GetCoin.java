package ch11_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetCoin {

	public static void main(String[] args) throws IOException, ParseException {
		String url = "https://api.upbit.com/v1/market/all";
		String url_detail = "https://api.upbit.com/v1/ticker?markets=KRW-BTC";
		try {
			URL call_url = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) call_url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json");
			if (connection.getResponseCode() != 200) {
				throw new RuntimeException("failed: " + connection.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder result = new StringBuilder();
			String line;
			while ((line = br.readLine()) != null) {
				result.append(line);
			}
			// JSONParser를 이용해 파싱
			System.out.println("JSON response:" + result.toString());
			JSONParser parser = new JSONParser();
			JSONArray arr = (JSONArray) parser.parse(result.toString());
			System.out.println("JsonArray:" + arr.toJSONString());
			for (Object obj : arr) {
				JSONObject jsonObj = (JSONObject) obj;
				System.out.println(jsonObj.get("korean_name") + ":" + jsonObj.get("market"));
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		   search(url_detail);

	}

	public static void search(String detail) {
	    Scanner scan = new Scanner(System.in);
	    while (true) {
	        System.out.print("코인정보입력: ");
	        String command = scan.nextLine();
	        if(command.isEmpty()) {
	            System.out.println("미입력");
	            continue;
	        }
	        String url_detail = "https://api.upbit.com/v1/ticker?markets=" + command;
	        try {
	            URL call_url = new URL(url_detail);
	            HttpURLConnection connection = (HttpURLConnection) call_url.openConnection();
	            connection.setRequestMethod("GET");
	            connection.setRequestProperty("Accept", "application/json");

	            if (connection.getResponseCode() != 200) {
	                System.out.println("정보없음");
	                continue;
	            }

	            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	            StringBuilder result = new StringBuilder();
	            String line;
	            while ((line = br.readLine()) != null) {
	                result.append(line);
	            }

	            // JSONParser를 이용해 파싱
//	            System.out.println("JSON response:" + result.toString());
	            JSONParser parser = new JSONParser();
	            JSONArray arr = (JSONArray) parser.parse(result.toString());
//	            System.out.println("JsonArray:" + arr.toJSONString());
	            for (Object obj : arr) {
	                JSONObject jsonObj = (JSONObject) obj;
	                System.out.println("trade_price:" + jsonObj.get("trade_price"));
	            }

	            connection.disconnect();

	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	    }
	}

}
