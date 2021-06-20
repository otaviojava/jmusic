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
    Interval DOUBLE_FLAT = new Semitone(-2);
    /**
     * A semitone, also called a half step or a half tone,[3] is the smallest musical interval commonly used
     * in Western tonal music, and it is considered the most dissonant[5] when sounded harmonically.
     * It is defined as the interval between two adjacent notes in a 12-tone scale. For example,
     * C is adjacent to C♯; the interval between them is a semitone.
     */
    Interval SEMITONE = new Semitone(1);
    /**
     * In Western music theory, a major second (sometimes also called whole tone or a whole step) is a second spanning
     * two semitones. A second is a musical interval encompassing two adjacent staff
     * positions. For example, the interval from C to D is a major second,
     * as the note D lies two semitones above C, and the two notes are notated on adjacent staff positions.
     * <p>
     * Diminished, minor and augmented seconds are notated on adjacent staff positions as well,
     * but consist of a different number of semitones (zero, one, and three).
     */
    Interval TONE = new Semitone(2);


}
