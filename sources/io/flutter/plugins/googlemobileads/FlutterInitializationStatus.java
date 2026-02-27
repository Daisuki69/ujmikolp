package io.flutter.plugins.googlemobileads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class FlutterInitializationStatus {

    @NonNull
    final Map<String, FlutterAdapterStatus> adapterStatuses;

    public FlutterInitializationStatus(@NonNull Map<String, FlutterAdapterStatus> map) {
        this.adapterStatuses = map;
    }

    public FlutterInitializationStatus(@NonNull InitializationStatus initializationStatus) {
        HashMap map = new HashMap();
        for (Map.Entry<String, AdapterStatus> entry : initializationStatus.getAdapterStatusMap().entrySet()) {
            map.put(entry.getKey(), new FlutterAdapterStatus(entry.getValue()));
        }
        this.adapterStatuses = map;
    }
}
