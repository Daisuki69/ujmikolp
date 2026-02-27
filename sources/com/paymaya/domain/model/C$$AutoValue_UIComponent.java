package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.paymaya.domain.model.UIComponent;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_UIComponent, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_UIComponent extends UIComponent {
    private final String dateFormat;
    private final boolean day;
    private final String defaultValue;
    private final boolean month;
    private final String parameter;
    private final String placeholder;
    private final String regex;
    private final boolean required;
    private final String type;
    private final List<UIValue> values;
    private final boolean year;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_UIComponent$Builder */
    public static class Builder extends UIComponent.Builder {
        private String dateFormat;
        private Boolean day;
        private String defaultValue;
        private Boolean month;
        private String parameter;
        private String placeholder;
        private String regex;
        private Boolean required;
        private String type;
        private List<UIValue> values;
        private Boolean year;

        public /* synthetic */ Builder(UIComponent uIComponent, int i) {
            this(uIComponent);
        }

        @Override // com.paymaya.domain.model.UIComponent.Builder
        public UIComponent build() {
            String strI = this.type == null ? " type" : "";
            if (this.parameter == null) {
                strI = s.i(strI, " parameter");
            }
            if (this.placeholder == null) {
                strI = s.i(strI, " placeholder");
            }
            if (this.required == null) {
                strI = s.i(strI, " required");
            }
            if (this.day == null) {
                strI = s.i(strI, " day");
            }
            if (this.month == null) {
                strI = s.i(strI, " month");
            }
            if (this.year == null) {
                strI = s.i(strI, " year");
            }
            if (strI.isEmpty()) {
                return new AutoValue_UIComponent(this.type, this.values, this.regex, this.dateFormat, this.defaultValue, this.parameter, this.placeholder, this.required.booleanValue(), this.day.booleanValue(), this.month.booleanValue(), this.year.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.UIComponent.Builder
        public UIComponent.Builder dateFormat(String str) {
            this.dateFormat = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UIComponent.Builder
        public UIComponent.Builder day(boolean z4) {
            this.day = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.UIComponent.Builder
        public UIComponent.Builder defaultValue(String str) {
            this.defaultValue = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UIComponent.Builder
        public UIComponent.Builder month(boolean z4) {
            this.month = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.UIComponent.Builder
        public UIComponent.Builder parameter(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameter");
            }
            this.parameter = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UIComponent.Builder
        public UIComponent.Builder placeholder(String str) {
            if (str == null) {
                throw new NullPointerException("Null placeholder");
            }
            this.placeholder = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UIComponent.Builder
        public UIComponent.Builder regex(String str) {
            this.regex = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UIComponent.Builder
        public UIComponent.Builder required(boolean z4) {
            this.required = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.UIComponent.Builder
        public UIComponent.Builder type(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.type = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UIComponent.Builder
        public UIComponent.Builder values(List<UIValue> list) {
            this.values = list;
            return this;
        }

        @Override // com.paymaya.domain.model.UIComponent.Builder
        public UIComponent.Builder year(boolean z4) {
            this.year = Boolean.valueOf(z4);
            return this;
        }

        public Builder() {
        }

        private Builder(UIComponent uIComponent) {
            this.type = uIComponent.type();
            this.values = uIComponent.values();
            this.regex = uIComponent.regex();
            this.dateFormat = uIComponent.dateFormat();
            this.defaultValue = uIComponent.defaultValue();
            this.parameter = uIComponent.parameter();
            this.placeholder = uIComponent.placeholder();
            this.required = Boolean.valueOf(uIComponent.required());
            this.day = Boolean.valueOf(uIComponent.day());
            this.month = Boolean.valueOf(uIComponent.month());
            this.year = Boolean.valueOf(uIComponent.year());
        }
    }

    public C$$AutoValue_UIComponent(String str, @Nullable List<UIValue> list, @Nullable String str2, @Nullable String str3, @Nullable String str4, String str5, String str6, boolean z4, boolean z5, boolean z8, boolean z9) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        this.values = list;
        this.regex = str2;
        this.dateFormat = str3;
        this.defaultValue = str4;
        if (str5 == null) {
            throw new NullPointerException("Null parameter");
        }
        this.parameter = str5;
        if (str6 == null) {
            throw new NullPointerException("Null placeholder");
        }
        this.placeholder = str6;
        this.required = z4;
        this.day = z5;
        this.month = z8;
        this.year = z9;
    }

    @Override // com.paymaya.domain.model.UIComponent
    @Nullable
    @InterfaceC1498b("dateFormat")
    public String dateFormat() {
        return this.dateFormat;
    }

    @Override // com.paymaya.domain.model.UIComponent
    @InterfaceC1498b("day")
    public boolean day() {
        return this.day;
    }

    @Override // com.paymaya.domain.model.UIComponent
    @Nullable
    @InterfaceC1498b("defaultValue")
    public String defaultValue() {
        return this.defaultValue;
    }

    public boolean equals(Object obj) {
        List<UIValue> list;
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof UIComponent) {
            UIComponent uIComponent = (UIComponent) obj;
            if (this.type.equals(uIComponent.type()) && ((list = this.values) != null ? list.equals(uIComponent.values()) : uIComponent.values() == null) && ((str = this.regex) != null ? str.equals(uIComponent.regex()) : uIComponent.regex() == null) && ((str2 = this.dateFormat) != null ? str2.equals(uIComponent.dateFormat()) : uIComponent.dateFormat() == null) && ((str3 = this.defaultValue) != null ? str3.equals(uIComponent.defaultValue()) : uIComponent.defaultValue() == null) && this.parameter.equals(uIComponent.parameter()) && this.placeholder.equals(uIComponent.placeholder()) && this.required == uIComponent.required() && this.day == uIComponent.day() && this.month == uIComponent.month() && this.year == uIComponent.year()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        List<UIValue> list = this.values;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        String str = this.regex;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.dateFormat;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.defaultValue;
        return ((((((((((((iHashCode4 ^ (str3 != null ? str3.hashCode() : 0)) * 1000003) ^ this.parameter.hashCode()) * 1000003) ^ this.placeholder.hashCode()) * 1000003) ^ (this.required ? 1231 : 1237)) * 1000003) ^ (this.day ? 1231 : 1237)) * 1000003) ^ (this.month ? 1231 : 1237)) * 1000003) ^ (this.year ? 1231 : 1237);
    }

    @Override // com.paymaya.domain.model.UIComponent
    @InterfaceC1498b("month")
    public boolean month() {
        return this.month;
    }

    @Override // com.paymaya.domain.model.UIComponent
    @InterfaceC1498b(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD)
    public String parameter() {
        return this.parameter;
    }

    @Override // com.paymaya.domain.model.UIComponent
    @InterfaceC1498b("placeholder")
    public String placeholder() {
        return this.placeholder;
    }

    @Override // com.paymaya.domain.model.UIComponent
    @Nullable
    @InterfaceC1498b("regex")
    public String regex() {
        return this.regex;
    }

    @Override // com.paymaya.domain.model.UIComponent
    @InterfaceC1498b("required")
    public boolean required() {
        return this.required;
    }

    @Override // com.paymaya.domain.model.UIComponent
    public UIComponent.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UIComponent{type=");
        sb2.append(this.type);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", regex=");
        sb2.append(this.regex);
        sb2.append(", dateFormat=");
        sb2.append(this.dateFormat);
        sb2.append(", defaultValue=");
        sb2.append(this.defaultValue);
        sb2.append(", parameter=");
        sb2.append(this.parameter);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", day=");
        sb2.append(this.day);
        sb2.append(", month=");
        sb2.append(this.month);
        sb2.append(", year=");
        return s.s(sb2, this.year, "}");
    }

    @Override // com.paymaya.domain.model.UIComponent
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String type() {
        return this.type;
    }

    @Override // com.paymaya.domain.model.UIComponent
    @Nullable
    @InterfaceC1498b("values")
    public List<UIValue> values() {
        return this.values;
    }

    @Override // com.paymaya.domain.model.UIComponent
    @InterfaceC1498b("year")
    public boolean year() {
        return this.year;
    }
}
