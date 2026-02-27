package com.paymaya.domain.model;

import We.s;
import android.app.PendingIntent;
import com.paymaya.domain.model.ScheduledNotification;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ScheduledNotification, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_ScheduledNotification extends ScheduledNotification {
    private final PendingIntent mContentIntent;
    private final String mNotificationChannelId;
    private final long mNotificationTriggerTime;
    private final String mSchedulingDataIdentifier;
    private final int mSchedulingRequestCode;
    private final String mText;
    private final String mTitle;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ScheduledNotification$Builder */
    public static class Builder extends ScheduledNotification.Builder {
        private PendingIntent mContentIntent;
        private String mNotificationChannelId;
        private Long mNotificationTriggerTime;
        private String mSchedulingDataIdentifier;
        private Integer mSchedulingRequestCode;
        private String mText;
        private String mTitle;

        @Override // com.paymaya.domain.model.ScheduledNotification.Builder
        public ScheduledNotification build() {
            String strI = this.mNotificationChannelId == null ? " mNotificationChannelId" : "";
            if (this.mSchedulingDataIdentifier == null) {
                strI = s.i(strI, " mSchedulingDataIdentifier");
            }
            if (this.mSchedulingRequestCode == null) {
                strI = s.i(strI, " mSchedulingRequestCode");
            }
            if (this.mNotificationTriggerTime == null) {
                strI = s.i(strI, " mNotificationTriggerTime");
            }
            if (this.mTitle == null) {
                strI = s.i(strI, " mTitle");
            }
            if (this.mText == null) {
                strI = s.i(strI, " mText");
            }
            if (this.mContentIntent == null) {
                strI = s.i(strI, " mContentIntent");
            }
            if (strI.isEmpty()) {
                return new AutoValue_ScheduledNotification(this.mNotificationChannelId, this.mSchedulingDataIdentifier, this.mSchedulingRequestCode.intValue(), this.mNotificationTriggerTime.longValue(), this.mTitle, this.mText, this.mContentIntent);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.ScheduledNotification.Builder
        public ScheduledNotification.Builder mContentIntent(PendingIntent pendingIntent) {
            if (pendingIntent == null) {
                throw new NullPointerException("Null mContentIntent");
            }
            this.mContentIntent = pendingIntent;
            return this;
        }

        @Override // com.paymaya.domain.model.ScheduledNotification.Builder
        public ScheduledNotification.Builder mNotificationChannelId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mNotificationChannelId");
            }
            this.mNotificationChannelId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ScheduledNotification.Builder
        public ScheduledNotification.Builder mNotificationTriggerTime(long j) {
            this.mNotificationTriggerTime = Long.valueOf(j);
            return this;
        }

        @Override // com.paymaya.domain.model.ScheduledNotification.Builder
        public ScheduledNotification.Builder mSchedulingDataIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null mSchedulingDataIdentifier");
            }
            this.mSchedulingDataIdentifier = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ScheduledNotification.Builder
        public ScheduledNotification.Builder mSchedulingRequestCode(int i) {
            this.mSchedulingRequestCode = Integer.valueOf(i);
            return this;
        }

        @Override // com.paymaya.domain.model.ScheduledNotification.Builder
        public ScheduledNotification.Builder mText(String str) {
            if (str == null) {
                throw new NullPointerException("Null mText");
            }
            this.mText = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ScheduledNotification.Builder
        public ScheduledNotification.Builder mTitle(String str) {
            if (str == null) {
                throw new NullPointerException("Null mTitle");
            }
            this.mTitle = str;
            return this;
        }
    }

    public C$$AutoValue_ScheduledNotification(String str, String str2, int i, long j, String str3, String str4, PendingIntent pendingIntent) {
        if (str == null) {
            throw new NullPointerException("Null mNotificationChannelId");
        }
        this.mNotificationChannelId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mSchedulingDataIdentifier");
        }
        this.mSchedulingDataIdentifier = str2;
        this.mSchedulingRequestCode = i;
        this.mNotificationTriggerTime = j;
        if (str3 == null) {
            throw new NullPointerException("Null mTitle");
        }
        this.mTitle = str3;
        if (str4 == null) {
            throw new NullPointerException("Null mText");
        }
        this.mText = str4;
        if (pendingIntent == null) {
            throw new NullPointerException("Null mContentIntent");
        }
        this.mContentIntent = pendingIntent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ScheduledNotification) {
            ScheduledNotification scheduledNotification = (ScheduledNotification) obj;
            if (this.mNotificationChannelId.equals(scheduledNotification.mNotificationChannelId()) && this.mSchedulingDataIdentifier.equals(scheduledNotification.mSchedulingDataIdentifier()) && this.mSchedulingRequestCode == scheduledNotification.mSchedulingRequestCode() && this.mNotificationTriggerTime == scheduledNotification.mNotificationTriggerTime() && this.mTitle.equals(scheduledNotification.mTitle()) && this.mText.equals(scheduledNotification.mText()) && this.mContentIntent.equals(scheduledNotification.mContentIntent())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.mNotificationChannelId.hashCode() ^ 1000003) * 1000003) ^ this.mSchedulingDataIdentifier.hashCode()) * 1000003) ^ this.mSchedulingRequestCode) * 1000003;
        long j = this.mNotificationTriggerTime;
        return ((((((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.mTitle.hashCode()) * 1000003) ^ this.mText.hashCode()) * 1000003) ^ this.mContentIntent.hashCode();
    }

    @Override // com.paymaya.domain.model.ScheduledNotification
    public PendingIntent mContentIntent() {
        return this.mContentIntent;
    }

    @Override // com.paymaya.domain.model.ScheduledNotification
    public String mNotificationChannelId() {
        return this.mNotificationChannelId;
    }

    @Override // com.paymaya.domain.model.ScheduledNotification
    public long mNotificationTriggerTime() {
        return this.mNotificationTriggerTime;
    }

    @Override // com.paymaya.domain.model.ScheduledNotification
    public String mSchedulingDataIdentifier() {
        return this.mSchedulingDataIdentifier;
    }

    @Override // com.paymaya.domain.model.ScheduledNotification
    public int mSchedulingRequestCode() {
        return this.mSchedulingRequestCode;
    }

    @Override // com.paymaya.domain.model.ScheduledNotification
    public String mText() {
        return this.mText;
    }

    @Override // com.paymaya.domain.model.ScheduledNotification
    public String mTitle() {
        return this.mTitle;
    }

    public String toString() {
        return "ScheduledNotification{mNotificationChannelId=" + this.mNotificationChannelId + ", mSchedulingDataIdentifier=" + this.mSchedulingDataIdentifier + ", mSchedulingRequestCode=" + this.mSchedulingRequestCode + ", mNotificationTriggerTime=" + this.mNotificationTriggerTime + ", mTitle=" + this.mTitle + ", mText=" + this.mText + ", mContentIntent=" + this.mContentIntent + "}";
    }
}
