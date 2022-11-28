package brainly
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class bddbrainly {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("i want to login brainly")
	def  i_want_to_login_brainly() {
		Mobile.startExistingApplication('co.brainly')
	}

	@When("i want to  ask in the application")
	def  i_want_to_ask_in_the_application() {
		Mobile.tap(findTestObject('Object Repository/BraunltRegressiontest/android.widget.ImageView'), 0)
		
		Mobile.setText(findTestObject('Object Repository/BraunltRegressiontest/android.widget.EditText - Mulai tuliskan pertanyaanmu'),
			'apa kah yang dimaksud mamalia', 0)
		
		Mobile.tap(findTestObject('Object Repository/BraunltRegressiontest/android.widget.TextView - 2 jawaban'), 0)
		
		Mobile.tap(findTestObject('Object Repository/BraunltRegressiontest/android.widget.ImageView (1)'), 0)
		
		Mobile.tap(findTestObject('Object Repository/BraunltRegressiontest/android.widget.ImageView (2)'), 0)
	}

	@Then("i want to repeat the question")
	def  i_want_to_repeat_the_question() {
		Mobile.setText(findTestObject('BraunltRegressiontest/android.widget.EditText - Mulai tuliskan pertanyaanmu'), 'apakah yang dimaksud kemerdekaan',
			0)
		
		Mobile.tap(findTestObject('Object Repository/BraunltRegressiontest/android.widget.ImageView (3)'), 0)
		
		Mobile.tap(findTestObject('Object Repository/BraunltRegressiontest/android.widget.ImageView (4)'), 0)
		
		Mobile.tap(findTestObject('Object Repository/BraunltRegressiontest/android.widget.ImageView (5)'), 0)
		
		Mobile.closeApplication()
	}
}