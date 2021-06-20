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
 * In music theory, an interval is a difference in pitch between two sounds. An interval may be described
 * as horizontal, linear, or melodic if it refers to successively sounding tones, such as two adjacent pitches
 * in a melody, and vertical or harmonic if it pertains to simultaneously sounding tones, such as in a chord.
 */
public interface Interval {

    /**
     * In music, sharp, dièse (from French), or diesis (from Greek)[a] means higher in pitch.
     * More specifically, in musical notation, sharp means "higher in pitch by one semitone (half step)".
     * Sharp is the opposite of flat, which is a lowering of pitch.
     * <p>
     * A sharp symbol, ♯, is used in key signatures or as an accidental.
     * For instance, the music below has a key signature with three sharps
     * (indicating either A major or F♯ minor, the relative minor) and the note, A♯, has a sharp accidental.
     */
    Interval SHARP = new Semitone(1);
    /**
     * Double sharps are indicated by the symbol double sharp and raise a note by two semitones,
     * or one whole tone. They should not be confused with a ghost note. Historically,
     * in order to lower a double sharp by one semitone to a sharp, it would be denoted as a ♮♯.
     * In modern notation the natural sign is often omitted.
     */
    Interval DOUBLE_SHARP = new Semitone(2);
    /**
     * In music, flat (Italian bemolle for "soft B") means "lower in pitch".
     * Flat is the opposite of sharp, which is a raising of pitch. In musical notation, flat means
     * "lower in pitch by one semitone (half step)", notated using the symbol ♭ which is derived from a
     * stylised lowercase 'b'. For instance, the music below has a key signature with three flats
     * (indicating either E♭ major or C minor) and the note, D♭, has a flat accidental.
     */
    Interval FLAT = new Semitone(-1);
    /**
     * Double flats also exist, which look like double flat (similar to two flats, ♭♭) and lower a note by
     * two semitones, or a whole step. The Unicode character 𝄫 (U+1D12B)
     * in the Musical Symbols block represents the double-flat sign. Historically, in order to
     * raise a double flat to a simple flat, it was required to use the notation ♮♭.
     * In modern scores it is acceptable to simply denote this with a single flat ♭.
     */
    Interval DOUBLE_FLAT = new Semitone(-1);
    Interval SEMITONE = new Semitone(1);
    Interval TONE = new Semitone(2);


}
