package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.ECommAppEventV2Config;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ECommAppEventV2Config extends C$AutoValue_ECommAppEventV2Config {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(ECommAppEventV2Config)";
        }

        @Override // com.google.gson.y
        public ECommAppEventV2Config read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            ECommAppEventV2Config.Builder builderSBuilder = ECommAppEventV2Config.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "qr":
                            y yVarH = this.boolean__adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH;
                            }
                            builderSBuilder.mQR((Boolean) yVarH.read(aVar));
                            break;
                        case "shop":
                            y yVarH2 = this.boolean__adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH2;
                            }
                            builderSBuilder.mShop((Boolean) yVarH2.read(aVar));
                            break;
                        case "bills_pay":
                            y yVarH3 = this.boolean__adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH3;
                            }
                            builderSBuilder.mBillsPay((Boolean) yVarH3.read(aVar));
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
        public void write(b bVar, ECommAppEventV2Config eCommAppEventV2Config) throws IOException {
            if (eCommAppEventV2Config == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("qr");
            if (eCommAppEventV2Config.mQR() == null) {
                bVar.r();
            } else {
                y yVarH = this.boolean__adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH;
                }
                yVarH.write(bVar, eCommAppEventV2Config.mQR());
            }
            bVar.m("shop");
            if (eCommAppEventV2Config.mShop() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.boolean__adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH2;
                }
                yVarH2.write(bVar, eCommAppEventV2Config.mShop());
            }
            bVar.m("bills_pay");
            if (eCommAppEventV2Config.mBillsPay() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.boolean__adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH3;
                }
                yVarH3.write(bVar, eCommAppEventV2Config.mBillsPay());
            }
            bVar.k();
        }
    }

    public AutoValue_ECommAppEventV2Config(Boolean bool, Boolean bool2, Boolean bool3) {
        new ECommAppEventV2Config(bool, bool2, bool3) { // from class: com.paymaya.domain.model.$AutoValue_ECommAppEventV2Config
            private final Boolean mBillsPay;
            private final Boolean mQR;
            private final Boolean mShop;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ECommAppEventV2Config$Builder */
            public static class Builder extends ECommAppEventV2Config.Builder {
                private Boolean mBillsPay;
                private Boolean mQR;
                private Boolean mShop;

                public /* synthetic */ Builder(ECommAppEventV2Config eCommAppEventV2Config, int i) {
                    this(eCommAppEventV2Config);
                }

                @Override // com.paymaya.domain.model.ECommAppEventV2Config.Builder
                public ECommAppEventV2Config build() {
                    return new AutoValue_ECommAppEventV2Config(this.mQR, this.mShop, this.mBillsPay);
                }

                @Override // com.paymaya.domain.model.ECommAppEventV2Config.Builder
                public ECommAppEventV2Config.Builder mBillsPay(Boolean bool) {
                    this.mBillsPay = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.ECommAppEventV2Config.Builder
                public ECommAppEventV2Config.Builder mQR(Boolean bool) {
                    this.mQR = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.ECommAppEventV2Config.Builder
                public ECommAppEventV2Config.Builder mShop(Boolean bool) {
                    this.mShop = bool;
                    return this;
                }

                public Builder() {
                }

                private Builder(ECommAppEventV2Config eCommAppEventV2Config) {
                    this.mQR = eCommAppEventV2Config.mQR();
                    this.mShop = eCommAppEventV2Config.mShop();
                    this.mBillsPay = eCommAppEventV2Config.mBillsPay();
                }
            }

            {
                this.mQR = bool;
                this.mShop = bool2;
                this.mBillsPay = bool3;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ECommAppEventV2Config) {
                    ECommAppEventV2Config eCommAppEventV2Config = (ECommAppEventV2Config) obj;
                    Boolean bool4 = this.mQR;
                    if (bool4 != null ? bool4.equals(eCommAppEventV2Config.mQR()) : eCommAppEventV2Config.mQR() == null) {
                        Boolean bool5 = this.mShop;
                        if (bool5 != null ? bool5.equals(eCommAppEventV2Config.mShop()) : eCommAppEventV2Config.mShop() == null) {
                            Boolean bool6 = this.mBillsPay;
                            if (bool6 != null ? bool6.equals(eCommAppEventV2Config.mBillsPay()) : eCommAppEventV2Config.mBillsPay() == null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Boolean bool4 = this.mQR;
                int iHashCode = ((bool4 == null ? 0 : bool4.hashCode()) ^ 1000003) * 1000003;
                Boolean bool5 = this.mShop;
                int iHashCode2 = (iHashCode ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
                Boolean bool6 = this.mBillsPay;
                return iHashCode2 ^ (bool6 != null ? bool6.hashCode() : 0);
            }

            @Override // com.paymaya.domain.model.ECommAppEventV2Config
            @InterfaceC1498b("bills_pay")
            public Boolean mBillsPay() {
                return this.mBillsPay;
            }

            @Override // com.paymaya.domain.model.ECommAppEventV2Config
            @InterfaceC1498b("qr")
            public Boolean mQR() {
                return this.mQR;
            }

            @Override // com.paymaya.domain.model.ECommAppEventV2Config
            @InterfaceC1498b("shop")
            public Boolean mShop() {
                return this.mShop;
            }

            @Override // com.paymaya.domain.model.ECommAppEventV2Config
            public ECommAppEventV2Config.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("ECommAppEventV2Config{mQR=");
                sb2.append(this.mQR);
                sb2.append(", mShop=");
                sb2.append(this.mShop);
                sb2.append(", mBillsPay=");
                return AbstractC1213b.N(sb2, this.mBillsPay, "}");
            }
        };
    }
}
