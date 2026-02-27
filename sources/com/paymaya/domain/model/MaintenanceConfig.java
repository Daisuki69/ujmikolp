package com.paymaya.domain.model;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.AutoValue_MaintenanceConfig;
import com.paymaya.domain.model.C$AutoValue_MaintenanceConfig;
import g3.InterfaceC1498b;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MaintenanceConfig {

    public static abstract class Builder {
        public abstract MaintenanceConfig build();

        public abstract Builder mEnd(String str);

        public abstract Builder mMessage(String str);

        public abstract Builder mMessageV2(String str);

        public abstract Builder mServiceAvailabilityConfig(ServiceAvailabilityConfig serviceAvailabilityConfig);

        public abstract Builder mStart(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_MaintenanceConfig.Builder().mStart("2016-06-19T10:30:00.000Z").mEnd("2016-06-19T08:30:00.000Z").mMessage("Oops! Something’s up. But don’t worry, we’re now looking into it. Please try again later.").mMessageV2("Oops! Something’s up. But don’t worry, we’re now looking into it. Please try again later.").mServiceAvailabilityConfig(ServiceAvailabilityConfig.sBuilder().build());
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_MaintenanceConfig.GsonTypeAdapter(jVar);
    }

    public boolean isMaintenance() {
        DateTime dateTimeB = AbstractC1234x.b(mStart());
        DateTime dateTimeB2 = AbstractC1234x.b(mEnd());
        DateTime dateTimeNow = DateTime.now();
        return dateTimeNow.isAfter(dateTimeB) && dateTimeNow.isBefore(dateTimeB2);
    }

    @InterfaceC1498b(TtmlNode.END)
    public abstract String mEnd();

    @InterfaceC1498b("message")
    public abstract String mMessage();

    @InterfaceC1498b("message_v2")
    public abstract String mMessageV2();

    @InterfaceC1498b("service_availability")
    public abstract ServiceAvailabilityConfig mServiceAvailabilityConfig();

    @InterfaceC1498b(TtmlNode.START)
    public abstract String mStart();

    public abstract Builder toBuilder();
}
