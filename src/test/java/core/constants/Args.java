package core.constants;

import io.appium.java_client.service.local.flags.ServerArgument;

public enum Args implements ServerArgument {
	TIMEOUT("--command-timeout"), LOG_LEVEL("--log-level"), BOOTSTRAP_PORT("--bootstrap-port");

	private final String args;

	Args(String args) {
		this.args = args;
	}

	@Override
	public String getArgument() {
		return args;
	}

}
