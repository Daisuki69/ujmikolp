package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzhje {
    public static final List zza(Object obj, long j) {
        zzhit zzhitVar = (zzhit) zzhlc.zzn(obj, j);
        if (zzhitVar.zza()) {
            return zzhitVar;
        }
        int size = zzhitVar.size();
        zzhit zzhitVarZzh = zzhitVar.zzh(size == 0 ? 10 : size + size);
        zzhlc.zzo(obj, j, zzhitVarZzh);
        return zzhitVarZzh;
    }
}
