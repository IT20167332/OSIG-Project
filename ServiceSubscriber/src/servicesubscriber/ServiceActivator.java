package servicesubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import itemServicepublisher.ServicePublish;
import mainmenuservicepublisher.MainServicePublish;

public class ServiceActivator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Start Subscribe Service");
		serviceReference = bundleContext.getServiceReference(ServicePublish.class.getName());
		ServicePublish servicePublish = (ServicePublish) bundleContext.getService(serviceReference);
		
		serviceReference = bundleContext.getServiceReference(MainServicePublish.class.getName());
		MainServicePublish servicePublish2 = (MainServicePublish) bundleContext.getService(serviceReference);
		
		servicePublish2.publishService(servicePublish);
		//servicePublish.ItemMenu();
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Good bye!");
		bundleContext.ungetService(serviceReference);
	}
	
	
}
