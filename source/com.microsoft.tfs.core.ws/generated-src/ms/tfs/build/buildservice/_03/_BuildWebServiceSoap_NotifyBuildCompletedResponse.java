// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._BuildDetail;
import ms.tfs.build.buildservice._03._BuildInformationNode;
import ms.tfs.build.buildservice._03._BuildPhaseStatus;
import ms.tfs.build.buildservice._03._BuildReason;
import ms.tfs.build.buildservice._03._BuildStatus;
import ms.tfs.build.buildservice._03._BuildWebServiceSoap_NotifyBuildCompletedResponse;
import ms.tfs.build.buildservice._03._InformationField;

import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildWebServiceSoap_NotifyBuildCompletedResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _BuildDetail notifyBuildCompletedResult;

    public _BuildWebServiceSoap_NotifyBuildCompletedResponse()
    {
        super();
    }

    public _BuildWebServiceSoap_NotifyBuildCompletedResponse(final _BuildDetail notifyBuildCompletedResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setNotifyBuildCompletedResult(notifyBuildCompletedResult);
    }

    public _BuildDetail getNotifyBuildCompletedResult()
    {
        return this.notifyBuildCompletedResult;
    }

    public void setNotifyBuildCompletedResult(_BuildDetail value)
    {
        this.notifyBuildCompletedResult = value;
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

                if (localName.equalsIgnoreCase("NotifyBuildCompletedResult"))
                {
                    this.notifyBuildCompletedResult = new _BuildDetail();
                    this.notifyBuildCompletedResult.readFromElement(reader);
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
