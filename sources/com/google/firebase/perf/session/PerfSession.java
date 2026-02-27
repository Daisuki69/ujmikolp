package com.google.firebase.perf.session;

import A1.a;
import K2.p;
import M2.b;
import T2.d;
import U2.v;
import U2.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new a(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Timer f9857b;
    public boolean c;

    public PerfSession(String str, b bVar) {
        this.c = false;
        this.f9856a = str;
        this.f9857b = new Timer();
    }

    public static w[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        w[] wVarArr = new w[list.size()];
        w wVarA = ((PerfSession) list.get(0)).a();
        boolean z4 = false;
        for (int i = 1; i < list.size(); i++) {
            w wVarA2 = ((PerfSession) list.get(i)).a();
            if (z4 || !((PerfSession) list.get(i)).c) {
                wVarArr[i] = wVarA2;
            } else {
                wVarArr[0] = wVarA2;
                wVarArr[i] = wVarA;
                z4 = true;
            }
        }
        if (!z4) {
            wVarArr[0] = wVarA;
        }
        return wVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.firebase.perf.session.PerfSession c(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.PerfSession.c(java.lang.String):com.google.firebase.perf.session.PerfSession");
    }

    public final w a() {
        v vVarW = w.w();
        vVarW.i();
        w.s((w) vVarW.f10116b, this.f9856a);
        if (this.c) {
            vVarW.i();
            w.t((w) vVarW.f10116b);
        }
        return (w) vVarW.g();
    }

    public final boolean d() {
        p pVar;
        long jLongValue;
        long minutes = TimeUnit.MICROSECONDS.toMinutes(this.f9857b.a());
        K2.a aVarE = K2.a.e();
        aVarE.getClass();
        synchronized (p.class) {
            try {
                if (p.f2576b == null) {
                    p.f2576b = new p();
                }
                pVar = p.f2576b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d dVarK = aVarE.k(pVar);
        if (!dVarK.b() || ((Long) dVarK.a()).longValue() <= 0) {
            d dVar = aVarE.f2561a.getLong("fpr_session_max_duration_min");
            if (!dVar.b() || ((Long) dVar.a()).longValue() <= 0) {
                d dVarC = aVarE.c(pVar);
                jLongValue = (!dVarC.b() || ((Long) dVarC.a()).longValue() <= 0) ? 240L : ((Long) dVarC.a()).longValue();
            } else {
                aVarE.c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                jLongValue = ((Long) dVar.a()).longValue();
            }
        } else {
            jLongValue = ((Long) dVarK.a()).longValue();
        }
        return minutes > jLongValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9856a);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f9857b, 0);
    }

    public PerfSession(Parcel parcel) {
        this.c = false;
        this.f9856a = parcel.readString();
        this.c = parcel.readByte() != 0;
        this.f9857b = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
