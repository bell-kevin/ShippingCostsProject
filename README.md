# ShippingCostsProject
SDEV 1060 Project. DATC. Davis Tech. Davis Technical College. Kaysville, Utah. Final Project. Automated unit-testing. OOP

The Final Project tests your competency in the topics of this course. Be sure to read the instructions carefully -- ask the instructor questions if you need clarification. As with Module Competency projects, you must do this project on your own, without help about coding from the instructor or students.

This project calculates shipping costs based on 2 pieces of information: the weight of the package and the distance to the delivery point. The shipping cost is the result of multiplying those 2 factors. The factors are based on these tables:


Weight of Package 	                        Weight Factor 		    Distance to Ship 	                        Distance Factor
Less than 10.0 pounds 	                    2.50 		              Less than 100.0 miles 	                  2.0
Less than 25.0 pounds 	                    10.0 		              Less than 500.0 miles 	                  5.0
Greater than or equal to 25.0 pounds 	      25.0 		              Greater than or equal to 500.0 miles 	    10.0

For example, if the package weighs 5 pounds, the weight factor is 2.50. If the shipping distance is 50 miles, the distance factor is 2.0. The shipping cost is therefore 2.5 * 2.0 = $5.00.

First, create a table of test cases to determine the correct results. You need at least one "happy path" case for each of the categories in the table above -- one with weight less than 10 pounds, one with weight between 10 and 25 pounds, one with weight greater than 25 pounds, also one with distance less than 100 miles, one with distance between 100 and 500 miles, one with distance greater than 500 miles. You need to test all combinations -- for a package that weighs less than 10 pounds (first weight category), you will need 3 tests, one for each distance category; for a package in the second weight category, you will need 3 more tests, one for each distance category; for a package in the third weight category, you will need 3 more tests, one for each distance category. 
Weight 	             Miles 	                  Weight 	            Miles 	                Weight 	              Miles
Weight < 10 pounds 	 Distance < 100 miles 	  Weight < 25 pounds 	Distance < 100 miles 	  Weight >= 25 pounds 	Distance < 100 miles
Weight < 10 pounds 	 Distance < 500 miles 	  Weight < 25 pounds 	Distance < 500 miles 	  Weight >= 25 pounds 	Distance < 500 miles
Weight < 10 pounds 	 Distance >= 500 miles 	  Weight < 25 pounds 	Distance >= 500 miles 	Weight >= 25 pounds 	Distance >= 500 miles

That is 9 tests for the happy path, at a minimum. 

Add boundary and edge tests as well -- 9.9 pounds and 10.0 pounds, for example, at the first boundary for the weight of the package. These weights need to be tested with all 3 distances as well. You should have at least 1 test number in the middle (happy path) of each category and at least 2 edge tests (between the 1st and 2nd categories, and between the 2nd and 3rd categories). That will be 3 happy path numbers and 4 edge numbers, or 7 numbers to test for weights and 7 numbers to test for distances.  The table should have at least 49 entries in it to test valid data.

Create the test table in Excel or Word, to be submitted with this assignment.

Create the project. You don't need a class, you can create the calculation methods in the Main file below the Main class. You don't need to create any code in the Main class, but you can create the complete project with the user interface if you like. The user interface would ask the user for the weight of the package, and for the distance to ship, then run the calculation methods to determine the shipping cost, and display it.

There must be 3 methods to do calculations -- one method calculates the weight factor, another method calculates the distance factor, another method calculates the cost based on those 2 factors.

Create unit tests for each method. Use test runners in each unit test. For the methods to calculate factors (weight factor and distance factor), include the correct result in the data for the test runner. For the method to calculate the cost, the data needs to include weight and weight factor, distance and distance factor; in the test method, calculate the total cost by multiplying the weight factor and the distance factor to get the expected result.

For Java projects, create a test suite to run multiple tests in one run.

Take a screenshot showing a successful test. Take screenshots of the calculation methods and of the unit test code.

 

Submission: table of test cases document, specified screenshots and the root folder for the project

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
