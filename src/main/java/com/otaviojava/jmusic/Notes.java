/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.otaviojava.jmusic;

import java.util.function.Supplier;

/**
 * An utilitarian class to {@link Note}
 */
public class Notes {

    public static class EnglishConvention {
        public static final Note C = new AbstractNote(1);
        public static final Note D = new AbstractNote(3);
        public static final Note E = new AbstractNote(5);
        public static final Note F = new AbstractNote(6);
        public static final Note G = new AbstractNote(8);
        public static final Note A = new AbstractNote(10);
        public static final Note B = new AbstractNote(12);
    }

    public static class NeoLatinConvention {
        public static final Note DO = new AbstractNote(1);
        public static final Note RE = new AbstractNote(3);
        public static final Note MI = new AbstractNote(5);
        public static final Note FA = new AbstractNote(6);
        public static final Note SOL = new AbstractNote(8);
        public static final Note LA = new AbstractNote(10);
        public static final Note SI = new AbstractNote(12);
    }
}
