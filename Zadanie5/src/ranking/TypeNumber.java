
package ranking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for type_number complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type_number">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *       &lt;attribute name="top_three" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type_number", namespace = "ranking", propOrder = {
    "value"
})
public class TypeNumber {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "top_three")
    protected String topThree;

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the topThree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopThree() {
        return topThree;
    }

    /**
     * Sets the value of the topThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopThree(String value) {
        this.topThree = value;
    }

}
