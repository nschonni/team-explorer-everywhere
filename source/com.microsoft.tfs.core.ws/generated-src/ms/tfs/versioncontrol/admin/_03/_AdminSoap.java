// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceInterface.vm template.
 */
package ms.tfs.versioncontrol.admin._03;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.versioncontrol.admin._03._AdminRepositoryInfo;
import ms.tfs.versioncontrol.admin._03._AdminSoap_GenerateRepositoryKey;
import ms.tfs.versioncontrol.admin._03._AdminSoap_GenerateRepositoryKeyResponse;
import ms.tfs.versioncontrol.admin._03._AdminSoap_OptimizeDatabase;
import ms.tfs.versioncontrol.admin._03._AdminSoap_OptimizeDatabaseResponse;
import ms.tfs.versioncontrol.admin._03._AdminSoap_QueryRepositoryInformation;
import ms.tfs.versioncontrol.admin._03._AdminSoap_QueryRepositoryInformationResponse;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/VersionControl/Admin/03}AdminSoap
 */
public interface _AdminSoap
{
    public _AdminRepositoryInfo queryRepositoryInformation()
        throws TransportException, SOAPFault;

    public void optimizeDatabase(final int optimizationFlags)
        throws TransportException, SOAPFault;

    public void generateRepositoryKey()
        throws TransportException, SOAPFault;
}
