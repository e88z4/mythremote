
package mythapi.frontend;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetActionListResult" type="{http://mythtv.org}FrontendActionList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getActionListResult"
})
@XmlRootElement(name = "GetActionListResponse")
public class GetActionListResponse {

    @XmlElementRef(name = "GetActionListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<FrontendActionList> getActionListResult;

    /**
     * Gets the value of the getActionListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FrontendActionList }{@code >}
     *     
     */
    public JAXBElement<FrontendActionList> getGetActionListResult() {
        return getActionListResult;
    }

    /**
     * Sets the value of the getActionListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FrontendActionList }{@code >}
     *     
     */
    public void setGetActionListResult(JAXBElement<FrontendActionList> value) {
        this.getActionListResult = value;
    }

}
