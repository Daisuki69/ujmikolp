package com.dynatrace.android.callback;

import We.s;
import com.dynatrace.android.callback.CbConstants;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
abstract class WebReqStateParms {
    protected String desc;
    int respCode;
    CbConstants.WrStates state;
    CbConstants.WrMethod trackingMethod;
    String reason = null;
    String reasonPhrase = null;
    long requestLength = -1;
    long responseLength = -1;
    boolean canFinalize = true;
    String serverTimingValue = null;
    Throwable exception = null;
    Map<String, List<String>> requestHeaders = null;
    Map<String, List<String>> responseHeaders = null;

    public WebReqStateParms(CbConstants.WrMethod wrMethod, CbConstants.WrStates wrStates, int i) {
        this.trackingMethod = wrMethod;
        this.state = wrStates;
        this.respCode = i;
    }

    public void evaluateServerTiming(List<String> list) {
        this.serverTimingValue = new ServerTimingAnalyzer().analyze(list);
    }

    public abstract String getRequestClassName();

    public String getRequestClassName(Object obj) {
        return obj != null ? obj.getClass().getSimpleName() : "NA";
    }

    public abstract String getRequestDesc();

    public abstract Map<String, List<String>> getRequestHeaders();

    public abstract String getRequestHost();

    public abstract String getRequestMethod();

    public abstract Map<String, List<String>> getResponseHeaders();

    public abstract URL getUrl();

    public abstract Object[] getWebContext();

    public abstract boolean isSupportedByGrail();

    public String toString() {
        CbConstants.WrStates wrStates = this.state;
        String requestClassName = getRequestClassName();
        CbConstants.WrMethod wrMethod = this.trackingMethod;
        String requestDesc = getRequestDesc();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(wrStates);
        sb2.append(" of ");
        sb2.append(requestClassName);
        sb2.append(".");
        sb2.append(wrMethod);
        return s.p(sb2, " to ", requestDesc);
    }
}
