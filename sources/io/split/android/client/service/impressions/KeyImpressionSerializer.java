package io.split.android.client.service.impressions;

import com.google.gson.internal.bind.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.s;
import io.split.android.client.dtos.KeyImpression;

/* JADX INFO: loaded from: classes4.dex */
public class KeyImpressionSerializer implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f17610a;

    public KeyImpressionSerializer() {
        k kVar = new k();
        kVar.f10026g = true;
        this.f17610a = kVar.a();
    }

    @Override // com.google.gson.s
    public final o a(Object obj) {
        o oVarH;
        KeyImpression keyImpression = (KeyImpression) obj;
        j jVar = this.f17610a;
        jVar.getClass();
        if (keyImpression == null) {
            oVarH = p.f10033a;
        } else {
            Class<?> cls = keyImpression.getClass();
            f fVar = new f();
            jVar.n(keyImpression, cls, fVar);
            oVarH = fVar.H();
        }
        q qVar = (q) oVarH;
        if (keyImpression.properties == null) {
        }
        return qVar;
    }
}
