/**
 * Copyright 2016 StreamSets Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.api.impl;

import com.streamsets.pipeline.api.base.Errors;

public class ByteTypeSupport extends TypeSupport<Byte> {

  @Override
  public Byte convert(Object value) {
    if (value instanceof Byte) {
      return (Byte) value;
    }
    if (value instanceof String) {
      return Byte.parseByte((String) value);
    }
    if (value instanceof Integer) {
      return ((Integer)value).byteValue();
    }
    if (value instanceof Long) {
      return ((Long)value).byteValue();
    }
    if (value instanceof Short) {
      return ((Short)value).byteValue();
    }
    if (value instanceof Float) {
      return ((Float)value).byteValue();
    }
    if (value instanceof Double) {
      return ((Double)value).byteValue();
    }
    if (value instanceof Number) {
      return ((Number)value).byteValue();
    }
    throw new IllegalArgumentException(Utils.format(Errors.API_04.getMessage(),
                                                    value.getClass().getSimpleName(), value));
  }

}
