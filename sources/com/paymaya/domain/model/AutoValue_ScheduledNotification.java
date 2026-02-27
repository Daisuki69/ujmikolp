package com.paymaya.domain.model;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.ScheduledNotification;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ScheduledNotification extends C$AutoValue_ScheduledNotification {
    public static final Parcelable.Creator<AutoValue_ScheduledNotification> CREATOR = new Parcelable.Creator<AutoValue_ScheduledNotification>() { // from class: com.paymaya.domain.model.AutoValue_ScheduledNotification.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ScheduledNotification createFromParcel(Parcel parcel) {
            return new AutoValue_ScheduledNotification(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), (PendingIntent) parcel.readParcelable(ScheduledNotification.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ScheduledNotification[] newArray(int i) {
            return new AutoValue_ScheduledNotification[i];
        }
    };

    public AutoValue_ScheduledNotification(final String str, final String str2, final int i, final long j, final String str3, final String str4, final PendingIntent pendingIntent) {
        new C$$AutoValue_ScheduledNotification(str, str2, i, j, str3, str4, pendingIntent) { // from class: com.paymaya.domain.model.$AutoValue_ScheduledNotification

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ScheduledNotification$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y int__adapter;
                private volatile y long__adapter;
                private volatile y pendingIntent_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(ScheduledNotification)";
                }

                @Override // com.google.gson.y
                public ScheduledNotification read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    ScheduledNotification.Builder builderSBuilder = ScheduledNotification.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if ("mNotificationChannelId".equals(strE)) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mNotificationChannelId((String) yVarH.read(aVar));
                            } else if ("mSchedulingDataIdentifier".equals(strE)) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mSchedulingDataIdentifier((String) yVarH2.read(aVar));
                            } else if ("mSchedulingRequestCode".equals(strE)) {
                                y yVarH3 = this.int__adapter;
                                if (yVarH3 == null) {
                                    yVarH3 = this.gson.h(Integer.class);
                                    this.int__adapter = yVarH3;
                                }
                                builderSBuilder.mSchedulingRequestCode(((Integer) yVarH3.read(aVar)).intValue());
                            } else if ("mNotificationTriggerTime".equals(strE)) {
                                y yVarH4 = this.long__adapter;
                                if (yVarH4 == null) {
                                    yVarH4 = this.gson.h(Long.class);
                                    this.long__adapter = yVarH4;
                                }
                                builderSBuilder.mNotificationTriggerTime(((Long) yVarH4.read(aVar)).longValue());
                            } else if ("mTitle".equals(strE)) {
                                y yVarH5 = this.string_adapter;
                                if (yVarH5 == null) {
                                    yVarH5 = this.gson.h(String.class);
                                    this.string_adapter = yVarH5;
                                }
                                builderSBuilder.mTitle((String) yVarH5.read(aVar));
                            } else if ("mText".equals(strE)) {
                                y yVarH6 = this.string_adapter;
                                if (yVarH6 == null) {
                                    yVarH6 = this.gson.h(String.class);
                                    this.string_adapter = yVarH6;
                                }
                                builderSBuilder.mText((String) yVarH6.read(aVar));
                            } else if ("mContentIntent".equals(strE)) {
                                y yVarH7 = this.pendingIntent_adapter;
                                if (yVarH7 == null) {
                                    yVarH7 = this.gson.h(PendingIntent.class);
                                    this.pendingIntent_adapter = yVarH7;
                                }
                                builderSBuilder.mContentIntent((PendingIntent) yVarH7.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, ScheduledNotification scheduledNotification) throws IOException {
                    if (scheduledNotification == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("mNotificationChannelId");
                    if (scheduledNotification.mNotificationChannelId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, scheduledNotification.mNotificationChannelId());
                    }
                    bVar.m("mSchedulingDataIdentifier");
                    if (scheduledNotification.mSchedulingDataIdentifier() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, scheduledNotification.mSchedulingDataIdentifier());
                    }
                    bVar.m("mSchedulingRequestCode");
                    y yVarH3 = this.int__adapter;
                    if (yVarH3 == null) {
                        yVarH3 = this.gson.h(Integer.class);
                        this.int__adapter = yVarH3;
                    }
                    yVarH3.write(bVar, Integer.valueOf(scheduledNotification.mSchedulingRequestCode()));
                    bVar.m("mNotificationTriggerTime");
                    y yVarH4 = this.long__adapter;
                    if (yVarH4 == null) {
                        yVarH4 = this.gson.h(Long.class);
                        this.long__adapter = yVarH4;
                    }
                    yVarH4.write(bVar, Long.valueOf(scheduledNotification.mNotificationTriggerTime()));
                    bVar.m("mTitle");
                    if (scheduledNotification.mTitle() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, scheduledNotification.mTitle());
                    }
                    bVar.m("mText");
                    if (scheduledNotification.mText() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, scheduledNotification.mText());
                    }
                    bVar.m("mContentIntent");
                    if (scheduledNotification.mContentIntent() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.pendingIntent_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(PendingIntent.class);
                            this.pendingIntent_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, scheduledNotification.mContentIntent());
                    }
                    bVar.k();
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mNotificationChannelId());
        parcel.writeString(mSchedulingDataIdentifier());
        parcel.writeInt(mSchedulingRequestCode());
        parcel.writeLong(mNotificationTriggerTime());
        parcel.writeString(mTitle());
        parcel.writeString(mText());
        parcel.writeParcelable(mContentIntent(), i);
    }
}
