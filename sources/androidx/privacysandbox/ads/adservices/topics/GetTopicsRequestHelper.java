package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.media3.common.PlaybackException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class GetTopicsRequestHelper {
    public static final GetTopicsRequestHelper INSTANCE = new GetTopicsRequestHelper();

    private GetTopicsRequestHelper() {
    }

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 5), @RequiresExtension(extension = 31, version = 9)})
    public final android.adservices.topics.GetTopicsRequest convertRequestWithRecordObservation$ads_adservices_release(GetTopicsRequest request) {
        j.g(request, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = androidx.privacysandbox.ads.adservices.measurement.a.o().setAdsSdkName(request.getAdsSdkName()).setShouldRecordObservation(request.shouldRecordObservation()).build();
        j.f(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 4), @RequiresExtension(extension = 31, version = 9)})
    public final android.adservices.topics.GetTopicsRequest convertRequestWithoutRecordObservation$ads_adservices_release(GetTopicsRequest request) {
        j.g(request, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = androidx.privacysandbox.ads.adservices.measurement.a.o().setAdsSdkName(request.getAdsSdkName()).build();
        j.f(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }
}
