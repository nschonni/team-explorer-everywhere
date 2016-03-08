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

import ms.tfs.services.classification._03._Classification4Soap_GetNodeResponse;
import ms.tfs.services.classification._03._NodeInfo;
import ms.tfs.services.classification._03._Property;

import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _Classification4Soap_GetNodeResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _NodeInfo getNodeResult;

    public _Classification4Soap_GetNodeResponse()
    {
        super();
    }

    public _Classification4Soap_GetNodeResponse(final _NodeInfo getNodeResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetNodeResult(getNodeResult);
    }

    public _NodeInfo getGetNodeResult()
    {
        return this.getNodeResult;
    }

    public void setGetNodeResult(_NodeInfo value)
    {
        this.getNodeResult = value;
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

                if (localName.equalsIgnoreCase("GetNodeResult"))
                {
                    this.getNodeResult = new _NodeInfo();
                    this.getNodeResult.readFromElement(reader);
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