// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._AdministrationWebServiceSoap_DeleteBuildAgents;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _AdministrationWebServiceSoap_DeleteBuildAgents
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String[] agentUris;

    public _AdministrationWebServiceSoap_DeleteBuildAgents()
    {
        super();
    }

    public _AdministrationWebServiceSoap_DeleteBuildAgents(final String[] agentUris)
    {
        // TODO : Call super() instead of setting all fields directly?
        setAgentUris(agentUris);
    }

    public String[] getAgentUris()
    {
        return this.agentUris;
    }

    public void setAgentUris(String[] value)
    {
        this.agentUris = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.agentUris != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("agentUris");

            for (int iterator0 = 0; iterator0 < this.agentUris.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.agentUris[iterator0]);
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
