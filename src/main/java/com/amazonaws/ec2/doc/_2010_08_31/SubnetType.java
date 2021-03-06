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
 * <p>Java class for SubnetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubnetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subnetId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vpcId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidrBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="availableIpAddressCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="availabilityZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagSet" type="{http://ec2.amazonaws.com/doc/2010-08-31/}ResourceTagSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubnetType", propOrder = {
    "subnetId",
    "state",
    "vpcId",
    "cidrBlock",
    "availableIpAddressCount",
    "availabilityZone",
    "tagSet"
})
public class SubnetType {

    @XmlElement(required = true)
    protected String subnetId;
    protected String state;
    protected String vpcId;
    protected String cidrBlock;
    protected Integer availableIpAddressCount;
    protected String availabilityZone;
    protected ResourceTagSetType tagSet;

    /**
     * Gets the value of the subnetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * Sets the value of the subnetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetId(String value) {
        this.subnetId = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the vpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * Sets the value of the vpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpcId(String value) {
        this.vpcId = value;
    }

    /**
     * Gets the value of the cidrBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * Sets the value of the cidrBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidrBlock(String value) {
        this.cidrBlock = value;
    }

    /**
     * Gets the value of the availableIpAddressCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableIpAddressCount() {
        return availableIpAddressCount;
    }

    /**
     * Sets the value of the availableIpAddressCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableIpAddressCount(Integer value) {
        this.availableIpAddressCount = value;
    }

    /**
     * Gets the value of the availabilityZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * Sets the value of the availabilityZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityZone(String value) {
        this.availabilityZone = value;
    }

    /**
     * Gets the value of the tagSet property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceTagSetType }
     *     
     */
    public ResourceTagSetType getTagSet() {
        return tagSet;
    }

    /**
     * Sets the value of the tagSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceTagSetType }
     *     
     */
    public void setTagSet(ResourceTagSetType value) {
        this.tagSet = value;
    }

}
