/*******************************************************************************
 * Copyright (c) 2013, 2014 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.component.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.scada.configuration.component.CalculationComponent;
import org.eclipse.scada.configuration.component.ComponentFactory;
import org.eclipse.scada.configuration.component.ComponentPackage;
import org.eclipse.scada.configuration.world.WorldFactory;
import org.eclipse.scada.configuration.world.WorldPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.scada.configuration.component.CalculationComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CalculationComponentItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemStyledLabelProvider
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CalculationComponentItemProvider ( AdapterFactory adapterFactory )
    {
        super ( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors ( Object object )
    {
        if ( itemPropertyDescriptors == null )
        {
            super.getPropertyDescriptors ( object );

            addShortDescriptionPropertyDescriptor ( object );
            addNamePropertyDescriptor ( object );
            addCustomizationPipelinePropertyDescriptor ( object );
            addArchiveSelectorPropertyDescriptor ( object );
            addMasterOnPropertyDescriptor ( object );
            addImplementationPropertyDescriptor ( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Short Description feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShortDescriptionPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Documentable_shortDescription_feature" ), //$NON-NLS-1$
                getString ( "_UI_PropertyDescriptor_description", "_UI_Documentable_shortDescription_feature", "_UI_Documentable_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                WorldPackage.Literals.DOCUMENTABLE__SHORT_DESCRIPTION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_namingPropertyCategory" ), //$NON-NLS-1$
                null ) );
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_NamedDocumentable_name_feature" ), //$NON-NLS-1$
                getString ( "_UI_PropertyDescriptor_description", "_UI_NamedDocumentable_name_feature", "_UI_NamedDocumentable_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                WorldPackage.Literals.NAMED_DOCUMENTABLE__NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_namingPropertyCategory" ), //$NON-NLS-1$
                null ) );
    }

    /**
     * This adds a property descriptor for the Customization Pipeline feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomizationPipelinePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Component_customizationPipeline_feature" ), //$NON-NLS-1$
                getString ( "_UI_PropertyDescriptor_description", "_UI_Component_customizationPipeline_feature", "_UI_Component_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                ComponentPackage.Literals.COMPONENT__CUSTOMIZATION_PIPELINE, true, false, true, null, getString ( "_UI_customizationPropertyCategory" ), //$NON-NLS-1$
                null ) );
    }

    /**
     * This adds a property descriptor for the Archive Selector feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addArchiveSelectorPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Component_archiveSelector_feature" ), //$NON-NLS-1$
                getString ( "_UI_PropertyDescriptor_description", "_UI_Component_archiveSelector_feature", "_UI_Component_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                ComponentPackage.Literals.COMPONENT__ARCHIVE_SELECTOR, true, false, true, null, getString ( "_UI_customizationPropertyCategory" ), //$NON-NLS-1$
                null ) );
    }

    /**
     * This adds a property descriptor for the Master On feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMasterOnPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_MasterAssigned_masterOn_feature" ), //$NON-NLS-1$
                getString ( "_UI_PropertyDescriptor_description", "_UI_MasterAssigned_masterOn_feature", "_UI_MasterAssigned_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                ComponentPackage.Literals.MASTER_ASSIGNED__MASTER_ON, true, false, true, null, getString ( "_UI_corePropertyCategory" ), //$NON-NLS-1$
                null ) );
    }

    /**
     * This adds a property descriptor for the Implementation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addImplementationPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_CalculationComponent_implementation_feature" ), //$NON-NLS-1$
                getString ( "_UI_PropertyDescriptor_description", "_UI_CalculationComponent_implementation_feature", "_UI_CalculationComponent_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                ComponentPackage.Literals.CALCULATION_COMPONENT__IMPLEMENTATION, true, false, true, null, getString ( "_UI_corePropertyCategory" ), //$NON-NLS-1$
                null ) );
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures ( Object object )
    {
        if ( childrenFeatures == null )
        {
            super.getChildrenFeatures ( object );
            childrenFeatures.add ( ComponentPackage.Literals.COMPONENT__PROPERTIES );
            childrenFeatures.add ( ComponentPackage.Literals.CALCULATION_COMPONENT__OUTPUTS );
            childrenFeatures.add ( ComponentPackage.Literals.CALCULATION_COMPONENT__INPUTS );
            childrenFeatures.add ( ComponentPackage.Literals.CALCULATION_COMPONENT__INIT_PROPERTIES );
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature ( Object object, Object child )
    {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature ( object, child );
    }

    /**
     * This returns CalculationComponent.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public Object getImage ( final Object object )
    {
        return overlayImage ( object, getResourceLocator ().getImage ( "full/obj16/CalculationComponent.png" ) ); //$NON-NLS-1$
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean shouldComposeCreationImage ()
    {
        return true;
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText ( Object object )
    {
        return ( (StyledString)getStyledText ( object ) ).getString ();
    }

    /**
     * This returns the label styled text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getStyledText ( Object object )
    {
        String label = ( (CalculationComponent)object ).getName ();
        StyledString styledLabel = new StyledString ();
        if ( label == null || label.length () == 0 )
        {
            styledLabel.append ( getString ( "_UI_CalculationComponent_type" ), StyledString.Style.QUALIFIER_STYLER ); //$NON-NLS-1$
        }
        else
        {
            styledLabel.append ( getString ( "_UI_CalculationComponent_type" ), StyledString.Style.QUALIFIER_STYLER ).append ( " " + label ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        return styledLabel;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged ( Notification notification )
    {
        updateChildren ( notification );

        switch ( notification.getFeatureID ( CalculationComponent.class ) )
        {
            case ComponentPackage.CALCULATION_COMPONENT__SHORT_DESCRIPTION:
            case ComponentPackage.CALCULATION_COMPONENT__NAME:
                fireNotifyChanged ( new ViewerNotification ( notification, notification.getNotifier (), false, true ) );
                return;
            case ComponentPackage.CALCULATION_COMPONENT__PROPERTIES:
            case ComponentPackage.CALCULATION_COMPONENT__OUTPUTS:
            case ComponentPackage.CALCULATION_COMPONENT__INPUTS:
            case ComponentPackage.CALCULATION_COMPONENT__INIT_PROPERTIES:
                fireNotifyChanged ( new ViewerNotification ( notification, notification.getNotifier (), true, false ) );
                return;
        }
        super.notifyChanged ( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors ( Collection<Object> newChildDescriptors, Object object )
    {
        super.collectNewChildDescriptors ( newChildDescriptors, object );

        newChildDescriptors.add ( createChildParameter ( ComponentPackage.Literals.COMPONENT__PROPERTIES, WorldFactory.eINSTANCE.createPropertyEntry () ) );

        newChildDescriptors.add ( createChildParameter ( ComponentPackage.Literals.CALCULATION_COMPONENT__OUTPUTS, ComponentFactory.eINSTANCE.createOutputDefinition () ) );

        newChildDescriptors.add ( createChildParameter ( ComponentPackage.Literals.CALCULATION_COMPONENT__OUTPUTS, ComponentFactory.eINSTANCE.createItemReferenceOutputDefinition () ) );

        newChildDescriptors.add ( createChildParameter ( ComponentPackage.Literals.CALCULATION_COMPONENT__OUTPUTS, ComponentFactory.eINSTANCE.createComponentReferenceOutputDefinition () ) );

        newChildDescriptors.add ( createChildParameter ( ComponentPackage.Literals.CALCULATION_COMPONENT__INPUTS, ComponentFactory.eINSTANCE.createItemReferenceInputDefinition () ) );

        newChildDescriptors.add ( createChildParameter ( ComponentPackage.Literals.CALCULATION_COMPONENT__INPUTS, ComponentFactory.eINSTANCE.createComponentReferenceInputDefinition () ) );

        newChildDescriptors.add ( createChildParameter ( ComponentPackage.Literals.CALCULATION_COMPONENT__INIT_PROPERTIES, WorldFactory.eINSTANCE.createPropertyEntry () ) );
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText ( Object owner, Object feature, Object child, Collection<?> selection )
    {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == ComponentPackage.Literals.COMPONENT__PROPERTIES || childFeature == ComponentPackage.Literals.CALCULATION_COMPONENT__INIT_PROPERTIES;

        if ( qualify )
        {
            return getString ( "_UI_CreateChild_text2", //$NON-NLS-1$
                    new Object[] { getTypeText ( childObject ), getFeatureText ( childFeature ), getTypeText ( owner ) } );
        }
        return super.getCreateChildText ( owner, feature, child, selection );
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator ()
    {
        return ( (IChildCreationExtender)adapterFactory ).getResourceLocator ();
    }

}
