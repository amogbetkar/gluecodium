/*
 * Copyright (C) 2016-2019 HERE Europe B.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * License-Filename: LICENSE
 */

package com.here.genium.generator.cbridge

import com.here.genium.model.lime.LimeArray
import com.here.genium.model.lime.LimeMap
import com.here.genium.model.lime.LimeSet
import com.here.genium.model.lime.LimeType
import com.here.genium.model.lime.LimeTypeDef

object CBridgeNameResolver {
    fun getArrayName(limeType: LimeType) = getTypeName(limeType)

    private fun getTypeName(limeType: LimeType): String = when (limeType) {
        is LimeTypeDef -> getTypeName(limeType.typeRef.type)
        is LimeArray -> "ArrayOf_${getTypeName(limeType.elementType.type)}"
        is LimeMap ->
            "MapOf_${getTypeName(limeType.keyType.type)}_To_${getTypeName(limeType.valueType.type)}"
        is LimeSet -> "SetOf_${getTypeName(limeType.elementType.type)}"
        else -> CBridgeNameRules.getName(limeType)
    }
}
