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

import ms.sql.reporting.reportingservices._ExtensionParameter;
import ms.sql.reporting.reportingservices._ReportingService2005Soap_ValidateExtensionSettingsResponse;
import ms.sql.reporting.reportingservices._ValidValue;

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
public class _ReportingService2005Soap_ValidateExtensionSettingsResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _ExtensionParameter[] parameterErrors;

    public _ReportingService2005Soap_ValidateExtensionSettingsResponse()
    {
        super();
    }

    public _ReportingService2005Soap_ValidateExtensionSettingsResponse(final _ExtensionParameter[] parameterErrors)
    {
        // TODO : Call super() instead of setting all fields directly?
        setParameterErrors(parameterErrors);
    }

    public _ExtensionParameter[] getParameterErrors()
    {
        return this.parameterErrors;
    }

    public void setParameterErrors(_ExtensionParameter[] value)
    {
        this.parameterErrors = value;
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

                if (localName.equalsIgnoreCase("ParameterErrors"))
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
                            _ExtensionParameter complexObject0 = new _ExtensionParameter();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.parameterErrors = (_ExtensionParameter[]) list0.toArray(new _ExtensionParameter[list0.size()]);
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
