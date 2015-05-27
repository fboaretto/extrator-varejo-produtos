
package com.projetandoo.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 */
@WebService(name = "Produtos", targetNamespace = "http://service.varejodigital.projetandoo/1.0/")
@XmlSeeAlso({ObjectFactory.class})
public interface Produtos {

    /**
     * @param produto
     * @return 
     * 		returns com.projetandoo.ProdutoResponseType
     */
    @WebMethod(action = "salvarProduto")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "salvar", targetNamespace = "http://service.varejodigital.projetandoo/1.0/", className = "com.projetandoo.Salvar")
    @ResponseWrapper(localName = "salvarResponse", targetNamespace = "http://service.varejodigital.projetandoo/1.0/", className = "com.projetandoo.SalvarResponse")
    @Action(input = "salvarProduto", output = "http://service.varejodigital.projetandoo/1.0/Produtos/salvarResponse")
    public ProdutoResponseType salvar(@WebParam(name = "produto", targetNamespace = "")ProdutoType produto);

}