/**
 */
package mbse.tutorial.yawl;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbse.tutorial.yawl.ControlType#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see mbse.tutorial.yawl.YawlPackage#getControlType()
 * @model
 * @generated
 */
public interface ControlType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link mbse.tutorial.yawl.ControlTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see mbse.tutorial.yawl.ControlTypes
	 * @see #setText(ControlTypes)
	 * @see mbse.tutorial.yawl.YawlPackage#getControlType_Text()
	 * @model
	 * @generated
	 */
	ControlTypes getText();

	/**
	 * Sets the value of the '{@link mbse.tutorial.yawl.ControlType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see mbse.tutorial.yawl.ControlTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(ControlTypes value);

} // ControlType
