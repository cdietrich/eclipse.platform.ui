package org.eclipse.ui.tests.zoom;
/**********************************************************************
Copyright (c) 2000, 2002 IBM Corp. and others.
All rights reserved.   This program and the accompanying materials
are made available under the terms of the Common Public License v0.5
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/cpl-v05.html
**********************************************************************/
import junit.framework.Assert;

import org.eclipse.ui.IViewPart;

public class OpenEditorTest extends ZoomTestCase {
	public OpenEditorTest(String name) {
		super(name);	
	}
	
	// open an editor when a view is zoomed
	public void test1() {
		IViewPart view = showRegularView(view1Id);
		zoom(view);
		openEditor(file1);
		Assert.assertTrue(noZoom());
	}
	// open an editor in the same workbook as the zoomed editor
	public void test2() {
		zoom(editor1);
		openEditor(file2);
		Assert.assertTrue(isZoomed(editor2));			
	}
	// open an editor in a different workbook than the zoomed editor
	public void test3() {
		differentWorkbookSetUp();
		zoom(editor1);
		openEditor(file2);
		Assert.assertTrue(noZoom());
	}
	// open a new editor while another editor is zoomed
	public void test4() {
		page.closeEditor(editor2, false);
		zoom(editor1);
		openEditor(file2);
		Assert.assertTrue(isZoomed(editor2));
	}
}
