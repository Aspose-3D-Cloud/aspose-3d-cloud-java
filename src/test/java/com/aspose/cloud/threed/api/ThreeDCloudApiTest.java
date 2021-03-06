/*
 * Aspose.ThreeD Cloud API Reference
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.aspose.cloud.threed.api;
import com.aspose.cloud.threed.client.ApiClient;
import com.aspose.cloud.threed.client.ApiException;
import com.aspose.cloud.threed.client.ApiResponse;
import com.aspose.cloud.threed.client.Configuration;


import com.aspose.cloud.threed.model.AccessTokenResponse;
import com.aspose.cloud.threed.model.DiscUsage;
import com.aspose.cloud.threed.model.Entity;

import java.io.File;
import com.aspose.cloud.threed.model.FileVersions;
import com.aspose.cloud.threed.model.FilesList;
import com.aspose.cloud.threed.model.FilesUploadResult;
import com.aspose.cloud.threed.model.ModelData;
import com.aspose.cloud.threed.model.ObjectExist;
import com.aspose.cloud.threed.model.HTMLSaveOption;
import com.aspose.cloud.threed.model.SaveFormat;
import com.aspose.cloud.threed.model.SaveOptions;
import com.aspose.cloud.threed.model.StorageExist;
import com.aspose.cloud.threed.model.Torus;
import com.aspose.cloud.threed.model.Transform;
import com.aspose.cloud.threed.model.Vector3;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * API tests for ThreeDCloudApi
 */
//@Ignore
public class ThreeDCloudApiTest extends ThreeDBaseTest{

	private ThreeDCloudApi threeDCloudApi = GetThreeDCloudApi();  
	
	public ThreeDCloudApiTest() throws ApiException {
		super();

	}
	
	
    /**
     * Copy file Test 
     * @throws ApiException if the Api call fails
     */
    @Test
    public void copyFileTest() throws ApiException {
        String srcPath = "3DTest\\Aspose.pdf";
        String destPath = "3DTest\\Aspose.java.pdf";
        String srcStorageName = null;
        String destStorageName = null;
        String versionId = null;
        ApiResponse<Void> response = threeDCloudApi.copyFileWithHttpInfo(srcPath, destPath, srcStorageName, destStorageName, versionId);
        Assert.assertEquals(response.getStatusCode(),200);
    } 
    
    /**
     * Copy folder Test 
     * @throws ApiException if the Api call fails
     */
    @Test
    public void copyFolderTest() throws ApiException {
    	String srcPath = "3DTest";
        String destPath = "3DTestJava";
        String srcStorageName = null;
        String destStorageName = null;
        ApiResponse<Void> response = threeDCloudApi.copyFolderWithHttpInfo(srcPath, destPath, srcStorageName, destStorageName);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Create folder Test 
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createFolderTest() throws ApiException {
        String path = "3DTestJava2";
        String storageName = null;        
        ApiResponse<Void> response = threeDCloudApi.createFolderWithHttpInfo(path, storageName);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Delete file Test
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFileTest() throws ApiException {
        ///String path = "3DTestJava/Aspose.pdf";
    	String path = "3DTestJava\\Aspose3D.java.pdf";
        String storageName = null;
        String versionId = null;        
        ApiResponse<Void> response = threeDCloudApi.deleteFileWithHttpInfo(path, storageName, versionId);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Delete folder Test
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFolderTest() throws ApiException {
        String path ="3DTestJava";
        String storageName = null;
        Boolean recursive = true;
        ApiResponse<Void> response = threeDCloudApi.deleteFolderWithHttpInfo(path, storageName, recursive);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Delete nodes from scene,nodes are addressed by Object Addressing Path
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteNodesTest() throws ApiException {
    	
    	String name = "oaptest.pdf";
    	String objectaddressingpath = "//*[(@Type = 'Camera') or (@Name = 'light')]";
    	String folder = "3DTest";
    	String storageName = "First Storage";
    	ApiResponse<File> response = threeDCloudApi.deleteNodesWithHttpInfo(name, objectaddressingpath, folder, storageName);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Download file from specific storage 
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadFileTest() throws ApiException {
        String path = "3DTest\\Aspose.pdf";
        String storageName = null;
        String versionId = null;
        File response = threeDCloudApi.downloadFile(path, storageName, versionId);
        Assert.assertTrue(response.isFile());
    }
    
    /**
     * Get disc usage
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDiscUsageTest() throws ApiException {
        String storageName = null;
        ApiResponse<DiscUsage> response = threeDCloudApi.getDiscUsageWithHttpInfo(storageName);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Get file versions 
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFileVersionsTest() throws ApiException {
 
        String path = "3DTest\\Aspose.pdf";
        String storageName = null;
        ApiResponse<FileVersions> response = threeDCloudApi.getFileVersionsWithHttpInfo(path, storageName);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Get all files and folders within a folder
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFilesListTest() throws ApiException {
        String path = "3DTestCOPY";
        String storageName = null;
        ApiResponse<FilesList> response = threeDCloudApi.getFilesListWithHttpInfo(path, storageName);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Move file
     * @throws ApiException if the Api call fails
     */
    @Test
    public void moveFileTest() throws ApiException {
        String srcPath = "3DTest\\Aspose.java.pdf";
        String destPath = "3DTestDest\\Aspose.pdf";
        String srcStorageName = null;
        String destStorageName = null;
        String versionId = null;
        ApiResponse<Void> response = threeDCloudApi.moveFileWithHttpInfo(srcPath, destPath, srcStorageName, destStorageName, versionId);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Move folder
     * @throws ApiException if the Api call fails
     */
    @Test
    public void moveFolderTest() throws ApiException {
        String srcPath = "3DTestJava";
        String destPath = "3DTestJava2";
        String srcStorageName = null;
        String destStorageName = null;
        ApiResponse<Void> response = threeDCloudApi.moveFolderWithHttpInfo(srcPath, destPath, srcStorageName, destStorageName);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Get Access token
     * @throws ApiException if the Api call fails
     */
    @Test
    public void oAuthPostTest() throws ApiException {
        String grantType = "client_credentials";
        String clientId = "threed.cloud";
        String clientSecret = "threed.cloud";;
        /*specially handling*/
        threeDCloudApi.getApiClient().setBasePath("https://api.aspose.cloud/");
        /*specially handling end*/
        ApiResponse<AccessTokenResponse> response = threeDCloudApi.oAuthPostWithHttpInfo(grantType, clientId, clientSecret);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Check if file or folder exists
     * @throws ApiException if the Api call fails
     */
    @Test
    public void objectExistsTest() throws ApiException {
        String path = "3DTest\\Aspose.pdf";
        String storageName = null;
        String versionId = null;
        ApiResponse<ObjectExist> response = threeDCloudApi.objectExistsWithHttpInfo(path, storageName, versionId);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Convert file on server to other formats with fileformat parameter             
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postConvertByFormatTest() throws ApiException {
        String name = "Aspose.pdf";
        String newformat = "pdf";
        String newfilename = "saveasformat.pdf";;
        String folder = "3DTest";
        Boolean isOverwrite = true;
        String storage = null;
        ApiResponse<File> response = threeDCloudApi.postConvertByFormatWithHttpInfo(name, newformat, newfilename, folder, isOverwrite, storage);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Convert file on server to other formats with saveOption parameter             
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postConvertByOptTest() throws ApiException {
        String name =  "Aspose.pdf";
        HTMLSaveOption saveopt = new HTMLSaveOption();       
        saveopt.setSaveFormat(SaveFormat.HTML);
        //FileSystem fs = new FileSystem();       
        //saveopt.setFileSystem(fs);
        //fs.setFileSystemType(FileSystemType.NUMBER_0);
        //List<String> positionComponents  = Arrays.asList("y","x","z");
        //saveopt.setPositionComponents(positionComponents);      
        String newfilename = "saveasOptS.pdf";
        String folder =  "3DTest";
        Boolean isOverwrite = true;
        String storage = null;
        ApiResponse<File> response = threeDCloudApi.postConvertByOptWithHttpInfo(name, saveopt, newfilename, folder, isOverwrite, storage);
        Assert.assertEquals(response.getStatusCode(),200);
	}

	/**
     * Create new file with specified format.
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCreateTest() throws ApiException {
        String format = "pdf";
        ApiResponse<File> response = threeDCloudApi.postCreateWithHttpInfo(format);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Parametric Modeling, Create a Entity 
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postModelTest() throws ApiException {
        String name = "Aspose.pdf";
        String newformat = "pdf";
        String folder = "3DTest";
        String storage = null;     
        ModelData modeldata = new ModelData();
        modeldata.setTransform(new Transform());
        modeldata.getTransform().setTranslation(new Vector3());
        modeldata.getTransform().getTranslation().setX((double) 100);
        modeldata.getTransform().getTranslation().setY((double) 100);
        modeldata.getTransform().getTranslation().setZ((double) 100);
        //modeldata.Transform.Translation.Length2 = 0;
        //modeldata.Transform.Translation.Length = 0;
        modeldata.setEntity(new Entity());
        modeldata.getEntity().setTorus(new Torus());
        modeldata.getEntity().getTorus().setRadius((double)10);
        modeldata.getEntity().getTorus().setTube((double)10);
        modeldata.getEntity().getTorus().setRadialSegments((Integer)10);
        modeldata.getEntity().getTorus().setTubularSegments((Integer)10);
        ApiResponse<File> response = threeDCloudApi.postModelWithHttpInfo(name, modeldata, newformat, folder, storage);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Extract raw data(without any modification) from a password protected PDF file             
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postPdfRawDataTest() throws ApiException {
    	
    	String name = "extracttest.pdf";
    	String multifileprefix = "rawdata";
        String password = "";
        String folder = "3DTest";
        String storage = null;
        ApiResponse<File> response = threeDCloudApi.postPdfRawDataWithHttpInfo(name, multifileprefix, password, folder, storage);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Convert part of the file into different format
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postSaveAsPartTest() throws ApiException {
        String name = "parttest.fbx";
        String objectaddressingpath = "a1";
        String newformat = "pdf";
        String newfilename = "saveaspart.pdf";
        String folder = "3DTest"; ;
        Boolean isOverwrite = true;
        String storage = null;
        ApiResponse<File> response = threeDCloudApi.postSaveAsPartWithHttpInfo(name, objectaddressingpath, newformat, newfilename, folder, isOverwrite, storage);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Extract and save in different format             
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postSceneToFileTest() throws ApiException {
        String name = "extracttest.pdf";
        String multifileprefix = "newScene";
        String newformat = "pdf";
        String password = null;
        String folder = "3DTest";
        String storage = null;
        ApiResponse<File> response = threeDCloudApi.postSceneToFileWithHttpInfo(name, multifileprefix, newformat, password, folder, storage);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Triangulate whole file and save to the different file
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postTriangulateNewTest() throws ApiException {
        String name = "triangulate.3ds";
        String newfilename = "triangulateNew";
        String newformat = "pdf";
        String folder = "3DTest";
        String storage = null;
        ApiResponse<File> response = threeDCloudApi.postTriangulateNewWithHttpInfo(name, newfilename, newformat, folder, storage);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Triangulate whole file and save to original file
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postTriangulateOriginalTest() throws ApiException {
        String name = "triangulate.3ds";
        String folder = "3DTest";
        String storage = null;
        ApiResponse<File> response = threeDCloudApi.postTriangulateOriginalWithHttpInfo(name, folder, storage);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Check if storage exists
     * @throws ApiException if the Api call fails
     */
    @Test
    public void storageExistsTest() throws ApiException {
        /* NOTE: here storageName can not be null*/
        String storageName = "Fist Storage";/*here can not be null*/
        ApiResponse<StorageExist> response = threeDCloudApi.storageExistsWithHttpInfo(storageName);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    /**
     * Upload file
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadFileTest() throws ApiException {
        File file = new File(ThreeDBaseTest.GetSourceFolder());
        String path  = "3DTestDest\\AsposeUpload_Java.pdf";;
        String storageName = null;                       
        ApiResponse<FilesUploadResult> response = threeDCloudApi.uploadFileWithHttpInfo(path, file, storageName);
        Assert.assertEquals(response.getStatusCode(),200);
    }  
}
