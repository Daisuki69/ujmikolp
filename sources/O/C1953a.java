package o;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* JADX INFO: renamed from: o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1953a extends Paint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18750a;

    private final void a(LocaleList localeList) {
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f18750a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1953a(int i, int i4) {
        super(i);
        this.f18750a = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1953a(PorterDuff.Mode mode) {
        super(1);
        this.f18750a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }
}
