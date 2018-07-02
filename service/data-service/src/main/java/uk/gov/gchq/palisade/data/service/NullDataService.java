/*
 * Copyright 2018 Crown Copyright
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
 */

package uk.gov.gchq.palisade.data.service;

import uk.gov.gchq.palisade.data.service.request.ReadRequest;
import uk.gov.gchq.palisade.data.service.request.ReadResponse;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

/**
 * A null implementation of the {@link DataService} that prevents hitting
 * {@link NullPointerException}s if your deployment does not require a
 * {@link DataService}, but one is expected.
 */
public class NullDataService implements DataService {
    @Override
    public <RAW_DATA_TYPE> CompletableFuture<ReadResponse<RAW_DATA_TYPE>> read(final ReadRequest request) {
        return CompletableFuture.completedFuture(new ReadResponse<>(Stream.<RAW_DATA_TYPE>empty()));
    }
}