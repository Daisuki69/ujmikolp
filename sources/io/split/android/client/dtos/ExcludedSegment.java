package io.split.android.client.dtos;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.AbstractC1414e;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public class ExcludedSegment {
    private static final String TYPE_LARGE = "large";
    private static final String TYPE_RULE_BASED = "rule-based";
    private static final String TYPE_STANDARD = "standard";

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private String mName;

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private String mType;

    public ExcludedSegment() {
    }

    @VisibleForTesting
    public static ExcludedSegment large(String str) {
        return new ExcludedSegment(str, TYPE_LARGE);
    }

    public static ExcludedSegment ruleBased(String str) {
        return new ExcludedSegment(str, TYPE_RULE_BASED);
    }

    @VisibleForTesting
    public static ExcludedSegment standard(String str) {
        return new ExcludedSegment(str, TYPE_STANDARD);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExcludedSegment)) {
            return false;
        }
        ExcludedSegment excludedSegment = (ExcludedSegment) obj;
        return this.mName.equals(excludedSegment.mName) && this.mType.equals(excludedSegment.mType);
    }

    public String getName() {
        return this.mName;
    }

    public int hashCode() {
        return this.mType.hashCode() + AbstractC1414e.c(527, 31, this.mName);
    }

    public boolean isLarge() {
        return TYPE_LARGE.equals(this.mType);
    }

    public boolean isRuleBased() {
        return TYPE_RULE_BASED.equals(this.mType);
    }

    public boolean isStandard() {
        return TYPE_STANDARD.equals(this.mType);
    }

    private ExcludedSegment(String str, String str2) {
        this.mName = str;
        this.mType = str2;
    }
}
