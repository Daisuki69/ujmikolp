package com.paymaya.data.api;

import Ah.p;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.paymaya.domain.model.ReferralEligibilityV2;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
public interface ReferralEligibilityClientApi {
    @GET("v1/eligibility")
    p<ReferralEligibilityV2> getReferralEligibility(@Query(SessionDescription.ATTR_TYPE) String str);
}
