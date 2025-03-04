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

import com.here.android.RobolectricApplication
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(application = RobolectricApplication::class)
class RefEqualityTest {

    @org.junit.Test
    fun refEqualityPreservedForClass() {
        val instance1: DummyClass = DummyFactory.getDummyClassSingleton()
        val instance2: DummyClass = DummyFactory.getDummyClassSingleton()

        assertTrue(instance1 === instance2)
    }

    @org.junit.Test
    fun refInequalityPreservedForClass() {
        val instance1: DummyClass = DummyFactory.getDummyClassSingleton()
        val instance2: DummyClass = DummyFactory.createDummyClass()

        assertFalse(instance1 === instance2)
    }

    @org.junit.Test
    fun refEqualityPreservedForInterface() {
        val instance1: DummyInterface = DummyFactory.getDummyInterfaceSingleton()
        val instance2: DummyInterface = DummyFactory.getDummyInterfaceSingleton()

        assertTrue(instance1 === instance2)
    }

    @org.junit.Test
    fun refInequalityPreservedForInterface() {
        val instance1: DummyInterface = DummyFactory.getDummyInterfaceSingleton()
        val instance2: DummyInterface = DummyFactory.createDummyInterface()

        assertFalse(instance1 === instance2)
    }

    @org.junit.Test
    fun refEqualityPreservedForClassConstructor() {
        val instance1: DummyClass = DummyClass()
        val instance2: DummyClass = DummyClass.dummyClassRoundTrip(instance1)

        assertTrue(instance1 === instance2)
    }

    @org.junit.Test
    fun refInequalityPreservedForClassConstructor() {
        val instance1: DummyClass = DummyClass()
        val instance2: DummyClass = DummyClass()

        assertFalse(instance1 === instance2)
    }

    @org.junit.Test
    fun refEqualityPreservedForClassInList() {
        val list = mutableListOf(DummyClass())
        val result = DummyClass.dummyClassListRoundTrip(list)

        assertTrue(list[0] === result[0])
    }

    @org.junit.Test
    fun refEqualityPreservedForChildClassAsParent() {
        val instance1: DummyChildClass = DummyFactory.getDummyChildClassSingleton()
        val instance2: DummyParentClass = DummyFactory.getDummyChildClassSingletonAsParent()

        assertTrue(instance1 === instance2)
    }
}