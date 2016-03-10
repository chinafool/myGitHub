/** @Title: ClientMain.java
 * @Package ins.outweb
 * @Description: TODO
 * @author ������
 * @date 2016��3��3�� ����5:58:47
 * @version V1.0  
 **/
package ins.outweb;

import ins.outweb.service.SchoolResp;
import ins.outweb.service.SinosoftInter;
import ins.outweb.service.UserResp;
import ins.outweb.service.ZsSchoolInfo;
import ins.outweb.service.ZsUserInfo;
import ins.outweb.serviceimpl.SinosoftWebInterService;

/** @ClassName ClientMain
 * @PackageName ins.outweb
 * @Description TODO
 * @author ������
 * @Date 2016��3��3�� ����5:58:47
 * @Version V1.0
 */
public class ClientMain {

	/** @Title main
	 * @Description TODO
	 * @Author ������
	 * @CreateDate 2016��3��3�� ����5:58:47
	 */

	public static void main(String[] args) {
		SinosoftWebInterService service = new SinosoftWebInterService();
		SinosoftInter sinosoftInter = service.getSinosoftWebInterPort();
		SchoolResp resp = sinosoftInter.schoolList("��ƽ");
		ZsSchoolInfo comCName = resp.getSchoolList().get(2);
		System.out.println(comCName);
		UserResp userDetail = sinosoftInter.userDetail("admin");
		String userName = userDetail.getUserName();
		System.out.println(userName);
		ZsUserInfo onlineUser = sinosoftInter.onlineUser("","");
		onlineUser.getUserName();
	}

}
