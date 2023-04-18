#!/bin/sh
echo "------ Step 01: Set project path to variable -------"
project_path="/Users/admin/Library/Mobile Documents/com~apple~CloudDocs/Downloads/Selenium_Online_28/03-Java Hybrid Framework/hybrid-framework-nopcommerce"
echo "------ Step 02: Go to project path folder -------"
cd "$project_path"
echo "------ Step 03: Run the testcases -------"
java -javaagent:"${project_loc}/libraryAllureReport/aspectjweaver-1.9.8.jar"" -classpath "$project_path/bin:$project_path/libraryAllureReport/*:$project_path/libraryLog4J/*:$project_path/libraryReportNG/*:$project_path/libraryWebDriverManager/*:$project_path/librarySelenium/*" org.testng.TestNG "$project_path/bin/runTechPandaTestcases.xml"
echo "------ Step 04: Load allure command line setting -------"
source ~/.bash_profile
echo "------ Step 05: Generate Allure HTML Report -------"
allure serve ./allure-results/