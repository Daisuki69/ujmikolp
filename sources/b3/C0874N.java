package b3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import o6.C1967a;
import w2.C2373d;

/* JADX INFO: renamed from: b3.N, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0874N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0874N f8398a = new C0874N();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1967a f8399b;

    static {
        C2373d c2373d = new C2373d();
        c2373d.registerEncoder(C0873M.class, C0886g.f8458a);
        c2373d.registerEncoder(V.class, C0887h.f8461a);
        c2373d.registerEncoder(C0890k.class, C0884e.f8447a);
        c2373d.registerEncoder(C0881b.class, C0883d.f8441a);
        c2373d.registerEncoder(C0880a.class, C0882c.f8435a);
        c2373d.registerEncoder(C0865E.class, C0885f.f8454a);
        c2373d.f20681d = true;
        f8399b = new C1967a(c2373d, 21);
    }

    public static C0881b a(U1.g gVar) throws PackageManager.NameNotFoundException {
        gVar.a();
        Context context = gVar.f5904a;
        kotlin.jvm.internal.j.f(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        gVar.a();
        String str = gVar.c.f5912b;
        kotlin.jvm.internal.j.f(str, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.j.f(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.f(RELEASE, "RELEASE");
        EnumC0904y enumC0904y = EnumC0904y.f8503b;
        kotlin.jvm.internal.j.d(packageName);
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? strValueOf : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.j.f(MANUFACTURER, "MANUFACTURER");
        gVar.a();
        C0865E c0865eB = AbstractC0900u.b(context);
        gVar.a();
        return new C0881b(str, new C0880a(packageName, str3, strValueOf, c0865eB, AbstractC0900u.a(context)));
    }
}
