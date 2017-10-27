/**
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl.bromium.impl;

import com.hribol.bromium.dsl.bromium.BromiumPackage;
import com.hribol.bromium.dsl.bromium.ExposedParameter;
import com.hribol.bromium.dsl.bromium.ParameterValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ParameterValueImpl#getContent <em>Content</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ParameterValueImpl#getExposedParameter <em>Exposed Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterValueImpl extends MinimalEObjectImpl.Container implements ParameterValue
{
  /**
   * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected static final String CONTENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected String content = CONTENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getExposedParameter() <em>Exposed Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExposedParameter()
   * @generated
   * @ordered
   */
  protected ExposedParameter exposedParameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterValueImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BromiumPackage.Literals.PARAMETER_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(String newContent)
  {
    String oldContent = content;
    content = newContent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BromiumPackage.PARAMETER_VALUE__CONTENT, oldContent, content));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExposedParameter getExposedParameter()
  {
    if (exposedParameter != null && exposedParameter.eIsProxy())
    {
      InternalEObject oldExposedParameter = (InternalEObject)exposedParameter;
      exposedParameter = (ExposedParameter)eResolveProxy(oldExposedParameter);
      if (exposedParameter != oldExposedParameter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BromiumPackage.PARAMETER_VALUE__EXPOSED_PARAMETER, oldExposedParameter, exposedParameter));
      }
    }
    return exposedParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExposedParameter basicGetExposedParameter()
  {
    return exposedParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExposedParameter(ExposedParameter newExposedParameter)
  {
    ExposedParameter oldExposedParameter = exposedParameter;
    exposedParameter = newExposedParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BromiumPackage.PARAMETER_VALUE__EXPOSED_PARAMETER, oldExposedParameter, exposedParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BromiumPackage.PARAMETER_VALUE__CONTENT:
        return getContent();
      case BromiumPackage.PARAMETER_VALUE__EXPOSED_PARAMETER:
        if (resolve) return getExposedParameter();
        return basicGetExposedParameter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BromiumPackage.PARAMETER_VALUE__CONTENT:
        setContent((String)newValue);
        return;
      case BromiumPackage.PARAMETER_VALUE__EXPOSED_PARAMETER:
        setExposedParameter((ExposedParameter)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BromiumPackage.PARAMETER_VALUE__CONTENT:
        setContent(CONTENT_EDEFAULT);
        return;
      case BromiumPackage.PARAMETER_VALUE__EXPOSED_PARAMETER:
        setExposedParameter((ExposedParameter)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BromiumPackage.PARAMETER_VALUE__CONTENT:
        return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
      case BromiumPackage.PARAMETER_VALUE__EXPOSED_PARAMETER:
        return exposedParameter != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (content: ");
    result.append(content);
    result.append(')');
    return result.toString();
  }

} //ParameterValueImpl
