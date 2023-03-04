package itemServicepublisher;
import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("publisher start");
		ServicePublish publishService = new ServicePublishImpl();
		publishServiceRegistration = bundleContext.registerService(
				ServicePublish.class.getName(), publishService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("publisher Stop!");
		publishServiceRegistration.unregister();
	}

}
