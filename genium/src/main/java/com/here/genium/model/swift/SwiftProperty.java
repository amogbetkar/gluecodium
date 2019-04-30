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

package com.here.genium.model.swift;

import java.util.stream.Stream;

public final class SwiftProperty extends SwiftTypedModelElement {

  public final SwiftMethod getter;
  public final SwiftMethod setter;
  public final boolean isStatic;

  public SwiftProperty(
      final String propertyName,
      final SwiftVisibility visibility,
      final SwiftType type,
      final SwiftMethod getter,
      final SwiftMethod setter,
      final boolean isStatic) {
    super(propertyName, visibility, type);
    this.getter = getter;
    this.setter = setter;
    this.isStatic = isStatic;
  }

  @Override
  public Stream<SwiftModelElement> stream() {
    return setter != null
        ? Stream.concat(super.stream(), Stream.of(getter, setter))
        : Stream.concat(super.stream(), Stream.of(getter));
  }
}
