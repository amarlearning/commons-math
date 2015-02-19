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

package org.apache.commons.math4.optimization;

import org.apache.commons.math4.analysis.DifferentiableMultivariateVectorFunction;
import org.apache.commons.math4.random.RandomVectorGenerator;

/**
 * Special implementation of the {@link DifferentiableMultivariateVectorOptimizer}
 * interface addind multi-start features to an existing optimizer.
 *
 * This class wraps a classical optimizer to use it several times in
 * turn with different starting points in order to avoid being trapped
 * into a local extremum when looking for a global one.
 *
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.0
 */
@Deprecated
public class DifferentiableMultivariateVectorMultiStartOptimizer
    extends BaseMultivariateVectorMultiStartOptimizer<DifferentiableMultivariateVectorFunction>
    implements DifferentiableMultivariateVectorOptimizer {
    /**
     * Create a multi-start optimizer from a single-start optimizer.
     *
     * @param optimizer Single-start optimizer to wrap.
     * @param starts Number of starts to perform (including the
     * first one), multi-start is disabled if value is less than or
     * equal to 1.
     * @param generator Random vector generator to use for restarts.
     */
    public DifferentiableMultivariateVectorMultiStartOptimizer(
                final DifferentiableMultivariateVectorOptimizer optimizer,
                final int starts,
                final RandomVectorGenerator generator) {
        super(optimizer, starts, generator);
    }
}