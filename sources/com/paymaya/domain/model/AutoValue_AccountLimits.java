package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.AccountLimits;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_AccountLimits extends C$AutoValue_AccountLimits {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y list__accountLimitType_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(AccountLimits)";
        }

        @Override // com.google.gson.y
        public AccountLimits read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            AccountLimits.Builder builderSBuilder = AccountLimits.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("daily")) {
                        y yVarG = this.list__accountLimitType_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, AccountLimitType.class));
                            this.list__accountLimitType_adapter = yVarG;
                        }
                        builderSBuilder.mAccountLimitTypesDaily((List) yVarG.read(aVar));
                    } else if (strE.equals("monthly")) {
                        y yVarG2 = this.list__accountLimitType_adapter;
                        if (yVarG2 == null) {
                            yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, AccountLimitType.class));
                            this.list__accountLimitType_adapter = yVarG2;
                        }
                        builderSBuilder.mAccountLimitTypesMonthly((List) yVarG2.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, AccountLimits accountLimits) throws IOException {
            if (accountLimits == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("daily");
            if (accountLimits.mAccountLimitTypesDaily() == null) {
                bVar.r();
            } else {
                y yVarG = this.list__accountLimitType_adapter;
                if (yVarG == null) {
                    yVarG = this.gson.g(TypeToken.getParameterized(List.class, AccountLimitType.class));
                    this.list__accountLimitType_adapter = yVarG;
                }
                yVarG.write(bVar, accountLimits.mAccountLimitTypesDaily());
            }
            bVar.m("monthly");
            if (accountLimits.mAccountLimitTypesMonthly() == null) {
                bVar.r();
            } else {
                y yVarG2 = this.list__accountLimitType_adapter;
                if (yVarG2 == null) {
                    yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, AccountLimitType.class));
                    this.list__accountLimitType_adapter = yVarG2;
                }
                yVarG2.write(bVar, accountLimits.mAccountLimitTypesMonthly());
            }
            bVar.k();
        }
    }

    public AutoValue_AccountLimits(List<AccountLimitType> list, List<AccountLimitType> list2) {
        new AccountLimits(list, list2) { // from class: com.paymaya.domain.model.$AutoValue_AccountLimits
            private final List<AccountLimitType> mAccountLimitTypesDaily;
            private final List<AccountLimitType> mAccountLimitTypesMonthly;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_AccountLimits$Builder */
            public static class Builder extends AccountLimits.Builder {
                private List<AccountLimitType> mAccountLimitTypesDaily;
                private List<AccountLimitType> mAccountLimitTypesMonthly;

                @Override // com.paymaya.domain.model.AccountLimits.Builder
                public AccountLimits build() {
                    String strI = this.mAccountLimitTypesDaily == null ? " mAccountLimitTypesDaily" : "";
                    if (this.mAccountLimitTypesMonthly == null) {
                        strI = s.i(strI, " mAccountLimitTypesMonthly");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_AccountLimits(this.mAccountLimitTypesDaily, this.mAccountLimitTypesMonthly);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.AccountLimits.Builder
                public AccountLimits.Builder mAccountLimitTypesDaily(List<AccountLimitType> list) {
                    if (list == null) {
                        throw new NullPointerException("Null mAccountLimitTypesDaily");
                    }
                    this.mAccountLimitTypesDaily = list;
                    return this;
                }

                @Override // com.paymaya.domain.model.AccountLimits.Builder
                public AccountLimits.Builder mAccountLimitTypesMonthly(List<AccountLimitType> list) {
                    if (list == null) {
                        throw new NullPointerException("Null mAccountLimitTypesMonthly");
                    }
                    this.mAccountLimitTypesMonthly = list;
                    return this;
                }
            }

            {
                if (list == null) {
                    throw new NullPointerException("Null mAccountLimitTypesDaily");
                }
                this.mAccountLimitTypesDaily = list;
                if (list2 == null) {
                    throw new NullPointerException("Null mAccountLimitTypesMonthly");
                }
                this.mAccountLimitTypesMonthly = list2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof AccountLimits) {
                    AccountLimits accountLimits = (AccountLimits) obj;
                    if (this.mAccountLimitTypesDaily.equals(accountLimits.mAccountLimitTypesDaily()) && this.mAccountLimitTypesMonthly.equals(accountLimits.mAccountLimitTypesMonthly())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((this.mAccountLimitTypesDaily.hashCode() ^ 1000003) * 1000003) ^ this.mAccountLimitTypesMonthly.hashCode();
            }

            @Override // com.paymaya.domain.model.AccountLimits
            @InterfaceC1498b("daily")
            public List<AccountLimitType> mAccountLimitTypesDaily() {
                return this.mAccountLimitTypesDaily;
            }

            @Override // com.paymaya.domain.model.AccountLimits
            @InterfaceC1498b("monthly")
            public List<AccountLimitType> mAccountLimitTypesMonthly() {
                return this.mAccountLimitTypesMonthly;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("AccountLimits{mAccountLimitTypesDaily=");
                sb2.append(this.mAccountLimitTypesDaily);
                sb2.append(", mAccountLimitTypesMonthly=");
                return s.r(sb2, this.mAccountLimitTypesMonthly, "}");
            }
        };
    }
}
