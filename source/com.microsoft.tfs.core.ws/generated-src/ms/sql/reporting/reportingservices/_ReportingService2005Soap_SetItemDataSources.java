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

import ms.sql.reporting.reportingservices._CredentialRetrievalEnum;
import ms.sql.reporting.reportingservices._DataSource;
import ms.sql.reporting.reportingservices._DataSourceDefinition;
import ms.sql.reporting.reportingservices._DataSourceReference;
import ms.sql.reporting.reportingservices._InvalidDataSourceReference;
import ms.sql.reporting.reportingservices._ReportingService2005Soap_SetItemDataSources;

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
public class _ReportingService2005Soap_SetItemDataSources
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String item;
    protected _DataSource[] dataSources;

    public _ReportingService2005Soap_SetItemDataSources()
    {
        super();
    }

    public _ReportingService2005Soap_SetItemDataSources(
        final String item,
        final _DataSource[] dataSources)
    {
        // TODO : Call super() instead of setting all fields directly?
        setItem(item);
        setDataSources(dataSources);
    }

    public String getItem()
    {
        return this.item;
    }

    public void setItem(String value)
    {
        this.item = value;
    }

    public _DataSource[] getDataSources()
    {
        return this.dataSources;
    }

    public void setDataSources(_DataSource[] value)
    {
        this.dataSources = value;
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

        if (this.dataSources != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("DataSources");

            for (int iterator0 = 0; iterator0 < this.dataSources.length; iterator0++)
            {
                this.dataSources[iterator0].writeAsElement(
                    writer,
                    "DataSource");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
