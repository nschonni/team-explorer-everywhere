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

import ms.tfs.build.buildservice._04._BuildControllerSpec;
import ms.tfs.build.buildservice._04._BuildDefinitionSpec;
import ms.tfs.build.buildservice._04._BuildQueueServiceSoap_QueryBuilds;
import ms.tfs.build.buildservice._04._BuildQueueSpec;
import ms.tfs.build.buildservice._04._DefinitionTriggerType;
import ms.tfs.build.buildservice._04._QueryOptions;
import ms.tfs.build.buildservice._04._QueueStatus;

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
public class _BuildQueueServiceSoap_QueryBuilds
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _BuildQueueSpec[] specs;

    public _BuildQueueServiceSoap_QueryBuilds()
    {
        super();
    }

    public _BuildQueueServiceSoap_QueryBuilds(final _BuildQueueSpec[] specs)
    {
        // TODO : Call super() instead of setting all fields directly?
        setSpecs(specs);
    }

    public _BuildQueueSpec[] getSpecs()
    {
        return this.specs;
    }

    public void setSpecs(_BuildQueueSpec[] value)
    {
        this.specs = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.specs != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("specs");

            for (int iterator0 = 0; iterator0 < this.specs.length; iterator0++)
            {
                this.specs[iterator0].writeAsElement(
                    writer,
                    "BuildQueueSpec");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
