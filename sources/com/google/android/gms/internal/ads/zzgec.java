package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgec {
    public static final ClipData zza = ClipData.newIntent("", new Intent());

    public static PendingIntent zza(Context context, int i, Intent intent, int i4) {
        return PendingIntent.getActivity(context, 0, zzc(intent, 201326592, 0), 201326592);
    }

    public static PendingIntent zzb(Context context, int i, Intent intent, int i4, int i6) {
        return PendingIntent.getService(context, 0, zzc(intent, 1140850688, 0), 1140850688);
    }

    private static Intent zzc(Intent intent, int i, int i4) {
        zzghc.zzb((i & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        zzghc.zzb((i & 1) == 0 || zzd(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        zzghc.zzb((i & 2) == 0 || zzd(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        zzghc.zzb((i & 4) == 0 || zzd(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        zzghc.zzb((i & 128) == 0 || zzd(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        zzghc.zzb(intent.getComponent() != null, "Must set component on Intent.");
        if (zzd(0, 1)) {
            zzghc.zzb(!zzd(i, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            zzghc.zzb(zzd(i, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!zzd(i, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zzd(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zzd(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zzd(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zzd(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zza);
            }
        }
        return intent2;
    }

    private static boolean zzd(int i, int i4) {
        return (i & i4) == i4;
    }
}
