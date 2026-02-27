package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.DeviceInformationResponse;
import java.util.Map;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;

/* JADX INFO: loaded from: classes3.dex */
public interface UnifiedGatewayApi {
    @GET("devices/consumer/v1/login-history")
    p<DeviceInformationResponse> getLoginHistoryDevices(@HeaderMap Map<String, String> map);
}
