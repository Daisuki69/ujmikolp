package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzedo implements zzedp {
    public static /* synthetic */ zzedu zzl(String str, String str2, String str3, zzedq zzedqVar, String str4, WebView webView, String str5, String str6, zzedr zzedrVar) {
        zzflx zzflxVarZza = zzflx.zza("Google", str2);
        zzflw zzflwVarZzn = zzn("javascript");
        zzflo zzfloVarZzp = zzp(zzedqVar.toString());
        zzflw zzflwVar = zzflw.NONE;
        if (zzflwVarZzn == zzflwVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfloVarZzp == null) {
            String strValueOf = String.valueOf(zzedqVar);
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        zzflw zzflwVarZzn2 = zzn(str4);
        if (zzfloVarZzp != zzflo.VIDEO || zzflwVarZzn2 != zzflwVar) {
            zzfll zzfllVarZza = zzfll.zza(zzflxVarZza, webView, str5, "");
            return new zzedu(zzflj.zze(zzflk.zza(zzfloVarZzp, zzo(zzedrVar.toString()), zzflwVarZzn, zzflwVarZzn2, true), zzfllVarZza), zzfllVarZza);
        }
        String strValueOf2 = String.valueOf(str4);
        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    public static /* synthetic */ zzedu zzm(String str, String str2, String str3, String str4, zzedq zzedqVar, WebView webView, String str5, String str6, zzedr zzedrVar) {
        zzflx zzflxVarZza = zzflx.zza(str, str2);
        zzflw zzflwVarZzn = zzn("javascript");
        zzflw zzflwVarZzn2 = zzn(str4);
        zzflo zzfloVarZzp = zzp(zzedqVar.toString());
        zzflw zzflwVar = zzflw.NONE;
        if (zzflwVarZzn == zzflwVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfloVarZzp == null) {
            String strValueOf = String.valueOf(zzedqVar);
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        if (zzfloVarZzp != zzflo.VIDEO || zzflwVarZzn2 != zzflwVar) {
            zzfll zzfllVarZzb = zzfll.zzb(zzflxVarZza, webView, str5, "");
            return new zzedu(zzflj.zze(zzflk.zza(zzfloVarZzp, zzo(zzedrVar.toString()), zzflwVarZzn, zzflwVarZzn2, true), zzfllVarZzb), zzfllVarZzb);
        }
        String strValueOf2 = String.valueOf(str4);
        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    private static zzflw zzn(@Nullable String str) {
        return "native".equals(str) ? zzflw.NATIVE : "javascript".equals(str) ? zzflw.JAVASCRIPT : zzflw.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzflr zzo(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 1
            r3 = 2
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r2) goto L41
            if (r4 == r3) goto L3e
            com.google.android.gms.internal.ads.zzflr r4 = com.google.android.gms.internal.ads.zzflr.UNSPECIFIED
            return r4
        L3e:
            com.google.android.gms.internal.ads.zzflr r4 = com.google.android.gms.internal.ads.zzflr.ONE_PIXEL
            return r4
        L41:
            com.google.android.gms.internal.ads.zzflr r4 = com.google.android.gms.internal.ads.zzflr.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.google.android.gms.internal.ads.zzflr r4 = com.google.android.gms.internal.ads.zzflr.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedo.zzo(java.lang.String):com.google.android.gms.internal.ads.zzflr");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzflo zzp(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.zzflo r4 = com.google.android.gms.internal.ads.zzflo.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.zzflo r4 = com.google.android.gms.internal.ads.zzflo.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.zzflo r4 = com.google.android.gms.internal.ads.zzflo.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedo.zzp(java.lang.String):com.google.android.gms.internal.ads.zzflo");
    }

    @Nullable
    private static final Object zzq(zzedn zzednVar) {
        try {
            return zzednVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final boolean zza(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzedn() { // from class: com.google.android.gms.internal.ads.zzedm
                @Override // com.google.android.gms.internal.ads.zzedn
                public final /* synthetic */ Object zza() {
                    if (zzflh.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzflh.zza(context);
                    return Boolean.valueOf(zzflh.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    @Nullable
    public final String zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue()) {
            return (String) zzq(zzedd.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    @Nullable
    public final zzedu zzc(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final zzedr zzedrVar, final zzedq zzedqVar, @Nullable final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue() || !zzflh.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzedu) zzq(new zzedn(str7, str, str6, zzedqVar, str4, webView, str5, str8, zzedrVar) { // from class: com.google.android.gms.internal.ads.zzede
            private final /* synthetic */ String zzb;
            private final /* synthetic */ zzedq zzd;
            private final /* synthetic */ String zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzedr zzi;
            private final /* synthetic */ String zza = "Google";
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzedqVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzedrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzedn
            public final /* synthetic */ Object zza() {
                return zzedo.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    @Nullable
    public final zzedu zzd(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final String str5, final zzedr zzedrVar, final zzedq zzedqVar, @Nullable final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue() || !zzflh.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzedu) zzq(new zzedn(str5, str, str8, str4, zzedqVar, webView, str6, str7, zzedrVar) { // from class: com.google.android.gms.internal.ads.zzedf
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzd;
            private final /* synthetic */ zzedq zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzedr zzi;
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzedqVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzedrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzedn
            public final /* synthetic */ Object zza() {
                return zzedo.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final void zze(final zzflj zzfljVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue() && zzflh.zzb()) {
            Objects.requireNonNull(zzfljVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfljVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final void zzf(final zzflj zzfljVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue() && zzflh.zzb()) {
                    zzfljVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final void zzg(final zzflj zzfljVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue() && zzflh.zzb()) {
                    zzfljVar.zzd(view, zzflq.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final void zzh(final zzflj zzfljVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue() && zzflh.zzb()) {
                    zzfljVar.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    @Nullable
    public final zzflv zzi(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z4) {
        final boolean z5 = true;
        return (zzflv) zzq(new zzedn(webView, z5) { // from class: com.google.android.gms.internal.ads.zzedj
            private final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzedn
            public final /* synthetic */ Object zza() {
                VersionInfoParcel versionInfoParcel2 = this.zza;
                int i = versionInfoParcel2.buddyApkVersion;
                int i4 = versionInfoParcel2.clientJarVersion;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i4).length());
                sb2.append(i);
                sb2.append(".");
                sb2.append(i4);
                return zzflv.zza(zzflx.zza("Google", sb2.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final void zzj(final zzflv zzflvVar, final zzflu zzfluVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzflvVar.zzb(zzfluVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final void zzk(final zzflv zzflvVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzflvVar.zzd(view, zzflq.NOT_VISIBLE, "Ad overlay");
            }
        });
    }
}
