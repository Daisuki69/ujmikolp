package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.ReportEventRequest;
import android.adservices.adselection.UpdateAdCounterHistogramRequest;
import android.adservices.common.AdFilters;
import android.adservices.common.AdTechIdentifier;
import android.adservices.common.FrequencyCapFilters;
import android.adservices.common.KeyedFrequencyCap;
import android.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import android.net.Uri;
import java.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ ReportEventRequest.Builder a(long j, String str, String str2, int i) {
        return new ReportEventRequest.Builder(j, str, str2, i);
    }

    public static /* synthetic */ android.adservices.adselection.ReportImpressionRequest c(long j) {
        return new android.adservices.adselection.ReportImpressionRequest(j);
    }

    public static /* synthetic */ UpdateAdCounterHistogramRequest.Builder d(long j, int i, AdTechIdentifier adTechIdentifier) {
        return new UpdateAdCounterHistogramRequest.Builder(j, i, adTechIdentifier);
    }

    public static /* synthetic */ AdFilters.Builder i() {
        return new AdFilters.Builder();
    }

    public static /* synthetic */ FrequencyCapFilters.Builder l() {
        return new FrequencyCapFilters.Builder();
    }

    public static /* synthetic */ KeyedFrequencyCap.Builder o(int i, int i4, Duration duration) {
        return new KeyedFrequencyCap.Builder(i, i4, duration);
    }

    public static /* synthetic */ FetchAndJoinCustomAudienceRequest.Builder t(Uri uri) {
        return new FetchAndJoinCustomAudienceRequest.Builder(uri);
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void z() {
    }
}
