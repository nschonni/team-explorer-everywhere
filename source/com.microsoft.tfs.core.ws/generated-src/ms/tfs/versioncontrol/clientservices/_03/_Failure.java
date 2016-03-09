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

import ms.tfs.versioncontrol.clientservices._03._ChangeType;
import ms.tfs.versioncontrol.clientservices._03._Failure;
import ms.tfs.versioncontrol.clientservices._03._RequestType;
import ms.tfs.versioncontrol.clientservices._03._SeverityType;
import ms.tfs.versioncontrol.clientservices._03._Warning;
import ms.tfs.versioncontrol.clientservices._03._WarningType;

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
public class _Failure
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected _RequestType req = _RequestType.None;
    protected String code;
    protected _SeverityType sev = _SeverityType.Error;
    protected String computer;
    protected String ident;
    protected String local;
    protected String res;
    protected String item;
    protected int itemid = 0;
    protected String ws;
    protected String owner;

    // Elements
    protected _Warning[] warnings;
    protected String message;

    public _Failure()
    {
        super();
    }

    public _Failure(
        final _RequestType req,
        final String code,
        final _SeverityType sev,
        final String computer,
        final String ident,
        final String local,
        final String res,
        final String item,
        final int itemid,
        final String ws,
        final String owner,
        final _Warning[] warnings,
        final String message)
    {
        // TODO : Call super() instead of setting all fields directly?
        setReq(req);
        setCode(code);
        setSev(sev);
        setComputer(computer);
        setIdent(ident);
        setLocal(local);
        setRes(res);
        setItem(item);
        setItemid(itemid);
        setWs(ws);
        setOwner(owner);
        setWarnings(warnings);
        setMessage(message);
    }

    public _RequestType getReq()
    {
        return this.req;
    }

    public void setReq(final _RequestType value)
    {
        this.req = value;
    }

    public String getCode()
    {
        return this.code;
    }

    public void setCode(final String value)
    {
        this.code = value;
    }

    public _SeverityType getSev()
    {
        return this.sev;
    }

    public void setSev(final _SeverityType value)
    {
        this.sev = value;
    }

    public String getComputer()
    {
        return this.computer;
    }

    public void setComputer(final String value)
    {
        this.computer = value;
    }

    public String getIdent()
    {
        return this.ident;
    }

    public void setIdent(final String value)
    {
        this.ident = value;
    }

    public String getLocal()
    {
        return this.local;
    }

    public void setLocal(final String value)
    {
        this.local = value;
    }

    public String getRes()
    {
        return this.res;
    }

    public void setRes(final String value)
    {
        this.res = value;
    }

    public String getItem()
    {
        return this.item;
    }

    public void setItem(final String value)
    {
        this.item = value;
    }

    public int getItemid()
    {
        return this.itemid;
    }

    public void setItemid(final int value)
    {
        this.itemid = value;
    }

    public String getWs()
    {
        return this.ws;
    }

    public void setWs(final String value)
    {
        this.ws = value;
    }

    public String getOwner()
    {
        return this.owner;
    }

    public void setOwner(final String value)
    {
        this.owner = value;
    }

    public _Warning[] getWarnings()
    {
        return this.warnings;
    }

    public void setWarnings(_Warning[] value)
    {
        this.warnings = value;
    }

    public String getMessage()
    {
        return this.message;
    }

    public void setMessage(String value)
    {
        this.message = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        if (this.req != null)
        {
            this.req.writeAsAttribute(
                writer,
                "req");
        }

        XMLStreamWriterHelper.writeAttribute(
            writer,
            "code",
            this.code);

        if (this.sev != null)
        {
            this.sev.writeAsAttribute(
                writer,
                "sev");
        }

        XMLStreamWriterHelper.writeAttribute(
            writer,
            "computer",
            this.computer);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ident",
            this.ident);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "local",
            this.local);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "res",
            this.res);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "item",
            this.item);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "itemid",
            this.itemid);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ws",
            this.ws);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "owner",
            this.owner);

        // Elements
        if (this.warnings != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Warnings");

            for (int iterator0 = 0; iterator0 < this.warnings.length; iterator0++)
            {
                this.warnings[iterator0].writeAsElement(
                    writer,
                    "Warning");
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "Message",
            this.message);

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

            if (localName.equalsIgnoreCase("req"))
            {
                this.req = _RequestType.fromString(attributeValue);
            }
            else if (localName.equalsIgnoreCase("code"))
            {
                this.code = attributeValue;
            }
            else if (localName.equalsIgnoreCase("sev"))
            {
                this.sev = _SeverityType.fromString(attributeValue);
            }
            else if (localName.equalsIgnoreCase("computer"))
            {
                this.computer = attributeValue;
            }
            else if (localName.equalsIgnoreCase("ident"))
            {
                this.ident = attributeValue;
            }
            else if (localName.equalsIgnoreCase("local"))
            {
                this.local = attributeValue;
            }
            else if (localName.equalsIgnoreCase("res"))
            {
                this.res = attributeValue;
            }
            else if (localName.equalsIgnoreCase("item"))
            {
                this.item = attributeValue;
            }
            else if (localName.equalsIgnoreCase("itemid"))
            {
                this.itemid = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("ws"))
            {
                this.ws = attributeValue;
            }
            else if (localName.equalsIgnoreCase("owner"))
            {
                this.owner = attributeValue;
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

                if (localName.equalsIgnoreCase("Warnings"))
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
                            _Warning complexObject0 = new _Warning();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.warnings = (_Warning[]) list0.toArray(new _Warning[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("Message"))
                {
                    this.message = reader.getElementText();
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
