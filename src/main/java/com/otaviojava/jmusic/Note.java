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

/**
 * In music, a note is a symbol denoting a musical sound. In English usage a note is also the sound itself.
 */
public interface Note {

    /**
     * Letter names are modified by the accidentals. The sharp sign ♯ raises a note by a semitone or half-step,
     * and a flat ♭ lowers it by the same amount. In modern tuning a half step has a frequency ratio of 12√2,
     * approximately 1.0595. The accidentals are written after the note name:
     * so, for example, F♯ represents F-sharp, B♭ is B-flat, and C♮ is C natural (or C).
     * @return <b>true</b> if the note is accidental
     */
    boolean isAccidental();
}
