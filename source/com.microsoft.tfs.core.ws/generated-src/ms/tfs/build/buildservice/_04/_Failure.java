// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._04._Failure;

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
public class _Failure
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String code;
    protected String message;

    // No elements    
    public _Failure()
    {
        super();
    }

    public _Failure(
        final String code,
        final String message)
    {
        // TODO : Call super() instead of setting all fields directly?
        setCode(code);
        setMessage(message);
    }

    public String getCode()
    {
        return this.code;
    }

    public void setCode(final String value)
    {
        this.code = value;
    }

    public String getMessage()
    {
        return this.message;
    }

    public void setMessage(final String value)
    {
        this.message = value;
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
            "Code",
            this.code);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Message",
            this.message);

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

            if (localName.equalsIgnoreCase("Code"))
            {
                this.code = attributeValue;
            }
            else if (localName.equalsIgnoreCase("Message"))
            {
                this.message = attributeValue;
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}
