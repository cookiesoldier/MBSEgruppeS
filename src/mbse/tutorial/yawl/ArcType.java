/**
 */
package mbse.tutorial.yawl;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbse.tutorial.yawl.ArcType#getText <em>Text</em>}</li>
 *   <li>{@link mbse.tutorial.yawl.ArcType#getArc <em>Arc</em>}</li>
 * </ul>
 *
 * @see mbse.tutorial.yawl.YawlPackage#getArcType()
 * @model
 * @generated
 */
public interface ArcType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link mbse.tutorial.yawl.ArcTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see mbse.tutorial.yawl.ArcTypes
	 * @see #setText(ArcTypes)
	 * @see mbse.tutorial.yawl.YawlPackage#getArcType_Text()
	 * @model
	 * @generated
	 */
	ArcTypes getText();

	/**
	 * Sets the value of the '{@link mbse.tutorial.yawl.ArcType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see mbse.tutorial.yawl.ArcTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(ArcTypes value);

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mbse.tutorial.yawl.Arc#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc</em>' container reference.
	 * @see #setArc(Arc)
	 * @see mbse.tutorial.yawl.YawlPackage#getArcType_Arc()
	 * @see mbse.tutorial.yawl.Arc#getType
	 * @model opposite="type"
	 * @generated
	 */
	Arc getArc();

	/**
	 * Sets the value of the '{@link mbse.tutorial.yawl.ArcType#getArc <em>Arc</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc</em>' container reference.
	 * @see #getArc()
	 * @generated
	 */
	void setArc(Arc value);

} // ArcType
