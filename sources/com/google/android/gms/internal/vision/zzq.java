package com.google.android.gms.internal.vision;

import android.content.Context;
import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class zzq {
    public static boolean zza(Context context, String str, String str2) {
        String strZza = zzdg.zza(str2);
        if (!"face".equals(str) && !"ica".equals(str) && !CommonUtils.SERVICE.equals(str) && !"barcode".equals(str)) {
            Log.e("NativeLibraryLoader", "Unrecognized engine: " + str);
            return false;
        }
        int iLastIndexOf = strZza.lastIndexOf(".so");
        if (iLastIndexOf == strZza.length() - 3) {
            strZza = strZza.substring(0, iLastIndexOf);
        }
        if (strZza.indexOf("lib") == 0) {
            strZza = strZza.substring(3);
        }
        boolean zZza = zzr.zza(str, strZza);
        if (!zZza) {
            Log.d("NativeLibraryLoader", str + " engine not loaded with " + strZza + ".");
        }
        return zZza;
    }
}
