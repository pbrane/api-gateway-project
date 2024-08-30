# TacCaseApi

All URIs are relative to *https://virtserver.swaggerhub.com/MolexDev/tac-cases-openapi-3.0/0.0.6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTacCase**](TacCaseApi.md#createTacCase) | **POST** /tacCases | Creates a TAC Case
[**createTacCaseNote**](TacCaseApi.md#createTacCaseNote) | **POST** /tacCases/{caseNumber}/notes | Creates a note assocated with a TAC Case
[**getTacCaseAttachments**](TacCaseApi.md#getTacCaseAttachments) | **GET** /tacCases/{caseNumber}/attachments | Get a list of attachments for a specific TAC case
[**getTacCaseNotes**](TacCaseApi.md#getTacCaseNotes) | **GET** /tacCases/{caseNumber}/notes | Get notes for a specific TAC Case
[**listTacCases**](TacCaseApi.md#listTacCases) | **GET** /tacCases | List or find TAC Cases
[**retrieveTacCase**](TacCaseApi.md#retrieveTacCase) | **GET** /tacCases/{caseNumber} | Retrieves a TAC Case by ID
[**retrieveTacCaseAttachment**](TacCaseApi.md#retrieveTacCaseAttachment) | **GET** /tacCases/{caseNumber}/attachments/{id} | Retrieves a TAC Case Attachment by ID
[**retrieveTacCaseNote**](TacCaseApi.md#retrieveTacCaseNote) | **GET** /tacCases/{caseNumber}/notes/{id} | Retrieves a TAC Case Note by ID
[**updateTacCase**](TacCaseApi.md#updateTacCase) | **PUT** /tacCases/{caseNumber} | Updates a TAC Case by ID
[**updateTacCaseNote**](TacCaseApi.md#updateTacCaseNote) | **PUT** /tacCases/{caseNumber}/notes/{id} | Updates a TAC Case Note by ID
[**uploadTacCaseAttachment**](TacCaseApi.md#uploadTacCaseAttachment) | **POST** /tacCases/{caseNumber}/attachments | Upload an attachment to a specific TAC case

<a name="createTacCase"></a>
# **createTacCase**
> TacCase createTacCase(body)

Creates a TAC Case

This operation creates a tacCase entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TacCaseApi;


TacCaseApi apiInstance = new TacCaseApi();
TacCaseCreate body = new TacCaseCreate(); // TacCaseCreate | The TroubleTicket to be created
try {
    TacCase result = apiInstance.createTacCase(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TacCaseApi#createTacCase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TacCaseCreate**](TacCaseCreate.md)| The TroubleTicket to be created |

### Return type

[**TacCase**](TacCase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="createTacCaseNote"></a>
# **createTacCaseNote**
> Note createTacCaseNote(body, caseNumber)

Creates a note assocated with a TAC Case

This operation creates adds a Case Note to a TAC Case

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TacCaseApi;


TacCaseApi apiInstance = new TacCaseApi();
NoteCreate body = new NoteCreate(); // NoteCreate | The TroubleTicket to be created
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
try {
    Note result = apiInstance.createTacCaseNote(body, caseNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TacCaseApi#createTacCaseNote");
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

<a name="getTacCaseAttachments"></a>
# **getTacCaseAttachments**
> List&lt;Attachment&gt; getTacCaseAttachments(caseNumber, offset, limit)

Get a list of attachments for a specific TAC case

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TacCaseApi;


TacCaseApi apiInstance = new TacCaseApi();
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
Integer offset = 56; // Integer | Requested index for start of items to be provided in response
Integer limit = 56; // Integer | Requested number of items to be provided in response
try {
    List<Attachment> result = apiInstance.getTacCaseAttachments(caseNumber, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TacCaseApi#getTacCaseAttachments");
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

<a name="getTacCaseNotes"></a>
# **getTacCaseNotes**
> List&lt;Note&gt; getTacCaseNotes(caseNumber, offset, limit, createdFrom, createdTo, createdSince)

Get notes for a specific TAC Case

Retrieve a list of notes attached to a specific item by its TAC Case Number.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TacCaseApi;


TacCaseApi apiInstance = new TacCaseApi();
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
Integer offset = 56; // Integer | Requested index for start of items to be provided in response
Integer limit = 56; // Integer | Requested number of items to be provided in response
OffsetDateTime createdFrom = new OffsetDateTime(); // OffsetDateTime | Beginning date portion of a date range query to search for a matching set of items
OffsetDateTime createdTo = new OffsetDateTime(); // OffsetDateTime | Ending date portion of a date range query to search for a matching set of items
OffsetDateTime createdSince = new OffsetDateTime(); // OffsetDateTime | Retrieve the set of items created since this date
try {
    List<Note> result = apiInstance.getTacCaseNotes(caseNumber, offset, limit, createdFrom, createdTo, createdSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TacCaseApi#getTacCaseNotes");
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

<a name="listTacCases"></a>
# **listTacCases**
> List&lt;TacCase&gt; listTacCases(fields, offset, limit, createdFrom, createdTo, createdSince, caseStatus, includeNotes)

List or find TAC Cases

This operation list or find TACCase entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TacCaseApi;


TacCaseApi apiInstance = new TacCaseApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of items to be provided in response
Integer limit = 56; // Integer | Requested number of items to be provided in response
OffsetDateTime createdFrom = new OffsetDateTime(); // OffsetDateTime | Beginning date portion of a date range query to search for a matching set of items
OffsetDateTime createdTo = new OffsetDateTime(); // OffsetDateTime | Ending date portion of a date range query to search for a matching set of items
OffsetDateTime createdSince = new OffsetDateTime(); // OffsetDateTime | Retrieve the set of items created since this date
TacCaseStatus caseStatus = new TacCaseStatus(); // TacCaseStatus | Retrieve the set of cases with this status
Boolean includeNotes = false; // Boolean | Use this flag to include Case Notes
try {
    List<TacCase> result = apiInstance.listTacCases(fields, offset, limit, createdFrom, createdTo, createdSince, caseStatus, includeNotes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TacCaseApi#listTacCases");
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
 **includeNotes** | **Boolean**| Use this flag to include Case Notes | [optional] [default to false]

### Return type

[**List&lt;TacCase&gt;**](TacCase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="retrieveTacCase"></a>
# **retrieveTacCase**
> TacCase retrieveTacCase(caseNumber, fields, includeNotes)

Retrieves a TAC Case by ID

This operation retrieves a tacCase entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TacCaseApi;


TacCaseApi apiInstance = new TacCaseApi();
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Boolean includeNotes = false; // Boolean | Use this flag to include Case Notes
try {
    TacCase result = apiInstance.retrieveTacCase(caseNumber, fields, includeNotes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TacCaseApi#retrieveTacCase");
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

[**TacCase**](TacCase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="retrieveTacCaseAttachment"></a>
# **retrieveTacCaseAttachment**
> List&lt;Attachment&gt; retrieveTacCaseAttachment(caseNumber, id, fields)

Retrieves a TAC Case Attachment by ID

This operation retrieves an TAC Case Attachment

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TacCaseApi;


TacCaseApi apiInstance = new TacCaseApi();
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
String id = "id_example"; // String | The unique identifier of an entity.
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
try {
    List<Attachment> result = apiInstance.retrieveTacCaseAttachment(caseNumber, id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TacCaseApi#retrieveTacCaseAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseNumber** | **String**| Identifier of the Case. This may be an alias for the ID of the proxied Case. |
 **id** | **String**| The unique identifier of an entity. |
 **fields** | **String**| Comma-separated properties to be provided in response | [optional]

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="retrieveTacCaseNote"></a>
# **retrieveTacCaseNote**
> Note retrieveTacCaseNote(caseNumber, id)

Retrieves a TAC Case Note by ID

This operation retrieves a CaseNote entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TacCaseApi;


TacCaseApi apiInstance = new TacCaseApi();
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
String id = "id_example"; // String | The unique identifier of an entity.
try {
    Note result = apiInstance.retrieveTacCaseNote(caseNumber, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TacCaseApi#retrieveTacCaseNote");
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

<a name="updateTacCase"></a>
# **updateTacCase**
> updateTacCase(body, caseNumber)

Updates a TAC Case by ID

This operation updates a tacCase entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TacCaseApi;


TacCaseApi apiInstance = new TacCaseApi();
TacCase body = new TacCase(); // TacCase | Updated the associated TAC Case
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
try {
    apiInstance.updateTacCase(body, caseNumber);
} catch (ApiException e) {
    System.err.println("Exception when calling TacCaseApi#updateTacCase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TacCase**](TacCase.md)| Updated the associated TAC Case |
 **caseNumber** | **String**| Identifier of the Case. This may be an alias for the ID of the proxied Case. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateTacCaseNote"></a>
# **updateTacCaseNote**
> updateTacCaseNote(body, caseNumber, id)

Updates a TAC Case Note by ID

This operation updates a TAC Case Note. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TacCaseApi;


TacCaseApi apiInstance = new TacCaseApi();
Note body = new Note(); // Note | Updated the associated TAC Case
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
String id = "id_example"; // String | The unique identifier of an entity.
try {
    apiInstance.updateTacCaseNote(body, caseNumber, id);
} catch (ApiException e) {
    System.err.println("Exception when calling TacCaseApi#updateTacCaseNote");
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

<a name="uploadTacCaseAttachment"></a>
# **uploadTacCaseAttachment**
> InlineResponse201 uploadTacCaseAttachment(file, description, caseNumber)

Upload an attachment to a specific TAC case

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TacCaseApi;


TacCaseApi apiInstance = new TacCaseApi();
File file = new File("file_example"); // File | 
String description = "description_example"; // String | 
String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
try {
    InlineResponse201 result = apiInstance.uploadTacCaseAttachment(file, description, caseNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TacCaseApi#uploadTacCaseAttachment");
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

