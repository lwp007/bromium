/**
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl.bromium.impl;

import com.hribol.bromium.dsl.bromium.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BromiumFactoryImpl extends EFactoryImpl implements BromiumFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BromiumFactory init()
  {
    try
    {
      BromiumFactory theBromiumFactory = (BromiumFactory)EPackage.Registry.INSTANCE.getEFactory(BromiumPackage.eNS_URI);
      if (theBromiumFactory != null)
      {
        return theBromiumFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BromiumFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BromiumFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BromiumPackage.MODEL: return createModel();
      case BromiumPackage.APPLICATION_ACTION: return createApplicationAction();
      case BromiumPackage.ACTION_DEFINITION: return createActionDefinition();
      case BromiumPackage.WEB_DRIVER_ACTION: return createWebDriverAction();
      case BromiumPackage.PRECONDITION: return createPrecondition();
      case BromiumPackage.POSTCONDITION: return createPostcondition();
      case BromiumPackage.ELEMENT_WITH_ID_IS_PRESENT: return createElementWithIdIsPresent();
      case BromiumPackage.CLICK_ON_ELEMENT_WITH_ID: return createClickOnElementWithId();
      case BromiumPackage.PAGE_LOAD: return createPageLoad();
      case BromiumPackage.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR: return createTypeTextInElementFoundByCssSelector();
      case BromiumPackage.PARAMETER_VALUE: return createParameterValue();
      case BromiumPackage.EXPOSED_PARAMETER: return createExposedParameter();
      case BromiumPackage.THREE_DOTTED_VERSION: return createThreeDottedVersion();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationAction createApplicationAction()
  {
    ApplicationActionImpl applicationAction = new ApplicationActionImpl();
    return applicationAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionDefinition createActionDefinition()
  {
    ActionDefinitionImpl actionDefinition = new ActionDefinitionImpl();
    return actionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebDriverAction createWebDriverAction()
  {
    WebDriverActionImpl webDriverAction = new WebDriverActionImpl();
    return webDriverAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Precondition createPrecondition()
  {
    PreconditionImpl precondition = new PreconditionImpl();
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Postcondition createPostcondition()
  {
    PostconditionImpl postcondition = new PostconditionImpl();
    return postcondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementWithIdIsPresent createElementWithIdIsPresent()
  {
    ElementWithIdIsPresentImpl elementWithIdIsPresent = new ElementWithIdIsPresentImpl();
    return elementWithIdIsPresent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClickOnElementWithId createClickOnElementWithId()
  {
    ClickOnElementWithIdImpl clickOnElementWithId = new ClickOnElementWithIdImpl();
    return clickOnElementWithId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageLoad createPageLoad()
  {
    PageLoadImpl pageLoad = new PageLoadImpl();
    return pageLoad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeTextInElementFoundByCssSelector createTypeTextInElementFoundByCssSelector()
  {
    TypeTextInElementFoundByCssSelectorImpl typeTextInElementFoundByCssSelector = new TypeTextInElementFoundByCssSelectorImpl();
    return typeTextInElementFoundByCssSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterValue createParameterValue()
  {
    ParameterValueImpl parameterValue = new ParameterValueImpl();
    return parameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExposedParameter createExposedParameter()
  {
    ExposedParameterImpl exposedParameter = new ExposedParameterImpl();
    return exposedParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThreeDottedVersion createThreeDottedVersion()
  {
    ThreeDottedVersionImpl threeDottedVersion = new ThreeDottedVersionImpl();
    return threeDottedVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BromiumPackage getBromiumPackage()
  {
    return (BromiumPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BromiumPackage getPackage()
  {
    return BromiumPackage.eINSTANCE;
  }

} //BromiumFactoryImpl
