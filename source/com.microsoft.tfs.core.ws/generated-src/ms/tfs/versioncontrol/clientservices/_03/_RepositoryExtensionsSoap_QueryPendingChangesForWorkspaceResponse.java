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
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._LockLevel;
import ms.tfs.versioncontrol.clientservices._03._MergeSource;
import ms.tfs.versioncontrol.clientservices._03._PendingChange;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryPendingChangesForWorkspaceResponse;
import ms.tfs.versioncontrol.clientservices._03._RequestType;
import ms.tfs.versioncontrol.clientservices._03._SeverityType;
import ms.tfs.versioncontrol.clientservices._03._Warning;
import ms.tfs.versioncontrol.clientservices._03._WarningType;

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
public class _RepositoryExtensionsSoap_QueryPendingChangesForWorkspaceResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _PendingChange[] queryPendingChangesForWorkspaceResult;
    protected _Failure[] failures;

    public _RepositoryExtensionsSoap_QueryPendingChangesForWorkspaceResponse()
    {
        super();
    }

    public _RepositoryExtensionsSoap_QueryPendingChangesForWorkspaceResponse(
        final _PendingChange[] queryPendingChangesForWorkspaceResult,
        final _Failure[] failures)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueryPendingChangesForWorkspaceResult(queryPendingChangesForWorkspaceResult);
        setFailures(failures);
    }

    public _PendingChange[] getQueryPendingChangesForWorkspaceResult()
    {
        return this.queryPendingChangesForWorkspaceResult;
    }

    public void setQueryPendingChangesForWorkspaceResult(_PendingChange[] value)
    {
        this.queryPendingChangesForWorkspaceResult = value;
    }

    public _Failure[] getFailures()
    {
        return this.failures;
    }

    public void setFailures(_Failure[] value)
    {
        this.failures = value;
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

                if (localName.equalsIgnoreCase("QueryPendingChangesForWorkspaceResult"))
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
                            _PendingChange complexObject0 = new _PendingChange();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.queryPendingChangesForWorkspaceResult = (_PendingChange[]) list0.toArray(
                                new _PendingChange[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("failures"))
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
                            _Failure complexObject0 = new _Failure();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.failures = (_Failure[]) list0.toArray(new _Failure[list0.size()]);
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