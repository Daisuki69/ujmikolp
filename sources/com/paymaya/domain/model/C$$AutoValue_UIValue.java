package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.UIValue;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_UIValue, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_UIValue extends UIValue {
    private final String display;
    private final String value;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_UIValue$Builder */
    public static class Builder extends UIValue.Builder {
        private String display;
        private String value;

        @Override // com.paymaya.domain.model.UIValue.Builder
        public UIValue build() {
            String strI = this.value == null ? " value" : "";
            if (this.display == null) {
                strI = s.i(strI, " display");
            }
            if (strI.isEmpty()) {
                return new AutoValue_UIValue(this.value, this.display);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.UIValue.Builder
        public UIValue.Builder display(String str) {
            if (str == null) {
                throw new NullPointerException("Null display");
            }
            this.display = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UIValue.Builder
        public UIValue.Builder value(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.value = str;
            return this;
        }
    }

    public C$$AutoValue_UIValue(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null value");
        }
        this.value = str;
        if (str2 == null) {
            throw new NullPointerException("Null display");
        }
        this.display = str2;
    }

    @Override // com.paymaya.domain.model.UIValue
    @InterfaceC1498b("display")
    public String display() {
        return this.display;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UIValue) {
            UIValue uIValue = (UIValue) obj;
            if (this.value.equals(uIValue.value()) && this.display.equals(uIValue.display())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.value.hashCode() ^ 1000003) * 1000003) ^ this.display.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UIValue{value=");
        sb2.append(this.value);
        sb2.append(", display=");
        return s.p(sb2, this.display, "}");
    }

    @Override // com.paymaya.domain.model.UIValue
    @InterfaceC1498b("value")
    public String value() {
        return this.value;
    }
}
