package com.google.firebase.perf.metrics;

import G6.r;
import J2.c;
import J2.d;
import M2.b;
import O2.e;
import Q2.a;
import S2.f;
import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public class Trace extends d implements Parcelable, a {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;
    public static final M2.a m = M2.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f9850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Trace f9851b;
    public final GaugeManager c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9852d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f9853g;
    public final ArrayList h;
    public final f i;
    public final b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Timer f9854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Timer f9855l;

    static {
        new ConcurrentHashMap();
        CREATOR = new A1.a(11);
    }

    public Trace(String str, f fVar, b bVar, c cVar) {
        this(str, fVar, bVar, cVar, GaugeManager.getInstance());
    }

    @Override // Q2.a
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            m.f("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (this.f9854k == null || c()) {
                return;
            }
            this.f9853g.add(perfSession);
        }
    }

    public final void b(String str, String str2) {
        if (c()) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalArgumentException(s.p(new StringBuilder("Trace '"), this.f9852d, "' has been stopped"));
        }
        ConcurrentHashMap concurrentHashMap = this.f;
        if (concurrentHashMap.containsKey(str) || concurrentHashMap.size() < 5) {
            e.b(str, str2);
        } else {
            Locale locale2 = Locale.ENGLISH;
            throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
        }
    }

    public final boolean c() {
        return this.f9855l != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.f9854k != null) && !c()) {
                m.g("Trace '%s' is started but not stopped when it is destructed!", this.f9852d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Nullable
    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.f.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        Counter counter = str != null ? (Counter) this.e.get(str.trim()) : null;
        if (counter == null) {
            return 0L;
        }
        return counter.f9849b.get();
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j) {
        String strC = e.c(str);
        M2.a aVar = m;
        if (strC != null) {
            aVar.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        boolean z4 = this.f9854k != null;
        String str2 = this.f9852d;
        if (!z4) {
            aVar.g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            aVar.g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.e;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        AtomicLong atomicLong = counter.f9849b;
        atomicLong.addAndGet(j);
        aVar.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z4 = true;
        M2.a aVar = m;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            aVar.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f9852d);
        } catch (Exception e) {
            aVar.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z4 = false;
        }
        if (z4) {
            this.f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j) {
        String strC = e.c(str);
        M2.a aVar = m;
        if (strC != null) {
            aVar.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        boolean z4 = this.f9854k != null;
        String str2 = this.f9852d;
        if (!z4) {
            aVar.g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            aVar.g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.e;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        counter.f9849b.set(j);
        aVar.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (!c()) {
            this.f.remove(str);
            return;
        }
        M2.a aVar = m;
        if (aVar.f3046b) {
            aVar.f3045a.getClass();
            Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Keep
    public void start() {
        String str;
        String str2 = null;
        boolean zT = K2.a.e().t();
        M2.a aVar = m;
        if (!zT) {
            aVar.a("Trace feature is disabled.");
            return;
        }
        Pattern pattern = e.f4629a;
        String str3 = this.f9852d;
        if (str3 == null) {
            str2 = "Trace name must not be null";
        } else if (str3.length() > 100) {
            Locale locale = Locale.US;
            str2 = "Trace name must not exceed 100 characters";
        } else if (str3.startsWith(Global.UNDERSCORE)) {
            int[] iArrD = AbstractC2217b.d(6);
            int length = iArrD.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    switch (iArrD[i]) {
                        case 1:
                            str = "_as";
                            break;
                        case 2:
                            str = "_astui";
                            break;
                        case 3:
                            str = "_astfd";
                            break;
                        case 4:
                            str = "_asti";
                            break;
                        case 5:
                            str = "_fs";
                            break;
                        case 6:
                            str = "_bs";
                            break;
                        default:
                            throw null;
                    }
                    if (!str.equals(str3)) {
                        i++;
                    }
                } else if (!str3.startsWith("_st_")) {
                    str2 = "Trace name must not start with '_'";
                }
            }
        }
        if (str2 != null) {
            aVar.c("Cannot start trace '%s'. Trace name is invalid.(%s)", str3, str2);
            return;
        }
        if (this.f9854k != null) {
            aVar.c("Trace '%s' has already started, should not start again!", str3);
            return;
        }
        this.j.getClass();
        this.f9854k = new Timer();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f9850a);
        a(perfSession);
        if (perfSession.c) {
            this.c.collectGaugeMetricOnce(perfSession.f9857b);
        }
    }

    @Keep
    public void stop() {
        boolean z4 = this.f9854k != null;
        String str = this.f9852d;
        M2.a aVar = m;
        if (!z4) {
            aVar.c("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (c()) {
            aVar.c("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f9850a);
        unregisterForAppState();
        this.j.getClass();
        Timer timer = new Timer();
        this.f9855l = timer;
        if (this.f9851b == null) {
            ArrayList arrayList = this.h;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) androidx.camera.core.impl.a.b(1, arrayList);
                if (trace.f9855l == null) {
                    trace.f9855l = timer;
                }
            }
            if (str.isEmpty()) {
                if (aVar.f3046b) {
                    aVar.f3045a.getClass();
                    Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
                    return;
                }
                return;
            }
            this.i.c(new r(this, 22).a(), getAppState());
            if (SessionManager.getInstance().perfSession().c) {
                this.c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f9857b);
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.f9851b, 0);
        parcel.writeString(this.f9852d);
        parcel.writeList(this.h);
        parcel.writeMap(this.e);
        parcel.writeParcelable(this.f9854k, 0);
        parcel.writeParcelable(this.f9855l, 0);
        synchronized (this.f9853g) {
            parcel.writeList(this.f9853g);
        }
    }

    public Trace(String str, f fVar, b bVar, c cVar, GaugeManager gaugeManager) {
        super(cVar);
        this.f9850a = new WeakReference(this);
        this.f9851b = null;
        this.f9852d = str.trim();
        this.h = new ArrayList();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.j = bVar;
        this.i = fVar;
        this.f9853g = Collections.synchronizedList(new ArrayList());
        this.c = gaugeManager;
    }

    public Trace(Parcel parcel, boolean z4) {
        super(z4 ? null : c.a());
        this.f9850a = new WeakReference(this);
        this.f9851b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f9852d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.e = concurrentHashMap;
        this.f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.f9854k = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.f9855l = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f9853g = listSynchronizedList;
        parcel.readList(listSynchronizedList, PerfSession.class.getClassLoader());
        if (z4) {
            this.i = null;
            this.j = null;
            this.c = null;
        } else {
            this.i = f.f5648s;
            this.j = new b(15);
            this.c = GaugeManager.getInstance();
        }
    }
}
