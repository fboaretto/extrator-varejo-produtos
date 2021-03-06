
package com.projetandoo.extrator.clienteWS;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProdutoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ProdutoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="loja" type="{http://schema.varejodigital.projetandoo/1.0/}LojaType"/>
 *         <element name="departamanento" type="{http://schema.varejodigital.projetandoo/1.0/}DepartamentoType" minOccurs="0"/>
 *         <element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="preco" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="custo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="peso" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="estoque" type="{http://schema.varejodigital.projetandoo/1.0/}EstoqueType"/>
 *         <element name="gondola" type="{http://schema.varejodigital.projetandoo/1.0/}GondolaType"/>
 *         <element name="codigoBarra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="codigoInterno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="codigoExterno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="fornecedores" type="{http://schema.varejodigital.projetandoo/1.0/}FornecedorType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="margem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="vendasPorDia" type="{http://service.varejodigital.projetandoo/1.0/}quantidadeVendasPorDia" minOccurs="0"/>
 *         <element name="vendasPorSemana" type="{http://service.varejodigital.projetandoo/1.0/}quantidadeVendasPorSemana" minOccurs="0"/>
 *         <element name="vendasPorMes" type="{http://service.varejodigital.projetandoo/1.0/}quantidadeVendasPorMes" minOccurs="0"/>
 *         <element name="dataAuditoria" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoType", propOrder = {
		"loja",
		"departamanento",
		"nome",
		"preco",
		"custo",
		"peso",
		"estoque",
		"gondola",
		"codigoBarra",
		"codigoInterno",
		"codigoExterno",
		"fornecedores",
		"margem",
		"vendasPorDia",
		"vendasPorSemana",
		"vendasPorMes",
		"dataAuditoria"
})
public class ProdutoType {

	@XmlElement(required = true)
	protected LojaType loja;

	protected DepartamentoType departamanento;

	@XmlElement(required = true)
	protected String nome;

	@XmlElement(required = true)
	protected BigDecimal preco;

	@XmlElement(required = true)
	protected BigDecimal custo;

	@XmlElement(required = true)
	protected BigDecimal peso;

	@XmlElement(required = true)
	protected EstoqueType estoque;

	@XmlElement(required = true)
	protected GondolaType gondola;

	@XmlElement(required = true)
	protected String codigoBarra;

	protected long codigoInterno;

	protected long codigoExterno;

	@XmlElement(nillable = true)
	protected List<FornecedorType> fornecedores;

	protected BigDecimal margem;

	protected QuantidadeVendasPorDia vendasPorDia;

	protected QuantidadeVendasPorSemana vendasPorSemana;

	protected QuantidadeVendasPorMes vendasPorMes;

	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar dataAuditoria;

	/**
	 * Gets the value of the loja property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link LojaType }
	 *     
	 */
	public LojaType getLoja() {
		return loja;
	}

	/**
	 * Sets the value of the loja property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link LojaType }
	 *     
	 */
	public void setLoja(LojaType value) {
		this.loja = value;
	}

	/**
	 * Gets the value of the departamanento property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link DepartamentoType }
	 *     
	 */
	public DepartamentoType getDepartamanento() {
		return departamanento;
	}

	/**
	 * Sets the value of the departamanento property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link DepartamentoType }
	 *     
	 */
	public void setDepartamanento(DepartamentoType value) {
		this.departamanento = value;
	}

	/**
	 * Gets the value of the nome property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the value of the nome property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setNome(String value) {
		this.nome = value;
	}

	/**
	 * Gets the value of the preco property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigDecimal }
	 *     
	 */
	public BigDecimal getPreco() {
		return preco;
	}

	/**
	 * Sets the value of the preco property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigDecimal }
	 *     
	 */
	public void setPreco(BigDecimal value) {
		this.preco = value;
	}

	/**
	 * Gets the value of the custo property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigDecimal }
	 *     
	 */
	public BigDecimal getCusto() {
		return custo;
	}

	/**
	 * Sets the value of the custo property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigDecimal }
	 *     
	 */
	public void setCusto(BigDecimal value) {
		this.custo = value;
	}

	/**
	 * Gets the value of the peso property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigDecimal }
	 *     
	 */
	public BigDecimal getPeso() {
		return peso;
	}

	/**
	 * Sets the value of the peso property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigDecimal }
	 *     
	 */
	public void setPeso(BigDecimal value) {
		this.peso = value;
	}

	/**
	 * Gets the value of the estoque property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link EstoqueType }
	 *     
	 */
	public EstoqueType getEstoque() {
		return estoque;
	}

	/**
	 * Sets the value of the estoque property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link EstoqueType }
	 *     
	 */
	public void setEstoque(EstoqueType value) {
		this.estoque = value;
	}

	/**
	 * Gets the value of the gondola property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link GondolaType }
	 *     
	 */
	public GondolaType getGondola() {
		return gondola;
	}

	/**
	 * Sets the value of the gondola property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link GondolaType }
	 *     
	 */
	public void setGondola(GondolaType value) {
		this.gondola = value;
	}

	/**
	 * Gets the value of the codigoBarra property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getCodigoBarra() {
		return codigoBarra;
	}

	/**
	 * Sets the value of the codigoBarra property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setCodigoBarra(String value) {
		this.codigoBarra = value;
	}

	/**
	 * Gets the value of the codigoInterno property.
	 * 
	 */
	public long getCodigoInterno() {
		return codigoInterno;
	}

	/**
	 * Sets the value of the codigoInterno property.
	 * 
	 */
	public void setCodigoInterno(long value) {
		this.codigoInterno = value;
	}

	/**
	 * Gets the value of the codigoExterno property.
	 * 
	 */
	public long getCodigoExterno() {
		return codigoExterno;
	}

	/**
	 * Sets the value of the codigoExterno property.
	 * 
	 */
	public void setCodigoExterno(long value) {
		this.codigoExterno = value;
	}

	/**
	 * Gets the value of the fornecedores property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> 
	 * method for the fornecedores property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getFornecedores().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link FornecedorType }
	 * 
	 * 
	 */
	public List<FornecedorType> getFornecedores() {
		if (fornecedores == null) {
			fornecedores = new ArrayList<FornecedorType>();
		}
		return this.fornecedores;
	}

	/**
	 * Gets the value of the margem property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigDecimal }
	 *     
	 */
	public BigDecimal getMargem() {
		return margem;
	}

	/**
	 * Sets the value of the margem property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigDecimal }
	 *     
	 */
	public void setMargem(BigDecimal value) {
		this.margem = value;
	}

	/**
	 * Gets the value of the vendasPorDia property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link QuantidadeVendasPorDia }
	 *     
	 */
	public QuantidadeVendasPorDia getVendasPorDia() {
		return vendasPorDia;
	}

	/**
	 * Sets the value of the vendasPorDia property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link QuantidadeVendasPorDia }
	 *     
	 */
	public void setVendasPorDia(QuantidadeVendasPorDia value) {
		this.vendasPorDia = value;
	}

	/**
	 * Gets the value of the vendasPorSemana property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link QuantidadeVendasPorSemana }
	 *     
	 */
	public QuantidadeVendasPorSemana getVendasPorSemana() {
		return vendasPorSemana;
	}

	/**
	 * Sets the value of the vendasPorSemana property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link QuantidadeVendasPorSemana }
	 *     
	 */
	public void setVendasPorSemana(QuantidadeVendasPorSemana value) {
		this.vendasPorSemana = value;
	}

	/**
	 * Gets the value of the vendasPorMes property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link QuantidadeVendasPorMes }
	 *     
	 */
	public QuantidadeVendasPorMes getVendasPorMes() {
		return vendasPorMes;
	}

	/**
	 * Sets the value of the vendasPorMes property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link QuantidadeVendasPorMes }
	 *     
	 */
	public void setVendasPorMes(QuantidadeVendasPorMes value) {
		this.vendasPorMes = value;
	}

	/**
	 * Gets the value of the dataAuditoria property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link XMLGregorianCalendar }
	 *     
	 */
	public XMLGregorianCalendar getDataAuditoria() {
		return dataAuditoria;
	}

	/**
	 * Sets the value of the dataAuditoria property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link XMLGregorianCalendar }
	 *     
	 */
	public void setDataAuditoria(XMLGregorianCalendar value) {
		this.dataAuditoria = value;
	}

}
