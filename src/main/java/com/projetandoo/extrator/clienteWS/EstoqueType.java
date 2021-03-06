
package com.projetandoo.extrator.clienteWS;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstoqueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="EstoqueType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="minimo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="disponivel" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="maximo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="ressuprimento" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstoqueType", propOrder = {
		"minimo",
		"disponivel",
		"maximo",
		"ressuprimento"
})
public class EstoqueType {

	@XmlElement(required = true)
	protected BigDecimal minimo;

	@XmlElement(required = true)
	protected BigDecimal disponivel;

	@XmlElement(required = true)
	protected BigDecimal maximo;

	@XmlElement(required = true)
	protected BigDecimal ressuprimento;

	/**
	 * Gets the value of the minimo property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigDecimal }
	 *     
	 */
	public BigDecimal getMinimo() {
		return minimo;
	}

	/**
	 * Sets the value of the minimo property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigDecimal }
	 *     
	 */
	public void setMinimo(BigDecimal value) {
		this.minimo = value;
	}

	/**
	 * Gets the value of the disponivel property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigDecimal }
	 *     
	 */
	public BigDecimal getDisponivel() {
		return disponivel;
	}

	/**
	 * Sets the value of the disponivel property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigDecimal }
	 *     
	 */
	public void setDisponivel(BigDecimal value) {
		this.disponivel = value;
	}

	/**
	 * Gets the value of the maximo property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigDecimal }
	 *     
	 */
	public BigDecimal getMaximo() {
		return maximo;
	}

	/**
	 * Sets the value of the maximo property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigDecimal }
	 *     
	 */
	public void setMaximo(BigDecimal value) {
		this.maximo = value;
	}

	/**
	 * Gets the value of the ressuprimento property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigDecimal }
	 *     
	 */
	public BigDecimal getRessuprimento() {
		return ressuprimento;
	}

	/**
	 * Sets the value of the ressuprimento property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigDecimal }
	 *     
	 */
	public void setRessuprimento(BigDecimal value) {
		this.ressuprimento = value;
	}

}
