package mainmenuservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Main publisher start");
		MainServicePublish publishService = new MainServicePublishImpl();
		publishServiceRegistration = bundleContext.registerService(
				MainServicePublish.class.getName(), publishService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Main publisher Stop!");
		publishServiceRegistration.unregister();
	}


}
