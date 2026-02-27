package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdwx {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final Executor zzc;
    private final AtomicReference zzd = new AtomicReference("");

    public zzdwx(Context context, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = executor;
    }

    private final String zzc() {
        String name;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String strZzd = null;
        if (versionInfoParcel.isClientJar) {
            name = zzcev.class.getName();
        } else {
            try {
                name = (String) new JSONObject(zzd((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoO))).get(Integer.toString(versionInfoParcel.clientJarVersion));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoN)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "SdkIE");
                }
                name = null;
            }
        }
        if (TextUtils.isEmpty(name)) {
            return ExifInterface.GPS_MEASUREMENT_2D;
        }
        try {
            strZzd = zzd((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoP));
        } catch (IllegalArgumentException e7) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoN)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e7, "SdkIE");
            }
        }
        if (TextUtils.isEmpty(strZzd)) {
            return ExifInterface.GPS_MEASUREMENT_3D;
        }
        try {
            for (Method method : this.zza.getClassLoader().loadClass(name).getDeclaredMethods()) {
                if (method.getName().matches(strZzd)) {
                    return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return "7";
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }

    private static final String zzd(String str) throws IllegalArgumentException {
        return com.google.android.gms.ads.internal.util.zzs.zzl(new String(Base64.decode(str, 0)), new String(Base64.decode((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoQ), 10), StandardCharsets.UTF_8));
    }

    @Nullable
    public final String zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoM)).booleanValue()) {
            if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoO)).isEmpty()) {
                if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoP)).isEmpty()) {
                    if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoQ)).isEmpty()) {
                        String str = (String) this.zzd.get();
                        if (!str.isEmpty()) {
                            return str;
                        }
                        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdww
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzb();
                            }
                        });
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final /* synthetic */ void zzb() {
        AtomicReference atomicReference = this.zzd;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(zzc());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
