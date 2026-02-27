package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_SevenElevenPushNotification;
import com.paymaya.domain.model.C$AutoValue_SevenElevenPushNotification;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SevenElevenPushNotification implements PushNotification {

    public static abstract class Builder {
        public abstract SevenElevenPushNotification build();

        public abstract Builder isSuccess(boolean z4);

        public abstract Builder mPayId(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_SevenElevenPushNotification.Builder().isSuccess(false);
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_SevenElevenPushNotification.GsonTypeAdapter(jVar);
    }

    public abstract boolean isSuccess();

    public abstract String mPayId();

    public abstract Builder toBuilder();
}
