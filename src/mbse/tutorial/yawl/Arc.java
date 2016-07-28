/**
 */
package mbse.tutorial.yawl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbse.tutorial.yawl.Arc#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mbse.tutorial.yawl.YawlPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends org.pnml.tools.epnk.pnmlcoremodel.Arc {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mbse.tutorial.yawl.ArcType#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ArcType)
	 * @see mbse.tutorial.yawl.YawlPackage#getArc_Type()
	 * @see mbse.tutorial.yawl.ArcType#getArc
	 * @model opposite="arc" containment="true"
	 * @generated
	 */
	ArcType getType();

	/**
	 * Sets the value of the '{@link mbse.tutorial.yawl.Arc#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ArcType value);

} // Arc
