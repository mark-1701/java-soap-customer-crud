
package model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddCustomerSOAP_QNAME = new QName("http://main/", "addCustomerSOAP");
    private final static QName _AddCustomerSOAPResponse_QNAME = new QName("http://main/", "addCustomerSOAPResponse");
    private final static QName _DeleteCustomer_QNAME = new QName("http://main/", "deleteCustomer");
    private final static QName _DeleteCustomerResponse_QNAME = new QName("http://main/", "deleteCustomerResponse");
    private final static QName _EditCustomerSOAP_QNAME = new QName("http://main/", "editCustomerSOAP");
    private final static QName _EditCustomerSOAPResponse_QNAME = new QName("http://main/", "editCustomerSOAPResponse");
    private final static QName _ListCustomersSOAP_QNAME = new QName("http://main/", "listCustomersSOAP");
    private final static QName _ListCustomersSOAPResponse_QNAME = new QName("http://main/", "listCustomersSOAPResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCustomerSOAP }
     * 
     */
    public AddCustomerSOAP createAddCustomerSOAP() {
        return new AddCustomerSOAP();
    }

    /**
     * Create an instance of {@link AddCustomerSOAPResponse }
     * 
     */
    public AddCustomerSOAPResponse createAddCustomerSOAPResponse() {
        return new AddCustomerSOAPResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomer }
     * 
     */
    public DeleteCustomer createDeleteCustomer() {
        return new DeleteCustomer();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link EditCustomerSOAP }
     * 
     */
    public EditCustomerSOAP createEditCustomerSOAP() {
        return new EditCustomerSOAP();
    }

    /**
     * Create an instance of {@link EditCustomerSOAPResponse }
     * 
     */
    public EditCustomerSOAPResponse createEditCustomerSOAPResponse() {
        return new EditCustomerSOAPResponse();
    }

    /**
     * Create an instance of {@link ListCustomersSOAP }
     * 
     */
    public ListCustomersSOAP createListCustomersSOAP() {
        return new ListCustomersSOAP();
    }

    /**
     * Create an instance of {@link ListCustomersSOAPResponse }
     * 
     */
    public ListCustomersSOAPResponse createListCustomersSOAPResponse() {
        return new ListCustomersSOAPResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCustomerSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://main/", name = "addCustomerSOAP")
    public JAXBElement<AddCustomerSOAP> createAddCustomerSOAP(AddCustomerSOAP value) {
        return new JAXBElement<AddCustomerSOAP>(_AddCustomerSOAP_QNAME, AddCustomerSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerSOAPResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCustomerSOAPResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://main/", name = "addCustomerSOAPResponse")
    public JAXBElement<AddCustomerSOAPResponse> createAddCustomerSOAPResponse(AddCustomerSOAPResponse value) {
        return new JAXBElement<AddCustomerSOAPResponse>(_AddCustomerSOAPResponse_QNAME, AddCustomerSOAPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://main/", name = "deleteCustomer")
    public JAXBElement<DeleteCustomer> createDeleteCustomer(DeleteCustomer value) {
        return new JAXBElement<DeleteCustomer>(_DeleteCustomer_QNAME, DeleteCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://main/", name = "deleteCustomerResponse")
    public JAXBElement<DeleteCustomerResponse> createDeleteCustomerResponse(DeleteCustomerResponse value) {
        return new JAXBElement<DeleteCustomerResponse>(_DeleteCustomerResponse_QNAME, DeleteCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomerSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditCustomerSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://main/", name = "editCustomerSOAP")
    public JAXBElement<EditCustomerSOAP> createEditCustomerSOAP(EditCustomerSOAP value) {
        return new JAXBElement<EditCustomerSOAP>(_EditCustomerSOAP_QNAME, EditCustomerSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomerSOAPResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditCustomerSOAPResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://main/", name = "editCustomerSOAPResponse")
    public JAXBElement<EditCustomerSOAPResponse> createEditCustomerSOAPResponse(EditCustomerSOAPResponse value) {
        return new JAXBElement<EditCustomerSOAPResponse>(_EditCustomerSOAPResponse_QNAME, EditCustomerSOAPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCustomersSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListCustomersSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://main/", name = "listCustomersSOAP")
    public JAXBElement<ListCustomersSOAP> createListCustomersSOAP(ListCustomersSOAP value) {
        return new JAXBElement<ListCustomersSOAP>(_ListCustomersSOAP_QNAME, ListCustomersSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCustomersSOAPResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListCustomersSOAPResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://main/", name = "listCustomersSOAPResponse")
    public JAXBElement<ListCustomersSOAPResponse> createListCustomersSOAPResponse(ListCustomersSOAPResponse value) {
        return new JAXBElement<ListCustomersSOAPResponse>(_ListCustomersSOAPResponse_QNAME, ListCustomersSOAPResponse.class, null, value);
    }

}
