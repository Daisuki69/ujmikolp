package com.paymaya.mayaui.kyczoloz.utils;

import E8.C0222e;
import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class Name implements Parcelable {
    public static final Parcelable.Creator<Name> CREATOR = new C0222e(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("firstName")
    private final String f12435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("middleName")
    private final String f12436b;

    @InterfaceC1498b("lastName")
    private final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC1498b("hasNoMiddleName")
    private final Boolean f12437d;

    public Name(String str, String str2, String str3, Boolean bool) {
        this.f12435a = str;
        this.f12436b = str2;
        this.c = str3;
        this.f12437d = bool;
    }

    public final String a() {
        return this.f12435a;
    }

    public final Boolean b() {
        return this.f12437d;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.f12436b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.f12435a);
        dest.writeString(this.f12436b);
        dest.writeString(this.c);
        Boolean bool = this.f12437d;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
    }
}
