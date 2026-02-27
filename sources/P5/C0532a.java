package P5;

import D.C0187u;
import D.CallableC0192z;
import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import cg.InterfaceC1101b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.paymaya.common.utility.C1220i;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteOpenHelper;
import x5.C2467a;

/* JADX INFO: renamed from: P5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0532a implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5048b;
    public final InterfaceC1101b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1101b f5049d;

    public /* synthetic */ C0532a(Object obj, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2, InterfaceC1101b interfaceC1101b3, int i) {
        this.f5047a = i;
        this.f5048b = interfaceC1101b;
        this.c = interfaceC1101b2;
        this.f5049d = interfaceC1101b3;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() throws Throwable {
        Task taskForException;
        We.D d10;
        switch (this.f5047a) {
            case 0:
                C1220i analyticsUtils = (C1220i) this.f5048b.get();
                B5.i flowController = (B5.i) this.c.get();
                S5.c flagConfigurationService = (S5.c) this.f5049d.get();
                kotlin.jvm.internal.j.g(analyticsUtils, "analyticsUtils");
                kotlin.jvm.internal.j.g(flowController, "flowController");
                kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
                return new C2467a(flowController, flagConfigurationService, analyticsUtils);
            case 1:
                com.paymaya.data.preference.a aVar = (com.paymaya.data.preference.a) this.f5048b.get();
                C0187u c0187u = (C0187u) this.c.get();
                Context context = (Context) this.f5049d.get();
                C1220i c1220i = new C1220i();
                c1220i.f11212a = aVar;
                c1220i.f11213b = c0187u;
                c1220i.c = context;
                FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
                firebaseAnalytics.getClass();
                try {
                    synchronized (FirebaseAnalytics.class) {
                        try {
                            if (firebaseAnalytics.f9743b == null) {
                                firebaseAnalytics.f9743b = new We.D(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                            }
                            d10 = firebaseAnalytics.f9743b;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    taskForException = Tasks.call(d10, new CallableC0192z(firebaseAnalytics, 2));
                } catch (RuntimeException e) {
                    firebaseAnalytics.f9742a.zzD(5, "Failed to schedule task for getSessionId", null, null, null);
                    taskForException = Tasks.forException(e);
                }
                taskForException.addOnSuccessListener(new com.google.firebase.messaging.n(10));
                return c1220i;
            case 2:
                Application application = (Application) this.f5048b.get();
                com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) this.c.get();
                A5.m flagLifecycleHandler = (A5.m) this.f5049d.get();
                kotlin.jvm.internal.j.g(application, "application");
                kotlin.jvm.internal.j.g(preference, "preference");
                kotlin.jvm.internal.j.g(flagLifecycleHandler, "flagLifecycleHandler");
                B5.f fVar = new B5.f();
                application.registerActivityLifecycleCallbacks(new B5.e(fVar, flagLifecycleHandler, preference));
                return fVar;
            case 3:
                Xe.f fVar2 = (Xe.f) this.c.get();
                SQLiteOpenHelper sQLiteOpenHelper = (SQLiteOpenHelper) this.f5049d.get();
                L5.c cVar = (L5.c) sQLiteOpenHelper;
                cVar.getClass();
                try {
                    System.loadLibrary("sqlcipher");
                    SQLiteDatabase.B(1, cVar.f2813l, null, null, null, new byte[0]).f();
                    if (cVar.f2815o.f11330b.getInt("key_resource_database_version", 0) != 13) {
                        cVar.f2814n.deleteDatabase(cVar.m);
                        cVar.getReadableDatabase();
                        try {
                            cVar.r();
                        } catch (IOException unused) {
                            yk.a.b();
                            cVar.t();
                        }
                    }
                    break;
                } catch (SQLiteException unused2) {
                    cVar.getReadableDatabase();
                    try {
                        cVar.r();
                    } catch (IOException unused3) {
                        yk.a.b();
                        cVar.t();
                    }
                    break;
                }
                Nh.j jVar = Th.e.c;
                Objects.requireNonNull(jVar, "scheduler is null");
                eh.e eVar = new eh.e(jVar, 1);
                fVar2.getClass();
                Wh.b bVar = new Wh.b();
                "".toCharArray();
                return new Xe.d(sQLiteOpenHelper, fVar2.f6616a, bVar, bVar, eVar);
            case 4:
                B5.i flowController2 = (B5.i) this.f5048b.get();
                com.paymaya.data.preference.a preference2 = (com.paymaya.data.preference.a) this.c.get();
                C1220i analyticsUtils2 = (C1220i) this.f5049d.get();
                kotlin.jvm.internal.j.g(flowController2, "flowController");
                kotlin.jvm.internal.j.g(preference2, "preference");
                kotlin.jvm.internal.j.g(analyticsUtils2, "analyticsUtils");
                return new Le.i(flowController2, preference2, analyticsUtils2);
            default:
                return new com.paymaya.domain.store.K((C1220i) this.f5048b.get(), (S5.c) this.c.get(), (com.paymaya.data.preference.a) this.f5049d.get());
        }
    }
}
