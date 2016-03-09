// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._ArtifactSpec;

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
public class _ArtifactSpec
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String item;
    protected int ver;
    protected String k;

    // Elements
    protected byte[] id;

    public _ArtifactSpec()
    {
        super();
    }

    public _ArtifactSpec(
        final String item,
        final int ver,
        final String k,
        final byte[] id)
    {
        // TODO : Call super() instead of setting all fields directly?
        setItem(item);
        setVer(ver);
        setK(k);
        setId(id);
    }

    public String getItem()
    {
        return this.item;
    }

    public void setItem(final String value)
    {
        this.item = value;
    }

    public int getVer()
    {
        return this.ver;
    }

    public void setVer(final int value)
    {
        this.ver = value;
    }

    public String getK()
    {
        return this.k;
    }

    public void setK(final String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'k' is a required attribute, its value cannot be null");
        }

        this.k = value;
    }

    public byte[] getId()
    {
        return this.id;
    }

    public void setId(byte[] value)
    {
        this.id = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "item",
            this.item);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ver",
            this.ver);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "k",
            this.k);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "Id",
            this.id);

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("item"))
            {
                this.item = attributeValue;
            }
            else if (localName.equalsIgnoreCase("ver"))
            {
                this.ver = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("k"))
            {
                this.k = attributeValue;
            }

            // Ignore unknown attributes.
        }

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("Id"))
                {
                    this.id = XMLConvert.toByteArray(reader.getElementText());
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
