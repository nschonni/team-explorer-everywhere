// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceImplementation.vm template.
 */
package ms.tfs.services.serverstatus._03;

import com.microsoft.tfs.core.httpclient.HttpClient;
import com.microsoft.tfs.core.ws.runtime.client.*;
import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.services.serverstatus._03._DataChanged;
import ms.tfs.services.serverstatus._03._ServerStatusSoap_CheckAuthentication;
import ms.tfs.services.serverstatus._03._ServerStatusSoap_CheckAuthenticationResponse;
import ms.tfs.services.serverstatus._03._ServerStatusSoap_GetServerStatus;
import ms.tfs.services.serverstatus._03._ServerStatusSoap_GetServerStatusResponse;
import ms.tfs.services.serverstatus._03._ServerStatusSoap_GetSupportedContractVersion;
import ms.tfs.services.serverstatus._03._ServerStatusSoap_GetSupportedContractVersionResponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.lang.String;

import java.net.URI;

import java.util.Calendar;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/Services/ServerStatus/03}ServerStatusSoap12Service
 */
public class _ServerStatusSoap12Service
    extends SOAP12Service
    implements _ServerStatusSoap
{
    private static final QName PORT_QNAME = new QName(
                "http://schemas.microsoft.com/TeamFoundation/2005/06/Services/ServerStatus/03",
                "ServerStatusSoap12Service");
    private static final String ENDPOINT_PATH = "/tfs/DefaultCollection/Services/v1.0/ServerStatus.asmx";

    public _ServerStatusSoap12Service(
        final URI endpoint,
        final QName port)
    {
        super(endpoint, port);
    }

    public _ServerStatusSoap12Service(
        final HttpClient client,
        URI endpoint,
        QName port)
    {
        super(client, endpoint, port);
    }

    /**
     * @return the qualified name of the WSDL port this service implementation can be used with
     */
    public static QName getPortQName()
    {
        return _ServerStatusSoap12Service.PORT_QNAME;
    }

    /**
     * @return the path part to use when constructing a URI to contact a host that provides this service
     */
    public static String getEndpointPath()
    {
        return _ServerStatusSoap12Service.ENDPOINT_PATH;
    }

    public _DataChanged[] getServerStatus()
        throws TransportException, SOAPFault
    {
        final _ServerStatusSoap_GetServerStatus requestData = new _ServerStatusSoap_GetServerStatus();

        final SOAPRequest request = createSOAPRequest(
                "GetServerStatus",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "GetServerStatus");
                    }
                });

        final _ServerStatusSoap_GetServerStatusResponse responseData = new _ServerStatusSoap_GetServerStatusResponse();

        executeSOAPRequest(
            request,
            "GetServerStatusResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getGetServerStatusResult();
    }

    public String checkAuthentication()
        throws TransportException, SOAPFault
    {
        final _ServerStatusSoap_CheckAuthentication requestData = new _ServerStatusSoap_CheckAuthentication();

        final SOAPRequest request = createSOAPRequest(
                "CheckAuthentication",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "CheckAuthentication");
                    }
                });

        final _ServerStatusSoap_CheckAuthenticationResponse responseData = new _ServerStatusSoap_CheckAuthenticationResponse();

        executeSOAPRequest(
            request,
            "CheckAuthenticationResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getCheckAuthenticationResult();
    }

    public String getSupportedContractVersion()
        throws TransportException, SOAPFault
    {
        final _ServerStatusSoap_GetSupportedContractVersion requestData = new _ServerStatusSoap_GetSupportedContractVersion();

        final SOAPRequest request = createSOAPRequest(
                "GetSupportedContractVersion",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "GetSupportedContractVersion");
                    }
                });

        final _ServerStatusSoap_GetSupportedContractVersionResponse responseData = new _ServerStatusSoap_GetSupportedContractVersionResponse();

        executeSOAPRequest(
            request,
            "GetSupportedContractVersionResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getGetSupportedContractVersionResult();
    }
}
