// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.workitemtracking.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.workitemtracking.clientservices._03._ArtifactWorkItemIds;

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
public class _ArtifactWorkItemIds
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected int[] workItemIds;
    protected String uri;
    protected int uriListOffset;

    public _ArtifactWorkItemIds()
    {
        super();
    }

    public _ArtifactWorkItemIds(
        final int[] workItemIds,
        final String uri,
        final int uriListOffset)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkItemIds(workItemIds);
        setUri(uri);
        setUriListOffset(uriListOffset);
    }

    public int[] getWorkItemIds()
    {
        return this.workItemIds;
    }

    public void setWorkItemIds(int[] value)
    {
        this.workItemIds = value;
    }

    public String getUri()
    {
        return this.uri;
    }

    public void setUri(String value)
    {
        this.uri = value;
    }

    public int getUriListOffset()
    {
        return this.uriListOffset;
    }

    public void setUriListOffset(int value)
    {
        this.uriListOffset = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.workItemIds != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("WorkItemIds");

            for (int iterator0 = 0; iterator0 < this.workItemIds.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "int",
                    this.workItemIds[iterator0]);
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "Uri",
            this.uri);
        XMLStreamWriterHelper.writeElement(
            writer,
            "UriListOffset",
            this.uriListOffset);

        writer.writeEndElement();
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

                if (localName.equalsIgnoreCase("WorkItemIds"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            list0.add(new Integer(XMLConvert.toInt(reader.getElementText())));
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.workItemIds = (int[]) PrimitiveArrayHelpers.toArray(
                            list0,
                            Integer.TYPE);
                }
                else if (localName.equalsIgnoreCase("Uri"))
                {
                    this.uri = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("UriListOffset"))
                {
                    this.uriListOffset = XMLConvert.toInt(reader.getElementText());
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