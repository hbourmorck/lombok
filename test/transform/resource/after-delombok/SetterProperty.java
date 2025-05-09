import java.beans.PropertyChangeSupport;

@SuppressWarnings("serial")
class SetterProperty extends PropertyChangeSupport {
	int i;
	int foo;

	SetterProperty(Object sourceBean) {
		super(sourceBean);
	}

	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public void setI(final int i) {
		this.firePropertyChange("i", this.i, this.i = i);
	}

	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public void setFoo(final int foo) {
		this.firePropertyChange("fooBar", this.foo, this.foo = foo);
	}
}
