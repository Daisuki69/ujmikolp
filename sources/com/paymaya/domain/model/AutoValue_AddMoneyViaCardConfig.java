package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.AddMoneyViaCardConfig;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_AddMoneyViaCardConfig extends C$AutoValue_AddMoneyViaCardConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;
        private volatile y int__adapter;
        private volatile y list__integer_adapter;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(AddMoneyViaCardConfig)";
        }

        @Override // com.google.gson.y
        public AddMoneyViaCardConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            AddMoneyViaCardConfig.Builder builderSBuilder = AddMoneyViaCardConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "enabled":
                            y yVarH = this.boolean__adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH;
                            }
                            builderSBuilder.mEnabled(((Boolean) yVarH.read(aVar)).booleanValue());
                            break;
                        case "dynamic_button":
                            y yVarG = this.list__integer_adapter;
                            if (yVarG == null) {
                                yVarG = this.gson.g(TypeToken.getParameterized(List.class, Integer.class));
                                this.list__integer_adapter = yVarG;
                            }
                            builderSBuilder.mDynamicButtonAmounts((List) yVarG.read(aVar));
                            break;
                        case "note":
                            y yVarH2 = this.string_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(String.class);
                                this.string_adapter = yVarH2;
                            }
                            builderSBuilder.mNote((String) yVarH2.read(aVar));
                            break;
                        case "button1":
                            y yVarH3 = this.int__adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(Integer.class);
                                this.int__adapter = yVarH3;
                            }
                            builderSBuilder.mMinAmount(((Integer) yVarH3.read(aVar)).intValue());
                            break;
                        case "button2":
                            y yVarH4 = this.int__adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(Integer.class);
                                this.int__adapter = yVarH4;
                            }
                            builderSBuilder.mSmallerPredefinedAmount(((Integer) yVarH4.read(aVar)).intValue());
                            break;
                        case "button3":
                            y yVarH5 = this.int__adapter;
                            if (yVarH5 == null) {
                                yVarH5 = this.gson.h(Integer.class);
                                this.int__adapter = yVarH5;
                            }
                            builderSBuilder.mBiggerPredefinedAmount(((Integer) yVarH5.read(aVar)).intValue());
                            break;
                        case "button4":
                            y yVarH6 = this.int__adapter;
                            if (yVarH6 == null) {
                                yVarH6 = this.gson.h(Integer.class);
                                this.int__adapter = yVarH6;
                            }
                            builderSBuilder.mMaxAmount(((Integer) yVarH6.read(aVar)).intValue());
                            break;
                        case "currency":
                            y yVarH7 = this.string_adapter;
                            if (yVarH7 == null) {
                                yVarH7 = this.gson.h(String.class);
                                this.string_adapter = yVarH7;
                            }
                            builderSBuilder.mCurrency((String) yVarH7.read(aVar));
                            break;
                        case "force_vaulting_enabled":
                            y yVarH8 = this.boolean__adapter;
                            if (yVarH8 == null) {
                                yVarH8 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH8;
                            }
                            builderSBuilder.mForceVaultingEnabled(((Boolean) yVarH8.read(aVar)).booleanValue());
                            break;
                        default:
                            aVar.Q();
                            break;
                    }
                } else {
                    aVar.G();
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, AddMoneyViaCardConfig addMoneyViaCardConfig) throws IOException {
            if (addMoneyViaCardConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(Constants.ENABLED);
            y yVarH = this.boolean__adapter;
            if (yVarH == null) {
                yVarH = this.gson.h(Boolean.class);
                this.boolean__adapter = yVarH;
            }
            yVarH.write(bVar, Boolean.valueOf(addMoneyViaCardConfig.mEnabled()));
            bVar.m("note");
            if (addMoneyViaCardConfig.mNote() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, addMoneyViaCardConfig.mNote());
            }
            bVar.m("force_vaulting_enabled");
            y yVarH3 = this.boolean__adapter;
            if (yVarH3 == null) {
                yVarH3 = this.gson.h(Boolean.class);
                this.boolean__adapter = yVarH3;
            }
            yVarH3.write(bVar, Boolean.valueOf(addMoneyViaCardConfig.mForceVaultingEnabled()));
            bVar.m("currency");
            if (addMoneyViaCardConfig.mCurrency() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.string_adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(String.class);
                    this.string_adapter = yVarH4;
                }
                yVarH4.write(bVar, addMoneyViaCardConfig.mCurrency());
            }
            bVar.m("button1");
            y yVarH5 = this.int__adapter;
            if (yVarH5 == null) {
                yVarH5 = this.gson.h(Integer.class);
                this.int__adapter = yVarH5;
            }
            yVarH5.write(bVar, Integer.valueOf(addMoneyViaCardConfig.mMinAmount()));
            bVar.m("button2");
            y yVarH6 = this.int__adapter;
            if (yVarH6 == null) {
                yVarH6 = this.gson.h(Integer.class);
                this.int__adapter = yVarH6;
            }
            yVarH6.write(bVar, Integer.valueOf(addMoneyViaCardConfig.mSmallerPredefinedAmount()));
            bVar.m("button3");
            y yVarH7 = this.int__adapter;
            if (yVarH7 == null) {
                yVarH7 = this.gson.h(Integer.class);
                this.int__adapter = yVarH7;
            }
            yVarH7.write(bVar, Integer.valueOf(addMoneyViaCardConfig.mBiggerPredefinedAmount()));
            bVar.m("button4");
            y yVarH8 = this.int__adapter;
            if (yVarH8 == null) {
                yVarH8 = this.gson.h(Integer.class);
                this.int__adapter = yVarH8;
            }
            yVarH8.write(bVar, Integer.valueOf(addMoneyViaCardConfig.mMaxAmount()));
            bVar.m("dynamic_button");
            if (addMoneyViaCardConfig.mDynamicButtonAmounts() == null) {
                bVar.r();
            } else {
                y yVarG = this.list__integer_adapter;
                if (yVarG == null) {
                    yVarG = this.gson.g(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = yVarG;
                }
                yVarG.write(bVar, addMoneyViaCardConfig.mDynamicButtonAmounts());
            }
            bVar.k();
        }
    }

    public AutoValue_AddMoneyViaCardConfig(boolean z4, @Nullable String str, boolean z5, String str2, int i, int i4, int i6, int i10, List<Integer> list) {
        new AddMoneyViaCardConfig(z4, str, z5, str2, i, i4, i6, i10, list) { // from class: com.paymaya.domain.model.$AutoValue_AddMoneyViaCardConfig
            private final int mBiggerPredefinedAmount;
            private final String mCurrency;
            private final List<Integer> mDynamicButtonAmounts;
            private final boolean mEnabled;
            private final boolean mForceVaultingEnabled;
            private final int mMaxAmount;
            private final int mMinAmount;
            private final String mNote;
            private final int mSmallerPredefinedAmount;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_AddMoneyViaCardConfig$Builder */
            public static class Builder extends AddMoneyViaCardConfig.Builder {
                private Integer mBiggerPredefinedAmount;
                private String mCurrency;
                private List<Integer> mDynamicButtonAmounts;
                private Boolean mEnabled;
                private Boolean mForceVaultingEnabled;
                private Integer mMaxAmount;
                private Integer mMinAmount;
                private String mNote;
                private Integer mSmallerPredefinedAmount;

                public /* synthetic */ Builder(AddMoneyViaCardConfig addMoneyViaCardConfig, int i) {
                    this(addMoneyViaCardConfig);
                }

                @Override // com.paymaya.domain.model.AddMoneyViaCardConfig.Builder
                public AddMoneyViaCardConfig build() {
                    String strI = this.mEnabled == null ? " mEnabled" : "";
                    if (this.mForceVaultingEnabled == null) {
                        strI = s.i(strI, " mForceVaultingEnabled");
                    }
                    if (this.mCurrency == null) {
                        strI = s.i(strI, " mCurrency");
                    }
                    if (this.mMinAmount == null) {
                        strI = s.i(strI, " mMinAmount");
                    }
                    if (this.mSmallerPredefinedAmount == null) {
                        strI = s.i(strI, " mSmallerPredefinedAmount");
                    }
                    if (this.mBiggerPredefinedAmount == null) {
                        strI = s.i(strI, " mBiggerPredefinedAmount");
                    }
                    if (this.mMaxAmount == null) {
                        strI = s.i(strI, " mMaxAmount");
                    }
                    if (this.mDynamicButtonAmounts == null) {
                        strI = s.i(strI, " mDynamicButtonAmounts");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_AddMoneyViaCardConfig(this.mEnabled.booleanValue(), this.mNote, this.mForceVaultingEnabled.booleanValue(), this.mCurrency, this.mMinAmount.intValue(), this.mSmallerPredefinedAmount.intValue(), this.mBiggerPredefinedAmount.intValue(), this.mMaxAmount.intValue(), this.mDynamicButtonAmounts);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.AddMoneyViaCardConfig.Builder
                public AddMoneyViaCardConfig.Builder mBiggerPredefinedAmount(int i) {
                    this.mBiggerPredefinedAmount = Integer.valueOf(i);
                    return this;
                }

                @Override // com.paymaya.domain.model.AddMoneyViaCardConfig.Builder
                public AddMoneyViaCardConfig.Builder mCurrency(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mCurrency");
                    }
                    this.mCurrency = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.AddMoneyViaCardConfig.Builder
                public AddMoneyViaCardConfig.Builder mDynamicButtonAmounts(List<Integer> list) {
                    if (list == null) {
                        throw new NullPointerException("Null mDynamicButtonAmounts");
                    }
                    this.mDynamicButtonAmounts = list;
                    return this;
                }

                @Override // com.paymaya.domain.model.AddMoneyViaCardConfig.Builder
                public AddMoneyViaCardConfig.Builder mEnabled(boolean z4) {
                    this.mEnabled = Boolean.valueOf(z4);
                    return this;
                }

                @Override // com.paymaya.domain.model.AddMoneyViaCardConfig.Builder
                public AddMoneyViaCardConfig.Builder mForceVaultingEnabled(boolean z4) {
                    this.mForceVaultingEnabled = Boolean.valueOf(z4);
                    return this;
                }

                @Override // com.paymaya.domain.model.AddMoneyViaCardConfig.Builder
                public AddMoneyViaCardConfig.Builder mMaxAmount(int i) {
                    this.mMaxAmount = Integer.valueOf(i);
                    return this;
                }

                @Override // com.paymaya.domain.model.AddMoneyViaCardConfig.Builder
                public AddMoneyViaCardConfig.Builder mMinAmount(int i) {
                    this.mMinAmount = Integer.valueOf(i);
                    return this;
                }

                @Override // com.paymaya.domain.model.AddMoneyViaCardConfig.Builder
                public AddMoneyViaCardConfig.Builder mNote(@Nullable String str) {
                    this.mNote = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.AddMoneyViaCardConfig.Builder
                public AddMoneyViaCardConfig.Builder mSmallerPredefinedAmount(int i) {
                    this.mSmallerPredefinedAmount = Integer.valueOf(i);
                    return this;
                }

                public Builder() {
                }

                private Builder(AddMoneyViaCardConfig addMoneyViaCardConfig) {
                    this.mEnabled = Boolean.valueOf(addMoneyViaCardConfig.mEnabled());
                    this.mNote = addMoneyViaCardConfig.mNote();
                    this.mForceVaultingEnabled = Boolean.valueOf(addMoneyViaCardConfig.mForceVaultingEnabled());
                    this.mCurrency = addMoneyViaCardConfig.mCurrency();
                    this.mMinAmount = Integer.valueOf(addMoneyViaCardConfig.mMinAmount());
                    this.mSmallerPredefinedAmount = Integer.valueOf(addMoneyViaCardConfig.mSmallerPredefinedAmount());
                    this.mBiggerPredefinedAmount = Integer.valueOf(addMoneyViaCardConfig.mBiggerPredefinedAmount());
                    this.mMaxAmount = Integer.valueOf(addMoneyViaCardConfig.mMaxAmount());
                    this.mDynamicButtonAmounts = addMoneyViaCardConfig.mDynamicButtonAmounts();
                }
            }

            {
                this.mEnabled = z4;
                this.mNote = str;
                this.mForceVaultingEnabled = z5;
                if (str2 == null) {
                    throw new NullPointerException("Null mCurrency");
                }
                this.mCurrency = str2;
                this.mMinAmount = i;
                this.mSmallerPredefinedAmount = i4;
                this.mBiggerPredefinedAmount = i6;
                this.mMaxAmount = i10;
                if (list == null) {
                    throw new NullPointerException("Null mDynamicButtonAmounts");
                }
                this.mDynamicButtonAmounts = list;
            }

            public boolean equals(Object obj) {
                String str3;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof AddMoneyViaCardConfig) {
                    AddMoneyViaCardConfig addMoneyViaCardConfig = (AddMoneyViaCardConfig) obj;
                    if (this.mEnabled == addMoneyViaCardConfig.mEnabled() && ((str3 = this.mNote) != null ? str3.equals(addMoneyViaCardConfig.mNote()) : addMoneyViaCardConfig.mNote() == null) && this.mForceVaultingEnabled == addMoneyViaCardConfig.mForceVaultingEnabled() && this.mCurrency.equals(addMoneyViaCardConfig.mCurrency()) && this.mMinAmount == addMoneyViaCardConfig.mMinAmount() && this.mSmallerPredefinedAmount == addMoneyViaCardConfig.mSmallerPredefinedAmount() && this.mBiggerPredefinedAmount == addMoneyViaCardConfig.mBiggerPredefinedAmount() && this.mMaxAmount == addMoneyViaCardConfig.mMaxAmount() && this.mDynamicButtonAmounts.equals(addMoneyViaCardConfig.mDynamicButtonAmounts())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                int i11 = ((this.mEnabled ? 1231 : 1237) ^ 1000003) * 1000003;
                String str3 = this.mNote;
                return ((((((((((((((i11 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ (this.mForceVaultingEnabled ? 1231 : 1237)) * 1000003) ^ this.mCurrency.hashCode()) * 1000003) ^ this.mMinAmount) * 1000003) ^ this.mSmallerPredefinedAmount) * 1000003) ^ this.mBiggerPredefinedAmount) * 1000003) ^ this.mMaxAmount) * 1000003) ^ this.mDynamicButtonAmounts.hashCode();
            }

            @Override // com.paymaya.domain.model.AddMoneyViaCardConfig
            @InterfaceC1498b("button3")
            public int mBiggerPredefinedAmount() {
                return this.mBiggerPredefinedAmount;
            }

            @Override // com.paymaya.domain.model.AddMoneyViaCardConfig
            @InterfaceC1498b("currency")
            public String mCurrency() {
                return this.mCurrency;
            }

            @Override // com.paymaya.domain.model.AddMoneyViaCardConfig
            @InterfaceC1498b("dynamic_button")
            public List<Integer> mDynamicButtonAmounts() {
                return this.mDynamicButtonAmounts;
            }

            @Override // com.paymaya.domain.model.AddMoneyViaCardConfig
            @InterfaceC1498b(Constants.ENABLED)
            public boolean mEnabled() {
                return this.mEnabled;
            }

            @Override // com.paymaya.domain.model.AddMoneyViaCardConfig
            @InterfaceC1498b("force_vaulting_enabled")
            public boolean mForceVaultingEnabled() {
                return this.mForceVaultingEnabled;
            }

            @Override // com.paymaya.domain.model.AddMoneyViaCardConfig
            @InterfaceC1498b("button4")
            public int mMaxAmount() {
                return this.mMaxAmount;
            }

            @Override // com.paymaya.domain.model.AddMoneyViaCardConfig
            @InterfaceC1498b("button1")
            public int mMinAmount() {
                return this.mMinAmount;
            }

            @Override // com.paymaya.domain.model.AddMoneyViaCardConfig
            @Nullable
            @InterfaceC1498b("note")
            public String mNote() {
                return this.mNote;
            }

            @Override // com.paymaya.domain.model.AddMoneyViaCardConfig
            @InterfaceC1498b("button2")
            public int mSmallerPredefinedAmount() {
                return this.mSmallerPredefinedAmount;
            }

            @Override // com.paymaya.domain.model.AddMoneyViaCardConfig
            public AddMoneyViaCardConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("AddMoneyViaCardConfig{mEnabled=");
                sb2.append(this.mEnabled);
                sb2.append(", mNote=");
                sb2.append(this.mNote);
                sb2.append(", mForceVaultingEnabled=");
                sb2.append(this.mForceVaultingEnabled);
                sb2.append(", mCurrency=");
                sb2.append(this.mCurrency);
                sb2.append(", mMinAmount=");
                sb2.append(this.mMinAmount);
                sb2.append(", mSmallerPredefinedAmount=");
                sb2.append(this.mSmallerPredefinedAmount);
                sb2.append(", mBiggerPredefinedAmount=");
                sb2.append(this.mBiggerPredefinedAmount);
                sb2.append(", mMaxAmount=");
                sb2.append(this.mMaxAmount);
                sb2.append(", mDynamicButtonAmounts=");
                return s.r(sb2, this.mDynamicButtonAmounts, "}");
            }
        };
    }
}
