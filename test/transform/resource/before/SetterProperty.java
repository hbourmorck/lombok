import lombok.Setter;
import java.beans.PropertyChangeSupport;
@SuppressWarnings("serial") class SetterProperty extends PropertyChangeSupport{
	@lombok.Setter(property = true) int i;
	@Setter(property = true,propertyName = "fooBar") int foo;
	SetterProperty(Object sourceBean) {
		super(sourceBean);
	}
}