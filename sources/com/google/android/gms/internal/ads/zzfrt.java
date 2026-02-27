package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfrt {
    @Nullable
    public static Object zza(String str, String str2, zzfrs... zzfrsVarArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return Class.forName(str).getDeclaredMethod("getInstance", null).invoke(null, null);
    }
}
