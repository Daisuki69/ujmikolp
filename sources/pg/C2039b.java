package pg;

import android.util.Log;
import io.flutter.plugin.common.FlutterException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: pg.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2039b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19102b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C2039b(int i, Object obj, Object obj2) {
        this.f19101a = i;
        this.c = obj;
        this.f19102b = obj2;
    }

    @Override // pg.g
    public final void reply(ByteBuffer byteBuffer) {
        switch (this.f19101a) {
            case 0:
                C2042e c2042e = (C2042e) this.c;
                try {
                    ((InterfaceC2041d) this.f19102b).reply(c2042e.c.decodeMessage(byteBuffer));
                } catch (RuntimeException e) {
                    Log.e("BasicMessageChannel#" + c2042e.f19104b, "Failed to handle message reply", e);
                    return;
                }
                break;
            default:
                t tVar = (t) this.f19102b;
                u uVar = (u) this.c;
                try {
                    if (byteBuffer == null) {
                        tVar.notImplemented();
                    } else {
                        try {
                            tVar.success(uVar.c.d(byteBuffer));
                        } catch (FlutterException e7) {
                            tVar.error(e7.f17173a, e7.getMessage(), e7.f17174b);
                        }
                    }
                } catch (RuntimeException e10) {
                    Log.e("MethodChannel#" + uVar.f19115b, "Failed to handle method call result", e10);
                    return;
                }
                break;
        }
    }
}
