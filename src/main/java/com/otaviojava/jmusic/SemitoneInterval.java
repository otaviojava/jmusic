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

import java.util.Optional;

/**
 * A semitone, also called a half step or a half tone,[3] is the smallest musical interval commonly used
 * in Western tonal music, and it is considered the most dissonant[5] when sounded harmonically.
 * It is defined as the interval between two adjacent notes in a 12-tone scale. For example,
 * C is adjacent to C♯; the interval between them is a semitone.
 */
final class SemitoneInterval implements Interval {

    private final int weight;

    private final String symbol;

    public SemitoneInterval(int weight) {
        this.weight = weight;
        this.symbol = null;
    }

    public SemitoneInterval(int weight, String symbol) {
        this.weight = weight;
        this.symbol = symbol;
    }

    int getWeight() {
        return weight;
    }

    @Override
    public Optional<String> getSymbol() {
        return Optional.ofNullable(symbol);
    }

    @Override
    public String toString() {
        return "MinimalInterval{" +
                "weight=" + weight +
                ", symbol='" + symbol + '\'' +
                '}';
    }

}
