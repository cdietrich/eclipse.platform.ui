package org.eclipse.ui.tests.api;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.tests.util.FileUtil;

public class IEditorSiteTest extends IWorkbenchPartSiteTest {

	/**
	 * Constructor for IEditorSiteTest
	 */
	public IEditorSiteTest(String testName) {
		super(testName);
	}

	/**
	 * @see IWorkbenchPartSiteTest#getTestPartName()
	 */
	protected String getTestPartName() throws Throwable {
		return MockEditorPart.NAME;
	}

	/**
	 * @see IWorkbenchPartSiteTest#getTestPartId()
	 */
	protected String getTestPartId() throws Throwable {
		return MockEditorPart.ID1;
	}

	/**
	 * @see IWorkbenchPartSiteTest#createTestPart(IWorkbenchPage)
	 */
	protected IWorkbenchPart createTestPart(IWorkbenchPage page) throws Throwable {
		IProject proj = FileUtil.createProject("createTestPart");
		IFile file = FileUtil.createFile("test1.mock1", proj);
		return page.openEditor(file);
	}
	
	public void testGetActionBarContributor() throws Throwable {
		// From Javadoc: "Returns the editor action bar contributor for 
		// this editor.
		
		IEditorPart editor = (IEditorPart) createTestPart(fPage);
		IEditorSite site = editor.getEditorSite();
		assertNull(site.getActionBarContributor());
		
		// TBD: Flesh this out with a real contributor.
	}

	

}

