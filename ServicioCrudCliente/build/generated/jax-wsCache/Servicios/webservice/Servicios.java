
package webservice;

import java.util.List;
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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Servicios", targetNamespace = "http://WebService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicios {


    /**
     * 
     * @return
     *     returns java.util.List<webservice.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "operation", targetNamespace = "http://WebService/", className = "webservice.Operation")
    @ResponseWrapper(localName = "operationResponse", targetNamespace = "http://WebService/", className = "webservice.OperationResponse")
    @Action(input = "http://WebService/Servicios/operationRequest", output = "http://WebService/Servicios/operationResponse")
    public List<User> operation();

    /**
     * 
     * @param apellidos
     * @param nombres
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregar", targetNamespace = "http://WebService/", className = "webservice.Agregar")
    @ResponseWrapper(localName = "agregarResponse", targetNamespace = "http://WebService/", className = "webservice.AgregarResponse")
    @Action(input = "http://WebService/Servicios/agregarRequest", output = "http://WebService/Servicios/agregarResponse")
    public String agregar(
        @WebParam(name = "nombres", targetNamespace = "")
        String nombres,
        @WebParam(name = "apellidos", targetNamespace = "")
        String apellidos);

    /**
     * 
     * @param id
     * @return
     *     returns webservice.User
     */
    @WebMethod(operationName = "ListarID")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListarID", targetNamespace = "http://WebService/", className = "webservice.ListarID")
    @ResponseWrapper(localName = "ListarIDResponse", targetNamespace = "http://WebService/", className = "webservice.ListarIDResponse")
    @Action(input = "http://WebService/Servicios/ListarIDRequest", output = "http://WebService/Servicios/ListarIDResponse")
    public User listarID(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param apellidos
     * @param id
     * @param nombres
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Actualizar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Actualizar", targetNamespace = "http://WebService/", className = "webservice.Actualizar")
    @ResponseWrapper(localName = "ActualizarResponse", targetNamespace = "http://WebService/", className = "webservice.ActualizarResponse")
    @Action(input = "http://WebService/Servicios/ActualizarRequest", output = "http://WebService/Servicios/ActualizarResponse")
    public String actualizar(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "nombres", targetNamespace = "")
        String nombres,
        @WebParam(name = "apellidos", targetNamespace = "")
        String apellidos);

    /**
     * 
     * @param id
     * @return
     *     returns webservice.User
     */
    @WebMethod(operationName = "Eliminar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Eliminar", targetNamespace = "http://WebService/", className = "webservice.Eliminar")
    @ResponseWrapper(localName = "EliminarResponse", targetNamespace = "http://WebService/", className = "webservice.EliminarResponse")
    @Action(input = "http://WebService/Servicios/EliminarRequest", output = "http://WebService/Servicios/EliminarResponse")
    public User eliminar(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}