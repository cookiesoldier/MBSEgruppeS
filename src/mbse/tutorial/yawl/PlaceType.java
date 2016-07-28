/**
 */
package mbse.tutorial.yawl;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbse.tutorial.yawl.PlaceType#getText <em>Text</em>}</li>
 *   <li>{@link mbse.tutorial.yawl.PlaceType#getPlace <em>Place</em>}</li>
 * </ul>
 *
 * @see mbse.tutorial.yawl.YawlPackage#getPlaceType()
 * @model
 * @generated
 */
public interface PlaceType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link mbse.tutorial.yawl.PlaceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see mbse.tutorial.yawl.PlaceTypes
	 * @see #setText(PlaceTypes)
	 * @see mbse.tutorial.yawl.YawlPackage#getPlaceType_Text()
	 * @model
	 * @generated
	 */
	PlaceTypes getText();

	/**
	 * Sets the value of the '{@link mbse.tutorial.yawl.PlaceType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see mbse.tutorial.yawl.PlaceTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(PlaceTypes value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mbse.tutorial.yawl.Place#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' container reference.
	 * @see #setPlace(Place)
	 * @see mbse.tutorial.yawl.YawlPackage#getPlaceType_Place()
	 * @see mbse.tutorial.yawl.Place#getType
	 * @model opposite="type" transient="false"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link mbse.tutorial.yawl.PlaceType#getPlace <em>Place</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' container reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

} // PlaceType
