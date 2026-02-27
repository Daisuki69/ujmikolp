package D8;

import androidx.core.util.Supplier;
import bg.AbstractC0983W;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUpdateProfileActivity;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUserProfileUpdateActivity;
import io.split.android.client.dtos.Partition;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import oi.C1983a;

/* JADX INFO: renamed from: D8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0193a implements Ah.q, Ch.c, Supplier, W6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1033b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1034d;

    public /* synthetic */ C0193a(y5.q qVar, MayaErrorDialogFragment mayaErrorDialogFragment, boolean z4, int i) {
        this.f1032a = i;
        this.c = qVar;
        this.f1034d = mayaErrorDialogFragment;
        this.f1033b = z4;
    }

    public static String b(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static Yh.b e(Ti.b bVar) {
        Yh.b bVar2 = new Yh.b();
        new ArrayList();
        new ArrayList();
        bVar2.f6789a = bVar.f5845a;
        bVar2.f6790b = bVar.f;
        Collection hashSet = bVar.f5850l;
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        new ArrayList(hashSet);
        String str = bVar.f5847d;
        bVar2.c = str;
        HashSet hashSet2 = new HashSet();
        Iterator it = bVar.e.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Ti.a) it.next()).c.iterator();
            while (it2.hasNext()) {
                hashSet2.add(((Partition) it2.next()).treatment);
            }
        }
        hashSet2.add(str);
        new ArrayList(hashSet2);
        return bVar2;
    }

    @Override // Ah.q, Ah.b
    public void a(io.reactivex.rxjava3.disposables.b bVar) {
        Ah.q qVar = (Ah.q) this.c;
        try {
            ((Ch.c) this.f1034d).accept(bVar);
            qVar.a(bVar);
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            this.f1033b = true;
            bVar.dispose();
            qVar.a(Dh.b.f1156a);
            qVar.onError(th2);
        }
    }

    @Override // Ch.c
    public void accept(Object obj) {
        List productsList = (List) obj;
        kotlin.jvm.internal.j.g(productsList, "productsList");
        boolean z4 = this.f1033b;
        C1285t0 c1285t0 = (C1285t0) this.c;
        if (!z4) {
            com.paymaya.data.database.repository.A a8 = c1285t0.c;
            a8.getClass();
            a8.f11293a.c("product_v3", com.paymaya.data.database.repository.A.b(productsList));
            return;
        }
        com.paymaya.data.database.repository.A a10 = c1285t0.c;
        a10.getClass();
        String providerName = (String) this.f1034d;
        kotlin.jvm.internal.j.g(providerName, "providerName");
        A7.f fVarA = a10.f11293a.a();
        fVarA.j("product_v3", "provider = ?", new String[]{providerName});
        fVarA.k("product_v3", com.paymaya.data.database.repository.A.b(productsList));
        fVarA.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.gson.internal.l c(com.google.gson.reflect.TypeToken r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.C0193a.c(com.google.gson.reflect.TypeToken, boolean):com.google.gson.internal.l");
    }

    public void d(double d10, double d11) {
        boolean z4 = this.f1033b;
        double[] dArr = (double[]) this.c;
        double d12 = 1.0d;
        if (!z4) {
            d12 = 1.0d / (((dArr[7] * d11) + (dArr[3] * d10)) + dArr[15]);
        }
        double d13 = ((dArr[4] * d11) + (dArr[0] * d10) + dArr[12]) * d12;
        double d14 = ((dArr[5] * d11) + (dArr[1] * d10) + dArr[13]) * d12;
        double[] dArr2 = (double[]) this.f1034d;
        if (d13 < dArr2[0]) {
            dArr2[0] = d13;
        } else if (d13 > dArr2[1]) {
            dArr2[1] = d13;
        }
        if (d14 < dArr2[2]) {
            dArr2[2] = d14;
        } else if (d14 > dArr2[3]) {
            dArr2[3] = d14;
        }
    }

    @Override // androidx.core.util.Supplier
    public synchronized Object get() {
        try {
            if (!this.f1033b) {
                this.f1034d = ((C1983a) this.c).get();
                this.f1033b = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f1034d;
    }

    @Override // W6.e
    public void onDismiss() {
        Object obj = this.c;
        switch (this.f1032a) {
            case 7:
                int i = MayaUpdateProfileActivity.f14232p;
                MayaUpdateProfileActivity mayaUpdateProfileActivity = (MayaUpdateProfileActivity) obj;
                if (!this.f1033b) {
                    mayaUpdateProfileActivity.getClass();
                    ((MayaErrorDialogFragment) this.f1034d).dismiss();
                    return;
                }
                Zd.b bVar = mayaUpdateProfileActivity.f14233n;
                if (bVar == null) {
                    kotlin.jvm.internal.j.n("mPresenter");
                    throw null;
                }
                String str = bVar.e;
                if (str == null) {
                    mayaUpdateProfileActivity.n1().q(mayaUpdateProfileActivity);
                    return;
                } else {
                    mayaUpdateProfileActivity.n1();
                    B5.i.k(mayaUpdateProfileActivity, str);
                    return;
                }
            default:
                int i4 = MayaUserProfileUpdateActivity.f14235p;
                MayaUserProfileUpdateActivity mayaUserProfileUpdateActivity = (MayaUserProfileUpdateActivity) obj;
                if (!this.f1033b) {
                    mayaUserProfileUpdateActivity.getClass();
                    ((MayaErrorDialogFragment) this.f1034d).dismiss();
                    return;
                } else {
                    if (((String) mayaUserProfileUpdateActivity.V1().e) == null) {
                        mayaUserProfileUpdateActivity.n1().q(mayaUserProfileUpdateActivity);
                        return;
                    }
                    String str2 = (String) mayaUserProfileUpdateActivity.V1().e;
                    if (str2 == null) {
                        str2 = "https://paymaya.com/app/";
                    }
                    mayaUserProfileUpdateActivity.n1();
                    B5.i.k(mayaUserProfileUpdateActivity, str2);
                    return;
                }
        }
    }

    @Override // Ah.q, Ah.b
    public void onError(Throwable th2) {
        if (this.f1033b) {
            E1.c.k(th2);
        } else {
            ((Ah.q) this.c).onError(th2);
        }
    }

    @Override // Ah.q
    public void onSuccess(Object obj) {
        if (this.f1033b) {
            return;
        }
        ((Ah.q) this.c).onSuccess(obj);
    }

    public String toString() {
        switch (this.f1032a) {
            case 3:
                return ((Map) this.c).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0193a(boolean z4, Object obj, Serializable serializable, int i) {
        this.f1032a = i;
        this.f1033b = z4;
        this.c = obj;
        this.f1034d = serializable;
    }

    public C0193a(J8.b bVar, List listDisabledDocuments, boolean z4) {
        this.f1032a = 0;
        kotlin.jvm.internal.j.g(listDisabledDocuments, "listDisabledDocuments");
        this.c = bVar;
        this.f1034d = listDisabledDocuments;
        this.f1033b = z4;
    }

    public C0193a(C1983a c1983a) {
        this.f1032a = 6;
        this.f1033b = false;
        this.c = c1983a;
    }

    public C0193a(io.split.android.client.storage.splits.c cVar, Si.d dVar, R4.i iVar) {
        this.f1032a = 2;
        this.f1033b = false;
        Objects.requireNonNull(cVar);
        this.c = cVar;
        this.f1034d = iVar;
    }

    public C0193a(Ah.q qVar, Ch.c cVar) {
        this.f1032a = 1;
        this.c = qVar;
        this.f1034d = cVar;
    }

    public C0193a(Map map, boolean z4, List list) {
        this.f1032a = 3;
        this.c = map;
        this.f1033b = z4;
        this.f1034d = list;
    }
}
