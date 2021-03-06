/******************************************************************************
 * Copyright 2017 The Baidu Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *****************************************************************************/
package com.baidu.che.codriverlauncher.network.request;

import com.baidu.che.codriverlauncher.network.HttpManager;
import com.baidu.che.codriverlauncher.network.callback.HttpCallback;

/**
 * httprequest base class
 */

public abstract class AbsHttpRequest implements IHttpRequest, HttpCallback {

    protected static final String TAG = "network";

    @Override
    public void execute() {
        HttpManager.post(getUrl(), getParams(), this);
    }

}
