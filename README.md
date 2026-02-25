# TravelBooking Automation Testing Report

## Project details
|  |  |
| --- | --- |
| Project Name | travelbooking automation |
| Application Name | [yatra](https://www.yatra.com/) |
| Version | v1.0 |
| Test Environment | QA |
| Starting Date | 25 Feb 2026 |
| Prepared By | TesticalTesters |

---

## Requirement analysis
Objective: To test travel booking application

### Functional Requirements
- User should be able to search hotels.
- User should be able to search available flights.

### Non-Functional Requirements
- Page load time < 5 secounds
- Application should support Chrome, Firefox
- Proper error handling

---

## Modoules
- Hotel Booking Module
- Flight Booking Module

---

## Test case development
### Hotel Booking Scenario 1
When the use provides valid hotel search data. the correct data should be displayed.

### Hotel Booking Scenario 2
When checkout date is less than check in date, then the checkin date should be updated and checkout date should be empty.

### Hotel Booking Scenario 3
When checkout date is same as check in date, then an error message should popup.

### Hotel Booking Scenario 4
When the difference of checkin and checkout date is greater than 15 nights. it should show error popup.

### Hotel Booking Scenario 5
When the user selects 'n' children then they should see 'n' input options for the age of thier children.

### Hotel Booking Scenario 6
When the user clicks on add room button. new room selection menu should be visible.

### Hotel Booking Scenario 7
When the user clicks on remove room button. the new added room should be removed.

### Flight Booking Scenario 1

---

## Timeline

- Requirement analysis
- Test plan
- Test Case Development
- Test Environment Setup
- Test Excution
