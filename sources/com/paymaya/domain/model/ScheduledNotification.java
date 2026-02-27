package com.paymaya.domain.model;

import android.app.PendingIntent;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_ScheduledNotification;
import com.paymaya.domain.model.C$AutoValue_ScheduledNotification;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ScheduledNotification implements Parcelable {

    public static abstract class Builder {
        public abstract ScheduledNotification build();

        public abstract Builder mContentIntent(PendingIntent pendingIntent);

        public abstract Builder mNotificationChannelId(String str);

        public abstract Builder mNotificationTriggerTime(long j);

        public abstract Builder mSchedulingDataIdentifier(String str);

        public abstract Builder mSchedulingRequestCode(int i);

        public abstract Builder mText(String str);

        public abstract Builder mTitle(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_ScheduledNotification.Builder().mSchedulingRequestCode(0).mNotificationTriggerTime(0L);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_ScheduledNotification.GsonTypeAdapter(jVar);
    }

    public abstract PendingIntent mContentIntent();

    public abstract String mNotificationChannelId();

    public abstract long mNotificationTriggerTime();

    public abstract String mSchedulingDataIdentifier();

    public abstract int mSchedulingRequestCode();

    public abstract String mText();

    public abstract String mTitle();
}
