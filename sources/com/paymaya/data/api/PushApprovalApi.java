package com.paymaya.data.api;

import Ah.a;
import Ah.p;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.PushApprovalPendingRequest;
import com.paymaya.domain.model.PushApprovalRequest;
import java.util.List;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes3.dex */
public interface PushApprovalApi {
    @PUT("approval-requests/{id}/allow")
    a allowRequest(@Path(TtmlNode.ATTR_ID) String str, @Body PushApprovalRequest pushApprovalRequest);

    @PUT("approval-requests/{id}/deny")
    a denyRequest(@Path(TtmlNode.ATTR_ID) String str, @Body PushApprovalRequest pushApprovalRequest);

    @GET("approval-requests")
    p<List<PushApprovalPendingRequest>> getPendingApprovalRequests();
}
