package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AccountType;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_AccountType extends C$AutoValue_AccountType {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y region_adapter;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(AccountType)";
        }

        @Override // com.google.gson.y
        public AccountType read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            AccountType.Builder builderSBuilder = AccountType.sBuilder();
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
                        case "region":
                            y yVarH2 = this.region_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(Region.class);
                                this.region_adapter = yVarH2;
                            }
                            builderSBuilder.mRegion((Region) yVarH2.read(aVar));
                            break;
                        case "status":
                            y yVarH3 = this.string_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(String.class);
                                this.string_adapter = yVarH3;
                            }
                            builderSBuilder.mStatus((String) yVarH3.read(aVar));
                            break;
                        case "id":
                            y yVarH4 = this.string_adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(String.class);
                                this.string_adapter = yVarH4;
                            }
                            builderSBuilder.mId((String) yVarH4.read(aVar));
                            break;
                        case "name":
                            y yVarH5 = this.string_adapter;
                            if (yVarH5 == null) {
                                yVarH5 = this.gson.h(String.class);
                                this.string_adapter = yVarH5;
                            }
                            builderSBuilder.mName((String) yVarH5.read(aVar));
                            break;
                        case "currency":
                            y yVarH6 = this.string_adapter;
                            if (yVarH6 == null) {
                                yVarH6 = this.gson.h(String.class);
                                this.string_adapter = yVarH6;
                            }
                            builderSBuilder.mCurrency((String) yVarH6.read(aVar));
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
        public void write(b bVar, AccountType accountType) throws IOException {
            if (accountType == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(TtmlNode.ATTR_ID);
            if (accountType.mId() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, accountType.mId());
            }
            bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (accountType.mName() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, accountType.mName());
            }
            bVar.m("description");
            if (accountType.mDescription() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, accountType.mDescription());
            }
            bVar.m(TtmlNode.TAG_REGION);
            if (accountType.mRegion() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.region_adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(Region.class);
                    this.region_adapter = yVarH4;
                }
                yVarH4.write(bVar, accountType.mRegion());
            }
            bVar.m("currency");
            if (accountType.mCurrency() == null) {
                bVar.r();
            } else {
                y yVarH5 = this.string_adapter;
                if (yVarH5 == null) {
                    yVarH5 = this.gson.h(String.class);
                    this.string_adapter = yVarH5;
                }
                yVarH5.write(bVar, accountType.mCurrency());
            }
            bVar.m("status");
            if (accountType.mStatus() == null) {
                bVar.r();
            } else {
                y yVarH6 = this.string_adapter;
                if (yVarH6 == null) {
                    yVarH6 = this.gson.h(String.class);
                    this.string_adapter = yVarH6;
                }
                yVarH6.write(bVar, accountType.mStatus());
            }
            bVar.k();
        }
    }

    public AutoValue_AccountType(final String str, final String str2, final String str3, final Region region, final String str4, final String str5) {
        new AccountType(str, str2, str3, region, str4, str5) { // from class: com.paymaya.domain.model.$AutoValue_AccountType
            private final String mCurrency;
            private final String mDescription;
            private final String mId;
            private final String mName;
            private final Region mRegion;
            private final String mStatus;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_AccountType$Builder */
            public static class Builder extends AccountType.Builder {
                private String mCurrency;
                private String mDescription;
                private String mId;
                private String mName;
                private Region mRegion;
                private String mStatus;

                @Override // com.paymaya.domain.model.AccountType.Builder
                public AccountType build() {
                    String strI = this.mId == null ? " mId" : "";
                    if (this.mName == null) {
                        strI = s.i(strI, " mName");
                    }
                    if (this.mDescription == null) {
                        strI = s.i(strI, " mDescription");
                    }
                    if (this.mRegion == null) {
                        strI = s.i(strI, " mRegion");
                    }
                    if (this.mCurrency == null) {
                        strI = s.i(strI, " mCurrency");
                    }
                    if (this.mStatus == null) {
                        strI = s.i(strI, " mStatus");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_AccountType(this.mId, this.mName, this.mDescription, this.mRegion, this.mCurrency, this.mStatus);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.AccountType.Builder
                public AccountType.Builder mCurrency(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mCurrency");
                    }
                    this.mCurrency = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.AccountType.Builder
                public AccountType.Builder mDescription(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mDescription");
                    }
                    this.mDescription = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.AccountType.Builder
                public AccountType.Builder mId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mId");
                    }
                    this.mId = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.AccountType.Builder
                public AccountType.Builder mName(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mName");
                    }
                    this.mName = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.AccountType.Builder
                public AccountType.Builder mRegion(Region region) {
                    if (region == null) {
                        throw new NullPointerException("Null mRegion");
                    }
                    this.mRegion = region;
                    return this;
                }

                @Override // com.paymaya.domain.model.AccountType.Builder
                public AccountType.Builder mStatus(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mStatus");
                    }
                    this.mStatus = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mId");
                }
                this.mId = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mName");
                }
                this.mName = str2;
                if (str3 == null) {
                    throw new NullPointerException("Null mDescription");
                }
                this.mDescription = str3;
                if (region == null) {
                    throw new NullPointerException("Null mRegion");
                }
                this.mRegion = region;
                if (str4 == null) {
                    throw new NullPointerException("Null mCurrency");
                }
                this.mCurrency = str4;
                if (str5 == null) {
                    throw new NullPointerException("Null mStatus");
                }
                this.mStatus = str5;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof AccountType) {
                    AccountType accountType = (AccountType) obj;
                    if (this.mId.equals(accountType.mId()) && this.mName.equals(accountType.mName()) && this.mDescription.equals(accountType.mDescription()) && this.mRegion.equals(accountType.mRegion()) && this.mCurrency.equals(accountType.mCurrency()) && this.mStatus.equals(accountType.mStatus())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((((((((((this.mId.hashCode() ^ 1000003) * 1000003) ^ this.mName.hashCode()) * 1000003) ^ this.mDescription.hashCode()) * 1000003) ^ this.mRegion.hashCode()) * 1000003) ^ this.mCurrency.hashCode()) * 1000003) ^ this.mStatus.hashCode();
            }

            @Override // com.paymaya.domain.model.AccountType
            @InterfaceC1498b("currency")
            public String mCurrency() {
                return this.mCurrency;
            }

            @Override // com.paymaya.domain.model.AccountType
            @InterfaceC1498b("description")
            public String mDescription() {
                return this.mDescription;
            }

            @Override // com.paymaya.domain.model.AccountType
            @InterfaceC1498b(TtmlNode.ATTR_ID)
            public String mId() {
                return this.mId;
            }

            @Override // com.paymaya.domain.model.AccountType
            @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
            public String mName() {
                return this.mName;
            }

            @Override // com.paymaya.domain.model.AccountType
            @InterfaceC1498b(TtmlNode.TAG_REGION)
            public Region mRegion() {
                return this.mRegion;
            }

            @Override // com.paymaya.domain.model.AccountType
            @InterfaceC1498b("status")
            public String mStatus() {
                return this.mStatus;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("AccountType{mId=");
                sb2.append(this.mId);
                sb2.append(", mName=");
                sb2.append(this.mName);
                sb2.append(", mDescription=");
                sb2.append(this.mDescription);
                sb2.append(", mRegion=");
                sb2.append(this.mRegion);
                sb2.append(", mCurrency=");
                sb2.append(this.mCurrency);
                sb2.append(", mStatus=");
                return s.p(sb2, this.mStatus, "}");
            }
        };
    }
}
