package U1;

import Kh.I;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import b2.C0859a;
import b2.j;
import b3.C0893n;
import c2.l;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import dOYHB6.yFtIp6.ht2aO8;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f5902k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ArrayMap f5903l = new ArrayMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5905b;
    public final i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2.e f5906d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f5907g;
    public final B2.b h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    public g(i iVar, Context context, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.f5904a = (Context) Preconditions.checkNotNull(context);
        this.f5905b = Preconditions.checkNotEmpty(str);
        this.c = (i) Preconditions.checkNotNull(iVar);
        a aVar = FirebaseInitProvider.f9860a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListE = new Y.e(11, context, new Qd.a(ComponentDiscoveryService.class, 21)).e();
        Trace.endSection();
        Trace.beginSection("Runtime");
        l lVar = l.f9273a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListE);
        arrayList.add(new C2.b(new FirebaseCommonRegistrar(), 2));
        arrayList.add(new C2.b(new ExecutorsRegistrar(), 2));
        arrayList2.add(C0859a.c(context, Context.class, new Class[0]));
        arrayList2.add(C0859a.c(this, g.class, new Class[0]));
        arrayList2.add(C0859a.c(iVar, i.class, new Class[0]));
        I i = new I(22);
        if (UserManagerCompat.isUserUnlocked(context) && FirebaseInitProvider.f9861b.get()) {
            arrayList2.add(C0859a.c(aVar, a.class, new Class[0]));
        }
        b2.e eVar = new b2.e(lVar, arrayList, arrayList2, i);
        this.f5906d = eVar;
        Trace.endSection();
        this.f5907g = new j(new c(0, this, context));
        this.h = eVar.d(z2.c.class);
        d dVar = new d(this);
        a();
        if (atomicBoolean.get()) {
            BackgroundDetector.getInstance().isInBackground();
        }
        copyOnWriteArrayList.add(dVar);
        Trace.endSection();
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
        synchronized (f5902k) {
            try {
                for (V v7 : f5903l.values()) {
                    v7.a();
                    arrayList.add(v7.f5905b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static g e() {
        g gVar;
        synchronized (f5902k) {
            try {
                gVar = (g) f5903l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((z2.c) gVar.h.get()).c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static g f(String str) {
        g gVar;
        String str2;
        synchronized (f5902k) {
            try {
                gVar = (g) f5903l.get(str.trim());
                if (gVar == null) {
                    ArrayList arrayListD = d();
                    if (arrayListD.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListD);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((z2.c) gVar.h.get()).c();
            } finally {
            }
        }
        return gVar;
    }

    public static g i(i iVar, Context context, String str) {
        g gVar;
        AtomicReference atomicReference = e.f5899a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f5899a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(eVar);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f5902k) {
            ArrayMap arrayMap = f5903l;
            Preconditions.checkState(!arrayMap.containsKey(strTrim), "FirebaseApp name " + strTrim + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            gVar = new g(iVar, context, strTrim);
            arrayMap.put(strTrim, gVar);
        }
        gVar.h();
        return gVar;
    }

    public static g j(Context context) {
        synchronized (f5902k) {
            try {
                if (f5903l.containsKey("[DEFAULT]")) {
                    return e();
                }
                i iVarA = i.a(context);
                if (iVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return i(iVarA, context, "[DEFAULT]");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    public final void b() {
        if (this.f.compareAndSet(false, true)) {
            synchronized (f5902k) {
                f5903l.remove(this.f5905b);
            }
            for (C0893n c0893n : this.j) {
                c0893n.getClass();
                Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
                c0893n.f8486a.f8419b = false;
            }
        }
    }

    public final Object c(Class cls) {
        a();
        return this.f5906d.get(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f5905b.equals(gVar.f5905b);
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(Base64Utils.encodeUrlSafeNoPadding(this.f5905b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(Base64Utils.encodeUrlSafeNoPadding(this.c.f5912b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void h() {
        Context context = this.f5904a;
        boolean zIsUserUnlocked = UserManagerCompat.isUserUnlocked(context);
        String str = this.f5905b;
        if (zIsUserUnlocked) {
            StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            a();
            this.f5906d.c("[DEFAULT]".equals(str));
            ((z2.c) this.h.get()).c();
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        a();
        sb3.append(str);
        Log.i("FirebaseApp", sb3.toString());
        AtomicReference atomicReference = f.f5900b;
        if (atomicReference.get() == null) {
            f fVar = new f(context);
            while (!atomicReference.compareAndSet(null, fVar)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            ht2aO8.registerReceiver(context, fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final int hashCode() {
        return this.f5905b.hashCode();
    }

    public final boolean k() {
        boolean z4;
        a();
        G2.a aVar = (G2.a) this.f5907g.get();
        synchronized (aVar) {
            z4 = aVar.f1701d;
        }
        return z4;
    }

    public final void l(boolean z4) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            g gVar = ((d) it.next()).f5898a;
            if (z4) {
                gVar.getClass();
            } else {
                ((z2.c) gVar.h.get()).c();
            }
        }
    }

    public final void m(Boolean bool) {
        a();
        G2.a aVar = (G2.a) this.f5907g.get();
        synchronized (aVar) {
            try {
                if (bool == null) {
                    aVar.f1700b.edit().remove("firebase_data_collection_default_enabled").apply();
                    aVar.b(aVar.a());
                } else {
                    boolean zEquals = Boolean.TRUE.equals(bool);
                    aVar.f1700b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                    aVar.b(zEquals);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f5905b).add("options", this.c).toString();
    }
}
