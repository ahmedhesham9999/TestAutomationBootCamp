package oops.encapsulation;

public class Browser {
	private String name;
	private int currentVersion;
	private String preferredOs;
	private boolean isSecured;

	public Browser(String name, int currentVersion, String preferredOs, boolean isSecured) {
		this.name = name;
		this.currentVersion = currentVersion;
		this.preferredOs = preferredOs;
		this.isSecured = isSecured;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(int currentVersion) {
		this.currentVersion = currentVersion;
	}

	public String getPreferredOs() {
		return preferredOs;
	}

	public void setPreferredOs(String preferredOs) {
		this.preferredOs = preferredOs;
	}

	public boolean isSecured() {
		return isSecured;
	}

	public void setSecured(boolean isSecured) {
		this.isSecured = isSecured;
	}

	@Override
	public String toString() {
		return "Browser [Browser Name= " + name + " ,Current Version=" + currentVersion + ",Preferred OS ="
				+ preferredOs + " ,IS SECURED=" + isSecured + "]";

	}
}
