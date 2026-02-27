package Xh;

import We.s;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b2.C0859a;
import b2.InterfaceC0860b;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.DependencyException;
import e2.C1421c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.C1781b;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Zh.a, InterfaceC0860b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6628b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6629d;
    public final Object e;
    public final Object f;

    public b(Cg.c cVar, Si.d dVar, Qi.c cVar2, c cVar3, zi.c cVar4) {
        this.f = new AtomicBoolean(true);
        this.f6628b = cVar;
        this.f6627a = dVar;
        Objects.requireNonNull(cVar2);
        this.c = cVar2;
        this.f6629d = cVar3;
        this.e = cVar4;
    }

    @Override // b2.InterfaceC0860b
    public b2.l a(b2.n nVar) {
        if (((Set) this.c).contains(nVar)) {
            return ((InterfaceC0860b) this.f).a(nVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Deferred<" + nVar + ">.");
    }

    @Override // Zh.a
    public boolean b(Map map) {
        C1781b c1781b;
        C1421c c1421c;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            ((Si.d) this.c).getClass();
            if (!(value instanceof String) && !(value instanceof Boolean) && !(value instanceof Integer) && !(value instanceof Long) && !(value instanceof Float) && !(value instanceof Double) && !(value instanceof Collection)) {
                String strJ = s.j("You passed an invalid attribute value for ", (String) entry.getKey(), ", acceptable types are String, double, float, long, int, boolean or Collections");
                ((Si.d) this.f6627a).getClass();
                Si.d.d(strJ, "split attributes");
                return false;
            }
        }
        io.split.android.client.storage.attributes.c cVar = (io.split.android.client.storage.attributes.c) this.f6628b;
        cVar.f17617a.putAll(map);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(cVar.f17617a);
        io.split.android.client.storage.attributes.d dVar = (io.split.android.client.storage.attributes.d) this.f6629d;
        if (dVar == null || (c1781b = (C1781b) this.f) == null || (c1421c = (C1421c) this.e) == null) {
            return true;
        }
        c1781b.i(new Ci.a((String) c1421c.f16555b, dVar, concurrentHashMap), 5L, null);
        return true;
    }

    @Override // Zh.a
    public Map c() {
        io.split.android.client.storage.attributes.c cVar = (io.split.android.client.storage.attributes.c) this.f6628b;
        cVar.getClass();
        return new ConcurrentHashMap(cVar.f17617a);
    }

    @Override // b2.InterfaceC0860b
    public B2.b d(Class cls) {
        return e(b2.n.a(cls));
    }

    @Override // b2.InterfaceC0860b
    public B2.b e(b2.n nVar) {
        if (((Set) this.f6627a).contains(nVar)) {
            return ((InterfaceC0860b) this.f).e(nVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + nVar + ">.");
    }

    @Override // b2.InterfaceC0860b
    public Object f(b2.n nVar) {
        if (((Set) this.f6628b).contains(nVar)) {
            return ((InterfaceC0860b) this.f).f(nVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + nVar + ".");
    }

    @Override // b2.InterfaceC0860b
    public Set g(b2.n nVar) {
        if (((Set) this.f6629d).contains(nVar)) {
            return ((InterfaceC0860b) this.f).g(nVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + nVar + ">.");
    }

    @Override // b2.InterfaceC0860b
    public Object get(Class cls) {
        if (((Set) this.f6628b).contains(b2.n.a(cls))) {
            Object obj = ((InterfaceC0860b) this.f).get(cls);
            return !cls.equals(y2.c.class) ? obj : new b2.o((Set) this.e, (y2.c) obj);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + cls + ".");
    }

    public Task h(Task task) {
        return task.continueWith(new androidx.arch.core.executor.a(2), new androidx.work.impl.e(this, 12));
    }

    public b2.l i(Class cls) {
        return a(b2.n.a(cls));
    }

    public void j(String str, String str2, Bundle bundle) {
        int i;
        String strEncodeToString;
        int iA;
        PackageInfo packageInfoD;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        U1.g gVar = (U1.g) this.f6628b;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.c.f5912b);
        com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.f6627a;
        synchronized (oVar) {
            try {
                if (oVar.f9797d == 0 && (packageInfoD = oVar.d("com.google.android.gms")) != null) {
                    oVar.f9797d = packageInfoD.versionCode;
                }
                i = oVar.f9797d;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((com.google.firebase.messaging.o) this.f6627a).a());
        bundle.putString("app_ver_name", ((com.google.firebase.messaging.o) this.f6627a).b());
        U1.g gVar2 = (U1.g) this.f6628b;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f5905b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str3 = ((C2.a) Tasks.await(((C2.d) ((C2.e) this.f)).e())).f668a;
            if (TextUtils.isEmpty(str3)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e7) {
            e = e7;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(((C2.d) ((C2.e) this.f)).d()));
        bundle.putString("cliv", "fcm-25.0.1");
        z2.f fVar = (z2.f) ((B2.b) this.e).get();
        V2.b bVar = (V2.b) ((B2.b) this.f6629d).get();
        if (fVar == null || bVar == null || (iA = ((z2.c) fVar).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(AbstractC2217b.c(iA)));
        bundle.putString("Firebase-Client", bVar.a());
    }

    public Set k(Class cls) {
        return g(b2.n.a(cls));
    }

    public Task l(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return ((Rpc) this.c).send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    public b(C0859a c0859a, InterfaceC0860b interfaceC0860b) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (b2.h hVar : c0859a.c) {
            int i = hVar.c;
            boolean z4 = i == 0;
            int i4 = hVar.f8363b;
            b2.n nVar = hVar.f8362a;
            if (z4) {
                if (i4 == 2) {
                    hashSet4.add(nVar);
                } else {
                    hashSet.add(nVar);
                }
            } else if (i == 2) {
                hashSet3.add(nVar);
            } else if (i4 == 2) {
                hashSet5.add(nVar);
            } else {
                hashSet2.add(nVar);
            }
        }
        Set set = c0859a.f8352g;
        if (!set.isEmpty()) {
            hashSet.add(b2.n.a(y2.c.class));
        }
        this.f6628b = Collections.unmodifiableSet(hashSet);
        this.f6627a = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.f6629d = Collections.unmodifiableSet(hashSet4);
        Collections.unmodifiableSet(hashSet5);
        this.e = set;
        this.f = interfaceC0860b;
    }

    public b(io.split.android.client.storage.attributes.c cVar, Si.d dVar, Si.d dVar2, io.split.android.client.storage.attributes.d dVar3, C1421c c1421c, C1781b c1781b) {
        Objects.requireNonNull(cVar);
        this.f6628b = cVar;
        Objects.requireNonNull(dVar);
        this.c = dVar;
        Objects.requireNonNull(dVar2);
        this.f6627a = dVar2;
        this.f6629d = dVar3;
        this.e = c1421c;
        this.f = c1781b;
    }

    public b(U1.g gVar, com.google.firebase.messaging.o oVar, B2.b bVar, B2.b bVar2, C2.e eVar) {
        gVar.a();
        Rpc rpc = new Rpc(gVar.f5904a);
        this.f6628b = gVar;
        this.f6627a = oVar;
        this.c = rpc;
        this.f6629d = bVar;
        this.e = bVar2;
        this.f = eVar;
    }
}
