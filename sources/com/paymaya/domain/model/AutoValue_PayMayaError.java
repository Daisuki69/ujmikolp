package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.PayMayaError;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_PayMayaError extends C$AutoValue_PayMayaError {
    public static final Parcelable.Creator<AutoValue_PayMayaError> CREATOR = new Parcelable.Creator<AutoValue_PayMayaError>() { // from class: com.paymaya.domain.model.AutoValue_PayMayaError.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PayMayaError createFromParcel(Parcel parcel) {
            return new AutoValue_PayMayaError(parcel.readInt(), parcel.readString(), parcel.readString(), (PayMayaErrorAction) parcel.readParcelable(PayMayaError.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PayMayaError[] newArray(int i) {
            return new AutoValue_PayMayaError[i];
        }
    };

    public AutoValue_PayMayaError(int i, String str, String str2, @Nullable PayMayaErrorAction payMayaErrorAction, int i4, boolean z4, boolean z5, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        new C$$AutoValue_PayMayaError(i, str, str2, payMayaErrorAction, i4, z4, z5, str3, str4, str5, str6) { // from class: com.paymaya.domain.model.$AutoValue_PayMayaError

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_PayMayaError$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y int__adapter;
                private volatile y payMayaErrorAction_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(PayMayaError)";
                }

                @Override // com.google.gson.y
                public PayMayaError read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    PayMayaError.Builder builderSBuilder = PayMayaError.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "action":
                                    y yVarH = this.payMayaErrorAction_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(PayMayaErrorAction.class);
                                        this.payMayaErrorAction_adapter = yVarH;
                                    }
                                    builderSBuilder.mAction((PayMayaErrorAction) yVarH.read(aVar));
                                    break;
                                case "msg":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mMessage((String) yVarH2.read(aVar));
                                    break;
                                case "code":
                                    y yVarH3 = this.int__adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(Integer.class);
                                        this.int__adapter = yVarH3;
                                    }
                                    builderSBuilder.mErrorCode(((Integer) yVarH3.read(aVar)).intValue());
                                    break;
                                case "spiel":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mSpiel((String) yVarH4.read(aVar));
                                    break;
                                case "details":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mDetails((String) yVarH5.read(aVar));
                                    break;
                                default:
                                    if ("mStatusCode".equals(strE)) {
                                        y yVarH6 = this.int__adapter;
                                        if (yVarH6 == null) {
                                            yVarH6 = this.gson.h(Integer.class);
                                            this.int__adapter = yVarH6;
                                        }
                                        builderSBuilder.mStatusCode(((Integer) yVarH6.read(aVar)).intValue());
                                        break;
                                    } else {
                                        if ("isNetworkError".equals(strE)) {
                                            y yVarH7 = this.boolean__adapter;
                                            if (yVarH7 == null) {
                                                yVarH7 = this.gson.h(Boolean.class);
                                                this.boolean__adapter = yVarH7;
                                            }
                                            builderSBuilder.isNetworkError(((Boolean) yVarH7.read(aVar)).booleanValue());
                                        } else if ("isDefault".equals(strE)) {
                                            y yVarH8 = this.boolean__adapter;
                                            if (yVarH8 == null) {
                                                yVarH8 = this.gson.h(Boolean.class);
                                                this.boolean__adapter = yVarH8;
                                            }
                                            builderSBuilder.isDefault(((Boolean) yVarH8.read(aVar)).booleanValue());
                                        } else if ("mJsonObject".equals(strE)) {
                                            y yVarH9 = this.string_adapter;
                                            if (yVarH9 == null) {
                                                yVarH9 = this.gson.h(String.class);
                                                this.string_adapter = yVarH9;
                                            }
                                            builderSBuilder.mJsonObject((String) yVarH9.read(aVar));
                                        } else if ("mThrowableMessage".equals(strE)) {
                                            y yVarH10 = this.string_adapter;
                                            if (yVarH10 == null) {
                                                yVarH10 = this.gson.h(String.class);
                                                this.string_adapter = yVarH10;
                                            }
                                            builderSBuilder.mThrowableMessage((String) yVarH10.read(aVar));
                                        } else if (!"mMeta".equals(strE)) {
                                            aVar.Q();
                                        } else {
                                            y yVarH11 = this.string_adapter;
                                            if (yVarH11 == null) {
                                                yVarH11 = this.gson.h(String.class);
                                                this.string_adapter = yVarH11;
                                            }
                                            builderSBuilder.mMeta((String) yVarH11.read(aVar));
                                        }
                                        break;
                                    }
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
                public void write(b bVar, PayMayaError payMayaError) throws IOException {
                    if (payMayaError == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("code");
                    y yVarH = this.int__adapter;
                    if (yVarH == null) {
                        yVarH = this.gson.h(Integer.class);
                        this.int__adapter = yVarH;
                    }
                    yVarH.write(bVar, Integer.valueOf(payMayaError.mErrorCode()));
                    bVar.m("msg");
                    if (payMayaError.mMessage() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, payMayaError.mMessage());
                    }
                    bVar.m("spiel");
                    if (payMayaError.mSpiel() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, payMayaError.mSpiel());
                    }
                    bVar.m("action");
                    if (payMayaError.mAction() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.payMayaErrorAction_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(PayMayaErrorAction.class);
                            this.payMayaErrorAction_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, payMayaError.mAction());
                    }
                    bVar.m("mStatusCode");
                    y yVarH5 = this.int__adapter;
                    if (yVarH5 == null) {
                        yVarH5 = this.gson.h(Integer.class);
                        this.int__adapter = yVarH5;
                    }
                    yVarH5.write(bVar, Integer.valueOf(payMayaError.mStatusCode()));
                    bVar.m("isNetworkError");
                    y yVarH6 = this.boolean__adapter;
                    if (yVarH6 == null) {
                        yVarH6 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH6;
                    }
                    yVarH6.write(bVar, Boolean.valueOf(payMayaError.isNetworkError()));
                    bVar.m("isDefault");
                    y yVarH7 = this.boolean__adapter;
                    if (yVarH7 == null) {
                        yVarH7 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH7;
                    }
                    yVarH7.write(bVar, Boolean.valueOf(payMayaError.isDefault()));
                    bVar.m("mJsonObject");
                    if (payMayaError.mJsonObject() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.string_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(String.class);
                            this.string_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, payMayaError.mJsonObject());
                    }
                    bVar.m("mThrowableMessage");
                    if (payMayaError.mThrowableMessage() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.string_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(String.class);
                            this.string_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, payMayaError.mThrowableMessage());
                    }
                    bVar.m("details");
                    if (payMayaError.mDetails() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.string_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(String.class);
                            this.string_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, payMayaError.mDetails());
                    }
                    bVar.m("mMeta");
                    if (payMayaError.mMeta() == null) {
                        bVar.r();
                    } else {
                        y yVarH11 = this.string_adapter;
                        if (yVarH11 == null) {
                            yVarH11 = this.gson.h(String.class);
                            this.string_adapter = yVarH11;
                        }
                        yVarH11.write(bVar, payMayaError.mMeta());
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
        parcel.writeInt(mErrorCode());
        parcel.writeString(mMessage());
        parcel.writeString(mSpiel());
        parcel.writeParcelable(mAction(), i);
        parcel.writeInt(mStatusCode());
        parcel.writeInt(isNetworkError() ? 1 : 0);
        parcel.writeInt(isDefault() ? 1 : 0);
        if (mJsonObject() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mJsonObject());
        }
        if (mThrowableMessage() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mThrowableMessage());
        }
        if (mDetails() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mDetails());
        }
        if (mMeta() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMeta());
        }
    }
}
