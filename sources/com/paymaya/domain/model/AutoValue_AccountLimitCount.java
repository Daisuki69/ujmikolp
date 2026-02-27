package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AccountLimitCount;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_AccountLimitCount extends C$AutoValue_AccountLimitCount {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y int__adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(AccountLimitCount)";
        }

        @Override // com.google.gson.y
        public AccountLimitCount read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            AccountLimitCount.Builder builderSBuilder = AccountLimitCount.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("limit")) {
                        y yVarH = this.int__adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Integer.class);
                            this.int__adapter = yVarH;
                        }
                        builderSBuilder.mLimit(((Integer) yVarH.read(aVar)).intValue());
                    } else if (strE.equals("remaining")) {
                        y yVarH2 = this.int__adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(Integer.class);
                            this.int__adapter = yVarH2;
                        }
                        builderSBuilder.mRemaining(((Integer) yVarH2.read(aVar)).intValue());
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, AccountLimitCount accountLimitCount) throws IOException {
            if (accountLimitCount == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("limit");
            y yVarH = this.int__adapter;
            if (yVarH == null) {
                yVarH = this.gson.h(Integer.class);
                this.int__adapter = yVarH;
            }
            yVarH.write(bVar, Integer.valueOf(accountLimitCount.mLimit()));
            bVar.m("remaining");
            y yVarH2 = this.int__adapter;
            if (yVarH2 == null) {
                yVarH2 = this.gson.h(Integer.class);
                this.int__adapter = yVarH2;
            }
            yVarH2.write(bVar, Integer.valueOf(accountLimitCount.mRemaining()));
            bVar.k();
        }
    }

    public AutoValue_AccountLimitCount(final int i, final int i4) {
        new AccountLimitCount(i, i4) { // from class: com.paymaya.domain.model.$AutoValue_AccountLimitCount
            private final int mLimit;
            private final int mRemaining;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_AccountLimitCount$Builder */
            public static class Builder extends AccountLimitCount.Builder {
                private Integer mLimit;
                private Integer mRemaining;

                @Override // com.paymaya.domain.model.AccountLimitCount.Builder
                public AccountLimitCount build() {
                    String strI = this.mLimit == null ? " mLimit" : "";
                    if (this.mRemaining == null) {
                        strI = s.i(strI, " mRemaining");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_AccountLimitCount(this.mLimit.intValue(), this.mRemaining.intValue());
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.AccountLimitCount.Builder
                public AccountLimitCount.Builder mLimit(int i) {
                    this.mLimit = Integer.valueOf(i);
                    return this;
                }

                @Override // com.paymaya.domain.model.AccountLimitCount.Builder
                public AccountLimitCount.Builder mRemaining(int i) {
                    this.mRemaining = Integer.valueOf(i);
                    return this;
                }
            }

            {
                this.mLimit = i;
                this.mRemaining = i4;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof AccountLimitCount) {
                    AccountLimitCount accountLimitCount = (AccountLimitCount) obj;
                    if (this.mLimit == accountLimitCount.mLimit() && this.mRemaining == accountLimitCount.mRemaining()) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((this.mLimit ^ 1000003) * 1000003) ^ this.mRemaining;
            }

            @Override // com.paymaya.domain.model.AccountLimitCount
            @InterfaceC1498b("limit")
            public int mLimit() {
                return this.mLimit;
            }

            @Override // com.paymaya.domain.model.AccountLimitCount
            @InterfaceC1498b("remaining")
            public int mRemaining() {
                return this.mRemaining;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("AccountLimitCount{mLimit=");
                sb2.append(this.mLimit);
                sb2.append(", mRemaining=");
                return s.o(sb2, "}", this.mRemaining);
            }
        };
    }
}
