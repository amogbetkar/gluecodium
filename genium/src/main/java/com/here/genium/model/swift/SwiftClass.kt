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

package com.here.genium.model.swift

class SwiftClass(
    name: String,
    visibility: SwiftVisibility? = null,
    val isInterface: Boolean = false,
    val parentClass: String? = null,
    @Suppress("unused") val nameSpace: String? = null,
    private val cInstance: String? = null,
    val functionTableName: String? = null,
    val useParentCInstance: Boolean = false,
    val hasEquatableType: Boolean = false,
    @Suppress("unused") val isObjcInterface: Boolean = false,
    @Suppress("unused") val hasTypeRepository: Boolean = false
) : SwiftType(
    name = name,
    visibility = visibility,
    category = TypeCategory.CLASS,
    publicName = name
) {

    val implementsProtocols = mutableListOf<String>()
    val properties = mutableListOf<SwiftProperty>()
    val methods = mutableListOf<SwiftMethod>()
    val structs = mutableListOf<SwiftStruct>()
    val enums = mutableListOf<SwiftEnum>()
    val typedefs = mutableListOf<SwiftTypeDef>()
    val constants = mutableListOf<SwiftConstant>()

    // Has to be a function. For a property Kotlin will generate a getter with "C" capitalized.
    @Suppress("unused")
    fun getcInstance() = cInstance

    @Suppress("unused")
    val hasParents
        get() = parentClass != null || !implementsProtocols.isEmpty()

    @Suppress("unused")
    val constructors
        get() = methods.filter { it.isConstructor }

    override fun stream() =
        super.stream() + properties + methods + structs + enums + typedefs + constants
}
