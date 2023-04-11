/*
 * Copyright 2023 Korandoru Contributors
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

package io.korandoru.zeronos.server.storage;

import io.korandoru.zeronos.proto.KeyBytes;
import io.korandoru.zeronos.server.record.BackendRangeResult;

public interface Backend {

    BackendRangeResult unsafeRange(Namespace ns, KeyBytes key, KeyBytes end, long limit);

    void unsafePut(Namespace ns, KeyBytes key, byte[] value);

}
