// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceImplementation.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.httpclient.HttpClient;
import com.microsoft.tfs.core.ws.runtime.client.*;
import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AcquireServiceHost;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AcquireServiceHostResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AddBuildAgents;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AddBuildAgentsResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AddBuildControllers;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AddBuildControllersResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AddBuildServiceHost;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AddBuildServiceHostResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_DeleteBuildAgents;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_DeleteBuildAgentsResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_DeleteBuildControllers;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_DeleteBuildControllersResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_DeleteBuildServiceHost;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_DeleteBuildServiceHostResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildAgents;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildAgentsByUri;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildAgentsByUriResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildAgentsResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildControllers;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildControllersByUri;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildControllersByUriResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildControllersResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildServiceHosts;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildServiceHostsByUri;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildServiceHostsByUriResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildServiceHostsResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_ReleaseServiceHost;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_ReleaseServiceHostResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_UpdateBuildAgents;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_UpdateBuildAgentsResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_UpdateBuildControllers;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_UpdateBuildControllersResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_UpdateBuildServiceHost;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_UpdateBuildServiceHostResponse;
import ms.tfs.build.buildservice._04._AgentStatus;
import ms.tfs.build.buildservice._04._BuildAgent;
import ms.tfs.build.buildservice._04._BuildAgentQueryResult;
import ms.tfs.build.buildservice._04._BuildAgentSpec;
import ms.tfs.build.buildservice._04._BuildAgentUpdate;
import ms.tfs.build.buildservice._04._BuildAgentUpdateOptions;
import ms.tfs.build.buildservice._04._BuildController;
import ms.tfs.build.buildservice._04._BuildControllerQueryResult;
import ms.tfs.build.buildservice._04._BuildControllerSpec;
import ms.tfs.build.buildservice._04._BuildControllerUpdate;
import ms.tfs.build.buildservice._04._BuildControllerUpdateOptions;
import ms.tfs.build.buildservice._04._BuildServiceHost;
import ms.tfs.build.buildservice._04._BuildServiceHostQueryResult;
import ms.tfs.build.buildservice._04._BuildServiceHostUpdate;
import ms.tfs.build.buildservice._04._BuildServiceHostUpdateOptions;
import ms.tfs.build.buildservice._04._ControllerStatus;
import ms.tfs.build.buildservice._04._PropertyValue;
import ms.tfs.build.buildservice._04._ServiceHostStatus;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.lang.Object;
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
 * {http://schemas.microsoft.com/TeamFoundation/2010/Build}AdministrationServiceSoapService
 */
public class _AdministrationServiceSoapService
    extends SOAP11Service
    implements _AdministrationServiceSoap
{
    private static final QName PORT_QNAME = new QName("http://schemas.microsoft.com/TeamFoundation/2010/Build",
            "AdministrationServiceSoapService");
    private static final String ENDPOINT_PATH = "/tfs/DefaultCollection/Build/v4.0/AdministrationService.asmx";

    public _AdministrationServiceSoapService(
        final URI endpoint,
        final QName port)
    {
        super(endpoint, port);
    }

    public _AdministrationServiceSoapService(
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
        return _AdministrationServiceSoapService.PORT_QNAME;
    }

    /**
     * @return the path part to use when constructing a URI to contact a host that provides this service
     */
    public static String getEndpointPath()
    {
        return _AdministrationServiceSoapService.ENDPOINT_PATH;
    }

    public _BuildAgent[] addBuildAgents(final _BuildAgent[] agents)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_AddBuildAgents requestData = new _AdministrationServiceSoap_AddBuildAgents(agents);

        final SOAPRequest request = createSOAPRequest(
                "AddBuildAgents",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "AddBuildAgents");
                    }
                });

        final _AdministrationServiceSoap_AddBuildAgentsResponse responseData = new _AdministrationServiceSoap_AddBuildAgentsResponse();

        executeSOAPRequest(
            request,
            "AddBuildAgentsResponse",
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

        return responseData.getAddBuildAgentsResult();
    }

    public void deleteBuildAgents(final String[] agentUris)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_DeleteBuildAgents requestData = new _AdministrationServiceSoap_DeleteBuildAgents(
                    agentUris);

        final SOAPRequest request = createSOAPRequest(
                "DeleteBuildAgents",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "DeleteBuildAgents");
                    }
                });

        final _AdministrationServiceSoap_DeleteBuildAgentsResponse responseData = new _AdministrationServiceSoap_DeleteBuildAgentsResponse();

        executeSOAPRequest(
            request,
            "DeleteBuildAgentsResponse",
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
    }

    public _BuildAgentQueryResult[] queryBuildAgents(final _BuildAgentSpec[] agentSpecs)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_QueryBuildAgents requestData = new _AdministrationServiceSoap_QueryBuildAgents(
                    agentSpecs);

        final SOAPRequest request = createSOAPRequest(
                "QueryBuildAgents",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryBuildAgents");
                    }
                });

        final _AdministrationServiceSoap_QueryBuildAgentsResponse responseData = new _AdministrationServiceSoap_QueryBuildAgentsResponse();

        executeSOAPRequest(
            request,
            "QueryBuildAgentsResponse",
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

        return responseData.getQueryBuildAgentsResult();
    }

    public _BuildAgentQueryResult queryBuildAgentsByUri(
        final String[] agentUris,
        final String[] propertyNameFilters)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_QueryBuildAgentsByUri requestData = new _AdministrationServiceSoap_QueryBuildAgentsByUri(
                    agentUris,
                    propertyNameFilters);

        final SOAPRequest request = createSOAPRequest(
                "QueryBuildAgentsByUri",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryBuildAgentsByUri");
                    }
                });

        final _AdministrationServiceSoap_QueryBuildAgentsByUriResponse responseData = new _AdministrationServiceSoap_QueryBuildAgentsByUriResponse();

        executeSOAPRequest(
            request,
            "QueryBuildAgentsByUriResponse",
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

        return responseData.getQueryBuildAgentsByUriResult();
    }

    public void updateBuildAgents(final _BuildAgentUpdateOptions[] updates)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_UpdateBuildAgents requestData = new _AdministrationServiceSoap_UpdateBuildAgents(
                    updates);

        final SOAPRequest request = createSOAPRequest(
                "UpdateBuildAgents",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "UpdateBuildAgents");
                    }
                });

        final _AdministrationServiceSoap_UpdateBuildAgentsResponse responseData = new _AdministrationServiceSoap_UpdateBuildAgentsResponse();

        executeSOAPRequest(
            request,
            "UpdateBuildAgentsResponse",
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
    }

    public _BuildController[] addBuildControllers(final _BuildController[] controllers)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_AddBuildControllers requestData = new _AdministrationServiceSoap_AddBuildControllers(
                    controllers);

        final SOAPRequest request = createSOAPRequest(
                "AddBuildControllers",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "AddBuildControllers");
                    }
                });

        final _AdministrationServiceSoap_AddBuildControllersResponse responseData = new _AdministrationServiceSoap_AddBuildControllersResponse();

        executeSOAPRequest(
            request,
            "AddBuildControllersResponse",
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

        return responseData.getAddBuildControllersResult();
    }

    public void deleteBuildControllers(final String[] controllerUris)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_DeleteBuildControllers requestData = new _AdministrationServiceSoap_DeleteBuildControllers(
                    controllerUris);

        final SOAPRequest request = createSOAPRequest(
                "DeleteBuildControllers",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "DeleteBuildControllers");
                    }
                });

        final _AdministrationServiceSoap_DeleteBuildControllersResponse responseData = new _AdministrationServiceSoap_DeleteBuildControllersResponse();

        executeSOAPRequest(
            request,
            "DeleteBuildControllersResponse",
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
    }

    public _BuildControllerQueryResult[] queryBuildControllers(final _BuildControllerSpec[] controllerSpecs)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_QueryBuildControllers requestData = new _AdministrationServiceSoap_QueryBuildControllers(
                    controllerSpecs);

        final SOAPRequest request = createSOAPRequest(
                "QueryBuildControllers",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryBuildControllers");
                    }
                });

        final _AdministrationServiceSoap_QueryBuildControllersResponse responseData = new _AdministrationServiceSoap_QueryBuildControllersResponse();

        executeSOAPRequest(
            request,
            "QueryBuildControllersResponse",
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

        return responseData.getQueryBuildControllersResult();
    }

    public _BuildControllerQueryResult queryBuildControllersByUri(
        final String[] controllerUris,
        final String[] propertyNameFilters,
        final boolean includeAgents)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_QueryBuildControllersByUri requestData = new _AdministrationServiceSoap_QueryBuildControllersByUri(
                    controllerUris,
                    propertyNameFilters,
                    includeAgents);

        final SOAPRequest request = createSOAPRequest(
                "QueryBuildControllersByUri",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryBuildControllersByUri");
                    }
                });

        final _AdministrationServiceSoap_QueryBuildControllersByUriResponse responseData = new _AdministrationServiceSoap_QueryBuildControllersByUriResponse();

        executeSOAPRequest(
            request,
            "QueryBuildControllersByUriResponse",
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

        return responseData.getQueryBuildControllersByUriResult();
    }

    public void updateBuildControllers(final _BuildControllerUpdateOptions[] updates)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_UpdateBuildControllers requestData = new _AdministrationServiceSoap_UpdateBuildControllers(
                    updates);

        final SOAPRequest request = createSOAPRequest(
                "UpdateBuildControllers",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "UpdateBuildControllers");
                    }
                });

        final _AdministrationServiceSoap_UpdateBuildControllersResponse responseData = new _AdministrationServiceSoap_UpdateBuildControllersResponse();

        executeSOAPRequest(
            request,
            "UpdateBuildControllersResponse",
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
    }

    public _BuildServiceHost addBuildServiceHost(final _BuildServiceHost serviceHost)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_AddBuildServiceHost requestData = new _AdministrationServiceSoap_AddBuildServiceHost(
                    serviceHost);

        final SOAPRequest request = createSOAPRequest(
                "AddBuildServiceHost",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "AddBuildServiceHost");
                    }
                });

        final _AdministrationServiceSoap_AddBuildServiceHostResponse responseData = new _AdministrationServiceSoap_AddBuildServiceHostResponse();

        executeSOAPRequest(
            request,
            "AddBuildServiceHostResponse",
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

        return responseData.getAddBuildServiceHostResult();
    }

    public void deleteBuildServiceHost(final String serviceHostUri)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_DeleteBuildServiceHost requestData = new _AdministrationServiceSoap_DeleteBuildServiceHost(
                    serviceHostUri);

        final SOAPRequest request = createSOAPRequest(
                "DeleteBuildServiceHost",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "DeleteBuildServiceHost");
                    }
                });

        final _AdministrationServiceSoap_DeleteBuildServiceHostResponse responseData = new _AdministrationServiceSoap_DeleteBuildServiceHostResponse();

        executeSOAPRequest(
            request,
            "DeleteBuildServiceHostResponse",
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
    }

    public _BuildServiceHostQueryResult queryBuildServiceHosts(final String computer)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_QueryBuildServiceHosts requestData = new _AdministrationServiceSoap_QueryBuildServiceHosts(
                    computer);

        final SOAPRequest request = createSOAPRequest(
                "QueryBuildServiceHosts",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryBuildServiceHosts");
                    }
                });

        final _AdministrationServiceSoap_QueryBuildServiceHostsResponse responseData = new _AdministrationServiceSoap_QueryBuildServiceHostsResponse();

        executeSOAPRequest(
            request,
            "QueryBuildServiceHostsResponse",
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

        return responseData.getQueryBuildServiceHostsResult();
    }

    public _BuildServiceHostQueryResult queryBuildServiceHostsByUri(final String[] serviceHostUris)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_QueryBuildServiceHostsByUri requestData = new _AdministrationServiceSoap_QueryBuildServiceHostsByUri(
                    serviceHostUris);

        final SOAPRequest request = createSOAPRequest(
                "QueryBuildServiceHostsByUri",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryBuildServiceHostsByUri");
                    }
                });

        final _AdministrationServiceSoap_QueryBuildServiceHostsByUriResponse responseData = new _AdministrationServiceSoap_QueryBuildServiceHostsByUriResponse();

        executeSOAPRequest(
            request,
            "QueryBuildServiceHostsByUriResponse",
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

        return responseData.getQueryBuildServiceHostsByUriResult();
    }

    public void updateBuildServiceHost(final _BuildServiceHostUpdateOptions update)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_UpdateBuildServiceHost requestData = new _AdministrationServiceSoap_UpdateBuildServiceHost(
                    update);

        final SOAPRequest request = createSOAPRequest(
                "UpdateBuildServiceHost",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "UpdateBuildServiceHost");
                    }
                });

        final _AdministrationServiceSoap_UpdateBuildServiceHostResponse responseData = new _AdministrationServiceSoap_UpdateBuildServiceHostResponse();

        executeSOAPRequest(
            request,
            "UpdateBuildServiceHostResponse",
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
    }

    public void acquireServiceHost(
        final String serviceHostUri,
        final String ownerName)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_AcquireServiceHost requestData = new _AdministrationServiceSoap_AcquireServiceHost(
                    serviceHostUri,
                    ownerName);

        final SOAPRequest request = createSOAPRequest(
                "AcquireServiceHost",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "AcquireServiceHost");
                    }
                });

        final _AdministrationServiceSoap_AcquireServiceHostResponse responseData = new _AdministrationServiceSoap_AcquireServiceHostResponse();

        executeSOAPRequest(
            request,
            "AcquireServiceHostResponse",
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
    }

    public void releaseServiceHost(final String serviceHostUri)
        throws TransportException, SOAPFault
    {
        final _AdministrationServiceSoap_ReleaseServiceHost requestData = new _AdministrationServiceSoap_ReleaseServiceHost(
                    serviceHostUri);

        final SOAPRequest request = createSOAPRequest(
                "ReleaseServiceHost",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "ReleaseServiceHost");
                    }
                });

        final _AdministrationServiceSoap_ReleaseServiceHostResponse responseData = new _AdministrationServiceSoap_ReleaseServiceHostResponse();

        executeSOAPRequest(
            request,
            "ReleaseServiceHostResponse",
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
    }
}
