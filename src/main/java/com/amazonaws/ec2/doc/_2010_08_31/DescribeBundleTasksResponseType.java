//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.07 at 09:45:19 AM CET 
//


package com.amazonaws.ec2.doc._2010_08_31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeBundleTasksResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeBundleTasksResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bundleInstanceTasksSet" type="{http://ec2.amazonaws.com/doc/2010-08-31/}BundleInstanceTasksSetType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeBundleTasksResponseType", propOrder = {
    "requestId",
    "bundleInstanceTasksSet"
})
public class DescribeBundleTasksResponseType {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected BundleInstanceTasksSetType bundleInstanceTasksSet;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the bundleInstanceTasksSet property.
     * 
     * @return
     *     possible object is
     *     {@link BundleInstanceTasksSetType }
     *     
     */
    public BundleInstanceTasksSetType getBundleInstanceTasksSet() {
        return bundleInstanceTasksSet;
    }

    /**
     * Sets the value of the bundleInstanceTasksSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleInstanceTasksSetType }
     *     
     */
    public void setBundleInstanceTasksSet(BundleInstanceTasksSetType value) {
        this.bundleInstanceTasksSet = value;
    }

}
