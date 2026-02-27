package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import dOYHB6.yFtIp6.svM7M6;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzi implements Callable<String> {
    private final /* synthetic */ SharedPreferences zzo;
    private final /* synthetic */ String zzp;
    private final /* synthetic */ String zzt;

    public zzi(SharedPreferences sharedPreferences, String str, String str2) {
        this.zzo = sharedPreferences;
        this.zzp = str;
        this.zzt = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        return svM7M6.getString(this.zzo, this.zzp, this.zzt);
    }
}
