package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzedv {

    @Nullable
    private MeasurementManagerFutures zza;
    private final Context zzb;

    public zzedv(Context context) {
        this.zzb = context;
    }

    public final S1.y zza() {
        try {
            MeasurementManagerFutures measurementManagerFuturesFrom = MeasurementManagerFutures.from(this.zzb);
            this.zza = measurementManagerFuturesFrom;
            return measurementManagerFuturesFrom == null ? zzgot.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesFrom.getMeasurementApiStatusAsync();
        } catch (Exception e) {
            return zzgot.zzc(e);
        }
    }

    public final S1.y zzb(Uri uri, InputEvent inputEvent) {
        try {
            MeasurementManagerFutures measurementManagerFutures = this.zza;
            Objects.requireNonNull(measurementManagerFutures);
            return measurementManagerFutures.registerSourceAsync(uri, inputEvent);
        } catch (Exception e) {
            return zzgot.zzc(e);
        }
    }
}
