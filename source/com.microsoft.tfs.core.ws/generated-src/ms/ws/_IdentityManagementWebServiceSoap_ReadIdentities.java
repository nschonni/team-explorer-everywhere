// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._IdentityManagementWebServiceSoap_ReadIdentities;

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
public class _IdentityManagementWebServiceSoap_ReadIdentities
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected int searchFactor;
    protected String[] factorValues;
    protected int queryMembership;
    protected int options;
    protected int features;
    protected String[] propertyNameFilters;
    protected int propertyScope;

    public _IdentityManagementWebServiceSoap_ReadIdentities()
    {
        super();
    }

    public _IdentityManagementWebServiceSoap_ReadIdentities(
        final int searchFactor,
        final String[] factorValues,
        final int queryMembership,
        final int options,
        final int features,
        final String[] propertyNameFilters,
        final int propertyScope)
    {
        // TODO : Call super() instead of setting all fields directly?
        setSearchFactor(searchFactor);
        setFactorValues(factorValues);
        setQueryMembership(queryMembership);
        setOptions(options);
        setFeatures(features);
        setPropertyNameFilters(propertyNameFilters);
        setPropertyScope(propertyScope);
    }

    public int getSearchFactor()
    {
        return this.searchFactor;
    }

    public void setSearchFactor(int value)
    {
        this.searchFactor = value;
    }

    public String[] getFactorValues()
    {
        return this.factorValues;
    }

    public void setFactorValues(String[] value)
    {
        this.factorValues = value;
    }

    public int getQueryMembership()
    {
        return this.queryMembership;
    }

    public void setQueryMembership(int value)
    {
        this.queryMembership = value;
    }

    public int getOptions()
    {
        return this.options;
    }

    public void setOptions(int value)
    {
        this.options = value;
    }

    public int getFeatures()
    {
        return this.features;
    }

    public void setFeatures(int value)
    {
        this.features = value;
    }

    public String[] getPropertyNameFilters()
    {
        return this.propertyNameFilters;
    }

    public void setPropertyNameFilters(String[] value)
    {
        this.propertyNameFilters = value;
    }

    public int getPropertyScope()
    {
        return this.propertyScope;
    }

    public void setPropertyScope(int value)
    {
        this.propertyScope = value;
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
            "searchFactor",
            this.searchFactor);

        if (this.factorValues != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("factorValues");

            for (int iterator0 = 0; iterator0 < this.factorValues.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.factorValues[iterator0]);
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "queryMembership",
            this.queryMembership);
        XMLStreamWriterHelper.writeElement(
            writer,
            "options",
            this.options);
        XMLStreamWriterHelper.writeElement(
            writer,
            "features",
            this.features);

        if (this.propertyNameFilters != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("propertyNameFilters");

            for (int iterator0 = 0; iterator0 < this.propertyNameFilters.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.propertyNameFilters[iterator0]);
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "propertyScope",
            this.propertyScope);

        writer.writeEndElement();
    }
}