# TacCase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the TAC Case |  [optional]
**href** | **String** | Hyperlink, a reference to the TAC Case entity |  [optional]
**caseNumber** | **String** | Same as ID, requested by customer |  [optional]
**caseStatus** | [**TacCaseStatus**](TacCaseStatus.md) |  |  [optional]
**rmaNeeded** | **Boolean** | TAC indicates RMA is required |  [optional]
**subject** | **String** | Subject of TAC Case |  [optional]
**relatedRmaCount** | **Integer** | Number of RMAs related to this TAC Case |  [optional]
**relatedDispatchCount** | **Integer** | Number of dispatches related to this TAC Case |  [optional]
**problemDescription** | **String** | A description of the problem assocated with this TAC Case |  [optional]
**installationCountry** | **String** |  |  [optional]
**firstResponseDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of first response from the TAC to this Case |  [optional]
**customerTrackingNumber** | **String** | A Reference to the customer&#x27;s issue associated with this Case |  [optional]
**contactEmail** | **String** | The email of the customer contact related to this Case |  [optional]
**productName** | **String** | The name of the product associated with this TAC Case |  [optional]
**productSerialNumber** | **String** | The serial number of the product associcated with this TAC Case |  [optional]
**productFirmwareVersion** | **String** | The version number of the product associcated with this TAC Case |  [optional]
**productSoftwareVersion** | **String** | The version number of the product associcated with this TAC Case |  [optional]
**caseSolutionDescription** | **String** | A general summary of the solution to this Case |  [optional]
**casePriority** | [**CasePriorityEnum**](#CasePriorityEnum) | The priorty assigned by TAC to this Case |  [optional]
**caseOwner** | **String** | The TAC name associated with the ownership of this Case |  [optional]
**caseNoteCount** | **Integer** | The number of notes associated with this Case |  [optional]
**caseCreatedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date this Case was created by Customer |  [optional]
**caseClosedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date this Case was closed by Customer or TAC |  [optional]
**businessImpact** | **String** | The impact to the customer&#x27;s business associated with this Case |  [optional]
**accountNumber** | **String** | The customer&#x27;s account number associated with this ticket |  [optional]
**notes** | [**List&lt;Note&gt;**](Note.md) |  |  [optional]

<a name="CasePriorityEnum"></a>
## Enum: CasePriorityEnum
Name | Value
---- | -----
CRITICAL | &quot;Critical&quot;
MAJOR | &quot;Major&quot;
MINOR | &quot;Minor&quot;
