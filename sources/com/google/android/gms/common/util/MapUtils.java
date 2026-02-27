package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@NonNull StringBuilder sb2, @NonNull HashMap<String, String> map) {
        sb2.append("{");
        boolean z4 = true;
        for (String str : map.keySet()) {
            if (!z4) {
                sb2.append(",");
            }
            String str2 = map.get(str);
            a.C(sb2, "\"", str, "\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                a.C(sb2, "\"", str2, "\"");
            }
            z4 = false;
        }
        sb2.append("}");
    }
}
