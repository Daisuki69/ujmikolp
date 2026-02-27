package com.google.android.gms.ads.internal.util;

import We.s;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.webkit.internal.AssetHelper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzdvo;
import com.google.android.gms.internal.ads.zzdvs;
import com.google.android.gms.internal.ads.zzgpd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzat {
    private final Context zza;
    private final zzdvs zzb;
    private String zzc;
    private String zzd;
    private String zze;

    @Nullable
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzat(Context context) {
        this.zzg = 0;
        this.zzl = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzas
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg();
            }
        };
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt.zzs().zza();
        this.zzk = com.google.android.gms.ads.internal.zzt.zzs().zzb();
        this.zzb = com.google.android.gms.ads.internal.zzt.zzo().zzb();
    }

    private final boolean zzs(float f, float f3, float f7, float f10) {
        return Math.abs(this.zzi.x - f) < ((float) this.zzh) && Math.abs(this.zzi.y - f3) < ((float) this.zzh) && Math.abs(this.zzj.x - f7) < ((float) this.zzh) && Math.abs(this.zzj.y - f10) < ((float) this.zzh);
    }

    private final void zzt(Context context) {
        ArrayList arrayList = new ArrayList();
        int iZzu = zzu(arrayList, "None", true);
        final int iZzu2 = zzu(arrayList, "Shake", true);
        final int iZzu3 = zzu(arrayList, "Flick", true);
        int iOrdinal = this.zzb.zzf().ordinal();
        final int i = iOrdinal != 1 ? iOrdinal != 2 ? iZzu : iZzu3 : iZzu2;
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzO = zzs.zzO(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builderZzO.setTitle("Setup gesture");
        builderZzO.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i4) {
                atomicInteger.set(i4);
            }
        });
        builderZzO.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzak
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i4) {
                this.zza.zzb();
            }
        });
        builderZzO.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzal
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i4) {
                this.zza.zzi(atomicInteger, i, iZzu2, iZzu3, dialogInterface, i4);
            }
        });
        builderZzO.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzam
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                this.zza.zzb();
            }
        });
        builderZzO.create().show();
    }

    private static final int zzu(List list, String str, boolean z4) {
        if (!z4) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.zzc);
        sb2.append(",DebugSignal: ");
        sb2.append(this.zzf);
        sb2.append(",AFMA Version: ");
        sb2.append(this.zze);
        sb2.append(",Ad Unit ID: ");
        return s.p(sb2, this.zzd, "}");
    }

    public final void zza(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.zzg;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.zzg = 5;
                this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.zzk.postDelayed(this.zzl, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfq)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z4 = false;
                for (int i4 = 0; i4 < historySize; i4++) {
                    z4 |= !zzs(motionEvent.getHistoricalX(0, i4), motionEvent.getHistoricalY(0, i4), motionEvent.getHistoricalX(1, i4), motionEvent.getHistoricalY(1, i4));
                }
                if (zzs(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z4) {
                    return;
                }
            }
            this.zzg = -1;
            this.zzk.removeCallbacks(this.zzl);
        }
    }

    public final void zzb() {
        try {
            Context context = this.zza;
            if (!(context instanceof Activity)) {
                int i = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzo().zzi())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzt.zzo().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iZzu = zzu(arrayList, "Ad information", true);
            final int iZzu2 = zzu(arrayList, str, true);
            final int iZzu3 = zzu(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjX)).booleanValue();
            final int iZzu4 = zzu(arrayList, "Open ad inspector", zBooleanValue);
            final int iZzu5 = zzu(arrayList, "Ad inspector settings", zBooleanValue);
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder builderZzO = zzs.zzO(context);
            builderZzO.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzad
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i4) {
                    this.zza.zzh(iZzu, iZzu2, iZzu3, iZzu4, iZzu5, dialogInterface, i4);
                }
            });
            builderZzO.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.zzb("", e);
        }
    }

    public final void zzc(String str) {
        this.zzd = str;
    }

    public final void zzd(String str) {
        this.zze = str;
    }

    public final void zze(String str) {
        this.zzc = str;
    }

    public final void zzf(String str) {
        this.zzf = str;
    }

    public final /* synthetic */ void zzg() {
        this.zzg = 4;
        zzb();
    }

    public final /* synthetic */ void zzh(int i, int i4, int i6, int i10, int i11, DialogInterface dialogInterface, int i12) {
        if (i12 != i) {
            if (i12 == i4) {
                int i13 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Debug mode [Creative Preview] selected.");
                zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzo();
                    }
                });
                return;
            }
            if (i12 == i6) {
                int i14 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Debug mode [Troubleshooting] selected.");
                zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzp();
                    }
                });
                return;
            }
            if (i12 == i10) {
                zzdvs zzdvsVar = this.zzb;
                final zzgpd zzgpdVar = zzbzh.zzf;
                zzgpd zzgpdVar2 = zzbzh.zza;
                if (zzdvsVar.zzs()) {
                    zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzl();
                        }
                    });
                    return;
                } else {
                    zzgpdVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzap
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzk(zzgpdVar);
                        }
                    });
                    return;
                }
            }
            if (i12 == i11) {
                zzdvs zzdvsVar2 = this.zzb;
                final zzgpd zzgpdVar3 = zzbzh.zzf;
                zzgpd zzgpdVar4 = zzbzh.zza;
                if (zzdvsVar2.zzs()) {
                    zzgpdVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzn();
                        }
                    });
                    return;
                } else {
                    zzgpdVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzm(zzgpdVar3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        Context context = this.zza;
        if (!(context instanceof Activity)) {
            int i15 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
            return;
        }
        String str = this.zzc;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb2 = new StringBuilder();
            com.google.android.gms.ads.internal.zzt.zzc();
            Map mapZzU = zzs.zzU(uriBuild);
            for (String str3 : mapZzU.keySet()) {
                sb2.append(str3);
                sb2.append(" = ");
                sb2.append((String) mapZzU.get(str3));
                sb2.append("\n\n");
            }
            String strTrim = sb2.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzO = zzs.zzO(context);
        builderZzO.setMessage(str2);
        builderZzO.setTitle("Ad Information");
        builderZzO.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzan
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface2, int i16) {
                this.zza.zzj(str2, dialogInterface2, i16);
            }
        });
        builderZzO.setNegativeButton("Close", zzao.zza);
        builderZzO.create().show();
    }

    public final /* synthetic */ void zzi(AtomicInteger atomicInteger, int i, int i4, int i6, DialogInterface dialogInterface, int i10) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i4) {
                this.zzb.zze(zzdvo.SHAKE);
            } else if (atomicInteger.get() == i6) {
                this.zzb.zze(zzdvo.FLICK);
            } else {
                this.zzb.zze(zzdvo.NONE);
            }
        }
        zzb();
    }

    public final /* synthetic */ void zzj(String str, DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzY(this.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType(AssetHelper.DEFAULT_MIME_TYPE).putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public final /* synthetic */ void zzk(zzgpd zzgpdVar) {
        zzax zzaxVarZzo = com.google.android.gms.ads.internal.zzt.zzo();
        Context context = this.zza;
        if (zzaxVarZzo.zze(context, this.zzd, this.zze)) {
            zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzo().zzf(context, this.zzd, this.zze);
        }
    }

    public final /* synthetic */ void zzl() {
        com.google.android.gms.ads.internal.zzt.zzo().zzc(this.zza);
    }

    public final /* synthetic */ void zzm(zzgpd zzgpdVar) {
        zzax zzaxVarZzo = com.google.android.gms.ads.internal.zzt.zzo();
        Context context = this.zza;
        if (zzaxVarZzo.zze(context, this.zzd, this.zze)) {
            zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzo().zzf(context, this.zzd, this.zze);
        }
    }

    public final /* synthetic */ void zzn() {
        zzt(this.zza);
    }

    public final /* synthetic */ void zzo() {
        zzax zzaxVarZzo = com.google.android.gms.ads.internal.zzt.zzo();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        if (!zzaxVarZzo.zzd(context, str, str2)) {
            zzaxVarZzo.zzn(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if (ExifInterface.GPS_MEASUREMENT_2D.equals(zzaxVarZzo.zza)) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Creative is not pushed for this device.");
            zzaxVarZzo.zzn(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(zzaxVarZzo.zza)) {
            int i4 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("The app is not linked for creative preview.");
            zzaxVarZzo.zzf(context, str, str2);
        } else if ("0".equals(zzaxVarZzo.zza)) {
            int i6 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Device is linked for in app preview.");
            zzaxVarZzo.zzn(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final /* synthetic */ void zzp() {
        zzax zzaxVarZzo = com.google.android.gms.ads.internal.zzt.zzo();
        String str = this.zzd;
        String str2 = this.zze;
        String str3 = this.zzf;
        boolean zZzm = zzaxVarZzo.zzm();
        Context context = this.zza;
        zzaxVarZzo.zzl(zzaxVarZzo.zze(context, str, str2));
        if (!zzaxVarZzo.zzm()) {
            zzaxVarZzo.zzf(context, str, str2);
            return;
        }
        if (!zZzm && !TextUtils.isEmpty(str3)) {
            zzaxVarZzo.zzh(context, str2, str3, str);
        }
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Device is linked for debug signals.");
        zzaxVarZzo.zzn(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    public final /* synthetic */ void zzq() {
        zzt(this.zza);
    }

    public final /* synthetic */ void zzr() {
        com.google.android.gms.ads.internal.zzt.zzo().zzc(this.zza);
    }

    public zzat(Context context, String str) {
        this(context);
        this.zzc = str;
    }
}
