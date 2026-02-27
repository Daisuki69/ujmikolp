package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzakx {
    @Nullable
    public static zzaky zza(@Nullable zzaky zzakyVar, @Nullable String[] strArr, Map map) {
        int length;
        int i = 0;
        if (zzakyVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzaky) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzaky zzakyVar2 = new zzaky();
                while (i < length2) {
                    zzakyVar2.zzr((zzaky) map.get(strArr[i]));
                    i++;
                }
                return zzakyVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzakyVar.zzr((zzaky) map.get(strArr[0]));
                return zzakyVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    zzakyVar.zzr((zzaky) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return zzakyVar;
    }
}
