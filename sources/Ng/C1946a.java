package ng;

import P0.f;
import android.view.View;
import dOYHB6.tiZVw8.numX49;
import io.flutter.plugin.platform.k;
import java.util.Map;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: renamed from: ng.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1946a implements k, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f18729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f18730b;
    public final C1947b c;

    /* JADX WARN: Removed duplicated region for block: B:44:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1946a(android.content.Context r9, pg.j r10, int r11, java.util.Map r12) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.C1946a.<init>(android.content.Context, pg.j, int, java.util.Map):void");
    }

    public static boolean a(String str, Map map) {
        if (map.containsKey(str)) {
            return ((Boolean) map.get(str)).booleanValue();
        }
        return false;
    }

    @Override // io.flutter.plugin.platform.k
    public final void dispose() {
        this.f18730b.b(null);
    }

    @Override // io.flutter.plugin.platform.k
    public final View getView() {
        return this.f18729a;
    }

    @Override // io.flutter.plugin.platform.k
    public final /* synthetic */ void onFlutterViewAttached(View view) {
    }

    @Override // io.flutter.plugin.platform.k
    public final /* synthetic */ void onFlutterViewDetached() {
    }

    @Override // io.flutter.plugin.platform.k
    public final /* synthetic */ void onInputConnectionLocked() {
    }

    @Override // io.flutter.plugin.platform.k
    public final /* synthetic */ void onInputConnectionUnlocked() {
    }

    @Override // pg.s
    public final void onMethodCall(r rVar, t tVar) {
        byte b8;
        byte b10;
        String str = rVar.f19112a;
        str.getClass();
        f fVar = this.f18729a;
        switch (str.hashCode()) {
            case -1990164468:
                b8 = str.equals(numX49.tnTj78("bQ94")) ? (byte) 0 : (byte) -1;
                break;
            case 601108392:
                b8 = str.equals(numX49.tnTj78("bQ9C")) ? (byte) 1 : (byte) -1;
                break;
            case 857882560:
                b8 = str.equals(numX49.tnTj78("bQ98")) ? (byte) 2 : (byte) -1;
                break;
            case 1984860689:
                b8 = str.equals(numX49.tnTj78("bQ9e")) ? (byte) 3 : (byte) -1;
                break;
            default:
                b8 = -1;
                break;
        }
        switch (b8) {
            case 0:
                Map map = (Map) rVar.f19113b;
                for (String str2 : map.keySet()) {
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -1439816841:
                            b10 = str2.equals(numX49.tnTj78("bQ9D")) ? (byte) 0 : (byte) -1;
                            break;
                        case 820702630:
                            b10 = str2.equals(numX49.tnTj78("bQ9m")) ? (byte) 1 : (byte) -1;
                            break;
                        case 859432697:
                            b10 = str2.equals(numX49.tnTj78("bQ9c")) ? (byte) 2 : (byte) -1;
                            break;
                        case 860552205:
                            b10 = str2.equals(numX49.tnTj78("bQ9w")) ? (byte) 3 : (byte) -1;
                            break;
                        case 1365525979:
                            b10 = str2.equals(numX49.tnTj78("bQ9K")) ? (byte) 4 : (byte) -1;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        case 0:
                            fVar.setSwipeEnabled(a(str2, map));
                            break;
                        case 1:
                            this.c.f18733d = a(str2, map);
                            break;
                        case 2:
                            fVar.setPageSnap(a(str2, map));
                            break;
                        case 3:
                            fVar.setPageFling(a(str2, map));
                            break;
                        case 4:
                            fVar.setNightMode(a(str2, map));
                            break;
                        default:
                            throw new IllegalArgumentException(numX49.tnTj78("bQ9h").concat(str2));
                    }
                }
                tVar.success(null);
                return;
            case 1:
                tVar.success(Integer.valueOf(fVar.getCurrentPage()));
                return;
            case 2:
                tVar.success(Integer.valueOf(fVar.getPageCount()));
                return;
            case 3:
                String strTnTj78 = numX49.tnTj78("bQ9o");
                if (rVar.a(strTnTj78) != null) {
                    fVar.k(((Integer) rVar.a(strTnTj78)).intValue());
                }
                tVar.success(Boolean.TRUE);
                return;
            default:
                tVar.notImplemented();
                return;
        }
    }
}
