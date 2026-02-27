package com.google.android.gms.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractAdRequestBuilder<T extends AbstractAdRequestBuilder<T>> {
    protected final zzej zza;

    public AbstractAdRequestBuilder() {
        zzej zzejVar = new zzej();
        this.zza = zzejVar;
        zzejVar.zze(AdRequest.DEVICE_ID_EMULATOR);
    }

    @NonNull
    @Deprecated
    public T addCustomEventExtrasBundle(@NonNull Class<? extends CustomEvent> cls, @NonNull Bundle bundle) {
        this.zza.zzd(cls, bundle);
        return (T) self();
    }

    @NonNull
    public T addCustomTargeting(@NonNull String str, @NonNull String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb2 = new StringBuilder(str2.length() + 108);
            sb2.append("Value ");
            sb2.append(str2);
            sb2.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            zzo.zzi(sb2.toString());
        }
        this.zza.zzl(str, str2);
        return (T) self();
    }

    @NonNull
    public T addKeyword(@NonNull String str) {
        this.zza.zza(str);
        return (T) self();
    }

    @NonNull
    public T addNetworkExtrasBundle(@NonNull Class<? extends MediationExtrasReceiver> cls, @NonNull Bundle bundle) {
        zzej zzejVar = this.zza;
        zzejVar.zzc(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            zzejVar.zzf(AdRequest.DEVICE_ID_EMULATOR);
        }
        return (T) self();
    }

    @NonNull
    public abstract T self();

    @NonNull
    public T setAdString(@NonNull String str) {
        this.zza.zzo(str);
        return (T) self();
    }

    @NonNull
    public T setContentUrl(@NonNull String str) {
        Preconditions.checkNotNull(str, "Content URL must be non-null.");
        Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
        int length = str.length();
        Preconditions.checkArgument(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
        this.zza.zzg(str);
        return (T) self();
    }

    @NonNull
    public T setHttpTimeoutMillis(int i) {
        this.zza.zzp(i);
        return (T) self();
    }

    @NonNull
    public T setNeighboringContentUrls(@NonNull List<String> list) {
        if (list == null) {
            zzo.zzi("neighboring content URLs list should not be null");
            return (T) self();
        }
        this.zza.zzh(list);
        return (T) self();
    }

    @NonNull
    public T setPlacementId(long j) {
        this.zza.zzq(j);
        return (T) self();
    }

    @NonNull
    public T setRequestAgent(@NonNull String str) {
        this.zza.zzj(str);
        return (T) self();
    }

    @NonNull
    public final AbstractAdRequestBuilder zza(@NonNull Bundle bundle) {
        this.zza.zzb(bundle);
        return self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zzb(@NonNull String str) {
        this.zza.zze(str);
        return self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zzc(boolean z4) {
        this.zza.zzk(z4);
        return self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zzd(boolean z4) {
        this.zza.zzn(z4);
        return self();
    }

    @NonNull
    public T addCustomTargeting(@NonNull String str, @NonNull List<String> list) {
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
                    StringBuilder sb2 = new StringBuilder(str2.length() + 108);
                    sb2.append("Value ");
                    sb2.append(str2);
                    sb2.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                    zzo.zzi(sb2.toString());
                }
            }
            this.zza.zzl(str, TextUtils.join(",", list));
        }
        return (T) self();
    }
}
