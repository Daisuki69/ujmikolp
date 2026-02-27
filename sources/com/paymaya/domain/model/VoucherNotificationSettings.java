package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_VoucherNotificationSettings;
import com.paymaya.domain.model.C$AutoValue_VoucherNotificationSettings;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VoucherNotificationSettings implements Parcelable {

    public static abstract class Builder {
        public abstract VoucherNotificationSettings build();

        public abstract Builder mNotificationSpiel(@Nullable String str);

        public abstract Builder mNotifyDatesBeforeExpiry(@Nullable List<String> list);

        public abstract Builder mType(@Nullable List<String> list);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_VoucherNotificationSettings.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_VoucherNotificationSettings.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("spiel")
    public abstract String mNotificationSpiel();

    @Nullable
    @InterfaceC1498b(alternate = {"notifyDatesBeforeExpiry"}, value = "notify_dates_before_expiry")
    public abstract List<String> mNotifyDatesBeforeExpiry();

    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract List<String> mType();

    public abstract Builder toBuilder();
}
