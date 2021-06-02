/*
 *  Copyright 2016 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.unused.webaudio;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.dom.events.EventListener;

public interface AudioWorkerGlobalScope extends JSObject {
    @JSProperty
    float getSampleRate();

    @JSProperty("onaudioprocess")
    void setOnAudioProcess(EventListener<MediaEvent> event);

    @JSProperty("onaudioprocess")
    EventListener<MediaEvent> getOnAudioProcess();

    @JSProperty("onnodecreate")
    void setOnNodeCreate(EventListener<MediaEvent> event);

    @JSProperty("onnodecreate")
    EventListener<MediaEvent> getOnNodeCreate();

    @JSProperty
    AudioWorkerParamDescriptor[] getParameters();

    AudioParam addParameter(String name, float defaultValue);

    void removeParameter(String name);
}