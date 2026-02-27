package io.ktor.client.call;

import Kg.c;
import Ng.m;
import Ng.q;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import java.util.List;
import kotlin.jvm.internal.C1790e;
import qk.i;
import zj.s;

/* JADX INFO: loaded from: classes4.dex */
public final class NoTransformationFoundException extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17503a;

    public NoTransformationFoundException(c cVar, C1790e c1790e, C1790e c1790e2) {
        StringBuilder sb2 = new StringBuilder("\n        Expected response body of the type '");
        sb2.append(c1790e2);
        sb2.append("' but was '");
        sb2.append(c1790e);
        sb2.append("'\n        In response from `");
        sb2.append(i.z(cVar).getUrl());
        sb2.append("`\n        Response status `");
        sb2.append(cVar.f());
        sb2.append("`\n        Response header `ContentType: ");
        m mVarA = cVar.a();
        List list = q.f4436a;
        sb2.append(mVarA.get(RtspHeaders.CONTENT_TYPE));
        sb2.append("` \n        Request header `Accept: ");
        sb2.append(i.z(cVar).a().get(RtspHeaders.ACCEPT));
        sb2.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.f17503a = s.b(sb2.toString());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f17503a;
    }
}
