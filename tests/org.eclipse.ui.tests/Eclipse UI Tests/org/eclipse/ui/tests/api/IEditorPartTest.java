package org.eclipse.ui.tests.api;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.tests.util.FileUtil;

/**
 * This is a test for IEditorPart.  Since IEditorPart is an
 * interface this test verifies the IEditorPart lifecycle rather
 * than the implementation.
 */
public class IEditorPartTest extends IWorkbenchPartTest {

	/**
	 * Constructor for IEditorPartTest
	 */
	public IEditorPartTest(String testName) {
		super(testName);
	}

	/**
	 * @see IWorkbenchPartTest#openPart(IWorkbenchPage)
	 */
	protected MockWorkbenchPart openPart(IWorkbenchPage page) throws Throwable {
		IProject proj = FileUtil.createProject("IEditorPartTest");
		IFile file = FileUtil.createFile("IEditorPartTest.txt", proj);
		return (MockWorkbenchPart)page.openEditor(file, MockEditorPart.ID1);
	}

	/**
	 * @see IWorkbenchPartTest#closePart(IWorkbenchPage, MockWorkbenchPart)
	 */
	protected void closePart(IWorkbenchPage page, MockWorkbenchPart part)
		throws Throwable 
	{
		page.closeEditor((IEditorPart)part, false);
	}
}

