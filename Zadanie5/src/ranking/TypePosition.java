
package ranking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type_position complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type_position">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{ranking}type_number"/>
 *         &lt;element name="poster" type="{ranking}type_poster"/>
 *         &lt;element name="name" type="{ranking}type_name"/>
 *         &lt;element name="genreName" type="{ranking}type_genre_color"/>
 *         &lt;element name="rating" type="{ranking}type_rating"/>
 *         &lt;element name="age" type="{ranking}type_age"/>
 *         &lt;element name="releaseDate" type="{ranking}type_releaseDate"/>
 *         &lt;element name="predecessor" type="{ranking}type_predecessor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type_position", namespace = "ranking", propOrder = {
    "number",
    "poster",
    "name",
    "genreName",
    "rating",
    "age",
    "releaseDate",
    "predecessor"
})
public class TypePosition {

    @XmlElement(namespace = "ranking", required = true)
    protected TypeNumber number;
    @XmlElement(namespace = "ranking", required = true)
    protected TypePoster poster;
    @XmlElement(namespace = "ranking", required = true)
    protected String name;
    @XmlElement(namespace = "ranking", required = true)
    protected TypeGenreColor genreName;
    @XmlElement(namespace = "ranking")
    protected float rating;
    @XmlElement(namespace = "ranking", required = true)
    protected TypeAge age;
    @XmlElement(namespace = "ranking", required = true)
    protected String releaseDate;
    @XmlElement(namespace = "ranking")
    protected TypePredecessor predecessor;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link TypeNumber }
     *     
     */
    public TypeNumber getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNumber }
     *     
     */
    public void setNumber(TypeNumber value) {
        this.number = value;
    }

    /**
     * Gets the value of the poster property.
     * 
     * @return
     *     possible object is
     *     {@link TypePoster }
     *     
     */
    public TypePoster getPoster() {
        return poster;
    }

    /**
     * Sets the value of the poster property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePoster }
     *     
     */
    public void setPoster(TypePoster value) {
        this.poster = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the genreName property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGenreColor }
     *     
     */
    public TypeGenreColor getGenreName() {
        return genreName;
    }

    /**
     * Sets the value of the genreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGenreColor }
     *     
     */
    public void setGenreName(TypeGenreColor value) {
        this.genreName = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     */
    public float getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     */
    public void setRating(float value) {
        this.rating = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAge }
     *     
     */
    public TypeAge getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAge }
     *     
     */
    public void setAge(TypeAge value) {
        this.age = value;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseDate(String value) {
        this.releaseDate = value;
    }

    /**
     * Gets the value of the predecessor property.
     * 
     * @return
     *     possible object is
     *     {@link TypePredecessor }
     *     
     */
    public TypePredecessor getPredecessor() {
        return predecessor;
    }

    /**
     * Sets the value of the predecessor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePredecessor }
     *     
     */
    public void setPredecessor(TypePredecessor value) {
        this.predecessor = value;
    }

}
