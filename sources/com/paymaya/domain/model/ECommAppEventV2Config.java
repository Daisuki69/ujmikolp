package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_ECommAppEventV2Config;
import com.paymaya.domain.model.C$AutoValue_ECommAppEventV2Config;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ECommAppEventV2Config {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder {
        public abstract ECommAppEventV2Config build();

        public abstract Builder mBillsPay(Boolean bool);

        public abstract Builder mQR(Boolean bool);

        public abstract Builder mShop(Boolean bool);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder sBuilder() {
            C$AutoValue_ECommAppEventV2Config.Builder builder = new C$AutoValue_ECommAppEventV2Config.Builder();
            Boolean bool = Boolean.FALSE;
            return builder.mQR(bool).mShop(bool).mBillsPay(bool);
        }

        public final y typeAdapter(j jVar) {
            return new AutoValue_ECommAppEventV2Config.GsonTypeAdapter(jVar);
        }

        private Companion() {
        }
    }

    public static final Builder sBuilder() {
        return Companion.sBuilder();
    }

    public static final y typeAdapter(j jVar) {
        return Companion.typeAdapter(jVar);
    }

    @InterfaceC1498b("bills_pay")
    public abstract Boolean mBillsPay();

    @InterfaceC1498b("qr")
    public abstract Boolean mQR();

    @InterfaceC1498b("shop")
    public abstract Boolean mShop();

    public abstract Builder toBuilder();
}
