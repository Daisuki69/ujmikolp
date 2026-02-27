package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import dOYHB6.yFtIp6.ht2aO8;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzoz {

    @VisibleForTesting
    static final zzgkc zzb;
    private final SparseArray zzd = new SparseArray();
    private final int zze;
    public static final zzoz zza = new zzoz(zzgjz.zzj(zzoy.zza));

    @SuppressLint({"InlinedApi"})
    private static final zzgjz zzc = zzgjz.zzl(2, 5, 6);

    static {
        zzgkb zzgkbVar = new zzgkb();
        zzgkbVar.zza(5, 6);
        zzgkbVar.zza(17, 6);
        zzgkbVar.zza(7, 6);
        zzgkbVar.zza(30, 10);
        zzgkbVar.zza(18, 6);
        zzgkbVar.zza(6, 8);
        zzgkbVar.zza(8, 8);
        zzgkbVar.zza(14, 8);
        zzb = zzgkbVar.zzc();
    }

    private zzoz(List list) {
        for (int i = 0; i < list.size(); i++) {
            zzoy zzoyVar = (zzoy) list.get(i);
            this.zzd.put(zzoyVar.zzb, zzoyVar);
        }
        int iMax = 0;
        for (int i4 = 0; i4 < this.zzd.size(); i4++) {
            iMax = Math.max(iMax, ((zzoy) this.zzd.valueAt(i4)).zzc);
        }
        this.zze = iMax;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static zzoz zza(Context context, zzc zzcVar, @Nullable AudioDeviceInfo audioDeviceInfo) {
        return zzb(context, ht2aO8.registerReceiver(context, null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzcVar, audioDeviceInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @android.annotation.SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzoz zzb(android.content.Context r10, @androidx.annotation.Nullable android.content.Intent r11, com.google.android.gms.internal.ads.zzc r12, @androidx.annotation.Nullable android.media.AudioDeviceInfo r13) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoz.zzb(android.content.Context, android.content.Intent, com.google.android.gms.internal.ads.zzc, android.media.AudioDeviceInfo):com.google.android.gms.internal.ads.zzoz");
    }

    @Nullable
    public static Uri zzc() {
        if (zze()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean zze() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    private static zzgjz zzf(@Nullable int[] iArr, int i) {
        int i4 = zzgjz.zzd;
        zzgjw zzgjwVar = new zzgjw();
        for (int i6 : iArr) {
            zzgjwVar.zzf(new zzoy(i6, i));
        }
        return zzgjwVar.zzi();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof zzoz) {
                zzoz zzozVar = (zzoz) obj;
                SparseArray sparseArray = this.zzd;
                SparseArray sparseArray2 = zzozVar.zzd;
                String str = zzeo.zza;
                if (Build.VERSION.SDK_INT < 31) {
                    int size = sparseArray.size();
                    if (size == sparseArray2.size()) {
                        for (int i = 0; i < size; i++) {
                            if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                                break;
                            }
                        }
                        if (this.zze != zzozVar.zze) {
                            break;
                        }
                    }
                } else if (sparseArray.contentEquals(sparseArray2)) {
                    if (this.zze != zzozVar.zze) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = zzeo.zza;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzd;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i4)) + ((sparseArray.keyAt(i4) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.zze;
    }

    public final String toString() {
        String string = this.zzd.toString();
        int i = this.zze;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 50 + string.length() + 1);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i);
        sb2.append(", audioProfiles=");
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r1
  0x003a: PHI (r1v3 int) = (r1v2 int), (r1v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair zzd(com.google.android.gms.internal.ads.zzu r10, com.google.android.gms.internal.ads.zzc r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.zzo
            r0.getClass()
            java.lang.String r1 = r10.zzk
            int r1 = com.google.android.gms.internal.ads.zzar.zzh(r0, r1)
            com.google.android.gms.internal.ads.zzgkc r2 = com.google.android.gms.internal.ads.zzoz.zzb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L19
            goto Lbf
        L19:
            r2 = 7
            r3 = 8
            r4 = 6
            r5 = 18
            if (r1 != r5) goto L2c
            android.util.SparseArray r1 = r9.zzd
            boolean r1 = com.google.android.gms.internal.ads.zzeo.zza(r1, r5)
            if (r1 != 0) goto L2b
            r1 = r4
            goto L47
        L2b:
            r1 = r5
        L2c:
            if (r1 != r3) goto L3a
            android.util.SparseArray r1 = r9.zzd
            boolean r1 = com.google.android.gms.internal.ads.zzeo.zza(r1, r3)
            if (r1 == 0) goto L38
            r1 = r3
            goto L3a
        L38:
            r1 = r2
            goto L47
        L3a:
            r6 = 30
            if (r1 != r6) goto L47
            android.util.SparseArray r7 = r9.zzd
            boolean r6 = com.google.android.gms.internal.ads.zzeo.zza(r7, r6)
            if (r6 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r6 = r9.zzd
            boolean r7 = com.google.android.gms.internal.ads.zzeo.zza(r6, r1)
            if (r7 == 0) goto Lbf
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.ads.zzoy r6 = (com.google.android.gms.internal.ads.zzoy) r6
            r6.getClass()
            int r7 = r10.zzG
            r8 = -1
            if (r7 == r8) goto L7a
            if (r1 != r5) goto L60
            goto L7a
        L60:
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L73
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 33
            if (r10 >= r11) goto L73
            r10 = 10
            if (r7 <= r10) goto L85
            goto Lbf
        L73:
            boolean r10 = r6.zza(r7)
            if (r10 != 0) goto L85
            goto Lbf
        L7a:
            int r10 = r10.zzH
            if (r10 != r8) goto L81
            r10 = 48000(0xbb80, float:6.7262E-41)
        L81:
            int r7 = r6.zzb(r10, r11)
        L85:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r10 > r11) goto L99
            if (r7 != r2) goto L8e
            goto L9a
        L8e:
            r11 = 3
            if (r7 == r11) goto L97
            r11 = 4
            if (r7 == r11) goto L97
            r11 = 5
            if (r7 != r11) goto L99
        L97:
            r3 = r4
            goto L9a
        L99:
            r3 = r7
        L9a:
            r11 = 26
            if (r10 > r11) goto Lac
            java.lang.String r10 = "fugu"
            java.lang.String r11 = android.os.Build.DEVICE
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto Lac
            r10 = 1
            if (r3 != r10) goto Lac
            r3 = 2
        Lac:
            int r10 = com.google.android.gms.internal.ads.zzeo.zzB(r3)
            if (r10 == 0) goto Lbf
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r11, r10)
            return r10
        Lbf:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoz.zzd(com.google.android.gms.internal.ads.zzu, com.google.android.gms.internal.ads.zzc):android.util.Pair");
    }
}
