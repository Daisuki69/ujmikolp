package com.paymaya.domain.model;

import We.s;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.paymaya.domain.model.ActivityDescription;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ActivityDescription, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_ActivityDescription extends ActivityDescription {
    private final String mAction;
    private final String mTarget;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ActivityDescription$Builder */
    public static class Builder extends ActivityDescription.Builder {
        private String mAction;
        private String mTarget;

        @Override // com.paymaya.domain.model.ActivityDescription.Builder
        public ActivityDescription build() {
            String strI = this.mAction == null ? " mAction" : "";
            if (this.mTarget == null) {
                strI = s.i(strI, " mTarget");
            }
            if (strI.isEmpty()) {
                return new AutoValue_ActivityDescription(this.mAction, this.mTarget);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.ActivityDescription.Builder
        public ActivityDescription.Builder mAction(String str) {
            if (str == null) {
                throw new NullPointerException("Null mAction");
            }
            this.mAction = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ActivityDescription.Builder
        public ActivityDescription.Builder mTarget(String str) {
            if (str == null) {
                throw new NullPointerException("Null mTarget");
            }
            this.mTarget = str;
            return this;
        }
    }

    public C$$AutoValue_ActivityDescription(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null mAction");
        }
        this.mAction = str;
        if (str2 == null) {
            throw new NullPointerException("Null mTarget");
        }
        this.mTarget = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ActivityDescription) {
            ActivityDescription activityDescription = (ActivityDescription) obj;
            if (this.mAction.equals(activityDescription.mAction()) && this.mTarget.equals(activityDescription.mTarget())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mAction.hashCode() ^ 1000003) * 1000003) ^ this.mTarget.hashCode();
    }

    @Override // com.paymaya.domain.model.ActivityDescription
    @InterfaceC1498b("action")
    public String mAction() {
        return this.mAction;
    }

    @Override // com.paymaya.domain.model.ActivityDescription
    @InterfaceC1498b(TypedValues.AttributesType.S_TARGET)
    public String mTarget() {
        return this.mTarget;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityDescription{mAction=");
        sb2.append(this.mAction);
        sb2.append(", mTarget=");
        return s.p(sb2, this.mTarget, "}");
    }
}
