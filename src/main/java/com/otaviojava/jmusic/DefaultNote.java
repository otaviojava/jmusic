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

import java.util.Objects;

/**
 * A template method class to implement notes
 */
class DefaultNote implements Note {

    private final int weight;

    protected DefaultNote(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public boolean isAccidental() {
        return false;
    }

    @Override
    public boolean isEnharmonic(Note note) {
        Objects.requireNonNull(note, "note is required");
        return this.getWeight() == note.getWeight();
    }
}
