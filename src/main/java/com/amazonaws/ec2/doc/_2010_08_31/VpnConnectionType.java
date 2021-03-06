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
 * <p>Java class for VpnConnectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VpnConnectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vpnConnectionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerGatewayConfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerGatewayId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vpnGatewayId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "VpnConnectionType", propOrder = {
    "vpnConnectionId",
    "state",
    "customerGatewayConfiguration",
    "type",
    "customerGatewayId",
    "vpnGatewayId",
    "tagSet"
})
public class VpnConnectionType {

    @XmlElement(required = true)
    protected String vpnConnectionId;
    @XmlElement(required = true)
    protected String state;
    protected String customerGatewayConfiguration;
    protected String type;
    @XmlElement(required = true)
    protected String customerGatewayId;
    @XmlElement(required = true)
    protected String vpnGatewayId;
    protected ResourceTagSetType tagSet;

    /**
     * Gets the value of the vpnConnectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnConnectionId() {
        return vpnConnectionId;
    }

    /**
     * Sets the value of the vpnConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnConnectionId(String value) {
        this.vpnConnectionId = value;
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
     * Gets the value of the customerGatewayConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGatewayConfiguration() {
        return customerGatewayConfiguration;
    }

    /**
     * Sets the value of the customerGatewayConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGatewayConfiguration(String value) {
        this.customerGatewayConfiguration = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the customerGatewayId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }

    /**
     * Sets the value of the customerGatewayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGatewayId(String value) {
        this.customerGatewayId = value;
    }

    /**
     * Gets the value of the vpnGatewayId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }

    /**
     * Sets the value of the vpnGatewayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnGatewayId(String value) {
        this.vpnGatewayId = value;
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
