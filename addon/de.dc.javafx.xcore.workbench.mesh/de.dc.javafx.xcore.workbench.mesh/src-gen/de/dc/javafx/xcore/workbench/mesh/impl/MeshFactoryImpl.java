/**
 */
package de.dc.javafx.xcore.workbench.mesh.impl;

import de.dc.javafx.xcore.workbench.mesh.*;

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
public class MeshFactoryImpl extends EFactoryImpl implements MeshFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeshFactory init() {
		try {
			MeshFactory theMeshFactory = (MeshFactory) EPackage.Registry.INSTANCE.getEFactory(MeshPackage.eNS_URI);
			if (theMeshFactory != null) {
				return theMeshFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MeshFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MeshPackage.MESH_CONTAINER:
			return createMeshContainer();
		case MeshPackage.POINT_LIGHT_FX:
			return createPointLightFX();
		case MeshPackage.CAMERA_FX:
			return createCameraFX();
		case MeshPackage.COORDINATE_SYSTEM:
			return createCoordinateSystem();
		case MeshPackage.BOX_FX:
			return createBoxFX();
		case MeshPackage.CYLINDER_FX:
			return createCylinderFX();
		case MeshPackage.SPHERE_FX:
			return createSphereFX();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeshContainer createMeshContainer() {
		MeshContainerImpl meshContainer = new MeshContainerImpl();
		return meshContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointLightFX createPointLightFX() {
		PointLightFXImpl pointLightFX = new PointLightFXImpl();
		return pointLightFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CameraFX createCameraFX() {
		CameraFXImpl cameraFX = new CameraFXImpl();
		return cameraFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystem createCoordinateSystem() {
		CoordinateSystemImpl coordinateSystem = new CoordinateSystemImpl();
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoxFX createBoxFX() {
		BoxFXImpl boxFX = new BoxFXImpl();
		return boxFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CylinderFX createCylinderFX() {
		CylinderFXImpl cylinderFX = new CylinderFXImpl();
		return cylinderFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SphereFX createSphereFX() {
		SphereFXImpl sphereFX = new SphereFXImpl();
		return sphereFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeshPackage getMeshPackage() {
		return (MeshPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MeshPackage getPackage() {
		return MeshPackage.eINSTANCE;
	}

} //MeshFactoryImpl
