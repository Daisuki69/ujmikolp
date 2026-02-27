package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.LoadUpPartner;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_LoadUpPartner extends C$AutoValue_LoadUpPartner {
    public static final Parcelable.Creator<AutoValue_LoadUpPartner> CREATOR = new Parcelable.Creator<AutoValue_LoadUpPartner>() { // from class: com.paymaya.domain.model.AutoValue_LoadUpPartner.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LoadUpPartner createFromParcel(Parcel parcel) {
            return new AutoValue_LoadUpPartner(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (Amount) parcel.readParcelable(LoadUpPartner.class.getClassLoader()), (Amount) parcel.readParcelable(LoadUpPartner.class.getClassLoader()), (MaintenanceDate) parcel.readParcelable(LoadUpPartner.class.getClassLoader()), (ImageUrl) parcel.readParcelable(LoadUpPartner.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString(), parcel.readInt() == 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LoadUpPartner[] newArray(int i) {
            return new AutoValue_LoadUpPartner[i];
        }
    };

    public AutoValue_LoadUpPartner(final String str, final String str2, @Nullable final String str3, final String str4, @Nullable final String str5, final Amount amount, final Amount amount2, final MaintenanceDate maintenanceDate, final ImageUrl imageUrl, @Nullable final String str6, @Nullable final String str7, final String str8, final boolean z4) {
        new C$$AutoValue_LoadUpPartner(str, str2, str3, str4, str5, amount, amount2, maintenanceDate, imageUrl, str6, str7, str8, z4) { // from class: com.paymaya.domain.model.$AutoValue_LoadUpPartner

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_LoadUpPartner$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y imageUrl_adapter;
                private volatile y maintenanceDate_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(LoadUpPartner)";
                }

                @Override // com.google.gson.y
                public LoadUpPartner read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    LoadUpPartner.Builder builderSBuilder = LoadUpPartner.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "subtitle":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mSubtitle((String) yVarH.read(aVar));
                                    break;
                                case "icon_url":
                                    y yVarH2 = this.imageUrl_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(ImageUrl.class);
                                        this.imageUrl_adapter = yVarH2;
                                    }
                                    builderSBuilder.mIconUrl((ImageUrl) yVarH2.read(aVar));
                                    break;
                                case "id":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mId((String) yVarH3.read(aVar));
                                    break;
                                case "name":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mName((String) yVarH4.read(aVar));
                                    break;
                                case "note":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mNote((String) yVarH5.read(aVar));
                                    break;
                                case "slug":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mSlug((String) yVarH6.read(aVar));
                                    break;
                                case "type":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mType((String) yVarH7.read(aVar));
                                    break;
                                case "steps":
                                    y yVarH8 = this.string_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(String.class);
                                        this.string_adapter = yVarH8;
                                    }
                                    builderSBuilder.mSteps((String) yVarH8.read(aVar));
                                    break;
                                case "maintenance":
                                    y yVarH9 = this.maintenanceDate_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(MaintenanceDate.class);
                                        this.maintenanceDate_adapter = yVarH9;
                                    }
                                    builderSBuilder.mMaintenance((MaintenanceDate) yVarH9.read(aVar));
                                    break;
                                case "channel":
                                    y yVarH10 = this.string_adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(String.class);
                                        this.string_adapter = yVarH10;
                                    }
                                    builderSBuilder.mChannel((String) yVarH10.read(aVar));
                                    break;
                                case "limit_max":
                                    y yVarH11 = this.amount_adapter;
                                    if (yVarH11 == null) {
                                        yVarH11 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH11;
                                    }
                                    builderSBuilder.mLimitMax((Amount) yVarH11.read(aVar));
                                    break;
                                case "limit_min":
                                    y yVarH12 = this.amount_adapter;
                                    if (yVarH12 == null) {
                                        yVarH12 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH12;
                                    }
                                    builderSBuilder.mLimitMin((Amount) yVarH12.read(aVar));
                                    break;
                                case "no_fee_display":
                                    y yVarH13 = this.boolean__adapter;
                                    if (yVarH13 == null) {
                                        yVarH13 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH13;
                                    }
                                    builderSBuilder.mNoFeeDisplay(((Boolean) yVarH13.read(aVar)).booleanValue());
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
                public void write(b bVar, LoadUpPartner loadUpPartner) throws IOException {
                    if (loadUpPartner == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.ATTR_ID);
                    if (loadUpPartner.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, loadUpPartner.mId());
                    }
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (loadUpPartner.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, loadUpPartner.mName());
                    }
                    bVar.m("subtitle");
                    if (loadUpPartner.mSubtitle() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, loadUpPartner.mSubtitle());
                    }
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (loadUpPartner.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, loadUpPartner.mType());
                    }
                    bVar.m("note");
                    if (loadUpPartner.mNote() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, loadUpPartner.mNote());
                    }
                    bVar.m("limit_min");
                    if (loadUpPartner.mLimitMin() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.amount_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, loadUpPartner.mLimitMin());
                    }
                    bVar.m("limit_max");
                    if (loadUpPartner.mLimitMax() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.amount_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, loadUpPartner.mLimitMax());
                    }
                    bVar.m("maintenance");
                    if (loadUpPartner.mMaintenance() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.maintenanceDate_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(MaintenanceDate.class);
                            this.maintenanceDate_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, loadUpPartner.mMaintenance());
                    }
                    bVar.m("icon_url");
                    if (loadUpPartner.mIconUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.imageUrl_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(ImageUrl.class);
                            this.imageUrl_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, loadUpPartner.mIconUrl());
                    }
                    bVar.m("steps");
                    if (loadUpPartner.mSteps() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.string_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(String.class);
                            this.string_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, loadUpPartner.mSteps());
                    }
                    bVar.m(AppsFlyerProperties.CHANNEL);
                    if (loadUpPartner.mChannel() == null) {
                        bVar.r();
                    } else {
                        y yVarH11 = this.string_adapter;
                        if (yVarH11 == null) {
                            yVarH11 = this.gson.h(String.class);
                            this.string_adapter = yVarH11;
                        }
                        yVarH11.write(bVar, loadUpPartner.mChannel());
                    }
                    bVar.m("slug");
                    if (loadUpPartner.mSlug() == null) {
                        bVar.r();
                    } else {
                        y yVarH12 = this.string_adapter;
                        if (yVarH12 == null) {
                            yVarH12 = this.gson.h(String.class);
                            this.string_adapter = yVarH12;
                        }
                        yVarH12.write(bVar, loadUpPartner.mSlug());
                    }
                    bVar.m("no_fee_display");
                    y yVarH13 = this.boolean__adapter;
                    if (yVarH13 == null) {
                        yVarH13 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH13;
                    }
                    yVarH13.write(bVar, Boolean.valueOf(loadUpPartner.mNoFeeDisplay()));
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
        parcel.writeString(mId());
        parcel.writeString(mName());
        if (mSubtitle() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mSubtitle());
        }
        parcel.writeString(mType());
        if (mNote() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mNote());
        }
        parcel.writeParcelable(mLimitMin(), i);
        parcel.writeParcelable(mLimitMax(), i);
        parcel.writeParcelable(mMaintenance(), i);
        parcel.writeParcelable(mIconUrl(), i);
        if (mSteps() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mSteps());
        }
        if (mChannel() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mChannel());
        }
        parcel.writeString(mSlug());
        parcel.writeInt(mNoFeeDisplay() ? 1 : 0);
    }
}
