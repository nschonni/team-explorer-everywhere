// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceInterface.vm template.
 */
package ms.tfs.services.registration._03;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.services.registration._03._FrameworkRegistrationEntry;
import ms.tfs.services.registration._03._OutboundLinkType;
import ms.tfs.services.registration._03._RegistrationArtifactType;
import ms.tfs.services.registration._03._RegistrationDatabase;
import ms.tfs.services.registration._03._RegistrationEventType;
import ms.tfs.services.registration._03._RegistrationExtendedAttribute2;
import ms.tfs.services.registration._03._RegistrationServiceInterface;
import ms.tfs.services.registration._03._RegistrationSoap_GetRegistrationEntries;
import ms.tfs.services.registration._03._RegistrationSoap_GetRegistrationEntriesResponse;

import java.lang.String;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/Services/Registration/03}RegistrationSoap
 */
public interface _RegistrationSoap
{
    public _FrameworkRegistrationEntry[] getRegistrationEntries(final String toolId)
        throws TransportException, SOAPFault;
}
