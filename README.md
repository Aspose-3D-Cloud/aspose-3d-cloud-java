[Aspose.3D Cloud](https://products.aspose.cloud/3D) contains Aspose.3D Cloud SDK for Java source code. This SDK allows you to work with Aspose.3D Cloud REST APIs in your java applications quickly and easily.

To use this SDK, you will need App SID and App Key which can be looked up at [Aspose Cloud Dashboard](https://dashboard.aspose.cloud/#/apps) (free registration in Aspose Cloud is required for this).


# Key Features

- Conversion between various document-related formats (10+ formats supported)

- Modeling and Data Processing,including parametric modeling and delete object from scene 

- Utilities,including extract 3D contens from PDF file and triangulate meshes 



See [API Reference](https://apireference.aspose.cloud/3d/) for full API specification.



# File,folder and storage API support


It gives you an ability to:

- Upload, download, copy, move and delete files, including versions handling (if you are using Cloud storage that supports this feature - true by default)
- Create, copy, move and delete folders
- Copy and move files and folders accross separate storages in scope of a single operation
- Check if certain file, folder or storage exists

# Licensing

All Aspose.3D Cloud SDKs are licensed under [MIT License](https://github.com/aspose-3d-cloud/aspose-3d-cloud-dotnet/blob/master/LICENSE).

# How to use the SDK?

## Installation & Usage

 

Add this dependency to your project's POM:


```
<repositories>
    <repository>
        <id>AsposeJavaAPI</id>
        <name>Aspose Java API</name>
        <url>https://repository.aspose.cloud/repo/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.aspose</groupId>
        <artifactId>aspose-3d-cloud</artifactId>
        <version>19.11</version>
    </dependency>
</dependencies>
```

## Getting Started

 

```
import com.aspose.cloud.threed.api.ThreeDCloudApi;
import com.aspose.cloud.threed.client.ApiException;
import com.aspose.cloud.threed.client.ApiResponse;

public class App 
{
		private static String grantType = "client_credentials"; 
		private static String clientId = "****yourAppid****";
		private static String clientSecret = "****yourAppKey****";
    public static void main( String[] args ) throws ApiException
    {
	
				ThreeDCloudApi threeDCloudApi = new ThreeDCloudApi(grantType,clientId,clientSecret);
				String srcPath = "3DTest\\Aspose.pdf";
				String destPath = "3DTest\\Aspose.javaNew2.pdf";
				String srcStorageName = null;
				String destStorageName = null;
				String versionId = null;
				ApiResponse<Void> response = threeDCloudApi.copyFileWithHttpInfo(srcPath, destPath, srcStorageName, destStorageName, versionId);
				```
    }
}
```

[Tests](https://github.com/Aspose-3D-Cloud/aspose-3D-cloud-java/tree/master/src/test/java/com/aspose/cloud/threed/api) contain various examples of using the SDK.



# Contact Us

Your feedback is very important to us. Please feel free to contact via

- [**Free Support Forum**](https://forum.aspose.cloud/c/3d)
- [**Paid Support Helpdesk**](https://helpdesk.aspose.cloud/)

# Resources

- [**Web API reference**](https://apireference.aspose.cloud/3d/)
- [**Website**](https://www.aspose.cloud)
- [**Product Home**](https://products.aspose.cloud/3d)
- [**Documentation**](https://docs.aspose.cloud/display/3dcloud/Home)
- [**Blog**](https://blog.aspose.cloud/category/3d/)