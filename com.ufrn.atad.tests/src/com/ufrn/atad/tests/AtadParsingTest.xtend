/*
 * generated by Xtext 2.25.0
 */
package com.ufrn.atad.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import com.ufrn.atad.atad.DeclaraComando

@ExtendWith(InjectionExtension)
@InjectWith(AtadInjectorProvider)
class AtadParsingTest {
	@Inject
	ParseHelper<DeclaraComando> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Quando clicar em teste
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: ?errors.join(", ")?''')
	}
}
