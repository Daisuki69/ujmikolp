package com.dynatrace.agent.view;

import androidx.camera.core.impl.a;
import com.dynatrace.agent.events.enrichment.EventKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewSummary {
    public static final String COUNT = "error.count";
    private static final String ERROR_NAMESPACE = "error.";
    public static final String EXCEPTION_COUNT = "error.exception_count";
    public static final String HAS_CRASH = "error.has_crash";
    public static final String HTTP_4XX_COUNT = "error.http_4xx_count";
    public static final String HTTP_5XX_COUNT = "error.http_5xx_count";
    public static final String HTTP_OTHER_COUNT = "error.http_other_count";
    public static final String REQUEST_OTHER_COUNT = "error.request_other_count";
    public static final ViewSummaryKeys ViewSummaryKeys = new ViewSummaryKeys(null);
    private final long duration;
    private final int errorCount;
    private final int errorExceptionCount;
    private final int errorHttp4xxCount;
    private final int errorHttp5xxCount;
    private final int errorHttpOtherCount;
    private final int errorRequestOtherCount;
    private final boolean hasCrash;
    private final long startTime;

    public static final class ViewSummaryKeys {
        public /* synthetic */ ViewSummaryKeys(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ViewSummaryKeys() {
        }
    }

    public ViewSummary(long j, long j6, int i, int i4, int i6, int i10, int i11, int i12, boolean z4) {
        this.startTime = j;
        this.duration = j6;
        this.errorCount = i;
        this.errorExceptionCount = i4;
        this.errorHttp4xxCount = i6;
        this.errorHttp5xxCount = i10;
        this.errorHttpOtherCount = i11;
        this.errorRequestOtherCount = i12;
        this.hasCrash = z4;
    }

    public static /* synthetic */ ViewSummary copy$default(ViewSummary viewSummary, long j, long j6, int i, int i4, int i6, int i10, int i11, int i12, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j = viewSummary.startTime;
        }
        return viewSummary.copy(j, (i13 & 2) != 0 ? viewSummary.duration : j6, (i13 & 4) != 0 ? viewSummary.errorCount : i, (i13 & 8) != 0 ? viewSummary.errorExceptionCount : i4, (i13 & 16) != 0 ? viewSummary.errorHttp4xxCount : i6, (i13 & 32) != 0 ? viewSummary.errorHttp5xxCount : i10, (i13 & 64) != 0 ? viewSummary.errorHttpOtherCount : i11, (i13 & 128) != 0 ? viewSummary.errorRequestOtherCount : i12, (i13 & 256) != 0 ? viewSummary.hasCrash : z4);
    }

    public final long component1() {
        return this.startTime;
    }

    public final long component2() {
        return this.duration;
    }

    public final int component3() {
        return this.errorCount;
    }

    public final int component4() {
        return this.errorExceptionCount;
    }

    public final int component5() {
        return this.errorHttp4xxCount;
    }

    public final int component6() {
        return this.errorHttp5xxCount;
    }

    public final int component7() {
        return this.errorHttpOtherCount;
    }

    public final int component8() {
        return this.errorRequestOtherCount;
    }

    public final boolean component9() {
        return this.hasCrash;
    }

    public final ViewSummary copy(long j, long j6, int i, int i4, int i6, int i10, int i11, int i12, boolean z4) {
        return new ViewSummary(j, j6, i, i4, i6, i10, i11, i12, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewSummary)) {
            return false;
        }
        ViewSummary viewSummary = (ViewSummary) obj;
        return this.startTime == viewSummary.startTime && this.duration == viewSummary.duration && this.errorCount == viewSummary.errorCount && this.errorExceptionCount == viewSummary.errorExceptionCount && this.errorHttp4xxCount == viewSummary.errorHttp4xxCount && this.errorHttp5xxCount == viewSummary.errorHttp5xxCount && this.errorHttpOtherCount == viewSummary.errorHttpOtherCount && this.errorRequestOtherCount == viewSummary.errorRequestOtherCount && this.hasCrash == viewSummary.hasCrash;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getErrorCount() {
        return this.errorCount;
    }

    public final int getErrorExceptionCount() {
        return this.errorExceptionCount;
    }

    public final int getErrorHttp4xxCount() {
        return this.errorHttp4xxCount;
    }

    public final int getErrorHttp5xxCount() {
        return this.errorHttp5xxCount;
    }

    public final int getErrorHttpOtherCount() {
        return this.errorHttpOtherCount;
    }

    public final int getErrorRequestOtherCount() {
        return this.errorRequestOtherCount;
    }

    public final boolean getHasCrash() {
        return this.hasCrash;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        long j = this.startTime;
        long j6 = this.duration;
        return (((((((((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31) + this.errorCount) * 31) + this.errorExceptionCount) * 31) + this.errorHttp4xxCount) * 31) + this.errorHttp5xxCount) * 31) + this.errorHttpOtherCount) * 31) + this.errorRequestOtherCount) * 31) + (this.hasCrash ? 1231 : 1237);
    }

    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(EventKeys.START_TIME, this.startTime).put("duration", this.duration).put(EventKeys.Characteristics.HAS_VIEW_SUMMARY, true).put(COUNT, this.errorCount).put(EXCEPTION_COUNT, this.errorExceptionCount).put(HTTP_4XX_COUNT, this.errorHttp4xxCount).put(HTTP_5XX_COUNT, this.errorHttp5xxCount).put(HTTP_OTHER_COUNT, this.errorHttpOtherCount).put(REQUEST_OTHER_COUNT, this.errorRequestOtherCount).put(HAS_CRASH, this.hasCrash);
        j.f(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ViewSummary(startTime=");
        sb2.append(this.startTime);
        sb2.append(", duration=");
        sb2.append(this.duration);
        sb2.append(", errorCount=");
        sb2.append(this.errorCount);
        sb2.append(", errorExceptionCount=");
        sb2.append(this.errorExceptionCount);
        sb2.append(", errorHttp4xxCount=");
        sb2.append(this.errorHttp4xxCount);
        sb2.append(", errorHttp5xxCount=");
        sb2.append(this.errorHttp5xxCount);
        sb2.append(", errorHttpOtherCount=");
        sb2.append(this.errorHttpOtherCount);
        sb2.append(", errorRequestOtherCount=");
        sb2.append(this.errorRequestOtherCount);
        sb2.append(", hasCrash=");
        return a.q(sb2, this.hasCrash, ')');
    }
}
