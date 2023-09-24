package my.service.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import my.liferay.service.MyService;
import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class MyServiceIntegrationTest {
	
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE);
	
	/**We can use Deployment annotation to deploy a jar file that created with ShrinkWrap through Jboss Arquillian **/
	//@Deployment
	//public static JavaArchive create() throws Exception {
		//final File jarFile = new File(System.getProperty("jarFile"));

		//return ShrinkWrap.createFromZipFile(JavaArchive.class, jarFile);
	//}	
	
	@Test
	public void testMyOutputService() throws Exception {
		Assert.assertNotNull(_myService);
		Assert.assertEquals("Hello World",_myService.myOutput());
		
	}

	@Inject
	private MyService _myService;
}
