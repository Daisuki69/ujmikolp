package com.paymaya.mayaui.travel.view.widget;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.domain.model.Operator;
import com.paymaya.domain.model.Route;
import com.paymaya.domain.model.Stop;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaTravelViewDataSelection implements Parcelable {
    public static final Parcelable.Creator<MayaTravelViewDataSelection> CREATOR = new a(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Operator f14229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f14230b;
    public Route c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f14231d;
    public Stop e;
    public Stop f;

    public MayaTravelViewDataSelection(Operator operator, ArrayList arrayList, Route route, ArrayList arrayList2, Stop stop, Stop stop2) {
        this.f14229a = operator;
        this.f14230b = arrayList;
        this.c = route;
        this.f14231d = arrayList2;
        this.e = stop;
        this.f = stop2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MayaTravelViewDataSelection)) {
            return false;
        }
        MayaTravelViewDataSelection mayaTravelViewDataSelection = (MayaTravelViewDataSelection) obj;
        return j.b(this.f14229a, mayaTravelViewDataSelection.f14229a) && j.b(this.f14230b, mayaTravelViewDataSelection.f14230b) && j.b(this.c, mayaTravelViewDataSelection.c) && j.b(this.f14231d, mayaTravelViewDataSelection.f14231d) && j.b(this.e, mayaTravelViewDataSelection.e) && j.b(this.f, mayaTravelViewDataSelection.f);
    }

    public final int hashCode() {
        Operator operator = this.f14229a;
        int iHashCode = (operator == null ? 0 : operator.hashCode()) * 31;
        ArrayList arrayList = this.f14230b;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Route route = this.c;
        int iHashCode3 = (iHashCode2 + (route == null ? 0 : route.hashCode())) * 31;
        ArrayList arrayList2 = this.f14231d;
        int iHashCode4 = (iHashCode3 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        Stop stop = this.e;
        int iHashCode5 = (iHashCode4 + (stop == null ? 0 : stop.hashCode())) * 31;
        Stop stop2 = this.f;
        return iHashCode5 + (stop2 != null ? stop2.hashCode() : 0);
    }

    public final String toString() {
        return "MayaTravelViewDataSelection(operatorSelected=" + this.f14229a + ", operatorList=" + this.f14230b + ", routeSelected=" + this.c + ", routeList=" + this.f14231d + ", originStopSelected=" + this.e + ", destinationStopSelected=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeParcelable(this.f14229a, i);
        ArrayList arrayList = this.f14230b;
        if (arrayList == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dest.writeParcelable((Parcelable) it.next(), i);
            }
        }
        dest.writeParcelable(this.c, i);
        ArrayList arrayList2 = this.f14231d;
        if (arrayList2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable((Parcelable) it2.next(), i);
            }
        }
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }
}
