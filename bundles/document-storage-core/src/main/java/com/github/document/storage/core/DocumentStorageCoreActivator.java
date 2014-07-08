package com.github.document.storage.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;

public class DocumentStorageCoreActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		LogService log = getLogService(context);
		log.log(LogService.LOG_INFO, "Bundle started!");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		LogService log = getLogService(context);
		log.log(LogService.LOG_INFO, "Bundle stopped!");
	}

	private LogService getLogService(BundleContext context) {
		final ServiceReference<LogService> ref = context
				.getServiceReference(LogService.class);
		LogService log = null;
		if (ref != null) {
			log = context.getService(ref);
		}
		return log;
	}

}
