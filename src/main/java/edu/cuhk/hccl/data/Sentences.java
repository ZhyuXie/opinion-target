//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.22 at 09:10:09 AM GMT 
//


package edu.cuhk.hccl.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="sentence" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="aspectTerms" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="aspectTerm" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="term" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="polarity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                     &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="aspectCategories">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="aspectCategory" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="polarity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}String" />
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
    "sentence"
})
@XmlRootElement(name = "sentences")
public class Sentences {

    protected List<Sentences.Sentence> sentence;

    /**
     * Gets the value of the sentence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sentence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSentence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sentences.Sentence }
     * 
     * 
     */
    public List<Sentences.Sentence> getSentence() {
        if (sentence == null) {
            sentence = new ArrayList<Sentences.Sentence>();
        }
        return this.sentence;
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
     *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="aspectTerms" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="aspectTerm" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="term" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="polarity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                           &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="aspectCategories">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="aspectCategory" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="polarity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}String" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "text",
        "aspectTerms",
        "aspectCategories"
    })
    public static class Sentence {

        @XmlElement(required = true)
        protected String text;
        protected Sentences.Sentence.AspectTerms aspectTerms;
        @XmlElement(required = true)
        protected Sentences.Sentence.AspectCategories aspectCategories;
        @XmlAttribute
        protected String id;

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Gets the value of the aspectTerms property.
         * 
         * @return
         *     possible object is
         *     {@link Sentences.Sentence.AspectTerms }
         *     
         */
        public Sentences.Sentence.AspectTerms getAspectTerms() {
            return aspectTerms;
        }

        /**
         * Sets the value of the aspectTerms property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sentences.Sentence.AspectTerms }
         *     
         */
        public void setAspectTerms(Sentences.Sentence.AspectTerms value) {
            this.aspectTerms = value;
        }

        /**
         * Gets the value of the aspectCategories property.
         * 
         * @return
         *     possible object is
         *     {@link Sentences.Sentence.AspectCategories }
         *     
         */
        public Sentences.Sentence.AspectCategories getAspectCategories() {
            return aspectCategories;
        }

        /**
         * Sets the value of the aspectCategories property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sentences.Sentence.AspectCategories }
         *     
         */
        public void setAspectCategories(Sentences.Sentence.AspectCategories value) {
            this.aspectCategories = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
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
         *         &lt;element name="aspectCategory" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="polarity" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
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
            "aspectCategory"
        })
        public static class AspectCategories {

            protected List<Sentences.Sentence.AspectCategories.AspectCategory> aspectCategory;

            /**
             * Gets the value of the aspectCategory property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the aspectCategory property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAspectCategory().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Sentences.Sentence.AspectCategories.AspectCategory }
             * 
             * 
             */
            public List<Sentences.Sentence.AspectCategories.AspectCategory> getAspectCategory() {
                if (aspectCategory == null) {
                    aspectCategory = new ArrayList<Sentences.Sentence.AspectCategories.AspectCategory>();
                }
                return this.aspectCategory;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="polarity" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class AspectCategory {

                @XmlValue
                protected String value;
                @XmlAttribute
                protected String category;
                @XmlAttribute
                protected String polarity;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the category property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCategory() {
                    return category;
                }

                /**
                 * Sets the value of the category property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCategory(String value) {
                    this.category = value;
                }

                /**
                 * Gets the value of the polarity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPolarity() {
                    return polarity;
                }

                /**
                 * Sets the value of the polarity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPolarity(String value) {
                    this.polarity = value;
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
         *         &lt;element name="aspectTerm" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="term" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="polarity" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                 &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}short" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
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
            "aspectTerm"
        })
        public static class AspectTerms {

            protected List<Sentences.Sentence.AspectTerms.AspectTerm> aspectTerm;

            /**
             * Gets the value of the aspectTerm property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the aspectTerm property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAspectTerm().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Sentences.Sentence.AspectTerms.AspectTerm }
             * 
             * 
             */
            public List<Sentences.Sentence.AspectTerms.AspectTerm> getAspectTerm() {
                if (aspectTerm == null) {
                    aspectTerm = new ArrayList<Sentences.Sentence.AspectTerms.AspectTerm>();
                }
                return this.aspectTerm;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="term" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="polarity" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}short" />
             *       &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}short" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class AspectTerm {

                @XmlValue
                protected String value;
                @XmlAttribute
                protected String term;
                @XmlAttribute
                protected String polarity;
                @XmlAttribute
                protected Short from;
                @XmlAttribute
                protected Short to;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the term property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTerm() {
                    return term;
                }

                /**
                 * Sets the value of the term property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTerm(String value) {
                    this.term = value;
                }

                /**
                 * Gets the value of the polarity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPolarity() {
                    return polarity;
                }

                /**
                 * Sets the value of the polarity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPolarity(String value) {
                    this.polarity = value;
                }

                /**
                 * Gets the value of the from property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Short }
                 *     
                 */
                public Short getFrom() {
                    return from;
                }

                /**
                 * Sets the value of the from property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Short }
                 *     
                 */
                public void setFrom(Short value) {
                    this.from = value;
                }

                /**
                 * Gets the value of the to property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Short }
                 *     
                 */
                public Short getTo() {
                    return to;
                }

                /**
                 * Sets the value of the to property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Short }
                 *     
                 */
                public void setTo(Short value) {
                    this.to = value;
                }

            }

        }

    }

}