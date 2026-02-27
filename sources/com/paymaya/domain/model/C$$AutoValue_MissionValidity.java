package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.MissionValidity;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MissionValidity, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_MissionValidity extends MissionValidity {
    private final String mUnit;
    private final int mValue;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MissionValidity$Builder */
    public static class Builder extends MissionValidity.Builder {
        private String mUnit;
        private Integer mValue;

        @Override // com.paymaya.domain.model.MissionValidity.Builder
        public MissionValidity build() {
            String strI = this.mValue == null ? " mValue" : "";
            if (this.mUnit == null) {
                strI = s.i(strI, " mUnit");
            }
            if (strI.isEmpty()) {
                return new AutoValue_MissionValidity(this.mValue.intValue(), this.mUnit);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.MissionValidity.Builder
        public MissionValidity.Builder mUnit(String str) {
            if (str == null) {
                throw new NullPointerException("Null mUnit");
            }
            this.mUnit = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MissionValidity.Builder
        public MissionValidity.Builder mValue(int i) {
            this.mValue = Integer.valueOf(i);
            return this;
        }
    }

    public C$$AutoValue_MissionValidity(int i, String str) {
        this.mValue = i;
        if (str == null) {
            throw new NullPointerException("Null mUnit");
        }
        this.mUnit = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MissionValidity) {
            MissionValidity missionValidity = (MissionValidity) obj;
            if (this.mValue == missionValidity.mValue() && this.mUnit.equals(missionValidity.mUnit())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mValue ^ 1000003) * 1000003) ^ this.mUnit.hashCode();
    }

    @Override // com.paymaya.domain.model.MissionValidity
    @InterfaceC1498b("unit")
    public String mUnit() {
        return this.mUnit;
    }

    @Override // com.paymaya.domain.model.MissionValidity
    @InterfaceC1498b("value")
    public int mValue() {
        return this.mValue;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MissionValidity{mValue=");
        sb2.append(this.mValue);
        sb2.append(", mUnit=");
        return s.p(sb2, this.mUnit, "}");
    }
}
