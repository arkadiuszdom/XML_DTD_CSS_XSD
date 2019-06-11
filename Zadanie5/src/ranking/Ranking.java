
package ranking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;group ref="{ranking}group_ranking_sections"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "genres",
    "positions"
})
@XmlRootElement(name = "ranking", namespace = "ranking")
public class Ranking {

    @XmlElement(namespace = "ranking", required = true)
    protected TypeHeader header;
    @XmlElement(namespace = "ranking", required = true)
    protected TypeGenres genres;
    @XmlElement(namespace = "ranking", required = true)
    protected TypePositions positions;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHeader }
     *     
     */
    public TypeHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHeader }
     *     
     */
    public void setHeader(TypeHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the genres property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGenres }
     *     
     */
    public TypeGenres getGenres() {
        return genres;
    }

    /**
     * Sets the value of the genres property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGenres }
     *     
     */
    public void setGenres(TypeGenres value) {
        this.genres = value;
    }

    /**
     * Gets the value of the positions property.
     * 
     * @return
     *     possible object is
     *     {@link TypePositions }
     *     
     */
    public TypePositions getPositions() {
        return positions;
    }

    /**
     * Sets the value of the positions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePositions }
     *     
     */
    public void setPositions(TypePositions value) {
        this.positions = value;
    }

}
