
package ins.outweb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>zsSchoolInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="zsSchoolInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comCAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comCName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shoolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="upperComCName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="upperComCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zsSchoolInfo", propOrder = {
    "comCAddress",
    "comCName",
    "comCode",
    "phoneNo",
    "postCode",
    "shoolType",
    "upperComCName",
    "upperComCode"
})
public class ZsSchoolInfo {

    protected String comCAddress;
    protected String comCName;
    protected String comCode;
    protected String phoneNo;
    protected String postCode;
    protected String shoolType;
    protected String upperComCName;
    protected String upperComCode;

    /**
     * ��ȡcomCAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComCAddress() {
        return comCAddress;
    }

    /**
     * ����comCAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComCAddress(String value) {
        this.comCAddress = value;
    }

    /**
     * ��ȡcomCName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComCName() {
        return comCName;
    }

    /**
     * ����comCName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComCName(String value) {
        this.comCName = value;
    }

    /**
     * ��ȡcomCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComCode() {
        return comCode;
    }

    /**
     * ����comCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComCode(String value) {
        this.comCode = value;
    }

    /**
     * ��ȡphoneNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * ����phoneNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNo(String value) {
        this.phoneNo = value;
    }

    /**
     * ��ȡpostCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * ����postCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * ��ȡshoolType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoolType() {
        return shoolType;
    }

    /**
     * ����shoolType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoolType(String value) {
        this.shoolType = value;
    }

    /**
     * ��ȡupperComCName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperComCName() {
        return upperComCName;
    }

    /**
     * ����upperComCName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperComCName(String value) {
        this.upperComCName = value;
    }

    /**
     * ��ȡupperComCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperComCode() {
        return upperComCode;
    }

    /**
     * ����upperComCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperComCode(String value) {
        this.upperComCode = value;
    }

	@Override
	public String toString() {
		return "ZsSchoolInfo [comCAddress=" + comCAddress + ", comCName="
				+ comCName + ", comCode=" + comCode + ", phoneNo=" + phoneNo
				+ ", postCode=" + postCode + ", shoolType=" + shoolType
				+ ", upperComCName=" + upperComCName + ", upperComCode="
				+ upperComCode + "]";
	}

}
