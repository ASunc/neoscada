/*******************************************************************************
 * Copyright (c) 2013 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.world.osgi.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.world.osgi.profile.StartBundle#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.scada.configuration.world.osgi.profile.ProfilePackage#getStartBundle()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface StartBundle extends EObject
{
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.eclipse.scada.configuration.world.osgi.profile.ProfilePackage#getStartBundle_Name()
     * @model id="true" required="true"
     *        extendedMetaData="name=':0' kind='simple'"
     * @generated
     */
    String getName ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.world.osgi.profile.StartBundle#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName ( String value );

} // StartBundle
