package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ CustomAudience.Builder a() {
        return new CustomAudience.Builder();
    }

    public static /* synthetic */ JoinCustomAudienceRequest.Builder c() {
        return new JoinCustomAudienceRequest.Builder();
    }

    public static /* synthetic */ LeaveCustomAudienceRequest.Builder f() {
        return new LeaveCustomAudienceRequest.Builder();
    }

    public static /* synthetic */ TrustedBiddingData.Builder i() {
        return new TrustedBiddingData.Builder();
    }

    public static /* synthetic */ DeletionRequest.Builder m() {
        return new DeletionRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ MeasurementManager s(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class t() {
        return MeasurementManager.class;
    }
}
