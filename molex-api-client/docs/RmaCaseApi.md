# RmaCaseApi

All URIs are relative to *https://virtserver.swaggerhub.com/MolexDev/tac-cases-openapi-3.0/0.0.6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRmaCaseNote**](RmaCaseApi.md#createRmaCaseNote) | **POST** /rmaCases/{caseNumber}/notes | Creates a note assocated with a RMA Case
[**createTacRma**](RmaCaseApi.md#createTacRma) | **POST** /rmaCases | Creates an RMA
[**getRmaCaseAttachments**](RmaCaseApi.md#getRmaCaseAttachments) | **GET** /rmaCases/{caseNumber}/attachments | Get a list of attachments for a specific RMA case
[**getRmaCaseNotes**](RmaCaseApi.md#getRmaCaseNotes) | **GET** /rmaCases/{caseNumber}/notes | Get notes for a specific RMA
[**listRmaCases**](RmaCaseApi.md#listRmaCases) | **GET** /rmaCases | List or find RMA Cases
[**retrieveRmaCase**](RmaCaseApi.md#retrieveRmaCase) | **GET** /rmaCases/{caseNumber} | Retrieves an RMA Case by ID
[**retrieveRmaCaseAttachment**](RmaCaseApi.md#retrieveRmaCaseAttachment) | **GET** /rmaCases/{caseNumber}/attachments/{id} | Retrieves an RMA Case Attachment by ID
[**retrieveRmaCaseNote**](RmaCaseApi.md#retrieveRmaCaseNote) | **GET** /rmaCases/{caseNumber}/notes/{id} | Retrieves an RMA Case Note by ID
[**updateRmaCase**](RmaCaseApi.md#updateRmaCase) | **PUT** /rmaCases/{caseNumber} | Updates an RMA Case by ID
[**updateRmaCaseNote**](RmaCaseApi.md#updateRmaCaseNote) | **PUT** /rmaCases/{caseNumber}/notes/{id} | Updates an RMA Case Note by ID
[**uploadRmaCaseAttachment**](RmaCaseApi.md#uploadRmaCaseAttachment) | **POST** /rmaCases/{caseNumber}/attachments | Upload an attachment to a specific RMA case

<a name="createRmaCaseNote"></a>
# **createRmaCaseNote**
> Note createRmaCaseNote(body, caseNumber)

Creates a note assocated with a RMA Case

This operation creates adds a Case Note to a TAC Case

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RmaCaseApi;


RmaCaseApi apiInstance = new RmaCaseApi();
NoteCreate body = new NoteCreate(); // NoteCreate | The TroubleTicket to be created
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
try {
    Note result = apiInstance.createRmaCaseNote(body, caseNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RmaCaseApi#createRmaCaseNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NoteCreate**](NoteCreate.md)| The TroubleTicket to be created |
 **caseNumber** | **String**| Identifier of the Case. This may be an alias for the ID of the proxied Case. |

### Return type

[**Note**](Note.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="createTacRma"></a>
# **createTacRma**
> RmaCase createTacRma(body)

Creates an RMA

This operation creates a tacRma entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RmaCaseApi;


RmaCaseApi apiInstance = new RmaCaseApi();
RmaCaseCreate body = new RmaCaseCreate(); // RmaCaseCreate | The TroubleTicket to be created
try {
    RmaCase result = apiInstance.createTacRma(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RmaCaseApi#createTacRma");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RmaCaseCreate**](RmaCaseCreate.md)| The TroubleTicket to be created |

### Return type

[**RmaCase**](RmaCase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getRmaCaseAttachments"></a>
# **getRmaCaseAttachments**
> List&lt;Attachment&gt; getRmaCaseAttachments(caseNumber, offset, limit)

Get a list of attachments for a specific RMA case

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RmaCaseApi;


RmaCaseApi apiInstance = new RmaCaseApi();
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
Integer offset = 56; // Integer | Requested index for start of items to be provided in response
Integer limit = 56; // Integer | Requested number of items to be provided in response
try {
    List<Attachment> result = apiInstance.getRmaCaseAttachments(caseNumber, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RmaCaseApi#getRmaCaseAttachments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseNumber** | **String**| Identifier of the Case. This may be an alias for the ID of the proxied Case. |
 **offset** | **Integer**| Requested index for start of items to be provided in response | [optional]
 **limit** | **Integer**| Requested number of items to be provided in response | [optional]

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="getRmaCaseNotes"></a>
# **getRmaCaseNotes**
> List&lt;Note&gt; getRmaCaseNotes(caseNumber, offset, limit, createdFrom, createdTo, createdSince)

Get notes for a specific RMA

Retrieve a list of notes attached to a specific RMA Case by its case number.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RmaCaseApi;


RmaCaseApi apiInstance = new RmaCaseApi();
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
Integer offset = 56; // Integer | Requested index for start of items to be provided in response
Integer limit = 56; // Integer | Requested number of items to be provided in response
OffsetDateTime createdFrom = new OffsetDateTime(); // OffsetDateTime | Beginning date portion of a date range query to search for a matching set of items
OffsetDateTime createdTo = new OffsetDateTime(); // OffsetDateTime | Ending date portion of a date range query to search for a matching set of items
OffsetDateTime createdSince = new OffsetDateTime(); // OffsetDateTime | Retrieve the set of items created since this date
try {
    List<Note> result = apiInstance.getRmaCaseNotes(caseNumber, offset, limit, createdFrom, createdTo, createdSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RmaCaseApi#getRmaCaseNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseNumber** | **String**| Identifier of the Case. This may be an alias for the ID of the proxied Case. |
 **offset** | **Integer**| Requested index for start of items to be provided in response | [optional]
 **limit** | **Integer**| Requested number of items to be provided in response | [optional]
 **createdFrom** | **OffsetDateTime**| Beginning date portion of a date range query to search for a matching set of items | [optional]
 **createdTo** | **OffsetDateTime**| Ending date portion of a date range query to search for a matching set of items | [optional]
 **createdSince** | **OffsetDateTime**| Retrieve the set of items created since this date | [optional]

### Return type

[**List&lt;Note&gt;**](Note.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json;charset=utf-8

<a name="listRmaCases"></a>
# **listRmaCases**
> List&lt;RmaCase&gt; listRmaCases(fields, offset, limit, createdFrom, createdTo, createdSince, caseStatus, vendorRmaNumber, includeNotes)

List or find RMA Cases

This operation list or find RMA Cases

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RmaCaseApi;


RmaCaseApi apiInstance = new RmaCaseApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of items to be provided in response
Integer limit = 56; // Integer | Requested number of items to be provided in response
OffsetDateTime createdFrom = new OffsetDateTime(); // OffsetDateTime | Beginning date portion of a date range query to search for a matching set of items
OffsetDateTime createdTo = new OffsetDateTime(); // OffsetDateTime | Ending date portion of a date range query to search for a matching set of items
OffsetDateTime createdSince = new OffsetDateTime(); // OffsetDateTime | Retrieve the set of items created since this date
TacCaseStatus caseStatus = new TacCaseStatus(); // TacCaseStatus | Retrieve the set of cases with this status
String vendorRmaNumber = "vendorRmaNumber_example"; // String | Retrieve the set of cases with this RMA number
Boolean includeNotes = false; // Boolean | Use this flag to include Case Notes
try {
    List<RmaCase> result = apiInstance.listRmaCases(fields, offset, limit, createdFrom, createdTo, createdSince, caseStatus, vendorRmaNumber, includeNotes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RmaCaseApi#listRmaCases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Comma-separated properties to be provided in response | [optional]
 **offset** | **Integer**| Requested index for start of items to be provided in response | [optional]
 **limit** | **Integer**| Requested number of items to be provided in response | [optional]
 **createdFrom** | **OffsetDateTime**| Beginning date portion of a date range query to search for a matching set of items | [optional]
 **createdTo** | **OffsetDateTime**| Ending date portion of a date range query to search for a matching set of items | [optional]
 **createdSince** | **OffsetDateTime**| Retrieve the set of items created since this date | [optional]
 **caseStatus** | [**TacCaseStatus**](.md)| Retrieve the set of cases with this status | [optional]
 **vendorRmaNumber** | **String**| Retrieve the set of cases with this RMA number | [optional]
 **includeNotes** | **Boolean**| Use this flag to include Case Notes | [optional] [default to false]

### Return type

[**List&lt;RmaCase&gt;**](RmaCase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="retrieveRmaCase"></a>
# **retrieveRmaCase**
> RmaCase retrieveRmaCase(caseNumber, fields, includeNotes)

Retrieves an RMA Case by ID

This operation retrieves a RmaCase entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RmaCaseApi;


RmaCaseApi apiInstance = new RmaCaseApi();
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Boolean includeNotes = false; // Boolean | Use this flag to include Case Notes
try {
    RmaCase result = apiInstance.retrieveRmaCase(caseNumber, fields, includeNotes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RmaCaseApi#retrieveRmaCase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseNumber** | **String**| Identifier of the Case. This may be an alias for the ID of the proxied Case. |
 **fields** | **String**| Comma-separated properties to be provided in response | [optional]
 **includeNotes** | **Boolean**| Use this flag to include Case Notes | [optional] [default to false]

### Return type

[**RmaCase**](RmaCase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="retrieveRmaCaseAttachment"></a>
# **retrieveRmaCaseAttachment**
> List&lt;Attachment&gt; retrieveRmaCaseAttachment(caseNumber, id)

Retrieves an RMA Case Attachment by ID

This operation retrieves an RMA Case Attachment

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RmaCaseApi;


RmaCaseApi apiInstance = new RmaCaseApi();
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
String id = "id_example"; // String | The unique identifier of an entity.
try {
    List<Attachment> result = apiInstance.retrieveRmaCaseAttachment(caseNumber, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RmaCaseApi#retrieveRmaCaseAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseNumber** | **String**| Identifier of the Case. This may be an alias for the ID of the proxied Case. |
 **id** | **String**| The unique identifier of an entity. |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="retrieveRmaCaseNote"></a>
# **retrieveRmaCaseNote**
> Note retrieveRmaCaseNote(caseNumber, id)

Retrieves an RMA Case Note by ID

This operation retrieves an RMA CaseNote. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RmaCaseApi;


RmaCaseApi apiInstance = new RmaCaseApi();
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
String id = "id_example"; // String | The unique identifier of an entity.
try {
    Note result = apiInstance.retrieveRmaCaseNote(caseNumber, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RmaCaseApi#retrieveRmaCaseNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseNumber** | **String**| Identifier of the Case. This may be an alias for the ID of the proxied Case. |
 **id** | **String**| The unique identifier of an entity. |

### Return type

[**Note**](Note.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="updateRmaCase"></a>
# **updateRmaCase**
> updateRmaCase(body, caseNumber)

Updates an RMA Case by ID

This operation updates a RmaCase entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RmaCaseApi;


RmaCaseApi apiInstance = new RmaCaseApi();
RmaCase body = new RmaCase(); // RmaCase | Updated the associated RMA Case
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
try {
    apiInstance.updateRmaCase(body, caseNumber);
} catch (ApiException e) {
    System.err.println("Exception when calling RmaCaseApi#updateRmaCase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RmaCase**](RmaCase.md)| Updated the associated RMA Case |
 **caseNumber** | **String**| Identifier of the Case. This may be an alias for the ID of the proxied Case. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateRmaCaseNote"></a>
# **updateRmaCaseNote**
> updateRmaCaseNote(body, caseNumber, id)

Updates an RMA Case Note by ID

This operation updates an RMA Case Note. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RmaCaseApi;


RmaCaseApi apiInstance = new RmaCaseApi();
Note body = new Note(); // Note | Updated the associated TAC Case
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
String id = "id_example"; // String | The unique identifier of an entity.
try {
    apiInstance.updateRmaCaseNote(body, caseNumber, id);
} catch (ApiException e) {
    System.err.println("Exception when calling RmaCaseApi#updateRmaCaseNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Note**](Note.md)| Updated the associated TAC Case |
 **caseNumber** | **String**| Identifier of the Case. This may be an alias for the ID of the proxied Case. |
 **id** | **String**| The unique identifier of an entity. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="uploadRmaCaseAttachment"></a>
# **uploadRmaCaseAttachment**
> InlineResponse201 uploadRmaCaseAttachment(file, description, caseNumber)

Upload an attachment to a specific RMA case

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RmaCaseApi;


RmaCaseApi apiInstance = new RmaCaseApi();
File file = new File("file_example"); // File | 
String description = "description_example"; // String | 
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
try {
    InlineResponse201 result = apiInstance.uploadRmaCaseAttachment(file, description, caseNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RmaCaseApi#uploadRmaCaseAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |
 **description** | **String**|  |
 **caseNumber** | **String**| Identifier of the Case. This may be an alias for the ID of the proxied Case. |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=utf-8

