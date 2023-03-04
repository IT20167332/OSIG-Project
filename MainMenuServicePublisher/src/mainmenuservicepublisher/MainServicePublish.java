package mainmenuservicepublisher;

import org.osgi.framework.ServiceReference;

import itemServicepublisher.ServicePublish;

public interface MainServicePublish {
	public String publishService(ServicePublish serviceReference);
}
