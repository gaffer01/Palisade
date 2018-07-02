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

package uk.gov.gchq.palisade.resource.impl;

import uk.gov.gchq.palisade.resource.AbstractResource;
import uk.gov.gchq.palisade.resource.ContainerResource;

public class FileResource extends AbstractResource implements ContainerResource {

    public FileResource() {
    }

    public FileResource(final String id) {
        super(id);
    }

    public FileResource(final String id, final String type) {
        super(id, type);
    }

    public FileResource(final String id, final String type, final String format) {
        super(id, type, format);
    }

    @Override
    public String _getClass() {
        return null;
    }
}
