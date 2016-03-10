
package ins.outweb.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>schoolResp complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="schoolResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="flowTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="schoolList" type="{http://service.outweb.ins/}zsSchoolInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schoolResp", propOrder = {
    "errorMsg",
    "errorNo",
    "flowTime",
    "schoolList",
    "uuid"
})
public class SchoolResp {

    protected String errorMsg;
    protected Integer errorNo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flowTime;
    @XmlElement(nillable = true)
    protected List<ZsSchoolInfo> schoolList;
    protected String uuid;

    /**
     * 获取errorMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * 设置errorMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    /**
     * 获取errorNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorNo() {
        return errorNo;
    }

    /**
     * 设置errorNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorNo(Integer value) {
        this.errorNo = value;
    }

    /**
     * 获取flowTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlowTime() {
        return flowTime;
    }

    /**
     * 设置flowTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlowTime(XMLGregorianCalendar value) {
        this.flowTime = value;
    }

    /**
     * Gets the value of the schoolList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schoolList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchoolList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZsSchoolInfo }
     * 
     * 
     */
    public List<ZsSchoolInfo> getSchoolList() {
        if (schoolList == null) {
            schoolList = new ArrayList<ZsSchoolInfo>();
        }
        return this.schoolList;
    }

    /**
     * 获取uuid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 设置uuid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
