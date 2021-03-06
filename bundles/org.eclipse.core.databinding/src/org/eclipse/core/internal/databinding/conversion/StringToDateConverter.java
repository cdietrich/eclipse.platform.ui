/*
 * Copyright (C) 2005, 2015 db4objects Inc.  http://www.db4o.com
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     db4objects - Initial API and implementation
 */
package org.eclipse.core.internal.databinding.conversion;

import java.util.Date;

import org.eclipse.core.databinding.conversion.IConverter;

/**
 * Convert a String to a java.util.Date, respecting the current locale
 *
 * @since 1.0
 */
public class StringToDateConverter extends DateConversionSupport implements IConverter<Object, Date> {
	@Override
	public Date convert(Object source) {
		return parse(source.toString());
	}

	@Override
	public Object getFromType() {
		return String.class;
	}

	@Override
	public Object getToType() {
		return Date.class;
	}
}
