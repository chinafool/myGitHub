
package ins.outweb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>zsSchoolInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取comCAddress属性的值。
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
     * 设置comCAddress属性的值。
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
     * 获取comCName属性的值。
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
     * 设置comCName属性的值。
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
     * 获取comCode属性的值。
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
     * 设置comCode属性的值。
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
     * 获取phoneNo属性的值。
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
     * 设置phoneNo属性的值。
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
     * 获取postCode属性的值。
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
     * 设置postCode属性的值。
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
     * 获取shoolType属性的值。
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
     * 设置shoolType属性的值。
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
     * 获取upperComCName属性的值。
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
     * 设置upperComCName属性的值。
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
     * 获取upperComCode属性的值。
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
     * 设置upperComCode属性的值。
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
