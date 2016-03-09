// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._ItemSpec;
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UnlabelItem;
import ms.tfs.versioncontrol.clientservices._03._VersionSpec;

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
public class _RepositorySoap_UnlabelItem
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String workspaceName;
    protected String workspaceOwner;
    protected String labelName;
    protected String labelScope;
    protected _ItemSpec[] items;
    protected _VersionSpec version;

    public _RepositorySoap_UnlabelItem()
    {
        super();
    }

    public _RepositorySoap_UnlabelItem(
        final String workspaceName,
        final String workspaceOwner,
        final String labelName,
        final String labelScope,
        final _ItemSpec[] items,
        final _VersionSpec version)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkspaceName(workspaceName);
        setWorkspaceOwner(workspaceOwner);
        setLabelName(labelName);
        setLabelScope(labelScope);
        setItems(items);
        setVersion(version);
    }

    public String getWorkspaceName()
    {
        return this.workspaceName;
    }

    public void setWorkspaceName(String value)
    {
        this.workspaceName = value;
    }

    public String getWorkspaceOwner()
    {
        return this.workspaceOwner;
    }

    public void setWorkspaceOwner(String value)
    {
        this.workspaceOwner = value;
    }

    public String getLabelName()
    {
        return this.labelName;
    }

    public void setLabelName(String value)
    {
        this.labelName = value;
    }

    public String getLabelScope()
    {
        return this.labelScope;
    }

    public void setLabelScope(String value)
    {
        this.labelScope = value;
    }

    public _ItemSpec[] getItems()
    {
        return this.items;
    }

    public void setItems(_ItemSpec[] value)
    {
        this.items = value;
    }

    public _VersionSpec getVersion()
    {
        return this.version;
    }

    public void setVersion(_VersionSpec value)
    {
        this.version = value;
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
            "workspaceName",
            this.workspaceName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "workspaceOwner",
            this.workspaceOwner);
        XMLStreamWriterHelper.writeElement(
            writer,
            "labelName",
            this.labelName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "labelScope",
            this.labelScope);

        if (this.items != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("items");

            for (int iterator0 = 0; iterator0 < this.items.length; iterator0++)
            {
                this.items[iterator0].writeAsElement(
                    writer,
                    "ItemSpec");
            }

            writer.writeEndElement();
        }

        if (this.version != null)
        {
            this.version.writeAsElement(
                writer,
                "version");
        }

        writer.writeEndElement();
    }
}
