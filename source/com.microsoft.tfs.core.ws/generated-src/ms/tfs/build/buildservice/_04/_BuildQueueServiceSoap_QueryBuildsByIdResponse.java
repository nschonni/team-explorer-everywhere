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

import ms.tfs.build.buildservice._04._AgentStatus;
import ms.tfs.build.buildservice._04._BuildAgent;
import ms.tfs.build.buildservice._04._BuildController;
import ms.tfs.build.buildservice._04._BuildDefinition;
import ms.tfs.build.buildservice._04._BuildDefinitionSourceProvider;
import ms.tfs.build.buildservice._04._BuildDetail;
import ms.tfs.build.buildservice._04._BuildInformationNode;
import ms.tfs.build.buildservice._04._BuildPhaseStatus;
import ms.tfs.build.buildservice._04._BuildQueueQueryResult;
import ms.tfs.build.buildservice._04._BuildQueueServiceSoap_QueryBuildsByIdResponse;
import ms.tfs.build.buildservice._04._BuildReason;
import ms.tfs.build.buildservice._04._BuildServiceHost;
import ms.tfs.build.buildservice._04._BuildStatus;
import ms.tfs.build.buildservice._04._ControllerStatus;
import ms.tfs.build.buildservice._04._DefinitionQueueStatus;
import ms.tfs.build.buildservice._04._DefinitionTriggerType;
import ms.tfs.build.buildservice._04._DeleteOptions;
import ms.tfs.build.buildservice._04._GetOption;
import ms.tfs.build.buildservice._04._InformationField;
import ms.tfs.build.buildservice._04._NameValueField;
import ms.tfs.build.buildservice._04._ProcessTemplate;
import ms.tfs.build.buildservice._04._ProcessTemplateType;
import ms.tfs.build.buildservice._04._PropertyValue;
import ms.tfs.build.buildservice._04._QueuePriority;
import ms.tfs.build.buildservice._04._QueueStatus;
import ms.tfs.build.buildservice._04._QueuedBuild;
import ms.tfs.build.buildservice._04._RetentionPolicy;
import ms.tfs.build.buildservice._04._Schedule;
import ms.tfs.build.buildservice._04._ScheduleDays;
import ms.tfs.build.buildservice._04._ServiceHostStatus;
import ms.tfs.build.buildservice._04._WorkspaceMapping;
import ms.tfs.build.buildservice._04._WorkspaceMappingType;
import ms.tfs.build.buildservice._04._WorkspaceTemplate;

import java.lang.Object;
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
public class _BuildQueueServiceSoap_QueryBuildsByIdResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _BuildQueueQueryResult queryBuildsByIdResult;

    public _BuildQueueServiceSoap_QueryBuildsByIdResponse()
    {
        super();
    }

    public _BuildQueueServiceSoap_QueryBuildsByIdResponse(final _BuildQueueQueryResult queryBuildsByIdResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueryBuildsByIdResult(queryBuildsByIdResult);
    }

    public _BuildQueueQueryResult getQueryBuildsByIdResult()
    {
        return this.queryBuildsByIdResult;
    }

    public void setQueryBuildsByIdResult(_BuildQueueQueryResult value)
    {
        this.queryBuildsByIdResult = value;
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

                if (localName.equalsIgnoreCase("QueryBuildsByIdResult"))
                {
                    this.queryBuildsByIdResult = new _BuildQueueQueryResult();
                    this.queryBuildsByIdResult.readFromElement(reader);
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
