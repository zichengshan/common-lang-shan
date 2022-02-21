/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SWE261_P2_Test {

    @Test
    public void testArrayToString() {
        String[] a = {"aaa", "bbb"};
        assertEquals("{aaa,bbb}", ArrayUtils.toString(a));
    }

    @Test
    public void testToArray() {
        String[] a = {"aaa", "bbb"};
        String[] b = ArrayUtils.toArray("aaa", "bbb");
        assertEquals(ArrayUtils.toString(a), ArrayUtils.toString(b));
    }

    @Test
    public void testArrayUtilAdd() {
        String[] a = ArrayUtils.toArray("aaa", "bbb");
        String[] c = ArrayUtils.add(a, "ccc");
        assertEquals("{aaa,bbb,ccc}", ArrayUtils.toString(c));
    }

    @Test
    public void testArrayUtilRemove() {
        String[] a = ArrayUtils.toArray("aaa", "bbb");
        String[] c = ArrayUtils.add(a, "ccc");
        String[] d = ArrayUtils.remove(c, c.length - 1);
        assertEquals("{aaa,bbb}", ArrayUtils.toString(d));
    }

    @Test
    public void testArrayUtilReverse() {
        String[] a = ArrayUtils.toArray("aaa", "bbb", "ccc");
        ArrayUtils.reverse(a);
        assertEquals("{ccc,bbb,aaa}", ArrayUtils.toString(a));
        ArrayUtils.reverse(a);
        assertEquals("{aaa,bbb,ccc}", ArrayUtils.toString(a));
    }

    @Test
    public void testArrayUtilSwap() {
        String[] a = ArrayUtils.toArray("aaa", "bbb", "ccc");
        ArrayUtils.swap(a, 0, 2);
        assertEquals("{ccc,bbb,aaa}", ArrayUtils.toString(a));
        ArrayUtils.swap(a, 2, 0);
        assertEquals("{aaa,bbb,ccc}", ArrayUtils.toString(a));
    }


}
