/********************************************************************************
 * Copyright (c) 2022,2023 BMW Group AG
 * Copyright (c) 2022,2023 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ********************************************************************************/
package org.eclipse.tractusx.valueaddedservice.dto.bpdm.pool;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.eclipse.tractusx.valueaddedservice.dto.bpdm.deserializers.ExtendedAlternativePostalAddressDtoDeserializer;
import org.eclipse.tractusx.valueaddedservice.dto.bpdm.deserializers.ExtendedPhysicalPostalAddressDtoDeserializer;

@Setter
@Getter
@ToString
public class PoolAddressDto {
    private String bpna;
    private String name;
    @JsonDeserialize(using = ExtendedPhysicalPostalAddressDtoDeserializer.class)
    private PoolExtendedPhysicalPostalAddressDto physicalPostalAddress;

    @JsonDeserialize(using = ExtendedAlternativePostalAddressDtoDeserializer.class)
    private PoolExtendedAlternativePostalAddressDto alternativePostalAddressDto;

    private String bpnLegalEntity;
    private boolean isLegalAddress;
    private String bpnSite;
    private boolean isMainAddress;

}
