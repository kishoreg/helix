package com.linkedin.helix;

import org.apache.log4j.Logger;

public class MockNodeFactory {
	
	private static final Logger logger = Logger.getLogger(MockNodeFactory.class);
	
	public MockNodeFactory()
	{
	}
	
	public static MockNode createMockNode(String type, CMConnector cm) {
		if (type.equals("EspressoStorage")) {
			return new EspressoStorageMockNode(cm);
		}
		else {
			logger.error("Unknown MockNode type "+type);
			return null;
		}
	}
}