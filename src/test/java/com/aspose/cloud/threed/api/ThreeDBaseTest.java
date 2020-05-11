package com.aspose.cloud.threed.api;

import com.aspose.cloud.threed.client.ApiClient;
import com.aspose.cloud.threed.client.ApiException;
import com.aspose.cloud.threed.model.AccessTokenResponse;

public class ThreeDBaseTest {
 
    protected ThreeDCloudApi threeDCloudApi;
   
	private static String accesstoken;
	private static String grantType = "client_credentials";
	private static String clientId = "*****your AppID*****";
	private static String clientSecret = "*****your AppKey*****";
	private static String sourceFolder ="E:\\Cloud\\src\\java\\testData\\Aspose.pdf";
	public static String GetSourceFolder() {
		return sourceFolder;
	}
	public static String GetGrantType() {
		return grantType;
	}

	public static String GetClientId() {
		return clientId;
	}

	public static String GetClientSecret() {
		return clientSecret;
	}

	protected ThreeDCloudApi GetThreeDCloudApi() throws ApiException {
		if (threeDCloudApi == null) {
			threeDCloudApi = new ThreeDCloudApi(grantType, clientId, clientSecret);
		}
		return threeDCloudApi;
	}
/*	
    public ThreeDBaseTest()
    {
    	threeDCloudApi = new ThreeDCloudApi(); 
    	threeDCloudApi.setApiClient(this.Ready());
    }        
 
	public static String GetAccessToken() {
		try {
			if (accesstoken == null || accesstoken == "") {
				System.out.println("--------------------------");
				ApiClient apiClient = new ApiClient();
				apiClient.setBasePath("https://api.aspose.cloud");
				ThreeDCloudApi oauth2 = new ThreeDCloudApi();
				oauth2.setApiClient(apiClient);
				AccessTokenResponse accessTokenResponse = oauth2.oAuthPost(grantType, clientId, clientSecret);
				accesstoken = accessTokenResponse.getAccessToken();
				System.out.println(accesstoken);
				System.out.println("--------------------------");
			}

		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accesstoken;
	}

	public static ApiClient Ready() {
		ThreeDCloudApi apiTask = new ThreeDCloudApi();
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath("https://api.aspose.cloud/v3.0");
		apiClient.addDefaultHeader("Authorization", "Bearer " + GetAccessToken());
		apiTask.setApiClient(apiClient);
		return apiClient;
	}
	*/
}
