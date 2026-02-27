package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.media3.exoplayer.DefaultLoadControl;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
public final class zzfoo {
    public static zzast zza(Context context, String str, String str2) {
        return new zzfon(context, str, str2).zza(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
    }
}
