package com.dynatrace.android.agent;

import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class AgentUtil {
    private AgentUtil() {
    }

    public static WebReqTag getRequestTag() {
        return Core.getRequestTag();
    }

    public static WebReqTag internalTagRequest(DTXActionImpl dTXActionImpl, HttpURLConnection httpURLConnection) {
        return dTXActionImpl.internalTagRequest();
    }

    public static WebReqTag internalTagRequest(DTXActionImpl dTXActionImpl) {
        return dTXActionImpl.internalTagRequest();
    }
}
