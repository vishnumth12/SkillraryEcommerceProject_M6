package Scripts;

import genericLibrary.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Test4 {

	public class Test3 extends BaseClass{

		public void tc3() throws Throwable
		{
			SkillraryLoginPage s=new SkillraryLoginPage(driver);
			s.gearsbutton();
			s.skillrarydemoapplication();
			
			SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
			utilies.switchingtabs(driver);
			utilies.dropDown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));
			TestingPage tp=new TestingPage(driver);
			utilies.dragdrop(driver, tp.getSeleniumtraining(), tp.getCarttab());
				
		}
	}
}
