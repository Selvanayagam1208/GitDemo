Feature: Flight Ticket Booking
@ticketpage
Scenario: Checking flights available for ticket booking

	   Given User is on greencart landing page
    When User fill details of ticket booking
    	| India  |
    	|  chennai  |
    	| Goa |
    When user clicks the search button
    Then User should navigate and verify available flights	

	
					
 #cucumber.ansi-colors.disabled=  # true or false. default: false
#cucumber.execution.dry-run=     # true or false. default: false
#cucumber.execution.limit=       # number of scenarios to execute (CLI only).
#cucumber.execution.order=       # lexical, reverse, random or random:[seed] (CLI only). default: lexical
#cucumber.execution.wip=         # true or false. default: false.
#cucumber.features=              # comma separated paths to feature files. example: path/to/example.feature, path/to/other.feature
#cucumber.filter.name=           # regex. example: .*Hello.*
#cucumber.filter.tags=           # tag expression. example: @smoke and not @slow
#cucumber.glue=                  # comma separated package names. example: com.example.glue
#cucumber.plugin=                # comma separated plugin strings. example: pretty, json:path/to/report.json
#cucumber.object-factory=        # object factory class name. example: com.example.MyObjectFactory
#cucumber.snippet-type=          # underscore or camelcase. default: underscore
 