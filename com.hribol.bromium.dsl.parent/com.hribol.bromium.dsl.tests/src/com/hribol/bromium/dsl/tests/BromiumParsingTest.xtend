/*
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl.tests

import com.google.inject.Inject
import com.hribol.bromium.dsl.bromium.Model
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.validation.IResourceValidator
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import java.util.List
import org.eclipse.xtext.validation.Issue

@RunWith(XtextRunner)
@InjectWith(BromiumInjectorProvider)
class BromiumParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Inject
	IResourceValidator validator
	
	@Test
	def void scopingOfExposedParameters() {
		val result = parseHelper.parse('''
			name 'Example name'
			version '8.2.5'
			actions {
				id typeIntoUsernameField
			    syntax 'Type ' content 'into username field'
				type content in element with css selector '#login' 
				do not expect http request
				
				id clickOnLoginButton
				syntax 'Click on login button'
				click on element with css selector content
				do not expect http request
				
			}
		''')
		
		
		val issues = validator.validate(result.eResource, CheckMode.ALL, CancelIndicator.NullImpl)
	
		Assert.assertFalse(issues.empty)
	}
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			name 'Demo app'
			version '0.1.0'
			actions {
				id loadLoginPage
				syntax 'Load login page'
				load page '/login'
				do expect http request
			
				id typeUsername
				syntax 'Type username'
				type "admin" in element with css selector "#user"
				do not expect http request
			
				id typePassword
				syntax 'Type password'
				type "admin" in element with css selector "#pass"
				do not expect http request
			
				id clickLoginButton
				syntax 'Click login button'
				click on element with css selector "#login"
				do expect http request
			}
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
