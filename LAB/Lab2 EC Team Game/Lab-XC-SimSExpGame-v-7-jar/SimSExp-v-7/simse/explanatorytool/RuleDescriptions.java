/* File generated by: simse.codegenerator.explanatorytoolgenerator.RuleDescriptionsGenerator */
package simse.explanatorytool;

public class RuleDescriptions {
static final String CREATEUSERSTORIES_INCNUMUSERSTORIES = "As the user stories are written, the number of user stories written increases at a rate dependent on the experience of the participating developers. If the customer is involved in writing the user stories, they will be written five times faster (without the customer invovled, the developers will have a hard time figuring out what they want!)";
static final String RELEASEPLANNINGMEETING_INCRELEASEPLANCOMPLETENESS = "The completeness of the release plan increases at a rate dependent on the experience of the developers involved.";
static final String RELEASEPLANNINGMEETING_SETUSERSTORIESPRIORITIZED = "User stories are set to prioritized=yes as the release planning meeting is finished. Prioritizing user stories in order of importance is a major activity in a release planning meeting.";
static final String CHOOSEUSERSTORIESFORITERATION_INCITERATIONPLANCOMPLETENESSUSERSTORIES = "The completeness of the iteration plan increases at a rate dependent on the developers' experience. If the customer was involved in the release planning meeting, this speed of completion increases, as much of the iteration plan will have already been hashed out between the customers and the develoeprs in the release planning meeting.";
static final String CREATEPROGRAMMINGTASKS_INCITERATIONPLANCOMPLETNESSPROTASKS = "The completeness of the iteration plan increases at a rate dependent on the developers' experience. If the customer was involved in the release planning meeting, this speed of completion increases, as much of the iteration plan will have already been hashed out between the customers and the develoeprs in the release planning meeting.";
static final String CREATEACCEPTANCETESTS_INCCOMPLETENESSACCTESTS = "The completeness of the acceptance tests are increased at a rate dependent on the experience of the developers. If the customer is involved, the rate of completion increases.";
static final String DESIGN_INCDESIGNCOMPLETENESS = "The completeness of the design increases at a rate dependent on the experience of the developers. If the acceptance tests have already been created, design will go twice as fast, as the developers will be able to practice test-driven development (using the acceptance tests as a guide to development).";
static final String CREATEUNITTESTS_INCCOMPLETENESSUNITTESTS = "The completeness of the unit tests is increased at a rate dependent on the experience of the developers. If a unit testing framework is used, this rate is twice as fast.";
static final String LEARNCODINGSTANDARD_INCREASECODINGSTANDARDKNOWLEDGE = "As the developer studies the coding standard, his/her knowledge of the coding standard increases.";
static final String PROGRAM_INCCODECOMPLETENESSPROGRAM = "As the developers program, the completeness of the code increases at a rate dependent on the experience of the developers, the completeness of the unit tests (more complete -> faster development), and the completeness of the design (more complete -> faster development). ";
static final String PROGRAM_SETCODEPERCENTERRONEOUSPROGRAM = "The number of errors in the code is set based on the completeness of the design and the completeness of the unit tests cases (more complete -> less errors, as both design and unit test development guide the coding process). The baseline PercentErroneous for this action is 12, meaning that even in the best cases, the code will be 12% erroneous before it is tested.";
static final String PAIRPROGRAMROBERTJOYCE_INCCODECOMPLETENESSPAIRPROGRAMRJ = "As the developers pair program, the completeness of the code increases at a rate dependent on the experience of the developers, the completeness of the unit tests (more complete -> faster development), and the completeness of the design (more complete -> faster development). ";
static final String PAIRPROGRAMROBERTJOYCE_SETCODEPERCENTERRONEOUSPAIRPROGRAMRJ = "The number of errors in the code is set based on the completeness of the design and the completeness of the unit tests cases (more complete -> less errors, as both design and unit test development guide the coding process). The baseline PercentErroneous for this action is 6, meaning that even in the best cases, the code will be 6% erroneous before it is tested.";
static final String PAIRPROGRAMTIMOTHYREDA_INCCODECOMPLETENESSPAIRPROGRAMTR = "As the developers pair program, the completeness of the code increases at a rate dependent on the experience of the developers, the completeness of the unit tests (more complete -> faster development), and the completeness of the design (more complete -> faster development). ";
static final String PAIRPROGRAMTIMOTHYREDA_SETCODEPERCENTERRONEOUSPAIRPROGRAMTR = "The number of errors in the code is set based on the completeness of the design and the completeness of the unit tests cases (more complete -> less errors, as both design and unit test development guide the coding process). The baseline PercentErroneous for this action is 6, meaning that even in the best cases, the code will be 6% erroneous before it is tested.";
static final String PAIRPROGRAMPEGSIGFREIDO_INCCODECOMPLETENESSPAIRPROGRAMPS = "As the developers pair program, the completeness of the code increases at a rate dependent on the experience of the developers, the completeness of the unit tests (more complete -> faster development), and the completeness of the design (more complete -> faster development). ";
static final String PAIRPROGRAMPEGSIGFREIDO_SETCODEPERCENTERRONEOUSPAIRPROGRAMPS = "The number of errors in the code is set based on the completeness of the design and the completeness of the unit tests cases (more complete -> less errors, as both design and unit test development guide the coding process). The baseline PercentErroneous for this action is 6, meaning that even in the best cases, the code will be 6% erroneous before it is tested.";
static final String UNITTESTINGANDFIXING_REMOVEERRORSFROMCODE = "Errors are removed from the code at a rate dependent on the developers' software development experience, how much the coding standard was used in the development of the code (used more -> faster unit testing and fixing), whether or not a testing framework tool was used to create the unit tests (tool used -> faster unit testing and fixing), and whether or not a testing framework tool is being used in unit testing and fixing (tool used -> faster).";
static final String REFACTOR_INCPERCENTREFACTORED = "The code is refactored at a rate dependent on the experience of the developers, how many errors are in the code (more errors -> slower refactoring), how much the coding standard was used in creating the code (coding standard used -> faster refactoring), and whether or not a refactoring tool is being used (tool used -> faster refactoring).";
static final String REFACTOR_INCNUMERRORSREFACTOR = "Employees introduce some new errors into the code as they refactor. The number of errors in the code increases at a rate dependent on the experience of the developers, whether or not the developers who originally developed the code knew the coding standard (coding standard used -> less errors), whether or not a refactoring tool is being used (tool used -> less errors), and the number of errors that currently exist in the code (more existing errors -> more errors introduced as a result of refactoring).";
static final String INTEGRATEROBERTJOYCE_INCPERCENTINTEGRATEDCODERJ = "As Robert and Joyce integrate the code they developed with the rest of the system, the percent integrated of the code increases at a rate dependent on the developers' experience, the number of errors in the code (more errors -> slower integration), how much refactoring was done on the code (more refactored -> faster integration), and whether or not the developers who originally developed the code knew the coding standard (coding standard used -> faster integration).";
static final String INTEGRATEROBERTJOYCE_INCNUMERRORSINTEGRATERJ = "As Robert and Joyce integrate their code with the rest of the system, they introduce some integration errors into the code at a rate dependent on their software development experience, the number of errors in the code (more existing errors -> leads to more integration errors), and how much the code was refactored (more refactored -> less integration errors).";
static final String INTEGRATETIMOTHYREDA_INCPERCENTINTEGRATEDCODETR = "As Timothy and Reda integrate the code they developed with the rest of the system, the percent integrated of the code increases at a rate dependent on the developers' experience, the number of errors in the code (more errors -> slower integration), how much refactoring was done on the code (more refactored -> faster integration), and whether or not the developers who originally developed the code knew the coding standard (coding standard used -> faster integration).";
static final String INTEGRATETIMOTHYREDA_INCNUMERRORSINTEGRATETR = "As Timothy and Reda integrate their code with the rest of the system, they introduce some integration errors into the code at a rate dependent on their software development experience, the number of errors in the code (more existing errors -> leads to more integration errors), and how much the code was refactored (more refactored -> less integration errors).";
static final String INTEGRATEPEGSIGFREIDO_INCPERCENTINTEGRATEDCODEPS = "As Peg and Sigfreido integrate the code they developed with the rest of the system, the percent integrated of the code increases at a rate dependent on the developers' experience, the number of errors in the code (more errors -> slower integration), how much refactoring was done on the code (more refactored -> faster integration), and whether or not the developers who originally developed the code knew the coding standard (coding standard used -> faster integration).";
static final String INTEGRATEPEGSIGFREIDO_INCNUMERRORSINTEGRATEPS = "As Peg and Sigfreido integrate their code with the rest of the system, they introduce some integration errors into the code at a rate dependent on their software development experience, the number of errors in the code (more existing errors -> leads to more integration errors), and how much the code was refactored (more refactored -> less integration errors).";
static final String INTEGRATE_INCPERCENTINTEGRATEDCODE = "As the developers integrate the code with the rest of the system, the percent integrated of the code increases at a rate dependent on the developers' experience, the number of errors in the code (more errors -> slower integration), how much refactoring was done on the code (more refactored -> faster integration), and whether or not the developers who originally developed the code knew the coding standard (coding standard used -> faster integration).";
static final String INTEGRATE_INCNUMERRORSINTEGRATE = "As the employees integrate the code with the rest of the system, they introduce some integration errors into the code at a rate dependent on their software development experience, the number of errors in the code (more existing errors -> leads to more integration errors), and how much the code was refactored (more refactored -> less integration errors).";
static final String ACCEPTANCETESTING_INCACCEPTANCETESTRUN = "As the developers and customer engage in acceptance testing, the number of acceptance tests run increases at a rate dependent upon the experience of the developers.";
static final String ACCEPTANCETESTING_SETNUMFAILEDTESTS = "The number of acceptance tests that fail is set based on whether or not the customer was involved in the creation of the acceptance test cases (customer involved -> less failed tests), as well as whether or not the code has any bugs in it (more bugs -> more failed tests).";
static final String ACCEPTANCETESTING_SETCODEPCNTERRONEOUSACCTESTING = "Any acceptance tests that fail reveal errors in the code, or places where there was a misunderstanding with the customer about what functionality was expected.";
static final String REQUIRERELEASEPLANDOOVER_RESETRELEASEPLANCOMPLETENESS = "The release plan completeness is set to 0.";
static final String REQUIRERELEASEPLANDOOVER_DEACTIVATEOTHERACTIONS = "The developers are \"frozen\" from progress in all of their other actions until the release plan is redone.";
static final String REQUIRERELEASEPLANDOOVER_REACTIVATEOTHERACTIONS = "Developers are \"unfrozen\" from all of their other actions.";
static final String GAMEOVER_CALCULATESCORE = "The score is calculated based on how complete and correct the product is.";
}