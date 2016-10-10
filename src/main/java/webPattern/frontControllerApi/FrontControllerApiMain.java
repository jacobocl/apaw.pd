package webPattern.frontControllerApi;

import web.http.HttpMethod;
import web.http.HttpRequest;
import web.http.HttpResponse;

public class FrontControllerApiMain {

	public void request(String path, HttpMethod method) {
		HttpRequest request = new HttpRequest(path, method);
		request.addQueryParam("param", "value");
		System.out.println(request.toString() + "\n");
		HttpResponse response = new Server().request(request);
		System.out.println("\n" + response);
	}

	public static void main(String[] args) {
		FrontControllerApiMain main = new FrontControllerApiMain();
		// Petición autorizada
		main.request("path1", HttpMethod.GET);
		System.out.println("\n-----------------------------ooo------------------------------\n");
		// Petición autorizada
		main.request("path2", HttpMethod.GET);
		System.out.println("\n-----------------------------ooo------------------------------\n");
		// Petición autorizada
        main.request("path3", HttpMethod.GET);
        System.out.println("\n-----------------------------ooo------------------------------\n");
        // Petición no existente
        main.request("path6", HttpMethod.GET);
        System.out.println("\n-----------------------------ooo------------------------------\n");
		// Petición autorizada
		main.request("path1", HttpMethod.POST);
		System.out.println("\n-----------------------------ooo------------------------------\n");
		// Petición autorizada
		main.request("path3", HttpMethod.POST);
		System.out.println("\n-----------------------------ooo------------------------------\n");
		// Petición autorizada
        main.request("path8", HttpMethod.POST);
        System.out.println("\n-----------------------------ooo------------------------------\n");
        // Petición no existente
        main.request("path4", HttpMethod.POST);
        System.out.println("\n-----------------------------ooo------------------------------\n");
	}
}
