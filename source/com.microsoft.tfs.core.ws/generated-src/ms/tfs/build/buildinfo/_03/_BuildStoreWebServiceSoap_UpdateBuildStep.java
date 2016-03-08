// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildinfo._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildinfo._03._BuildStepStatus;
import ms.tfs.build.buildinfo._03._BuildStoreWebServiceSoap_UpdateBuildStep;

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
public class _BuildStoreWebServiceSoap_UpdateBuildStep
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String buildUri;
    protected String buildStepName;
    protected Calendar finishTime;
    protected _BuildStepStatus status;
    protected long buildStepId;

    public _BuildStoreWebServiceSoap_UpdateBuildStep()
    {
        super();
    }

    public _BuildStoreWebServiceSoap_UpdateBuildStep(
        final String buildUri,
        final String buildStepName,
        final Calendar finishTime,
        final _BuildStepStatus status,
        final long buildStepId)
    {
        // TODO : Call super() instead of setting all fields directly?
        setBuildUri(buildUri);
        setBuildStepName(buildStepName);
        setFinishTime(finishTime);
        setStatus(status);
        setBuildStepId(buildStepId);
    }

    public String getBuildUri()
    {
        return this.buildUri;
    }

    public void setBuildUri(String value)
    {
        this.buildUri = value;
    }

    public String getBuildStepName()
    {
        return this.buildStepName;
    }

    public void setBuildStepName(String value)
    {
        this.buildStepName = value;
    }

    public Calendar getFinishTime()
    {
        return this.finishTime;
    }

    public void setFinishTime(Calendar value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'finishTime' is a required element, its value cannot be null");
        }

        this.finishTime = value;
    }

    public _BuildStepStatus getStatus()
    {
        return this.status;
    }

    public void setStatus(_BuildStepStatus value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'status' is a required element, its value cannot be null");
        }

        this.status = value;
    }

    public long getBuildStepId()
    {
        return this.buildStepId;
    }

    public void setBuildStepId(long value)
    {
        this.buildStepId = value;
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
            "buildUri",
            this.buildUri);
        XMLStreamWriterHelper.writeElement(
            writer,
            "buildStepName",
            this.buildStepName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "finishTime",
            this.finishTime,
            true);
        this.status.writeAsElement(
            writer,
            "status");
        XMLStreamWriterHelper.writeElement(
            writer,
            "buildStepId",
            this.buildStepId);

        writer.writeEndElement();
    }
}