
package mythapi.frontend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrontendActionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrontendActionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionList" type="{http://mythtv.org}MapOfStringAction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrontendActionList", propOrder = {
    "actionList"
})
public class FrontendActionList {

    @XmlElement(name = "ActionList")
    protected MapOfStringAction actionList;

    /**
     * Gets the value of the actionList property.
     * 
     * @return
     *     possible object is
     *     {@link MapOfStringAction }
     *     
     */
    public MapOfStringAction getActionList() {
        return actionList;
    }

    /**
     * Sets the value of the actionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapOfStringAction }
     *     
     */
    public void setActionList(MapOfStringAction value) {
        this.actionList = value;
    }

}
