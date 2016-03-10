
package ins.outweb.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ins.outweb.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OnlineUser_QNAME = new QName("http://service.outweb.ins/", "OnlineUser");
    private final static QName _OnlineUserResponse_QNAME = new QName("http://service.outweb.ins/", "OnlineUserResponse");
    private final static QName _OutUname_QNAME = new QName("http://service.outweb.ins/", "outUname");
    private final static QName _OutUnameResponse_QNAME = new QName("http://service.outweb.ins/", "outUnameResponse");
    private final static QName _SchoolList_QNAME = new QName("http://service.outweb.ins/", "schoolList");
    private final static QName _SchoolListResponse_QNAME = new QName("http://service.outweb.ins/", "schoolListResponse");
    private final static QName _UserDetail_QNAME = new QName("http://service.outweb.ins/", "userDetail");
    private final static QName _UserDetailResponse_QNAME = new QName("http://service.outweb.ins/", "userDetailResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ins.outweb.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OnlineUser }
     * 
     */
    public OnlineUser createOnlineUser() {
        return new OnlineUser();
    }

    /**
     * Create an instance of {@link OnlineUserResponse }
     * 
     */
    public OnlineUserResponse createOnlineUserResponse() {
        return new OnlineUserResponse();
    }

    /**
     * Create an instance of {@link OutUname }
     * 
     */
    public OutUname createOutUname() {
        return new OutUname();
    }

    /**
     * Create an instance of {@link OutUnameResponse }
     * 
     */
    public OutUnameResponse createOutUnameResponse() {
        return new OutUnameResponse();
    }

    /**
     * Create an instance of {@link SchoolList }
     * 
     */
    public SchoolList createSchoolList() {
        return new SchoolList();
    }

    /**
     * Create an instance of {@link SchoolListResponse }
     * 
     */
    public SchoolListResponse createSchoolListResponse() {
        return new SchoolListResponse();
    }

    /**
     * Create an instance of {@link UserDetail }
     * 
     */
    public UserDetail createUserDetail() {
        return new UserDetail();
    }

    /**
     * Create an instance of {@link UserDetailResponse }
     * 
     */
    public UserDetailResponse createUserDetailResponse() {
        return new UserDetailResponse();
    }

    /**
     * Create an instance of {@link SchoolResp }
     * 
     */
    public SchoolResp createSchoolResp() {
        return new SchoolResp();
    }

    /**
     * Create an instance of {@link ZsSchoolInfo }
     * 
     */
    public ZsSchoolInfo createZsSchoolInfo() {
        return new ZsSchoolInfo();
    }

    /**
     * Create an instance of {@link UserResp }
     * 
     */
    public UserResp createUserResp() {
        return new UserResp();
    }

    /**
     * Create an instance of {@link ZsUserRole }
     * 
     */
    public ZsUserRole createZsUserRole() {
        return new ZsUserRole();
    }

    /**
     * Create an instance of {@link ZsUserInfo }
     * 
     */
    public ZsUserInfo createZsUserInfo() {
        return new ZsUserInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnlineUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.outweb.ins/", name = "OnlineUser")
    public JAXBElement<OnlineUser> createOnlineUser(OnlineUser value) {
        return new JAXBElement<OnlineUser>(_OnlineUser_QNAME, OnlineUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnlineUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.outweb.ins/", name = "OnlineUserResponse")
    public JAXBElement<OnlineUserResponse> createOnlineUserResponse(OnlineUserResponse value) {
        return new JAXBElement<OnlineUserResponse>(_OnlineUserResponse_QNAME, OnlineUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutUname }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.outweb.ins/", name = "outUname")
    public JAXBElement<OutUname> createOutUname(OutUname value) {
        return new JAXBElement<OutUname>(_OutUname_QNAME, OutUname.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutUnameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.outweb.ins/", name = "outUnameResponse")
    public JAXBElement<OutUnameResponse> createOutUnameResponse(OutUnameResponse value) {
        return new JAXBElement<OutUnameResponse>(_OutUnameResponse_QNAME, OutUnameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.outweb.ins/", name = "schoolList")
    public JAXBElement<SchoolList> createSchoolList(SchoolList value) {
        return new JAXBElement<SchoolList>(_SchoolList_QNAME, SchoolList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.outweb.ins/", name = "schoolListResponse")
    public JAXBElement<SchoolListResponse> createSchoolListResponse(SchoolListResponse value) {
        return new JAXBElement<SchoolListResponse>(_SchoolListResponse_QNAME, SchoolListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.outweb.ins/", name = "userDetail")
    public JAXBElement<UserDetail> createUserDetail(UserDetail value) {
        return new JAXBElement<UserDetail>(_UserDetail_QNAME, UserDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.outweb.ins/", name = "userDetailResponse")
    public JAXBElement<UserDetailResponse> createUserDetailResponse(UserDetailResponse value) {
        return new JAXBElement<UserDetailResponse>(_UserDetailResponse_QNAME, UserDetailResponse.class, null, value);
    }

}
