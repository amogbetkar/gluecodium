/*
 * Copyright (C) 2016-2025 HERE Europe B.V.
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
package com.here.android.test

import org.junit.Assert.assertEquals

import com.here.android.RobolectricApplication
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(application = RobolectricApplication::class)
class AttributesInterfaceTest {
    private val delta = 0.00000001
    private val attributes: AttributesInterface = AttributesInterfaceFactory.createAttributesInterface()

    @org.junit.Test
    fun setGetBuiltInTypeAttribute() {
        val value: Long = 42
        attributes.builtInTypeAttribute = value

        val result: Long = attributes.builtInTypeAttribute
        assertEquals(value, result)
    }

    @org.junit.Test
    fun setGetStructAttribute() {
        val structValue = AttributesInterface.ExampleStruct()
        structValue.value = 2.71

        attributes.structAttribute = structValue

        val result = attributes.structAttribute
        assertEquals(structValue.value, result.value, delta)
    }
}