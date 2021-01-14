![](https://img.shields.io/badge/REST%20API-v3.0-lightgrey) [![GitHub license](https://img.shields.io/github/license/aspose-3d-cloud/aspose-3d-cloud-java)](https://github.com/aspose-3d-cloud/aspose-3d-cloud-java/blob/master/LICENSE) ![GitHub last commit](https://img.shields.io/github/last-commit/Aspose-3D-Cloud/aspose-3d-cloud-java)

# Java SDK for 3D File Formats

Java SDK wraps Aspose.3D Cloud APIs so you could create, edit and convert 3D files in your cloud-based Java applications with zero initial cost.

## Process 3D Objects & Files in the Cloud

- [Convert between 3D formats](https://docs.aspose.cloud/3d/converting-between-formats-using-aspose-3d-cloud/) without requring any additional tools or rendering software.
- Modeling and data processing, including parametric modeling and object deletion from scene.
- Utilities such as extract 3D contens from PDF file and triangulate meshes.

## Read & Write 3D Formats

AMF, 3DS, RVM, DRC, DAE, DXF, FBX, OBJ, PDF, PLY, STL, U3D, GLTF, HTML

## Read-Only Formats

JT, X (DirectX), 3MF, ASE

## Integrated Storage API

It gives you an ability to:

- Upload, download, copy, move and delete files, including versions handling (if you are using Cloud storage that supports this feature - true by default).
- Create, copy, move and delete folders.
- Copy and move files and folders accross separate storages in scope of a single operation.
- Check if certain file, folder or storage exists.

## Enhancements Version 20.5
- Added support to read/write more file formats.
- Added support for HTML file format conversion.
- New feature added to Triangulate part of the scene (Specified by OAP) and save the scene to a different file.

## Get Started with Aspose.3D Cloud SDK for Java

Register an account at [Aspose Cloud Dashboard](https://dashboard.aspose.cloud/#/apps) to get you application information. Next, add the following dependency to your project's POM to automatically fetch the required artifacts.

```
<repositories>
    <repository>
        <id>AsposeJavaAPI</id>
        <name>Aspose Java API</name>
        <url>https://repository.aspose.cloud/repo/</url>
    </repository>
</repositories>
```
```
<dependencies>
    <dependency>
        <groupId>com.aspose</groupId>
        <artifactId>aspose-3d-cloud</artifactId>
        <version>20.5</version>
    </dependency>
</dependencies>
```

## Extract Scene from a 3D File

```java
const string name = "extracttest.pdf";
const string multifileprefix = "newScene";
const string newformat = "pdf";
const string password = null;
const string folder = "3DTest";
string storage = null;
var response = threeDCloudApi.PostSceneToFileWithHttpInfo(name, multifileprefix, newformat, password, folder, storage);
Console.WriteLine(response);
```

## Aspose.3D Cloud SDKs in Popular Languages

| .NET | PHP | Python | Ruby | Node.js | Swift | Perl | GO |
|---|---|---|---|---|---|---|---|
| [GitHub](https://github.com/aspose-3d-cloud/aspose-3d-cloud-dotnet) | [GitHub](https://github.com/Aspose-3D-Cloud/aspose-3d-cloud-php) | [GitHub](https://github.com/Aspose-3D-Cloud/aspose-3d-cloud-python) | [GitHub](https://github.com/Aspose-3D-Cloud/aspose-3d-cloud-ruby)  | [GitHub](https://github.com/Aspose-3D-Cloud/aspose-3d-cloud-node) | [GitHub](https://github.com/aspose-3d-cloud/aspose-3d-cloud-swift) | [GitHub](https://github.com/Aspose-3D-Cloud/aspose-3d-cloud-perl) | [GitHub](https://github.com/Aspose-3D-Cloud/aspose-3d-cloud-go) |
| [NuGet](https://www.nuget.org/packages/Aspose.3D-Cloud/) | [Composer](https://packagist.org/packages/aspose/3d-sdk-php) | [PIP](https://pypi.org/project/aspose3dcloud/) | [GEM](https://rubygems.org/gems/aspose_3d_cloud)  | [NPM](https://www.npmjs.com/package/aspose3dcloud) | [POD](https://cocoapods.org/pods/Aspose3DCloud) |  [CPAN](https://metacpan.org/release/AsposeThreeDCloud-ThreeDCloudApi) | [GO](https://pkg.go.dev/github.com/Aspose-3D-Cloud/aspose-3d-cloud-go/v20?tab=overview) |

[Home](https://www.aspose.cloud) | [Product Page](https://products.aspose.cloud/3d/java) | [Documentation](https://docs.aspose.cloud/3d/) | [Live Demo](https://products.aspose.app/3d/family) | [API Reference](https://apireference.aspose.cloud/3d/) | [Code Samples](https://github.com/Aspose-3D-Cloud/aspose-3D-cloud-java/tree/master/src/test/java/com/aspose/cloud/threed/api) | [Blog](https://blog.aspose.cloud/category/3d/) | [Free Support](https://forum.aspose.cloud/c/3d) | [Free Trial](https://dashboard.aspose.cloud/#/apps)
