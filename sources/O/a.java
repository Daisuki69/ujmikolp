package O;

import We.s;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateException;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4506d;
    public P.b h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f4504a = h.f4515b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4505b = true;
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedHashSet f = new LinkedHashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f4507g = new ArrayList();

    public final void a(String str, j jVar, Object obj) {
        if (C2576A.H(str)) {
            throw new CustomTemplateException(numX49.tnTj78("Pz7"));
        }
        String strTnTj78 = numX49.tnTj78("PzX");
        if (z.w(str, 2, strTnTj78, false) || z.n(str, 2, strTnTj78, false) || C2576A.z(str, numX49.tnTj78("PzG"), false, 2)) {
            throw new CustomTemplateException(numX49.tnTj78("Pzv"));
        }
        LinkedHashSet linkedHashSet = this.e;
        boolean zContains = linkedHashSet.contains(str);
        String strTnTj782 = numX49.tnTj78("Pz3");
        String strTnTj783 = numX49.tnTj78("Pzy");
        if (zContains) {
            throw new CustomTemplateException(s.j(strTnTj783, str, strTnTj782));
        }
        int iE = C2576A.E(str, '.', 0, 4);
        while (true) {
            LinkedHashSet linkedHashSet2 = this.f;
            if (iE == -1) {
                if (linkedHashSet2.contains(str)) {
                    throw new CustomTemplateException(s.j(strTnTj783, str, strTnTj782));
                }
                this.f4507g.add(new i(str, jVar, obj));
                linkedHashSet.add(str);
                return;
            }
            String strSubstring = str.substring(0, iE);
            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
            if (linkedHashSet.contains(strSubstring)) {
                throw new CustomTemplateException(s.j(strTnTj783, str, strTnTj782));
            }
            linkedHashSet2.add(strSubstring);
            iE = C2576A.E(str, '.', iE + 1, 4);
        }
    }

    public final void b(String str) {
        if (this.f4506d != null) {
            throw new CustomTemplateException(androidx.camera.core.impl.a.n(new StringBuilder(numX49.tnTj78("PzY")), this.f4506d, '\"'));
        }
        if (C2576A.H(str)) {
            throw new CustomTemplateException(numX49.tnTj78("PzA"));
        }
        this.f4506d = str;
    }
}
