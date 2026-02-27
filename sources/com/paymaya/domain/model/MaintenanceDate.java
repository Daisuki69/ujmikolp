package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.C$$AutoValue_MaintenanceDate;
import com.paymaya.domain.model.C$AutoValue_MaintenanceDate;
import g3.InterfaceC1498b;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MaintenanceDate implements Parcelable {

    public static abstract class Builder {
        public abstract MaintenanceDate build();

        public abstract Builder mEnd(String str);

        public abstract Builder mMessage(String str);

        public abstract Builder mStart(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_MaintenanceDate.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_MaintenanceDate.GsonTypeAdapter(jVar);
    }

    public boolean isAvailable() {
        DateTime dateTimeB = AbstractC1234x.b(mStart());
        DateTime dateTimeB2 = AbstractC1234x.b(mEnd());
        DateTime dateTimeNow = DateTime.now();
        return (dateTimeNow.isAfter(dateTimeB) && dateTimeNow.isBefore(dateTimeB2)) ? false : true;
    }

    @InterfaceC1498b(TtmlNode.END)
    public abstract String mEnd();

    @InterfaceC1498b("message")
    public abstract String mMessage();

    @InterfaceC1498b(TtmlNode.START)
    public abstract String mStart();

    public abstract Builder toBuilder();
}
