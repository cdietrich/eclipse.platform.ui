/*******************************************************************************
 * Copyright (c) 2000, 2014 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Jeanderson Candido <http://jeandersonbc.github.io> - Bug 444070
 *******************************************************************************/
package org.eclipse.ui.tests.internal.util;

import java.util.List;

/**
 * Interface to describe a visual test pass for a dialog test.
 */
public interface IDialogTestPass {
	/**
	 * @return String The title of the test pass.
	 */
    public String title();

	/**
	 * @return String The description of the test pass.
	 */
    public String description();

	/**
	 * @return String The label of the test pass to be used in a selection list.
	 *         The return includes an '&' if a mnemonic is desired.
	 */
    public String label();

	/**
	 * @return A list of items to appear in a checklist. The items in the list
	 *         must be Strings and should include an '&' if a mnemonic is
	 *         desired.
	 */
	public List<String> checkListTexts();

	/**
	 * @return String[] Associated failure messages that correspond to the
	 *         checklist items. The size of this array should be the same size
	 *         as the checklist.
	 */
    public String[] failureTexts();

	/**
	 * @return String The test that corresponds to the test pass to which the
	 *         tester will respond with a 'yes' or 'no'.
	 */
    public String queryText();

	/**
	 * @return int A unique number that identifies the test pass.
	 */
    public int getID();
}

