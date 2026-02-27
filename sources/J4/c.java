package j4;

import androidx.appcompat.widget.AppCompatEditText;
import ch.r;
import g4.AbstractC1500b;
import k4.C1763a;
import k4.C1764b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends AbstractC1500b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatEditText f17712b;

    public c(AppCompatEditText view, int i) {
        this.f17711a = i;
        switch (i) {
            case 1:
                j.h(view, "view");
                this.f17712b = view;
                break;
            default:
                j.h(view, "view");
                this.f17712b = view;
                break;
        }
    }

    @Override // g4.AbstractC1500b
    public final Object d() {
        switch (this.f17711a) {
            case 0:
                return Boolean.valueOf(this.f17712b.hasFocus());
            default:
                AppCompatEditText appCompatEditText = this.f17712b;
                return new C1763a(appCompatEditText, appCompatEditText.getEditableText());
        }
    }

    @Override // g4.AbstractC1500b
    public final void e(r observer) {
        switch (this.f17711a) {
            case 0:
                j.h(observer, "observer");
                AppCompatEditText appCompatEditText = this.f17712b;
                b bVar = new b(appCompatEditText, observer);
                observer.onSubscribe(bVar);
                appCompatEditText.setOnFocusChangeListener(bVar);
                break;
            default:
                j.h(observer, "observer");
                AppCompatEditText appCompatEditText2 = this.f17712b;
                C1764b c1764b = new C1764b(appCompatEditText2, observer);
                observer.onSubscribe(c1764b);
                appCompatEditText2.addTextChangedListener(c1764b);
                break;
        }
    }
}
