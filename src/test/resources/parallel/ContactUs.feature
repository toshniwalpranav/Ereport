Feature: Contact Us Feature

Scenario Outline: Contact Us scenario with differnet set of data
Given user navigate to contact us page
When user fill the form from given sheetname "<SheetName>" and rownumber <RowNumber>
Then user click on send button 

Examples:
|SheetName|RowNumber|
|contactus|0|
|contactus|1|