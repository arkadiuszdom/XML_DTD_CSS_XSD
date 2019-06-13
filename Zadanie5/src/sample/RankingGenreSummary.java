
package sample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="positionsTable">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="positionsTableHeadRow">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="positionsTableHeadGenre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="positionsTableHeadTitles" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="positionsTableHeadSummedRating" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="positionsTableDataRow" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="positionsTableDataGenre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="positionsTableDataTitles">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="positionsTableDataTitle" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="positionsTableDataSummedRating" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reportTable">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reportTableHeadRow">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="reportTableHeadNGenres" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="reportTableHeadNPositions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="reportTableHeadTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="reportTableHeadDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="reportTableDataRow">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="reportTableDataNGeneres" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="reportTableDataNPositions" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="reportTableDataTotal" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="reportTableDataDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "positionsTable",
    "reportTable"
})
@XmlRootElement(name = "rankingGenreSummary")
public class RankingGenreSummary {

    @XmlElement(required = true)
    protected RankingGenreSummary.PositionsTable positionsTable;
    @XmlElement(required = true)
    protected RankingGenreSummary.ReportTable reportTable;

    /**
     * Gets the value of the positionsTable property.
     * 
     * @return
     *     possible object is
     *     {@link RankingGenreSummary.PositionsTable }
     *     
     */
    public RankingGenreSummary.PositionsTable getPositionsTable() {
        return positionsTable;
    }

    /**
     * Sets the value of the positionsTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link RankingGenreSummary.PositionsTable }
     *     
     */
    public void setPositionsTable(RankingGenreSummary.PositionsTable value) {
        this.positionsTable = value;
    }

    /**
     * Gets the value of the reportTable property.
     * 
     * @return
     *     possible object is
     *     {@link RankingGenreSummary.ReportTable }
     *     
     */
    public RankingGenreSummary.ReportTable getReportTable() {
        return reportTable;
    }

    /**
     * Sets the value of the reportTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link RankingGenreSummary.ReportTable }
     *     
     */
    public void setReportTable(RankingGenreSummary.ReportTable value) {
        this.reportTable = value;
    }


    public void addPositionsTableDataTitle(String positionsTableDataTitle, String positionsTableDataGenre) {
        this.positionsTable.addPositionsTableDataTitle(positionsTableDataTitle, positionsTableDataGenre);
    }
    public void editPositionsTableDataTitle(String positionsTableDataTitleOld, String positionsTableDataTitleNew, String positionsTableDataGenre) {
        this.positionsTable.editPositionsTableDataTitle( positionsTableDataTitleOld, positionsTableDataTitleNew, positionsTableDataGenre);
    }
    public void deletePositionsTableDataTitle(String positionsTableDataTitle, String positionsTableDataGenre) {
        this.positionsTable.deletePositionsTableDataTitle(positionsTableDataTitle, positionsTableDataGenre);
    }

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
     *         &lt;element name="positionsTableHeadRow">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="positionsTableHeadGenre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="positionsTableHeadTitles" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="positionsTableHeadSummedRating" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="positionsTableDataRow" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="positionsTableDataGenre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="positionsTableDataTitles">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="positionsTableDataTitle" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="positionsTableDataSummedRating" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "positionsTableHeadRow",
        "positionsTableDataRow"
    })
    public static class PositionsTable {

        @XmlElement(required = true)
        protected RankingGenreSummary.PositionsTable.PositionsTableHeadRow positionsTableHeadRow;
        protected List<RankingGenreSummary.PositionsTable.PositionsTableDataRow> positionsTableDataRow;

        /**
         * Gets the value of the positionsTableHeadRow property.
         * 
         * @return
         *     possible object is
         *     {@link RankingGenreSummary.PositionsTable.PositionsTableHeadRow }
         *     
         */
        public RankingGenreSummary.PositionsTable.PositionsTableHeadRow getPositionsTableHeadRow() {
            return positionsTableHeadRow;
        }

        /**
         * Sets the value of the positionsTableHeadRow property.
         * 
         * @param value
         *     allowed object is
         *     {@link RankingGenreSummary.PositionsTable.PositionsTableHeadRow }
         *     
         */
        public void setPositionsTableHeadRow(RankingGenreSummary.PositionsTable.PositionsTableHeadRow value) {
            this.positionsTableHeadRow = value;
        }

        /**
         * Gets the value of the positionsTableDataRow property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the positionsTableDataRow property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPositionsTableDataRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RankingGenreSummary.PositionsTable.PositionsTableDataRow }
         * 
         * 
         */
        public List<RankingGenreSummary.PositionsTable.PositionsTableDataRow> getPositionsTableDataRow() {
            if (positionsTableDataRow == null) {
                positionsTableDataRow = new ArrayList<RankingGenreSummary.PositionsTable.PositionsTableDataRow>();
            }
            return this.positionsTableDataRow;
        }
        public void addPositionsTableDataTitle(String positionsTableDataTitle, String positionsTableDataGenre) {
            for (int i = 0; i < this.positionsTableDataRow.size(); i++) {
                RankingGenreSummary.PositionsTable.PositionsTableDataRow positionsTableDataRow = this.positionsTableDataRow.get(i);
                if( positionsTableDataGenre.equals( positionsTableDataRow.getPositionsTableDataGenre() ) ) {
                    positionsTableDataRow.addPositionsTableDataTitle(positionsTableDataTitle);
                }
            }
        }
        public void editPositionsTableDataTitle(String positionsTableDataTitleOld, String positionsTableDataTitleNew, String positionsTableDataGenre) {
            for (int i = 0; i < this.positionsTableDataRow.size(); i++) {
                RankingGenreSummary.PositionsTable.PositionsTableDataRow positionsTableDataRow = this.positionsTableDataRow.get(i);
                if( positionsTableDataGenre.equals( positionsTableDataRow.getPositionsTableDataGenre() ) ) {
                    positionsTableDataRow.editPositionsTableDataTitle( positionsTableDataTitleOld, positionsTableDataTitleNew);
                }
            }
        }
        public void deletePositionsTableDataTitle(String positionsTableDataTitle, String positionsTableDataGenre) {
            for (int i = 0; i < this.positionsTableDataRow.size(); i++) {
                RankingGenreSummary.PositionsTable.PositionsTableDataRow positionsTableDataRow = this.positionsTableDataRow.get(i);
                if( positionsTableDataGenre.equals( positionsTableDataRow.getPositionsTableDataGenre() ) ) {
                    positionsTableDataRow.deletePositionsTableDataTitle(positionsTableDataTitle);
                }
            }
        }


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
         *         &lt;element name="positionsTableDataGenre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="positionsTableDataTitles">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="positionsTableDataTitle" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="positionsTableDataSummedRating" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
            "positionsTableDataGenre",
            "positionsTableDataTitles",
            "positionsTableDataSummedRating"
        })
        public static class PositionsTableDataRow {

            @XmlElement(required = true)
            protected String positionsTableDataGenre;
            @XmlElement(required = true)
            protected RankingGenreSummary.PositionsTable.PositionsTableDataRow.PositionsTableDataTitles positionsTableDataTitles;
            protected float positionsTableDataSummedRating;

            /**
             * Gets the value of the positionsTableDataGenre property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPositionsTableDataGenre() {
                return positionsTableDataGenre;
            }

            /**
             * Sets the value of the positionsTableDataGenre property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPositionsTableDataGenre(String value) {
                this.positionsTableDataGenre = value;
            }

            /**
             * Gets the value of the positionsTableDataTitles property.
             * 
             * @return
             *     possible object is
             *     {@link RankingGenreSummary.PositionsTable.PositionsTableDataRow.PositionsTableDataTitles }
             *     
             */
            public RankingGenreSummary.PositionsTable.PositionsTableDataRow.PositionsTableDataTitles getPositionsTableDataTitles() {
                return positionsTableDataTitles;
            }

            /**
             * Sets the value of the positionsTableDataTitles property.
             * 
             * @param value
             *     allowed object is
             *     {@link RankingGenreSummary.PositionsTable.PositionsTableDataRow.PositionsTableDataTitles }
             *     
             */
            public void setPositionsTableDataTitles(RankingGenreSummary.PositionsTable.PositionsTableDataRow.PositionsTableDataTitles value) {
                this.positionsTableDataTitles = value;
            }
            public void addPositionsTableDataTitle(String positionsTableDataTitle) {
                this.positionsTableDataTitles.addPositionsTableDataTitle(positionsTableDataTitle);
            }
            public void editPositionsTableDataTitle(String positionsTableDataTitleOld, String positionsTableDataTitleNew) {
                this.positionsTableDataTitles.editPositionsTableDataTitle(positionsTableDataTitleOld, positionsTableDataTitleNew);
            }
            public void deletePositionsTableDataTitle(String positionsTableDataTitle) {
                this.positionsTableDataTitles.deletePositionsTableDataTitle(positionsTableDataTitle);
            }

            /**
             * Gets the value of the positionsTableDataSummedRating property.
             * 
             */
            public float getPositionsTableDataSummedRating() {
                return positionsTableDataSummedRating;
            }

            /**
             * Sets the value of the positionsTableDataSummedRating property.
             * 
             */
            public void setPositionsTableDataSummedRating(float value) {
                this.positionsTableDataSummedRating = value;
            }


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
             *         &lt;element name="positionsTableDataTitle" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                "positionsTableDataTitle"
            })
            public static class PositionsTableDataTitles {

                protected List<String> positionsTableDataTitle;

                /**
                 * Gets the value of the positionsTableDataTitle property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the positionsTableDataTitle property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPositionsTableDataTitle().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getPositionsTableDataTitle() {
                    if (positionsTableDataTitle == null) {
                        positionsTableDataTitle = new ArrayList<String>();
                    }
                    return this.positionsTableDataTitle;
                }

                public void addPositionsTableDataTitle(String positionsTableDataTitle) {
                    this.positionsTableDataTitle.add(positionsTableDataTitle);
                }
                public void editPositionsTableDataTitle(String positionsTableDataTitleOld, String positionsTableDataTitleNew) {
                    this.positionsTableDataTitle.set( this.positionsTableDataTitle.indexOf(positionsTableDataTitleOld), positionsTableDataTitleNew );
                }
                public void deletePositionsTableDataTitle(String positionsTableDataTitle) {
                    this.positionsTableDataTitle.remove( positionsTableDataTitle );
                }
            }

        }


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
         *         &lt;element name="positionsTableHeadGenre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="positionsTableHeadTitles" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="positionsTableHeadSummedRating" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "positionsTableHeadGenre",
            "positionsTableHeadTitles",
            "positionsTableHeadSummedRating"
        })
        public static class PositionsTableHeadRow {

            @XmlElement(required = true)
            protected String positionsTableHeadGenre;
            @XmlElement(required = true)
            protected String positionsTableHeadTitles;
            @XmlElement(required = true)
            protected String positionsTableHeadSummedRating;

            /**
             * Gets the value of the positionsTableHeadGenre property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPositionsTableHeadGenre() {
                return positionsTableHeadGenre;
            }

            /**
             * Sets the value of the positionsTableHeadGenre property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPositionsTableHeadGenre(String value) {
                this.positionsTableHeadGenre = value;
            }

            /**
             * Gets the value of the positionsTableHeadTitles property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPositionsTableHeadTitles() {
                return positionsTableHeadTitles;
            }

            /**
             * Sets the value of the positionsTableHeadTitles property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPositionsTableHeadTitles(String value) {
                this.positionsTableHeadTitles = value;
            }

            /**
             * Gets the value of the positionsTableHeadSummedRating property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPositionsTableHeadSummedRating() {
                return positionsTableHeadSummedRating;
            }

            /**
             * Sets the value of the positionsTableHeadSummedRating property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPositionsTableHeadSummedRating(String value) {
                this.positionsTableHeadSummedRating = value;
            }

        }

    }


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
     *         &lt;element name="reportTableHeadRow">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="reportTableHeadNGenres" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="reportTableHeadNPositions" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="reportTableHeadTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="reportTableHeadDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="reportTableDataRow">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="reportTableDataNGeneres" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="reportTableDataNPositions" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="reportTableDataTotal" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="reportTableDataDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "reportTableHeadRow",
        "reportTableDataRow"
    })
    public static class ReportTable {

        @XmlElement(required = true)
        protected RankingGenreSummary.ReportTable.ReportTableHeadRow reportTableHeadRow;
        @XmlElement(required = true)
        protected RankingGenreSummary.ReportTable.ReportTableDataRow reportTableDataRow;

        /**
         * Gets the value of the reportTableHeadRow property.
         * 
         * @return
         *     possible object is
         *     {@link RankingGenreSummary.ReportTable.ReportTableHeadRow }
         *     
         */
        public RankingGenreSummary.ReportTable.ReportTableHeadRow getReportTableHeadRow() {
            return reportTableHeadRow;
        }

        /**
         * Sets the value of the reportTableHeadRow property.
         * 
         * @param value
         *     allowed object is
         *     {@link RankingGenreSummary.ReportTable.ReportTableHeadRow }
         *     
         */
        public void setReportTableHeadRow(RankingGenreSummary.ReportTable.ReportTableHeadRow value) {
            this.reportTableHeadRow = value;
        }

        /**
         * Gets the value of the reportTableDataRow property.
         * 
         * @return
         *     possible object is
         *     {@link RankingGenreSummary.ReportTable.ReportTableDataRow }
         *     
         */
        public RankingGenreSummary.ReportTable.ReportTableDataRow getReportTableDataRow() {
            return reportTableDataRow;
        }

        /**
         * Sets the value of the reportTableDataRow property.
         * 
         * @param value
         *     allowed object is
         *     {@link RankingGenreSummary.ReportTable.ReportTableDataRow }
         *     
         */
        public void setReportTableDataRow(RankingGenreSummary.ReportTable.ReportTableDataRow value) {
            this.reportTableDataRow = value;
        }


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
         *         &lt;element name="reportTableDataNGeneres" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="reportTableDataNPositions" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="reportTableDataTotal" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="reportTableDataDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
            "reportTableDataNGeneres",
            "reportTableDataNPositions",
            "reportTableDataTotal",
            "reportTableDataDate"
        })
        public static class ReportTableDataRow {

            protected byte reportTableDataNGeneres;
            protected byte reportTableDataNPositions;
            protected float reportTableDataTotal;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar reportTableDataDate;

            /**
             * Gets the value of the reportTableDataNGeneres property.
             * 
             */
            public byte getReportTableDataNGeneres() {
                return reportTableDataNGeneres;
            }

            /**
             * Sets the value of the reportTableDataNGeneres property.
             * 
             */
            public void setReportTableDataNGeneres(byte value) {
                this.reportTableDataNGeneres = value;
            }

            /**
             * Gets the value of the reportTableDataNPositions property.
             * 
             */
            public byte getReportTableDataNPositions() {
                return reportTableDataNPositions;
            }

            /**
             * Sets the value of the reportTableDataNPositions property.
             * 
             */
            public void setReportTableDataNPositions(byte value) {
                this.reportTableDataNPositions = value;
            }

            /**
             * Gets the value of the reportTableDataTotal property.
             * 
             */
            public float getReportTableDataTotal() {
                return reportTableDataTotal;
            }

            /**
             * Sets the value of the reportTableDataTotal property.
             * 
             */
            public void setReportTableDataTotal(float value) {
                this.reportTableDataTotal = value;
            }

            /**
             * Gets the value of the reportTableDataDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getReportTableDataDate() {
                return reportTableDataDate;
            }

            /**
             * Sets the value of the reportTableDataDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setReportTableDataDate(XMLGregorianCalendar value) {
                this.reportTableDataDate = value;
            }

        }


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
         *         &lt;element name="reportTableHeadNGenres" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="reportTableHeadNPositions" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="reportTableHeadTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="reportTableHeadDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "reportTableHeadNGenres",
            "reportTableHeadNPositions",
            "reportTableHeadTotal",
            "reportTableHeadDate"
        })
        public static class ReportTableHeadRow {

            @XmlElement(required = true)
            protected String reportTableHeadNGenres;
            @XmlElement(required = true)
            protected String reportTableHeadNPositions;
            @XmlElement(required = true)
            protected String reportTableHeadTotal;
            @XmlElement(required = true)
            protected String reportTableHeadDate;

            /**
             * Gets the value of the reportTableHeadNGenres property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReportTableHeadNGenres() {
                return reportTableHeadNGenres;
            }

            /**
             * Sets the value of the reportTableHeadNGenres property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReportTableHeadNGenres(String value) {
                this.reportTableHeadNGenres = value;
            }

            /**
             * Gets the value of the reportTableHeadNPositions property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReportTableHeadNPositions() {
                return reportTableHeadNPositions;
            }

            /**
             * Sets the value of the reportTableHeadNPositions property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReportTableHeadNPositions(String value) {
                this.reportTableHeadNPositions = value;
            }

            /**
             * Gets the value of the reportTableHeadTotal property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReportTableHeadTotal() {
                return reportTableHeadTotal;
            }

            /**
             * Sets the value of the reportTableHeadTotal property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReportTableHeadTotal(String value) {
                this.reportTableHeadTotal = value;
            }

            /**
             * Gets the value of the reportTableHeadDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReportTableHeadDate() {
                return reportTableHeadDate;
            }

            /**
             * Sets the value of the reportTableHeadDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReportTableHeadDate(String value) {
                this.reportTableHeadDate = value;
            }

        }

    }

}
