package com.google.firebase.concurrent;

import E1.c;
import R2.d;
import a2.InterfaceC0623a;
import a2.b;
import android.annotation.SuppressLint;
import androidx.media3.extractor.flv.a;
import b2.C0859a;
import b2.j;
import b2.n;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f9744a = new j(new d(6));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f9745b = new j(new d(7));
    public static final j c = new j(new d(8));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f9746d = new j(new d(9));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n nVar = new n(InterfaceC0623a.class, ScheduledExecutorService.class);
        n[] nVarArr = {new n(InterfaceC0623a.class, ExecutorService.class), new n(InterfaceC0623a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(nVar);
        for (n nVar2 : nVarArr) {
            c.d(nVar2, "Null interface");
        }
        Collections.addAll(hashSet, nVarArr);
        C0859a c0859a = new C0859a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a(23), hashSet3);
        n nVar3 = new n(b.class, ScheduledExecutorService.class);
        n[] nVarArr2 = {new n(b.class, ExecutorService.class), new n(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(nVar3);
        for (n nVar4 : nVarArr2) {
            c.d(nVar4, "Null interface");
        }
        Collections.addAll(hashSet4, nVarArr2);
        C0859a c0859a2 = new C0859a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new a(24), hashSet6);
        n nVar5 = new n(a2.c.class, ScheduledExecutorService.class);
        n[] nVarArr3 = {new n(a2.c.class, ExecutorService.class), new n(a2.c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(nVar5);
        for (n nVar6 : nVarArr3) {
            c.d(nVar6, "Null interface");
        }
        Collections.addAll(hashSet7, nVarArr3);
        C0859a c0859a3 = new C0859a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new a(25), hashSet9);
        K3.d dVarA = C0859a.a(new n(a2.d.class, Executor.class));
        dVarA.f = new a(26);
        return Arrays.asList(c0859a, c0859a2, c0859a3, dVarA.d());
    }
}
