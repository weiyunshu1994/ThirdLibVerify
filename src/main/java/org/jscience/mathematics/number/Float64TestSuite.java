/*
 * JScience - Java(TM) Tools and Libraries for the Advancement of Sciences.
 * Copyright (C) 2007 - JScience (http://jscience.org/)
 * All rights reserved.
 * 
 * Permission to use, copy, modify, and distribute this software is
 * freely granted, provided that this notice is preserved.
 */
package org.jscience.mathematics.number;

import org.jscience.mathematics.number.Float64;

/**
 * Instantiation of the generic tests of the {@link AbstractFloatTestSuite} for {@link Float64} and some further tests
 * that are specific to {@link Float64}.
 * @since 23.12.2008
 * @author <a href="http://www.stoerr.net/">Hans-Peter Störr</a>
 */
public class Float64TestSuite extends AbstractFloatTestSuite<Float64> {

    /** Sets the needed helper class. */
    public Float64TestSuite() {
        super(NumberHelper.FLOAT64);
    }

    /**
     * Overridden to do nothing since it has no isZero().
     */
    @Override
    protected void testIsPositive() {
        // not there 8-{
    }

    /**
     * Overridden to do nothing since it has no isZero().
     */
    @Override
    protected void testIsNegative() {
        // not there 8-{
    }

    /**
     * Overridden to do nothing since it has no isZero().
     */
    @Override
    protected void testIsZero() {
        // not there 8-{
    }
}
