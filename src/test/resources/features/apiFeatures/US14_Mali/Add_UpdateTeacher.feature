Feature: US14 ViceDean Add-Update Teacher API
  @us14mali
  Scenario: TC01 Teacher Post-Put Request
    Given User create Teacher by Post Request
    Then Verify the posted datas with response
    Given  User update datas with posted teacher id by put request
    Then Verify the updated datas with response


