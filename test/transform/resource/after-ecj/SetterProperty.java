import lombok.Setter;
import java.beans.PropertyChangeSupport;
@SuppressWarnings("serial") class SetterProperty extends PropertyChangeSupport {
  @lombok.Setter(property = true) int i;
  @Setter(property = true,propertyName = "fooBar") int foo;
  SetterProperty(Object sourceBean) {
    super(sourceBean);
  }
  public @java.lang.SuppressWarnings("all") @lombok.Generated void setI(final int i) {
    this.firePropertyChange("i", this.i, (this.i = i));
  }
  public @java.lang.SuppressWarnings("all") @lombok.Generated void setFoo(final int foo) {
    this.firePropertyChange("fooBar", this.foo, (this.foo = foo));
  }
}
