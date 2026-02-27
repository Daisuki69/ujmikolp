package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AFc1eSDK<Body> implements ResponseNetwork<Body> {

    @NonNull
    private final Body AFInAppEventParameterName;

    @NonNull
    final Map<String, List<String>> AFInAppEventType;
    final int AFKeystoreWrapper;

    @NonNull
    public final AFc1kSDK valueOf;
    final boolean values;

    public AFc1eSDK(@NonNull Body body, int i, boolean z4, Map<String, List<String>> map, @NonNull AFc1kSDK aFc1kSDK) {
        this.AFInAppEventParameterName = body;
        this.AFKeystoreWrapper = i;
        this.values = z4;
        this.AFInAppEventType = new HashMap(map);
        this.valueOf = aFc1kSDK;
    }

    @Nullable
    public final String AFInAppEventType(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb2 = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFc1eSDK aFc1eSDK = (AFc1eSDK) obj;
        if (this.AFKeystoreWrapper == aFc1eSDK.AFKeystoreWrapper && this.values == aFc1eSDK.values && this.AFInAppEventParameterName.equals(aFc1eSDK.AFInAppEventParameterName) && this.AFInAppEventType.equals(aFc1eSDK.AFInAppEventType)) {
            return this.valueOf.equals(aFc1eSDK.valueOf);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @Nullable
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.AFInAppEventType.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.AFInAppEventType.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.AFKeystoreWrapper;
    }

    public int hashCode() {
        return this.valueOf.hashCode() + ((this.AFInAppEventType.hashCode() + (((((this.AFInAppEventParameterName.hashCode() * 31) + this.AFKeystoreWrapper) * 31) + (this.values ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.values;
    }
}
