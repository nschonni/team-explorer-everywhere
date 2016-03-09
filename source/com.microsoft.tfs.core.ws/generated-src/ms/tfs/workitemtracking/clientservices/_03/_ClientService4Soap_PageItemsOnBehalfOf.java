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

import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_PageItemsOnBehalfOf;

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
public class _ClientService4Soap_PageItemsOnBehalfOf
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String userName;
    protected int[] ids;
    protected String[] columns;

    public _ClientService4Soap_PageItemsOnBehalfOf()
    {
        super();
    }

    public _ClientService4Soap_PageItemsOnBehalfOf(
        final String userName,
        final int[] ids,
        final String[] columns)
    {
        // TODO : Call super() instead of setting all fields directly?
        setUserName(userName);
        setIds(ids);
        setColumns(columns);
    }

    public String getUserName()
    {
        return this.userName;
    }

    public void setUserName(String value)
    {
        this.userName = value;
    }

    public int[] getIds()
    {
        return this.ids;
    }

    public void setIds(int[] value)
    {
        this.ids = value;
    }

    public String[] getColumns()
    {
        return this.columns;
    }

    public void setColumns(String[] value)
    {
        this.columns = value;
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
            "userName",
            this.userName);

        if (this.ids != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("ids");

            for (int iterator0 = 0; iterator0 < this.ids.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "int",
                    this.ids[iterator0]);
            }

            writer.writeEndElement();
        }

        if (this.columns != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("columns");

            for (int iterator0 = 0; iterator0 < this.columns.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.columns[iterator0]);
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
