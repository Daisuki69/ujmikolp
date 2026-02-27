package com.clevertap.android.sdk.inbox;

import A1.a;
import Z.t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CTInboxMessage implements Parcelable {
    public static final Parcelable.Creator<CTInboxMessage> CREATOR = new a(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9557b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9558d;
    public JSONObject f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9559g;
    public long h;
    public String i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f9561l;
    public String m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f9563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t f9564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public JSONObject f9565q;
    public JSONObject e = new JSONObject();
    public ArrayList j = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f9562n = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CTInboxMessage(org.json.JSONObject r20) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.inbox.CTInboxMessage.<init>(org.json.JSONObject):void");
    }

    public final String a() {
        return this.f9557b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9563o);
        parcel.writeString(this.c);
        parcel.writeString(this.i);
        parcel.writeString(this.f9556a);
        parcel.writeLong(this.f9559g);
        parcel.writeLong(this.h);
        parcel.writeString(this.f9561l);
        JSONObject jSONObject = this.f;
        if (jSONObject == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(jSONObject.toString());
        }
        JSONObject jSONObject2 = this.e;
        if (jSONObject2 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(jSONObject2.toString());
        }
        parcel.writeByte(this.f9560k ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.f9564p);
        ArrayList arrayList = this.f9562n;
        if (arrayList == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(arrayList);
        }
        parcel.writeString(this.f9557b);
        ArrayList arrayList2 = this.j;
        if (arrayList2 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(arrayList2);
        }
        parcel.writeString(this.m);
        parcel.writeString(this.f9558d);
        JSONObject jSONObject3 = this.f9565q;
        if (jSONObject3 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(jSONObject3.toString());
        }
    }
}
