package rg;

import K2.f;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.systemchannels.MouseCursorChannel;

/* JADX INFO: renamed from: rg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2205a implements MouseCursorChannel.MouseCursorMethodHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2207c f19946a;

    public C2205a(C2207c c2207c) {
        this.f19946a = c2207c;
    }

    @Override // io.flutter.embedding.engine.systemchannels.MouseCursorChannel.MouseCursorMethodHandler
    public final void activateSystemCursor(String str) {
        C2207c c2207c = this.f19946a;
        FlutterView flutterView = c2207c.f19947a;
        if (C2207c.c == null) {
            f fVar = new f();
            fVar.put(numX49.tnTj78("bFcP"), 1010);
            fVar.put(numX49.tnTj78("bFcb"), 1013);
            fVar.put(numX49.tnTj78("bFc2"), 1000);
            fVar.put(numX49.tnTj78("bFcL"), 1006);
            fVar.put(numX49.tnTj78("bFcr"), 1002);
            fVar.put(numX49.tnTj78("bFcZ"), 1001);
            fVar.put(numX49.tnTj78("bFck"), 1011);
            fVar.put(numX49.tnTj78("bFcB"), 1012);
            fVar.put(numX49.tnTj78("bFcu"), 1020);
            fVar.put(numX49.tnTj78("bFcV"), 1021);
            fVar.put(numX49.tnTj78("bFcS"), 1003);
            fVar.put(numX49.tnTj78("bFcj"), 1013);
            fVar.put(numX49.tnTj78("bFcd"), 0);
            fVar.put(numX49.tnTj78("bFci"), 1012);
            fVar.put(numX49.tnTj78("bFcE"), 1007);
            fVar.put(numX49.tnTj78("bFcF"), 1008);
            fVar.put(numX49.tnTj78("bFcH"), 1014);
            fVar.put(numX49.tnTj78("bFcO"), 1015);
            String strTnTj78 = numX49.tnTj78("bFcQ");
            fVar.put(strTnTj78, 1016);
            fVar.put(numX49.tnTj78("bFct"), 1017);
            fVar.put(numX49.tnTj78("bFcU"), 1014);
            fVar.put(numX49.tnTj78("bFce"), 1014);
            fVar.put(numX49.tnTj78("bFc8"), 1014);
            fVar.put(numX49.tnTj78("bFcC"), 1015);
            fVar.put(numX49.tnTj78("bFc4"), 1015);
            fVar.put(numX49.tnTj78("bFco"), 1015);
            fVar.put(strTnTj78, 1017);
            fVar.put(numX49.tnTj78("bFcK"), 1016);
            fVar.put(numX49.tnTj78("bFcw"), 1017);
            fVar.put(numX49.tnTj78("bFcc"), 1016);
            fVar.put(numX49.tnTj78("bFcm"), 1009);
            fVar.put(numX49.tnTj78("bFcD"), 1004);
            fVar.put(numX49.tnTj78("bFch"), 1018);
            fVar.put(numX49.tnTj78("bFcM"), 1019);
            C2207c.c = fVar;
        }
        flutterView.setPointerIcon(c2207c.f19947a.getSystemPointerIcon(((Integer) C2207c.c.getOrDefault(str, 1000)).intValue()));
    }
}
