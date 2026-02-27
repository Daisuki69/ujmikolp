package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AccountLimitType;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_AccountLimitType extends C$AutoValue_AccountLimitType {

    public static final class GsonTypeAdapter extends y {
        private volatile y accountLimitAmount_adapter;
        private volatile y accountLimitCount_adapter;
        private final j gson;
        private volatile y int__adapter;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(AccountLimitType)";
        }

        @Override // com.google.gson.y
        public AccountLimitType read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            AccountLimitType.Builder builderSBuilder = AccountLimitType.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "description":
                            y yVarH = this.string_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(String.class);
                                this.string_adapter = yVarH;
                            }
                            builderSBuilder.mDescription((String) yVarH.read(aVar));
                            break;
                        case "amount":
                            y yVarH2 = this.accountLimitAmount_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(AccountLimitAmount.class);
                                this.accountLimitAmount_adapter = yVarH2;
                            }
                            builderSBuilder.mAmount((AccountLimitAmount) yVarH2.read(aVar));
                            break;
                        case "name":
                            y yVarH3 = this.string_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(String.class);
                                this.string_adapter = yVarH3;
                            }
                            builderSBuilder.mName((String) yVarH3.read(aVar));
                            break;
                        case "type":
                            y yVarH4 = this.string_adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(String.class);
                                this.string_adapter = yVarH4;
                            }
                            builderSBuilder.mType((String) yVarH4.read(aVar));
                            break;
                        case "count":
                            y yVarH5 = this.accountLimitCount_adapter;
                            if (yVarH5 == null) {
                                yVarH5 = this.gson.h(AccountLimitCount.class);
                                this.accountLimitCount_adapter = yVarH5;
                            }
                            builderSBuilder.mCount((AccountLimitCount) yVarH5.read(aVar));
                            break;
                        case "order":
                            y yVarH6 = this.int__adapter;
                            if (yVarH6 == null) {
                                yVarH6 = this.gson.h(Integer.class);
                                this.int__adapter = yVarH6;
                            }
                            builderSBuilder.mOrder(((Integer) yVarH6.read(aVar)).intValue());
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
        public void write(b bVar, AccountLimitType accountLimitType) throws IOException {
            if (accountLimitType == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(SessionDescription.ATTR_TYPE);
            if (accountLimitType.mType() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, accountLimitType.mType());
            }
            bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (accountLimitType.mName() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, accountLimitType.mName());
            }
            bVar.m("description");
            if (accountLimitType.mDescription() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, accountLimitType.mDescription());
            }
            bVar.m("order");
            y yVarH4 = this.int__adapter;
            if (yVarH4 == null) {
                yVarH4 = this.gson.h(Integer.class);
                this.int__adapter = yVarH4;
            }
            yVarH4.write(bVar, Integer.valueOf(accountLimitType.mOrder()));
            bVar.m("count");
            if (accountLimitType.mCount() == null) {
                bVar.r();
            } else {
                y yVarH5 = this.accountLimitCount_adapter;
                if (yVarH5 == null) {
                    yVarH5 = this.gson.h(AccountLimitCount.class);
                    this.accountLimitCount_adapter = yVarH5;
                }
                yVarH5.write(bVar, accountLimitType.mCount());
            }
            bVar.m("amount");
            if (accountLimitType.mAmount() == null) {
                bVar.r();
            } else {
                y yVarH6 = this.accountLimitAmount_adapter;
                if (yVarH6 == null) {
                    yVarH6 = this.gson.h(AccountLimitAmount.class);
                    this.accountLimitAmount_adapter = yVarH6;
                }
                yVarH6.write(bVar, accountLimitType.mAmount());
            }
            bVar.k();
        }
    }

    public AutoValue_AccountLimitType(String str, String str2, String str3, int i, @Nullable AccountLimitCount accountLimitCount, @Nullable AccountLimitAmount accountLimitAmount) {
        new AccountLimitType(str, str2, str3, i, accountLimitCount, accountLimitAmount) { // from class: com.paymaya.domain.model.$AutoValue_AccountLimitType
            private final AccountLimitAmount mAmount;
            private final AccountLimitCount mCount;
            private final String mDescription;
            private final String mName;
            private final int mOrder;
            private final String mType;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_AccountLimitType$Builder */
            public static class Builder extends AccountLimitType.Builder {
                private AccountLimitAmount mAmount;
                private AccountLimitCount mCount;
                private String mDescription;
                private String mName;
                private Integer mOrder;
                private String mType;

                @Override // com.paymaya.domain.model.AccountLimitType.Builder
                public AccountLimitType build() {
                    String strI = this.mType == null ? " mType" : "";
                    if (this.mName == null) {
                        strI = s.i(strI, " mName");
                    }
                    if (this.mDescription == null) {
                        strI = s.i(strI, " mDescription");
                    }
                    if (this.mOrder == null) {
                        strI = s.i(strI, " mOrder");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_AccountLimitType(this.mType, this.mName, this.mDescription, this.mOrder.intValue(), this.mCount, this.mAmount);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.AccountLimitType.Builder
                public AccountLimitType.Builder mAmount(AccountLimitAmount accountLimitAmount) {
                    this.mAmount = accountLimitAmount;
                    return this;
                }

                @Override // com.paymaya.domain.model.AccountLimitType.Builder
                public AccountLimitType.Builder mCount(AccountLimitCount accountLimitCount) {
                    this.mCount = accountLimitCount;
                    return this;
                }

                @Override // com.paymaya.domain.model.AccountLimitType.Builder
                public AccountLimitType.Builder mDescription(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mDescription");
                    }
                    this.mDescription = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.AccountLimitType.Builder
                public AccountLimitType.Builder mName(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mName");
                    }
                    this.mName = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.AccountLimitType.Builder
                public AccountLimitType.Builder mOrder(int i) {
                    this.mOrder = Integer.valueOf(i);
                    return this;
                }

                @Override // com.paymaya.domain.model.AccountLimitType.Builder
                public AccountLimitType.Builder mType(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mType");
                    }
                    this.mType = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mType");
                }
                this.mType = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mName");
                }
                this.mName = str2;
                if (str3 == null) {
                    throw new NullPointerException("Null mDescription");
                }
                this.mDescription = str3;
                this.mOrder = i;
                this.mCount = accountLimitCount;
                this.mAmount = accountLimitAmount;
            }

            public boolean equals(Object obj) {
                AccountLimitCount accountLimitCount2;
                AccountLimitAmount accountLimitAmount2;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof AccountLimitType) {
                    AccountLimitType accountLimitType = (AccountLimitType) obj;
                    if (this.mType.equals(accountLimitType.mType()) && this.mName.equals(accountLimitType.mName()) && this.mDescription.equals(accountLimitType.mDescription()) && this.mOrder == accountLimitType.mOrder() && ((accountLimitCount2 = this.mCount) != null ? accountLimitCount2.equals(accountLimitType.mCount()) : accountLimitType.mCount() == null) && ((accountLimitAmount2 = this.mAmount) != null ? accountLimitAmount2.equals(accountLimitType.mAmount()) : accountLimitType.mAmount() == null)) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                int iHashCode = (((((((this.mType.hashCode() ^ 1000003) * 1000003) ^ this.mName.hashCode()) * 1000003) ^ this.mDescription.hashCode()) * 1000003) ^ this.mOrder) * 1000003;
                AccountLimitCount accountLimitCount2 = this.mCount;
                int iHashCode2 = (iHashCode ^ (accountLimitCount2 == null ? 0 : accountLimitCount2.hashCode())) * 1000003;
                AccountLimitAmount accountLimitAmount2 = this.mAmount;
                return iHashCode2 ^ (accountLimitAmount2 != null ? accountLimitAmount2.hashCode() : 0);
            }

            @Override // com.paymaya.domain.model.AccountLimitType
            @Nullable
            @InterfaceC1498b("amount")
            public AccountLimitAmount mAmount() {
                return this.mAmount;
            }

            @Override // com.paymaya.domain.model.AccountLimitType
            @Nullable
            @InterfaceC1498b("count")
            public AccountLimitCount mCount() {
                return this.mCount;
            }

            @Override // com.paymaya.domain.model.AccountLimitType
            @InterfaceC1498b("description")
            public String mDescription() {
                return this.mDescription;
            }

            @Override // com.paymaya.domain.model.AccountLimitType
            @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
            public String mName() {
                return this.mName;
            }

            @Override // com.paymaya.domain.model.AccountLimitType
            @InterfaceC1498b("order")
            public int mOrder() {
                return this.mOrder;
            }

            @Override // com.paymaya.domain.model.AccountLimitType
            @InterfaceC1498b(SessionDescription.ATTR_TYPE)
            public String mType() {
                return this.mType;
            }

            public String toString() {
                return "AccountLimitType{mType=" + this.mType + ", mName=" + this.mName + ", mDescription=" + this.mDescription + ", mOrder=" + this.mOrder + ", mCount=" + this.mCount + ", mAmount=" + this.mAmount + "}";
            }
        };
    }
}
