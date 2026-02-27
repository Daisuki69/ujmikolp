package b3;

import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import cj.C1112C;
import d3.InterfaceC1330b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: b3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0896q implements InterfaceC1330b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8491a;

    public static DataStore b(Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Gj.c cVar, Function0 function0) {
        C1112C c1112c = C1112C.f9377a;
        try {
            System.loadLibrary("datastore_shared_counter");
            return MultiProcessDataStoreFactory.INSTANCE.create(serializer, replaceFileCorruptionHandler, c1112c, cVar, function0);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return DataStoreFactory.INSTANCE.create(serializer, replaceFileCorruptionHandler, c1112c, cVar, function0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [C2.e] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(C2.e r9, ij.AbstractC1609c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof b3.C0902w
            if (r0 == 0) goto L13
            r0 = r10
            b3.w r0 = (b3.C0902w) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            b3.w r0 = new b3.w
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f8500b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            java.lang.String r3 = "FirebaseSessions"
            r4 = 2
            r5 = 1
            java.lang.String r6 = ""
            if (r2 == 0) goto L48
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r9 = r0.f8499a
            java.lang.String r9 = (java.lang.String) r9
            bj.AbstractC1039j.b(r10)     // Catch: java.lang.Exception -> L33
            goto L90
        L33:
            r10 = move-exception
            goto L97
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.f8499a
            C2.e r9 = (C2.e) r9
            bj.AbstractC1039j.b(r10)     // Catch: java.lang.Exception -> L46
            goto L65
        L46:
            r10 = move-exception
            goto L73
        L48:
            bj.AbstractC1039j.b(r10)
            r10 = r9
            C2.d r10 = (C2.d) r10     // Catch: java.lang.Exception -> L46
            com.google.android.gms.tasks.Task r9 = r10.e()     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "getToken(...)"
            kotlin.jvm.internal.j.f(r9, r2)     // Catch: java.lang.Exception -> L71
            r0.f8499a = r10     // Catch: java.lang.Exception -> L71
            r0.e = r5     // Catch: java.lang.Exception -> L71
            java.lang.Object r9 = S1.s.d(r9, r0)     // Catch: java.lang.Exception -> L71
            if (r9 != r1) goto L62
            goto L8f
        L62:
            r7 = r10
            r10 = r9
            r9 = r7
        L65:
            C2.a r10 = (C2.a) r10     // Catch: java.lang.Exception -> L46
            java.lang.String r10 = r10.f668a     // Catch: java.lang.Exception -> L46
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7a
        L6d:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L73
        L71:
            r9 = move-exception
            goto L6d
        L73:
            java.lang.String r2 = "Error getting authentication token."
            android.util.Log.w(r3, r2, r10)
            r10 = r9
            r9 = r6
        L7a:
            C2.d r10 = (C2.d) r10     // Catch: java.lang.Exception -> L33
            com.google.android.gms.tasks.Task r10 = r10.d()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "getId(...)"
            kotlin.jvm.internal.j.f(r10, r2)     // Catch: java.lang.Exception -> L33
            r0.f8499a = r9     // Catch: java.lang.Exception -> L33
            r0.e = r4     // Catch: java.lang.Exception -> L33
            java.lang.Object r10 = S1.s.d(r10, r0)     // Catch: java.lang.Exception -> L33
            if (r10 != r1) goto L90
        L8f:
            return r1
        L90:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L33
            if (r10 != 0) goto L95
            goto L9c
        L95:
            r6 = r10
            goto L9c
        L97:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r3, r0, r10)
        L9c:
            b3.x r10 = new b3.x
            r10.<init>(r6, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0896q.a(C2.e, ij.c):java.lang.Object");
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        switch (this.f8491a) {
            case 1:
                return j0.f8479a;
            default:
                return k0.f8482a;
        }
    }
}
