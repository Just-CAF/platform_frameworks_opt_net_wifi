/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.server.wifi;

import android.content.Context;
import static android.net.wifi.WifiManager.STA_SECONDARY;

/**
 * Serialization & Deserialization of shared WiFi network configurations.
 */
public class NetworkListSharedStoreData extends NetworkListStoreData {

    public NetworkListSharedStoreData(Context context) {
        super(context);
    }

    @Override
    public @WifiConfigStore.StoreFileId int getStoreFileId() {
        // Shared general store.
        return WifiConfigStore.STORE_FILE_SHARED_GENERAL;
    }
    @Override
    public @WifiConfigStore.StoreFileId int getStoreFileId(int staId) {
        // Shared general store.
        if (staId == STA_SECONDARY)
            return WifiConfigStore.QTI_STORE_FILE_SHARED_SECONDARY;
        return WifiConfigStore.STORE_FILE_SHARED_GENERAL;
    }
}

