package wk;

import b4.C0906a;
import java.util.Arrays;
import qk.i;
import v.AbstractC2329d;
import vk.c;
import vk.d;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uk.a f20804a;

    public b(uk.a aVar) {
        this.f20804a = aVar;
    }

    @Override // sk.a
    public final Object apply(Object obj) {
        d dVar = (d) obj;
        i.m(dVar, "Op cannot apply on null image.");
        uk.a aVar = this.f20804a;
        vk.b bVar = dVar.f20511b;
        if (bVar == null) {
            throw new IllegalStateException("No image has been loaded yet.");
        }
        xk.a aVarApply = aVar.apply(bVar.b(dVar.f20510a));
        vk.b bVar2 = dVar.f20511b;
        if (bVar2 == null) {
            throw new IllegalStateException("No image has been loaded yet.");
        }
        int iF = bVar2.f();
        d dVar2 = new d(aVarApply.h());
        i.j("Only ColorSpaceType.RGB and ColorSpaceType.GRAYSCALE are supported. Use `load(TensorBuffer, ImageProperties)` for other color space types.", iF == 1 || iF == 2);
        i.j("Only ColorSpaceType.RGB and ColorSpaceType.GRAYSCALE are supported. Use `create(TensorBuffer, ImageProperties)` for other color space types.", iF == 1 || iF == 2);
        aVarApply.b();
        int[] iArr = aVarApply.f21026b;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        AbstractC2329d.d(iF, "getHeight()");
        AbstractC2329d.e(iF, iArrCopyOf);
        int i = AbstractC2329d.f(iF, iArrCopyOf)[1];
        aVarApply.b();
        int[] iArr2 = aVarApply.f21026b;
        int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        AbstractC2329d.d(iF, "getWidth()");
        AbstractC2329d.e(iF, iArrCopyOf2);
        dVar2.f20511b = new C0906a(aVarApply, iF, i, AbstractC2329d.f(iF, iArrCopyOf2)[2]);
        return dVar2;
    }
}
