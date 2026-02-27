package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.VoucherNotificationSettings;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_VoucherNotificationSettings extends C$AutoValue_VoucherNotificationSettings {
    public static final Parcelable.Creator<AutoValue_VoucherNotificationSettings> CREATOR = new Parcelable.Creator<AutoValue_VoucherNotificationSettings>() { // from class: com.paymaya.domain.model.AutoValue_VoucherNotificationSettings.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoucherNotificationSettings createFromParcel(Parcel parcel) {
            return new AutoValue_VoucherNotificationSettings(parcel.readArrayList(VoucherNotificationSettings.class.getClassLoader()), parcel.readArrayList(VoucherNotificationSettings.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoucherNotificationSettings[] newArray(int i) {
            return new AutoValue_VoucherNotificationSettings[i];
        }
    };

    public AutoValue_VoucherNotificationSettings(@Nullable final List<String> list, @Nullable final List<String> list2, @Nullable final String str) {
        new C$$AutoValue_VoucherNotificationSettings(list, list2, str) { // from class: com.paymaya.domain.model.$AutoValue_VoucherNotificationSettings

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_VoucherNotificationSettings$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y list__string_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(VoucherNotificationSettings)";
                }

                @Override // com.google.gson.y
                public VoucherNotificationSettings read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    VoucherNotificationSettings.Builder builderSBuilder = VoucherNotificationSettings.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "notifyDatesBeforeExpiry":
                                case "notify_dates_before_expiry":
                                    y yVarG = this.list__string_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                                        this.list__string_adapter = yVarG;
                                    }
                                    builderSBuilder.mNotifyDatesBeforeExpiry((List) yVarG.read(aVar));
                                    break;
                                case "type":
                                    y yVarG2 = this.list__string_adapter;
                                    if (yVarG2 == null) {
                                        yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                                        this.list__string_adapter = yVarG2;
                                    }
                                    builderSBuilder.mType((List) yVarG2.read(aVar));
                                    break;
                                case "spiel":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mNotificationSpiel((String) yVarH.read(aVar));
                                    break;
                                default:
                                    aVar.Q();
                                    break;
                            }
                        } else {
                            aVar.G();
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, VoucherNotificationSettings voucherNotificationSettings) throws IOException {
                    if (voucherNotificationSettings == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (voucherNotificationSettings.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__string_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                            this.list__string_adapter = yVarG;
                        }
                        yVarG.write(bVar, voucherNotificationSettings.mType());
                    }
                    bVar.m("notify_dates_before_expiry");
                    if (voucherNotificationSettings.mNotifyDatesBeforeExpiry() == null) {
                        bVar.r();
                    } else {
                        y yVarG2 = this.list__string_adapter;
                        if (yVarG2 == null) {
                            yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                            this.list__string_adapter = yVarG2;
                        }
                        yVarG2.write(bVar, voucherNotificationSettings.mNotifyDatesBeforeExpiry());
                    }
                    bVar.m("spiel");
                    if (voucherNotificationSettings.mNotificationSpiel() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, voucherNotificationSettings.mNotificationSpiel());
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
        parcel.writeList(mType());
        parcel.writeList(mNotifyDatesBeforeExpiry());
        if (mNotificationSpiel() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mNotificationSpiel());
        }
    }
}
