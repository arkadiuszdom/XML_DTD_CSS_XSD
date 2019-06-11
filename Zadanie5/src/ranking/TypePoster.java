
package ranking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type_poster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type_poster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="poster_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type_poster", namespace = "ranking")
public class TypePoster {

    @XmlAttribute(name = "poster_id", required = true)
    protected String posterId;

    /**
     * Gets the value of the posterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosterId() {
        return posterId;
    }

    /**
     * Sets the value of the posterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosterId(String value) {
        this.posterId = value;
    }

}
