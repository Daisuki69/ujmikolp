package androidx.privacysandbox.ads.adservices.common;

import android.adservices.common.AdFilters;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.media3.common.PlaybackException;
import androidx.privacysandbox.ads.adservices.adselection.b;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalFeatures.Ext8OptIn
public final class AdFilters {
    private final FrequencyCapFilters frequencyCapFilters;

    public AdFilters(FrequencyCapFilters frequencyCapFilters) {
        this.frequencyCapFilters = frequencyCapFilters;
    }

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 8), @RequiresExtension(extension = 31, version = 9)})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final android.adservices.common.AdFilters convertToAdServices$ads_adservices_release() {
        AdFilters.Builder builderI = b.i();
        FrequencyCapFilters frequencyCapFilters = this.frequencyCapFilters;
        android.adservices.common.AdFilters adFiltersBuild = builderI.setFrequencyCapFilters(frequencyCapFilters != null ? frequencyCapFilters.convertToAdServices$ads_adservices_release() : null).build();
        j.f(adFiltersBuild, "Builder()\n            .s…s())\n            .build()");
        return adFiltersBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdFilters) {
            return j.b(this.frequencyCapFilters, ((AdFilters) obj).frequencyCapFilters);
        }
        return false;
    }

    public final FrequencyCapFilters getFrequencyCapFilters() {
        return this.frequencyCapFilters;
    }

    public int hashCode() {
        FrequencyCapFilters frequencyCapFilters = this.frequencyCapFilters;
        if (frequencyCapFilters != null) {
            return frequencyCapFilters.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AdFilters: frequencyCapFilters=" + this.frequencyCapFilters;
    }
}
