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

import ms.tfs.workitemtracking.clientservices._03._IdentityDescriptorData;

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
public class _IdentityDescriptorData
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String identityType;
    protected String identifier;

    // No elements    
    public _IdentityDescriptorData()
    {
        super();
    }

    public _IdentityDescriptorData(
        final String identityType,
        final String identifier)
    {
        // TODO : Call super() instead of setting all fields directly?
        setIdentityType(identityType);
        setIdentifier(identifier);
    }

    public String getIdentityType()
    {
        return this.identityType;
    }

    public void setIdentityType(final String value)
    {
        this.identityType = value;
    }

    public String getIdentifier()
    {
        return this.identifier;
    }

    public void setIdentifier(final String value)
    {
        this.identifier = value;
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
            "identityType",
            this.identityType);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "identifier",
            this.identifier);

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

            if (localName.equalsIgnoreCase("identityType"))
            {
                this.identityType = attributeValue;
            }
            else if (localName.equalsIgnoreCase("identifier"))
            {
                this.identifier = attributeValue;
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}
