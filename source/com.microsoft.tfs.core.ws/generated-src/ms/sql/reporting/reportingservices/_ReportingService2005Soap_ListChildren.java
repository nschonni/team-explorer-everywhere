// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.sql.reporting.reportingservices;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.sql.reporting.reportingservices._ReportingService2005Soap_ListChildren;

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
public class _ReportingService2005Soap_ListChildren
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String item;
    protected boolean recursive;

    public _ReportingService2005Soap_ListChildren()
    {
        super();
    }

    public _ReportingService2005Soap_ListChildren(
        final String item,
        final boolean recursive)
    {
        // TODO : Call super() instead of setting all fields directly?
        setItem(item);
        setRecursive(recursive);
    }

    public String getItem()
    {
        return this.item;
    }

    public void setItem(String value)
    {
        this.item = value;
    }

    public boolean isRecursive()
    {
        return this.recursive;
    }

    public void setRecursive(boolean value)
    {
        this.recursive = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "Item",
            this.item);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Recursive",
            this.recursive);

        writer.writeEndElement();
    }
}