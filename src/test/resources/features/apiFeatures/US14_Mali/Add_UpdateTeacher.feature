Feature: US14 ViceDean Add-Update Teacher API
  @Api
  Scenario: TC01 Teacher Post-Put Request
    Given User create Teacher by Post Request
    Then Validate the posted datas with response
    Given  User update datas with posted teacher id by put request
    Then Validate the updated datas with response

