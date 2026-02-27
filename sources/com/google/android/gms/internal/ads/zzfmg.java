package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmg extends zzfmj {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfmg zzb = new zzfmg();

    private zzfmg() {
    }

    public static zzfmg zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfmj
    public final boolean zzb() {
        Iterator it = zzfmh.zza().zzf().iterator();
        while (it.hasNext()) {
            View viewZzi = ((zzfln) it.next()).zzi();
            if (viewZzi != null && viewZzi.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfmj
    public final void zzc(boolean z4) {
        Iterator it = zzfmh.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfln) it.next()).zzg().zzf(z4);
        }
    }
}
