package O;

import D.S;
import N.l;
import We.s;
import cj.C1110A;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import dOYHB6.tiZVw8.numX49;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CTInAppNotification f4511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f4512b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4513d;
    public final WeakReference e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4514g;

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(O.b r8, com.clevertap.android.sdk.inapp.CTInAppNotification r9, N.k r10, O.c r11, D.S r12) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.f.<init>(O.b, com.clevertap.android.sdk.inapp.CTInAppNotification, N.k, O.c, D.S):void");
    }

    public final void a() {
        c cVar = this.f4512b;
        if (cVar != null) {
            ((k) cVar).c.remove(this.c);
        }
        this.f4512b = null;
        if (!this.f || this.f4514g) {
            WeakReference weakReference = this.e;
            l lVar = (l) weakReference.get();
            if (lVar != null) {
                lVar.K0(this.f4511a, null);
            } else {
                S.g(numX49.tnTj78("PzF"), numX49.tnTj78("PzH"));
            }
            weakReference.clear();
        }
    }

    public final void b() {
        if (this.f) {
            return;
        }
        l lVar = (l) this.e.get();
        if (lVar != null) {
            lVar.K(this.f4511a);
        } else {
            S.g(numX49.tnTj78("PzO"), numX49.tnTj78("PzQ"));
        }
    }

    public final String toString() {
        String string;
        String strTnTj78;
        N.f fVar;
        CustomTemplateInAppData customTemplateInAppData;
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("Pzt"));
        sb2.append(this.c);
        sb2.append(numX49.tnTj78("PzU"));
        LinkedHashMap linkedHashMap = this.f4513d;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            StringBuilder sb3 = new StringBuilder(numX49.tnTj78("Pze"));
            sb3.append((String) entry.getKey());
            sb3.append(numX49.tnTj78("Pz8"));
            if (entry.getValue() instanceof CTInAppAction) {
                StringBuilder sb4 = new StringBuilder(numX49.tnTj78("PzC"));
                Object value = entry.getValue();
                CTInAppAction cTInAppAction = value instanceof CTInAppAction ? (CTInAppAction) value : null;
                if (cTInAppAction == null || (customTemplateInAppData = cTInAppAction.f9473d) == null || (strTnTj78 = customTemplateInAppData.f9515a) == null) {
                    strTnTj78 = (cTInAppAction == null || (fVar = cTInAppAction.f9471a) == null) ? numX49.tnTj78("Pz4") : fVar.f3464a;
                }
                string = androidx.camera.core.impl.a.n(sb4, strTnTj78, '}');
            } else {
                string = entry.getValue().toString();
            }
            sb3.append(string);
            arrayList.add(sb3.toString());
        }
        return s.p(sb2, C1110A.F(arrayList, numX49.tnTj78("Pzo"), null, null, null, 62), numX49.tnTj78("PzK"));
    }
}
