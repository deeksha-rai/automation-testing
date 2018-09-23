Feature:Attitude Matters

In order to understand Attitude
As a working guy
I Want to know whom to greet 



@tester

Scenario Outline: I am an Employee and his attitude

Given I work in Latenights
When I meet watchmen
Then I Greeted him

Given I work in Morning
When I meet NewsPaperBoy
Then I skipGreeting him


Given we work in "<WeekDay>"
When we meet "<guy>"
Then I skip greeting

Examples:
|weekday| guy     |
|tenpm  |watchman |
|ninepm |cabdriver| 


