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

import ms.sql.reporting.reportingservices._DataSetDefinition;
import ms.sql.reporting.reportingservices._Field;
import ms.sql.reporting.reportingservices._QueryDefinition;
import ms.sql.reporting.reportingservices._ReportingService2005Soap_PrepareQueryResponse;
import ms.sql.reporting.reportingservices._SensitivityEnum;

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
public class _ReportingService2005Soap_PrepareQueryResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _DataSetDefinition dataSettings;
    protected boolean changed;
    protected String[] parameterNames;

    public _ReportingService2005Soap_PrepareQueryResponse()
    {
        super();
    }

    public _ReportingService2005Soap_PrepareQueryResponse(
        final _DataSetDefinition dataSettings,
        final boolean changed,
        final String[] parameterNames)
    {
        // TODO : Call super() instead of setting all fields directly?
        setDataSettings(dataSettings);
        setChanged(changed);
        setParameterNames(parameterNames);
    }

    public _DataSetDefinition getDataSettings()
    {
        return this.dataSettings;
    }

    public void setDataSettings(_DataSetDefinition value)
    {
        this.dataSettings = value;
    }

    public boolean isChanged()
    {
        return this.changed;
    }

    public void setChanged(boolean value)
    {
        this.changed = value;
    }

    public String[] getParameterNames()
    {
        return this.parameterNames;
    }

    public void setParameterNames(String[] value)
    {
        this.parameterNames = value;
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

                if (localName.equalsIgnoreCase("DataSettings"))
                {
                    this.dataSettings = new _DataSetDefinition();
                    this.dataSettings.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("Changed"))
                {
                    this.changed = XMLConvert.toBoolean(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("ParameterNames"))
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
                            list0.add(reader.getElementText());
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.parameterNames = (String[]) list0.toArray(new String[list0.size()]);
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
