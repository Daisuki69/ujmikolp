package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.ShopPurchaseHistoryPushNotification;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ShopPurchaseHistoryPushNotification extends C$AutoValue_ShopPurchaseHistoryPushNotification {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(ShopPurchaseHistoryPushNotification)";
        }

        @Override // com.google.gson.y
        public ShopPurchaseHistoryPushNotification read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            ShopPurchaseHistoryPushNotification.Builder builderSBuilder = ShopPurchaseHistoryPushNotification.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if ("mType".equals(strE)) {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        builderSBuilder.mType((String) yVarH.read(aVar));
                    } else if ("mStatus".equals(strE)) {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        builderSBuilder.mStatus((String) yVarH2.read(aVar));
                    } else if ("mOrderId".equals(strE)) {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        builderSBuilder.mOrderId((String) yVarH3.read(aVar));
                    } else if ("mPaymentId".equals(strE)) {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        builderSBuilder.mPaymentId((String) yVarH4.read(aVar));
                    } else if ("mProductId".equals(strE)) {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        builderSBuilder.mProductId((String) yVarH5.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, ShopPurchaseHistoryPushNotification shopPurchaseHistoryPushNotification) throws IOException {
            if (shopPurchaseHistoryPushNotification == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("mType");
            if (shopPurchaseHistoryPushNotification.mType() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, shopPurchaseHistoryPushNotification.mType());
            }
            bVar.m("mStatus");
            if (shopPurchaseHistoryPushNotification.mStatus() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, shopPurchaseHistoryPushNotification.mStatus());
            }
            bVar.m("mOrderId");
            if (shopPurchaseHistoryPushNotification.mOrderId() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, shopPurchaseHistoryPushNotification.mOrderId());
            }
            bVar.m("mPaymentId");
            if (shopPurchaseHistoryPushNotification.mPaymentId() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.string_adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(String.class);
                    this.string_adapter = yVarH4;
                }
                yVarH4.write(bVar, shopPurchaseHistoryPushNotification.mPaymentId());
            }
            bVar.m("mProductId");
            if (shopPurchaseHistoryPushNotification.mProductId() == null) {
                bVar.r();
            } else {
                y yVarH5 = this.string_adapter;
                if (yVarH5 == null) {
                    yVarH5 = this.gson.h(String.class);
                    this.string_adapter = yVarH5;
                }
                yVarH5.write(bVar, shopPurchaseHistoryPushNotification.mProductId());
            }
            bVar.k();
        }
    }

    public AutoValue_ShopPurchaseHistoryPushNotification(String str, String str2, String str3, String str4, String str5) {
        new ShopPurchaseHistoryPushNotification(str, str2, str3, str4, str5) { // from class: com.paymaya.domain.model.$AutoValue_ShopPurchaseHistoryPushNotification
            private final String mOrderId;
            private final String mPaymentId;
            private final String mProductId;
            private final String mStatus;
            private final String mType;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ShopPurchaseHistoryPushNotification$Builder */
            public static class Builder extends ShopPurchaseHistoryPushNotification.Builder {
                private String mOrderId;
                private String mPaymentId;
                private String mProductId;
                private String mStatus;
                private String mType;

                public /* synthetic */ Builder(ShopPurchaseHistoryPushNotification shopPurchaseHistoryPushNotification, int i) {
                    this(shopPurchaseHistoryPushNotification);
                }

                @Override // com.paymaya.domain.model.ShopPurchaseHistoryPushNotification.Builder
                public ShopPurchaseHistoryPushNotification build() {
                    String strI = this.mType == null ? " mType" : "";
                    if (this.mStatus == null) {
                        strI = s.i(strI, " mStatus");
                    }
                    if (this.mOrderId == null) {
                        strI = s.i(strI, " mOrderId");
                    }
                    if (this.mPaymentId == null) {
                        strI = s.i(strI, " mPaymentId");
                    }
                    if (this.mProductId == null) {
                        strI = s.i(strI, " mProductId");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_ShopPurchaseHistoryPushNotification(this.mType, this.mStatus, this.mOrderId, this.mPaymentId, this.mProductId);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.ShopPurchaseHistoryPushNotification.Builder
                public ShopPurchaseHistoryPushNotification.Builder mOrderId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mOrderId");
                    }
                    this.mOrderId = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.ShopPurchaseHistoryPushNotification.Builder
                public ShopPurchaseHistoryPushNotification.Builder mPaymentId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mPaymentId");
                    }
                    this.mPaymentId = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.ShopPurchaseHistoryPushNotification.Builder
                public ShopPurchaseHistoryPushNotification.Builder mProductId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mProductId");
                    }
                    this.mProductId = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.ShopPurchaseHistoryPushNotification.Builder
                public ShopPurchaseHistoryPushNotification.Builder mStatus(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mStatus");
                    }
                    this.mStatus = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.ShopPurchaseHistoryPushNotification.Builder
                public ShopPurchaseHistoryPushNotification.Builder mType(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mType");
                    }
                    this.mType = str;
                    return this;
                }

                public Builder() {
                }

                private Builder(ShopPurchaseHistoryPushNotification shopPurchaseHistoryPushNotification) {
                    this.mType = shopPurchaseHistoryPushNotification.mType();
                    this.mStatus = shopPurchaseHistoryPushNotification.mStatus();
                    this.mOrderId = shopPurchaseHistoryPushNotification.mOrderId();
                    this.mPaymentId = shopPurchaseHistoryPushNotification.mPaymentId();
                    this.mProductId = shopPurchaseHistoryPushNotification.mProductId();
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mType");
                }
                this.mType = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mStatus");
                }
                this.mStatus = str2;
                if (str3 == null) {
                    throw new NullPointerException("Null mOrderId");
                }
                this.mOrderId = str3;
                if (str4 == null) {
                    throw new NullPointerException("Null mPaymentId");
                }
                this.mPaymentId = str4;
                if (str5 == null) {
                    throw new NullPointerException("Null mProductId");
                }
                this.mProductId = str5;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ShopPurchaseHistoryPushNotification) {
                    ShopPurchaseHistoryPushNotification shopPurchaseHistoryPushNotification = (ShopPurchaseHistoryPushNotification) obj;
                    if (this.mType.equals(shopPurchaseHistoryPushNotification.mType()) && this.mStatus.equals(shopPurchaseHistoryPushNotification.mStatus()) && this.mOrderId.equals(shopPurchaseHistoryPushNotification.mOrderId()) && this.mPaymentId.equals(shopPurchaseHistoryPushNotification.mPaymentId()) && this.mProductId.equals(shopPurchaseHistoryPushNotification.mProductId())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((((((((this.mType.hashCode() ^ 1000003) * 1000003) ^ this.mStatus.hashCode()) * 1000003) ^ this.mOrderId.hashCode()) * 1000003) ^ this.mPaymentId.hashCode()) * 1000003) ^ this.mProductId.hashCode();
            }

            @Override // com.paymaya.domain.model.ShopPurchaseHistoryPushNotification
            public String mOrderId() {
                return this.mOrderId;
            }

            @Override // com.paymaya.domain.model.ShopPurchaseHistoryPushNotification
            public String mPaymentId() {
                return this.mPaymentId;
            }

            @Override // com.paymaya.domain.model.ShopPurchaseHistoryPushNotification
            public String mProductId() {
                return this.mProductId;
            }

            @Override // com.paymaya.domain.model.ShopPurchaseHistoryPushNotification
            public String mStatus() {
                return this.mStatus;
            }

            @Override // com.paymaya.domain.model.ShopPurchaseHistoryPushNotification
            public String mType() {
                return this.mType;
            }

            @Override // com.paymaya.domain.model.ShopPurchaseHistoryPushNotification
            public ShopPurchaseHistoryPushNotification.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("ShopPurchaseHistoryPushNotification{mType=");
                sb2.append(this.mType);
                sb2.append(", mStatus=");
                sb2.append(this.mStatus);
                sb2.append(", mOrderId=");
                sb2.append(this.mOrderId);
                sb2.append(", mPaymentId=");
                sb2.append(this.mPaymentId);
                sb2.append(", mProductId=");
                return s.p(sb2, this.mProductId, "}");
            }
        };
    }
}
