package wk;

import android.graphics.Bitmap;
import oi.C1983a;
import qk.i;
import v.AbstractC2329d;
import vk.c;
import vk.d;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20803a = true;

    @Override // sk.a
    public final Object apply(Object obj) {
        d dVar = (d) obj;
        vk.b bVar = dVar.f20511b;
        if (bVar == null) {
            throw new IllegalStateException("No image has been loaded yet.");
        }
        boolean z4 = bVar.f() == 1;
        vk.b bVar2 = dVar.f20511b;
        if (bVar2 == null) {
            throw new IllegalStateException("No image has been loaded yet.");
        }
        i.j("Only RGB images are supported in ResizeOp, but not ".concat(AbstractC2329d.j(bVar2.f())), z4);
        vk.b bVar3 = dVar.f20511b;
        if (bVar3 == null) {
            throw new IllegalStateException("No image has been loaded yet.");
        }
        dVar.f20511b = new C1983a(Bitmap.createScaledBitmap(bVar3.d(), 320, 320, this.f20803a));
        return dVar;
    }
}
