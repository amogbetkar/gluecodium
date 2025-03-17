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
import org.junit.Assert.assertEquals
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

class CppConstCallback : CppConstInterface {
    override fun getFoo(): String = "FOO"
}

@RunWith(RobolectricTestRunner::class)
@Config(application = RobolectricApplication::class)
class CppConstMethodsTest {

    @org.junit.Test
    fun callCppConstMethodOnClass() {
        val result: String = CppConstClass().getFoo()
        assertEquals("foo", result)
    }

    @org.junit.Test
    fun callCppConstMethodOnInterface() {
        val result: String = CppConstInterfaceFactory.createCppConstInterface().getFoo()
        assertEquals("foo", result)
    }

    @org.junit.Test
    fun callCppConstMethodOnInterfaceInCpp() {
        val result: String = CppConstInterfaceFactory.callGetFoo(CppConstCallback())
        assertEquals("FOO", result)
    }
}