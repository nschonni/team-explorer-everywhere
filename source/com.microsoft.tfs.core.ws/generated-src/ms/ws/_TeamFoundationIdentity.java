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

import ms.ws._IdentityDescriptor;
import ms.ws._KeyValueOfStringString;
import ms.ws._PropertyValue;
import ms.ws._TeamFoundationIdentity;

import java.lang.Object;
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
public class _TeamFoundationIdentity
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String displayName;
    protected boolean isContainer;
    protected boolean isActive;
    protected String teamFoundationId;
    protected String uniqueName;
    protected int uniqueUserId;

    // Elements
    protected _IdentityDescriptor descriptor;
    protected _KeyValueOfStringString[] attributes;
    protected _PropertyValue[] properties;
    protected _PropertyValue[] localProperties;
    protected _IdentityDescriptor[] members;
    protected _IdentityDescriptor[] memberOf;

    public _TeamFoundationIdentity()
    {
        super();
    }

    public _TeamFoundationIdentity(
        final String displayName,
        final boolean isContainer,
        final boolean isActive,
        final String teamFoundationId,
        final String uniqueName,
        final int uniqueUserId,
        final _IdentityDescriptor descriptor,
        final _KeyValueOfStringString[] attributes,
        final _PropertyValue[] properties,
        final _PropertyValue[] localProperties,
        final _IdentityDescriptor[] members,
        final _IdentityDescriptor[] memberOf)
    {
        // TODO : Call super() instead of setting all fields directly?
        setDisplayName(displayName);
        setIsContainer(isContainer);
        setIsActive(isActive);
        setTeamFoundationId(teamFoundationId);
        setUniqueName(uniqueName);
        setUniqueUserId(uniqueUserId);
        setDescriptor(descriptor);
        setAttributes(attributes);
        setProperties(properties);
        setLocalProperties(localProperties);
        setMembers(members);
        setMemberOf(memberOf);
    }

    public String getDisplayName()
    {
        return this.displayName;
    }

    public void setDisplayName(final String value)
    {
        this.displayName = value;
    }

    public boolean isIsContainer()
    {
        return this.isContainer;
    }

    public void setIsContainer(final boolean value)
    {
        this.isContainer = value;
    }

    public boolean isIsActive()
    {
        return this.isActive;
    }

    public void setIsActive(final boolean value)
    {
        this.isActive = value;
    }

    public String getTeamFoundationId()
    {
        return this.teamFoundationId;
    }

    public void setTeamFoundationId(final String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'TeamFoundationId' is a required attribute, its value cannot be null");
        }

        this.teamFoundationId = value;
    }

    public String getUniqueName()
    {
        return this.uniqueName;
    }

    public void setUniqueName(final String value)
    {
        this.uniqueName = value;
    }

    public int getUniqueUserId()
    {
        return this.uniqueUserId;
    }

    public void setUniqueUserId(final int value)
    {
        this.uniqueUserId = value;
    }

    public _IdentityDescriptor getDescriptor()
    {
        return this.descriptor;
    }

    public void setDescriptor(_IdentityDescriptor value)
    {
        this.descriptor = value;
    }

    public _KeyValueOfStringString[] getAttributes()
    {
        return this.attributes;
    }

    public void setAttributes(_KeyValueOfStringString[] value)
    {
        this.attributes = value;
    }

    public _PropertyValue[] getProperties()
    {
        return this.properties;
    }

    public void setProperties(_PropertyValue[] value)
    {
        this.properties = value;
    }

    public _PropertyValue[] getLocalProperties()
    {
        return this.localProperties;
    }

    public void setLocalProperties(_PropertyValue[] value)
    {
        this.localProperties = value;
    }

    public _IdentityDescriptor[] getMembers()
    {
        return this.members;
    }

    public void setMembers(_IdentityDescriptor[] value)
    {
        this.members = value;
    }

    public _IdentityDescriptor[] getMemberOf()
    {
        return this.memberOf;
    }

    public void setMemberOf(_IdentityDescriptor[] value)
    {
        this.memberOf = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "DisplayName",
            this.displayName);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "IsContainer",
            this.isContainer);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "IsActive",
            this.isActive);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "TeamFoundationId",
            this.teamFoundationId);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "UniqueName",
            this.uniqueName);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "UniqueUserId",
            this.uniqueUserId);

        // Elements
        if (this.descriptor != null)
        {
            this.descriptor.writeAsElement(
                writer,
                "Descriptor");
        }

        if (this.attributes != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Attributes");

            for (int iterator0 = 0; iterator0 < this.attributes.length; iterator0++)
            {
                this.attributes[iterator0].writeAsElement(
                    writer,
                    "KeyValueOfStringString");
            }

            writer.writeEndElement();
        }

        if (this.properties != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Properties");

            for (int iterator0 = 0; iterator0 < this.properties.length; iterator0++)
            {
                this.properties[iterator0].writeAsElement(
                    writer,
                    "PropertyValue");
            }

            writer.writeEndElement();
        }

        if (this.localProperties != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("LocalProperties");

            for (int iterator0 = 0; iterator0 < this.localProperties.length; iterator0++)
            {
                this.localProperties[iterator0].writeAsElement(
                    writer,
                    "PropertyValue");
            }

            writer.writeEndElement();
        }

        if (this.members != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Members");

            for (int iterator0 = 0; iterator0 < this.members.length; iterator0++)
            {
                this.members[iterator0].writeAsElement(
                    writer,
                    "IdentityDescriptor");
            }

            writer.writeEndElement();
        }

        if (this.memberOf != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("MemberOf");

            for (int iterator0 = 0; iterator0 < this.memberOf.length; iterator0++)
            {
                this.memberOf[iterator0].writeAsElement(
                    writer,
                    "IdentityDescriptor");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("DisplayName"))
            {
                this.displayName = attributeValue;
            }
            else if (localName.equalsIgnoreCase("IsContainer"))
            {
                this.isContainer = XMLConvert.toBoolean(attributeValue);
            }
            else if (localName.equalsIgnoreCase("IsActive"))
            {
                this.isActive = XMLConvert.toBoolean(attributeValue);
            }
            else if (localName.equalsIgnoreCase("TeamFoundationId"))
            {
                this.teamFoundationId = attributeValue;
            }
            else if (localName.equalsIgnoreCase("UniqueName"))
            {
                this.uniqueName = attributeValue;
            }
            else if (localName.equalsIgnoreCase("UniqueUserId"))
            {
                this.uniqueUserId = XMLConvert.toInt(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("Descriptor"))
                {
                    this.descriptor = new _IdentityDescriptor();
                    this.descriptor.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("Attributes"))
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
                            _KeyValueOfStringString complexObject0 = new _KeyValueOfStringString();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.attributes = (_KeyValueOfStringString[]) list0.toArray(
                            new _KeyValueOfStringString[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("Properties"))
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
                            _PropertyValue complexObject0 = new _PropertyValue();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.properties = (_PropertyValue[]) list0.toArray(new _PropertyValue[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("LocalProperties"))
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
                            _PropertyValue complexObject0 = new _PropertyValue();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.localProperties = (_PropertyValue[]) list0.toArray(new _PropertyValue[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("Members"))
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
                            _IdentityDescriptor complexObject0 = new _IdentityDescriptor();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.members = (_IdentityDescriptor[]) list0.toArray(new _IdentityDescriptor[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("MemberOf"))
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
                            _IdentityDescriptor complexObject0 = new _IdentityDescriptor();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.memberOf = (_IdentityDescriptor[]) list0.toArray(new _IdentityDescriptor[list0.size()]);
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
