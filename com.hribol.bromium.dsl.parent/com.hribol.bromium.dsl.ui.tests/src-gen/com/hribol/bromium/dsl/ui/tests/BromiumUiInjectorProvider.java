/*
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.ui.tests;

import com.google.inject.Injector;
import com.hribol.bromium.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class BromiumUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("com.hribol.bromium.dsl.Bromium");
	}

}
