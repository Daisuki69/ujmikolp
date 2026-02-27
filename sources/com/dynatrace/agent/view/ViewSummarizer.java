package com.dynatrace.agent.view;

import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.util.HexGenerator;
import kotlin.jvm.internal.j;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewSummarizer {
    private long creationTimeMs;
    private int errorCount;
    private int errorExceptionCount;
    private int errorHttp4xxCount;
    private int errorHttp5xxCount;
    private int errorHttpOtherCount;
    private int errorRequestOtherCount;
    private boolean hasCrash;
    private ViewContext viewContext;

    public final ViewSummary generateViewSummary(long j) {
        long j6 = this.creationTimeMs;
        return new ViewSummary(j6, j - j6, this.errorCount, this.errorExceptionCount, this.errorHttp4xxCount, this.errorHttp5xxCount, this.errorHttpOtherCount, this.errorRequestOtherCount, this.hasCrash);
    }

    public final void incorporateEvent(JSONObject jsonEvent) {
        j.g(jsonEvent, "jsonEvent");
        boolean zOptBoolean = jsonEvent.optBoolean(EventKeys.Characteristics.HAS_REQUEST);
        boolean zOptBoolean2 = jsonEvent.optBoolean(EventKeys.Characteristics.HAS_ERROR);
        boolean zOptBoolean3 = jsonEvent.optBoolean(EventKeys.Characteristics.HAS_EXCEPTION);
        boolean zOptBoolean4 = jsonEvent.optBoolean(EventKeys.Characteristics.HAS_FAILED_REQUEST);
        int iOptInt = jsonEvent.optInt(EventKeys.HTTP.RESPONSE_STATUS_CODE, -1);
        this.hasCrash = this.hasCrash || jsonEvent.optBoolean(EventKeys.Characteristics.HAS_CRASH);
        if (zOptBoolean3) {
            this.errorExceptionCount++;
        }
        if (zOptBoolean2) {
            this.errorCount++;
        }
        if (zOptBoolean) {
            if (400 <= iOptInt && iOptInt < 500) {
                this.errorHttp4xxCount++;
                return;
            }
            if (500 <= iOptInt && iOptInt < 600) {
                this.errorHttp5xxCount++;
                return;
            }
            if ((iOptInt >= 0 && iOptInt < 100) || (600 <= iOptInt && iOptInt <= Integer.MAX_VALUE)) {
                this.errorHttpOtherCount++;
            } else if (zOptBoolean4 || zOptBoolean3) {
                this.errorRequestOtherCount++;
            }
        }
    }

    public final ViewContext obtainViewContext() {
        return this.viewContext;
    }

    public final void openViewSummary(String viewName, long j) {
        j.g(viewName, "viewName");
        this.creationTimeMs = j;
        this.viewContext = new ViewContext(HexGenerator.generateRandomHex(8), viewName);
    }

    public final void resetViewSummary() {
        this.viewContext = null;
        this.creationTimeMs = 0L;
        this.errorCount = 0;
        this.errorExceptionCount = 0;
        this.errorHttp4xxCount = 0;
        this.errorHttp5xxCount = 0;
        this.errorHttpOtherCount = 0;
        this.errorRequestOtherCount = 0;
        this.hasCrash = false;
    }
}
