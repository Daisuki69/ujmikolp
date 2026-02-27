package androidx.privacysandbox.ads.adservices.common;

import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.media3.common.PlaybackException;
import androidx.privacysandbox.ads.adservices.adselection.b;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.time.Duration;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalFeatures.Ext8OptIn
public final class KeyedFrequencyCap {
    private final int adCounterKey;
    private final Duration interval;
    private final int maxCount;

    public KeyedFrequencyCap(int i, int i4, Duration interval) {
        j.g(interval, "interval");
        this.adCounterKey = i;
        this.maxCount = i4;
        this.interval = interval;
    }

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 8), @RequiresExtension(extension = 31, version = 9)})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final android.adservices.common.KeyedFrequencyCap convertToAdServices$ads_adservices_release() {
        b.B();
        android.adservices.common.KeyedFrequencyCap keyedFrequencyCapBuild = b.o(this.adCounterKey, this.maxCount, this.interval).build();
        j.f(keyedFrequencyCapBuild, "Builder(adCounterKey, ma…val)\n            .build()");
        return keyedFrequencyCapBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyedFrequencyCap)) {
            return false;
        }
        KeyedFrequencyCap keyedFrequencyCap = (KeyedFrequencyCap) obj;
        return this.adCounterKey == keyedFrequencyCap.adCounterKey && this.maxCount == keyedFrequencyCap.maxCount && j.b(this.interval, keyedFrequencyCap.interval);
    }

    public final int getAdCounterKey() {
        return this.adCounterKey;
    }

    public final Duration getInterval() {
        return this.interval;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public int hashCode() {
        return this.interval.hashCode() + (((this.adCounterKey * 31) + this.maxCount) * 31);
    }

    public String toString() {
        return "KeyedFrequencyCap: adCounterKey=" + this.adCounterKey + ", maxCount=" + this.maxCount + ", interval=" + this.interval;
    }
}
