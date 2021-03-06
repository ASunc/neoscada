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
package org.eclipse.scada.configuration.world.tests;

import junit.textui.TestRunner;

import org.eclipse.scada.configuration.world.ExecDriver;
import org.eclipse.scada.configuration.world.WorldFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exec Driver</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecDriverTest extends CommonDriverTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( ExecDriverTest.class );
    }

    /**
     * Constructs a new Exec Driver test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecDriverTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Exec Driver test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ExecDriver getFixture ()
    {
        return (ExecDriver)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp () throws Exception
    {
        setFixture ( WorldFactory.eINSTANCE.createExecDriver () );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown () throws Exception
    {
        setFixture ( null );
    }

} //ExecDriverTest
