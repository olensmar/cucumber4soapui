Feature: SoapUI

Scenario: System Properties
Given SoapUI is running
And no dialogs are visible
When I select System Properties from the Help menu
Then the System Properties dialog is shown

Scenario Outline: Menu Options
Given SoapUI is running
And no dialogs are visible
When I select <menuItem> from the <menu> menu
Then the <dialog> dialog is shown

Examples: Menus
    | menu | menuItem | dialog  |
    | Help | About soapUI | About soapUI  |
    | Tools | JBossWS Artifacts | JBossWS Artifacts |