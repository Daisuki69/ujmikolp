package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_AppEventsV2;
import com.paymaya.domain.model.C$AutoValue_AppEventsV2;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AppEventsV2 {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder {
        public abstract AppEventsV2 build();

        public abstract Builder mBankTransferEnabled(EnabledConfig enabledConfig);

        public abstract Builder mCashInEnabled(EnabledConfig enabledConfig);

        public abstract Builder mSendMoneyEnabled(EnabledConfig enabledConfig);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder sBuilder() {
            return new C$AutoValue_AppEventsV2.Builder().mBankTransferEnabled(EnabledConfig.sBuilder().build()).mSendMoneyEnabled(EnabledConfig.sBuilder().build()).mCashInEnabled(EnabledConfig.sBuilder().build());
        }

        public final y typeAdapter(j jVar) {
            return new AutoValue_AppEventsV2.GsonTypeAdapter(jVar);
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

    @InterfaceC1498b("bank_transfer")
    public abstract EnabledConfig mBankTransferEnabled();

    @InterfaceC1498b("cash_in")
    public abstract EnabledConfig mCashInEnabled();

    @InterfaceC1498b("send_money")
    public abstract EnabledConfig mSendMoneyEnabled();

    public abstract Builder toBuilder();
}
