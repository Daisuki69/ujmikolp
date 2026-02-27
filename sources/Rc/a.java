package Rc;

import We.K;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.paymaya.domain.model.CarouselItem;
import com.paymaya.domain.model.ClevertapAd;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CarouselItem f5473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f5474b;

    public a(c cVar, CarouselItem carouselItem) {
        this.f5474b = cVar;
        this.f5473a = carouselItem;
    }

    @Override // We.K
    public final void a(Bitmap bitmap) {
        CarouselItem carouselItem = this.f5473a;
        ((ClevertapAd) carouselItem).setBitmap(bitmap);
        c cVar = this.f5474b;
        cVar.f5478g.remove(this);
        if (cVar.e.remove(carouselItem)) {
            cVar.f.add(carouselItem);
            cVar.e(cVar.e, cVar.f);
        }
    }

    @Override // We.K
    public final void b(Exception exc, Drawable drawable) {
        this.f5474b.f(this.f5473a, this);
    }

    @Override // We.K
    public final void c(Drawable drawable) {
    }
}
