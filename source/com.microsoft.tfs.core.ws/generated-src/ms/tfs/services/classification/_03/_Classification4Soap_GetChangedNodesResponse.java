// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.classification._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.classification._03._Classification4Soap_GetChangedNodesResponse;

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
public class _Classification4Soap_GetChangedNodesResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected String getChangedNodesResult;

    public _Classification4Soap_GetChangedNodesResponse()
    {
        super();
    }

    public _Classification4Soap_GetChangedNodesResponse(final String getChangedNodesResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetChangedNodesResult(getChangedNodesResult);
    }

    public String getGetChangedNodesResult()
    {
        return this.getChangedNodesResult;
    }

    public void setGetChangedNodesResult(String value)
    {
        this.getChangedNodesResult = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("GetChangedNodesResult"))
                {
                    this.getChangedNodesResult = reader.getElementText();
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
